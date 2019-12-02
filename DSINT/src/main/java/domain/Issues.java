package domain;

public class Issues {
	
	private boolean hypokalemia = false;
	private boolean hypocalcemia = false;
	private boolean isqCor = false;
	private boolean atrialFlu = false;
	private boolean ami = false;
	private boolean bradycar = false;
	private boolean tachycar = false;
	private boolean ventricularContr = false;

	public boolean isHypokalemia() {
		return hypokalemia;
	}

	public void setHypokalemia(boolean hypokalemia) {
		this.hypokalemia = hypokalemia;
	}

	public boolean isHypocalcemia() {
		return hypocalcemia;
	}

	public void setHypocalcemia(boolean hypocalcemia) {
		this.hypocalcemia = hypocalcemia;
	}

	public boolean isIsqCor() {
		return isqCor;
	}

	public void setIsqCor(boolean isqCor) {
		this.isqCor = isqCor;
	}

	public boolean isAtrialFlu() {
		return atrialFlu;
	}

	public void setAtrialFlu(boolean atrialFlu) {
		this.atrialFlu = atrialFlu;
	}

	public boolean isAmi() {
		return ami;
	}

	public void setAmi(boolean ami) {
		this.ami = ami;
	}

	public boolean isBradycar() {
		return bradycar;
	}

	public void setBradycar(boolean bradycar) {
		this.bradycar = bradycar;
	}

	public boolean isTachycar() {
		return tachycar;
	}

	public void setTachycar(boolean tachycar) {
		this.tachycar = tachycar;
	}

	public boolean isVentricularContr() {
		return ventricularContr;
	}

	public void setVentricularContr(boolean ventricularContr) {
		this.ventricularContr = ventricularContr;
	}
	

}
