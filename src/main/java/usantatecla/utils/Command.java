package usantatecla.utils;

public abstract class Command {

	protected String tittle;
	protected abstract void execute();
	protected abstract boolean isActive();

	protected Command(String title) {
		this.tittle = title;
	}

	public String getTitle() {
		return this.tittle;
	}
}
