package domain;

public class Wave {

	private int start, end, cycle;
	private float peak;

	public Wave(int start, int end, float peak, int cycle) {
		this.start = start;
		this.end = end;
		this.peak = peak;
		this.cycle = cycle;
	}

	public int getCycle() {
		return cycle;
	}

	public void setCycle(int cycle) {
		this.cycle = cycle;
	}

	public int getStart() {
		return start;
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

}
