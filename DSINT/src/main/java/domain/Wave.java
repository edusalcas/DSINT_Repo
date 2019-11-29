package domain;

public class Wave extends Signal{

	private float peak;

	public Wave(int start, int end, float peak, int cycle) {
		super(start, end, cycle);
		this.peak = peak;
	}

	public float getPeak() {
		return peak;
	}

	public void setPeak(float peak) {
		this.peak = peak;
	}

}
