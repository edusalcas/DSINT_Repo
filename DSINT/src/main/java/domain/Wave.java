package domain;

public class Wave {

	private int start;
	private int end;
	private float peak;
	private WaveType type;

	public Wave(int start, int end, float peak, char type) {
		this.start = start;
		this.end = end;
		this.peak = peak;
		this.type = char2WaveType(type);
	}

	private WaveType char2WaveType(char type2) {
		switch (type2) {
		case 'P':
			return WaveType.P;
		case 'Q':
			return WaveType.Q;
		case 'R':
			return WaveType.R;
		case 'S':
			return WaveType.S;
		case 'T':
			return WaveType.T;
		default:
			return null;
		}
	}

	public WaveType getType() {
		return type;
	}

	public void setType(WaveType type) {
		this.type = type;
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
