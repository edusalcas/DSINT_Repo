package domain;

public abstract class Issue {
	
	private String message;
	
	public Issue (String message) {
		this.message = message;
	}

	public String getMessage() {
		return message + data();
	}

	protected abstract String data();

	public void setMessage(String message) {
		this.message = message;
	}

}
