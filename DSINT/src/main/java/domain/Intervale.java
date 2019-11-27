package domain;

public class Intervale {
	
	private int duration;
	private float minPeak;
	private float maxPeak;
	
	
	
	public Intervale(Wave... waves) {
		int waveEnd = -1;
		int waveStart = -1;
		float waveMaxPeak = -100.0f; 
		float waveMinPeak = 100.0f;
		for (Wave wave : waves) {
			if (wave.getEnd() > waveEnd)
				waveEnd = wave.getEnd();
			if (waveStart == -1 || wave.getStart() < waveStart)
				waveStart = wave.getStart();
			if (wave.getPeak() > waveMaxPeak)
				waveMaxPeak = wave.getPeak();
			if (wave.getPeak() < waveMinPeak)
				waveMinPeak = wave.getPeak();	
		}
		this.duration = waveEnd - waveStart;
		this.maxPeak = waveMaxPeak;
		this.minPeak = waveMinPeak;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public float getMinPeak() {
		return minPeak;
	}
	public void setMinPeak(float minPeak) {
		this.minPeak = minPeak;
	}
	public float getMaxPeak() {
		return maxPeak;
	}
	public void setMaxPeak(float maxPeak) {
		this.maxPeak = maxPeak;
	}
	
	

}
