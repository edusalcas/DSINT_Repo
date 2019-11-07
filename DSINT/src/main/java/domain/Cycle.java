package domain;

public class Cycle {

	private Wave[] waves;
	private int cycle;

	public Cycle(int cycle, Wave... waves) {
		this.waves = waves;
		this.cycle = cycle;
	}

	public Wave[] getWaves() {
		return waves;
	}

	public int getCycle() {
		return cycle;
	}

	public void setCycle(int cycle) {
		this.cycle = cycle;
	};

}
