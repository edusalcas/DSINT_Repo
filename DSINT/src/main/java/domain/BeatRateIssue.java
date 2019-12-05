package domain;

public class BeatRateIssue extends Issue {

	private int bpm;
	
	public BeatRateIssue(String message, int bpm) {
		super(message);
		this.bpm = bpm;
	}

	public int getBpm() {
		return bpm;
	}

	public void setBpm(int bpm) {
		this.bpm = bpm;
	}

	@Override
	protected String data() {
		return "(" + bpm + ")";
	}

}
