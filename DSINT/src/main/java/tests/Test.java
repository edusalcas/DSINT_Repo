package tests;
import ecgParser.Parser;

public class Test {

	public static void main(String[] args) {
		Parser.readFile("files/bradicardia.ecg.fix");
	}
}