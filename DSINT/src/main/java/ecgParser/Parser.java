package ecgParser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Parser {

	private static BufferedReader reader;

	private static void openFile(String fileName) throws FileNotFoundException {
		reader = new BufferedReader(new FileReader(fileName));
	}

	private static void closeFile() throws IOException {
		reader.close();
	}

	public static void readFile(String fileName) {
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
				String [] data= line.replaceAll("[A-Z()]", "").split(",");
				// TODO : Almacena cada uno de los tres datos en sus respectivos slots.
				System.out.println(data[0] + " " + data[1] + " " + data[2]);
				line = reader.readLine();
			}
			
			closeFile();
		} catch (FileNotFoundException e) {
			System.err.println(fileName + " no es un nombre no valido");
		} catch (IOException e) {
			System.err.println("El fichero ha provocado un fallo");
			e.printStackTrace();
		}

	}

}
