package ecgParser;

public class Data {

	// Atributos
	private int start, end, cycle;
	private float peak;
	private char letter;

	// Constructor
	public Data(int start, int end, float peak, char letter, int cycle) {
		this.start = start;
		this.end = end;
		this.peak = peak;
		this.letter = letter;
		this.cycle = cycle;
	}

	// Getters and Setters
	public int getStart() {
		return start;
	}

	public int getCycle() {
		return cycle;
	}

	public void setCycle(int cycle) {
		this.cycle = cycle;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public float getPeak() {
		return peak;
	}

	public void setPeak(float peak) {
		this.peak = peak;
	}

	public char getLetter() {
		return letter;
	}

	public void setLetter(char letter) {
		this.letter = letter;
	}

}
