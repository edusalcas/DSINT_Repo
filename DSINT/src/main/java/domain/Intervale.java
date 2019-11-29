package domain;

public class Intervale extends Signal {
	
	private int duration;
	
	public Intervale(int start, int end, int cycle) {
		super(start, end, cycle);
		this.duration = end - start;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
}
