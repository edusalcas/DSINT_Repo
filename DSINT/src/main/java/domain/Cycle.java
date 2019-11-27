package domain;

public class Cycle {

	private P pWave;
	private Q qWave;
	private R rWave;
	private S sWave;
	private T tWave;
	private final QRSComplex qrs;
	private final STSegment st;
	private final QTIntervale qt;
	private int cycle;

	public Cycle(int cycle, P p, Q q, R r, S s, T t) {
		this.pWave = p;
		this.qWave = q;
		this.rWave = r;
		this.sWave = s;
		this.tWave = t;
		this.cycle = cycle;
		this.qrs = new QRSComplex(q, r, s);
		this.qt = new QTIntervale(q, r, s, t);
		this.st = new STSegment(s, t);
	}

	public QRSComplex getQrs() {
		return qrs;
	}

	public STSegment getSt() {
		return st;
	}

	public QTIntervale getQt() {
		return qt;
	}

	public P getpWave() {
		return pWave;
	}

	public void setpWave(P pWave) {
		this.pWave = pWave;
	}

	public Q getqWave() {
		return qWave;
	}

	public void setqWave(Q qWave) {
		this.qWave = qWave;
	}

	public R getrWave() {
		return rWave;
	}

	public void setrWave(R rWave) {
		this.rWave = rWave;
	}

	public S getsWave() {
		return sWave;
	}

	public void setsWave(S sWave) {
		this.sWave = sWave;
	}

	public T gettWave() {
		return tWave;
	}

	public void settWave(T tWave) {
		this.tWave = tWave;
	}

	public int getCycle() {
		return cycle;
	}

	public void setCycle(int cycle) {
		this.cycle = cycle;
	};

}
