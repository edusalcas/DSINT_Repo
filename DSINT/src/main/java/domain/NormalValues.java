package domain;

public class NormalValues {
	
	private final int maxBPM = 60;
	private final int minBPM = 100;
	private final float maxPeakWaveT = 0.55f;
	private final float minPeakWaveT = 0.1f;
	private final int maxQTDuration = 420;
	
	public int getMaxBPM() {
		return maxBPM;
	}
	public int getMinBPM() {
		return minBPM;
	}
	public float getMaxPeakWaveT() {
		return maxPeakWaveT;
	}
	public float getMinPeakWaveT() {
		return minPeakWaveT;
	}
	public int getMaxQTDuration() {
		return maxQTDuration;
	}

}
