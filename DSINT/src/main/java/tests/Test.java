package tests;

import java.util.Scanner;
import ecgParser.Parser;

public class Test {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("¿Qué ECG quieres analizar?");
		String input = s.nextLine();
		Parser.readFile("files/" + input);
		s.close();
	}
}