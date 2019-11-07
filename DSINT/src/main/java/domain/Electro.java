package domain;

public class Electro {
	
	private int numCycles;
	private int bpm;

	public Electro(int numCycles, int bpm) {
		this.numCycles = numCycles;
		this.bpm = bpm;
	}

	public int getNumCycles() {
		return numCycles;
	}

	public void setNumCycles(int numCycles) {
		this.numCycles = numCycles;
	}

	public int getBpm() {
		return bpm;
	}

	public void setBpm(int bpm) {
		this.bpm = bpm;
	}
}
