package ecgParser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

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
	    System.out.println(kContainer.verify().getMessages().toString());
	    
	    KieSession kSession = kContainer.newKieSession("ksession-rules");

		try {
			openFile(fileName);
			
			// Ignoramos la primera linea
			String line = reader.readLine();
			// Obtenemos el numero de ciclos
			line = reader.readLine();
			int cycles = Integer.valueOf(line.replaceAll("\\D+", ""));
			// Obtenemos el ritmo cardiaco
			line = reader.readLine();
			int hRate = Integer.valueOf(line.replaceAll("\\D+", ""));
			
			System.out.println("El numero de ciclos es " + cycles + " y el ritmo cardiaco es " + hRate);
			
			// Ignoramos la linea en blanco
			reader.readLine();
			
			// Leemos todos los ciclos del ECG
			line = reader.readLine();
			while (line != null) {
				char letter = line.charAt(0);
				if (letter == 'P')
					actualCycle++;
				String [] dataArray = line.replaceAll("[A-Z()]", "").split(",");
				Data data = new Data(Integer.valueOf(dataArray[0]), Integer.valueOf(dataArray[1]), Float.valueOf(dataArray[2]), letter);
				//System.out.println(letter + " " + dataArray[0] + " " + dataArray[1] + " " + dataArray[2]);
				kSession.insert(data);
				line = reader.readLine();
			}
			kSession.fireAllRules();
			System.out.println("Ya se ha leido el fichero");
			closeFile();
		} catch (FileNotFoundException e) {
			System.err.println(fileName + " no es un nombre no valido");
		} catch (IOException e) {
			System.err.println("El fichero ha provocado un fallo");
			e.printStackTrace();
		}

	}

}
