package domain;

public class Signal {

	private int start;
	private int end;
	private int cycle;

	public Signal(int start, int end, int cycle) {
		super();
		this.start = start;
		this.end = end;
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

	public int getCycle() {
		return cycle;
	}

	public void setCycle(int cycle) {
		this.cycle = cycle;
	}
}
