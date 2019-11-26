package domain;

public class BPM {

	private int bpm;
	private final int normalMaxBPM = 60;
	private final int normalMinBPM = 100;
	
	public BPM(int bpm) {
		this.bpm = bpm;
	}

	public int getBPM() {
		return bpm;
	}
	
	public boolean isNormalBPM(int bpm) {
		return bpm >= normalMinBPM && bpm <= normalMaxBPM;
	}

	public void setBPM(int bpm) {
		this.bpm = bpm;
	}
	
}
