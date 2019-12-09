package domain;

public class CycleIssue extends Issue {

	private int cycle;

	public CycleIssue(String message, int cycle) {
		super(message);
		this.cycle = cycle;
	}

	public int getCycle() {
		return cycle;
	}

	public void setCycle(int cycle) {
		this.cycle = cycle;
	}

	@Override
	protected String data() {
		return "(" + cycle + ")";
	}

}
