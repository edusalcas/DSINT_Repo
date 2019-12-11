package ecgParser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import domain.*;

public class Parser {

	private static BufferedReader reader;

	private static void openFile(String fileName) throws FileNotFoundException {
		reader = new BufferedReader(new FileReader(fileName));
	}

	private static void closeFile() throws IOException {
		reader.close();
	}

	public static void readFile(String fileName) {
		int actualCycle = 0;

		KieServices ks = KieServices.Factory.get();
		KieContainer kContainer = ks.getKieClasspathContainer();
		KieSession kSession = kContainer.newKieSession("ksession-rules");

		try {
			openFile(fileName);

			// Ignoramos la primera linea
			String line = reader.readLine();
			// Obtenemos el numero de ciclos
			line = reader.readLine();
			Cycles cycles = new Cycles(Integer.valueOf(line.replaceAll("\\D+", "")));
			// Obtenemos el ritmo cardiaco
			line = reader.readLine();
			BPM bpm = new BPM(Integer.valueOf(line.replaceAll("\\D+", "")));

			//Insertamos el numero de ciclos y el ritmo cardiaco como hechos en nuestra kSession, asi como los datos normales de un ecg
			kSession.insert(new NormalValues());
			kSession.insert(cycles);
			kSession.insert(bpm);
			System.out.println("El numero de ciclos es " + cycles.getNumCycles() + " y el ritmo cardiaco es " + bpm.getBpm());

			// Ignoramos la linea en blanco
			reader.readLine();

			// Leemos todos los ciclos del ECG
			line = reader.readLine();
			
			//Creamos el fichero de salida
			PrintWriter writer = new PrintWriter("output-file.txt", "UTF-8");
			writer.println("Fichero de salida ECG: ");
			kSession.insert(writer);
			while (line != null) {
				char letter = line.charAt(0);
				if (letter == 'P')
					actualCycle++;
				String[] dataArray = line.replaceAll("[A-Z()]", "").split(",");

				Wave wave;
				switch (letter) {
				case 'P':
					wave = new P(Integer.valueOf(dataArray[0]), Integer.valueOf(dataArray[1]),
							Float.valueOf(dataArray[2]), actualCycle);
					break;
				case 'Q':
					wave = new Q(Integer.valueOf(dataArray[0]), Integer.valueOf(dataArray[1]),
							Float.valueOf(dataArray[2]), actualCycle);
					break;
				case 'R':
					wave = new R(Integer.valueOf(dataArray[0]), Integer.valueOf(dataArray[1]),
							Float.valueOf(dataArray[2]), actualCycle);
					break;
				case 'S':
					wave = new S(Integer.valueOf(dataArray[0]), Integer.valueOf(dataArray[1]),
							Float.valueOf(dataArray[2]), actualCycle);
					break;
				case 'T':
					wave = new T(Integer.valueOf(dataArray[0]), Integer.valueOf(dataArray[1]),
							Float.valueOf(dataArray[2]), actualCycle);
					break;
				default:
					wave = null;
					break;
				}
				kSession.insert(wave);
				line = reader.readLine();
			}
			kSession.fireAllRules();
			System.out.println("Ya se ha leido el fichero");
			writer.close();
			closeFile();
		} catch (FileNotFoundException e) {
			System.err.println(fileName + " no es un nombre no valido");
		} catch (IOException e) {
			System.err.println("El fichero ha provocado un fallo");
			e.printStackTrace();
		}

	}

}
