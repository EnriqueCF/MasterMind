package doo.mastermind.views;

public abstract class View {
	
	public void interact() {
		boolean newGame;
		do {
			this.start();
			boolean finished;
			do {
				finished = this.play();
			} while (!finished);
			newGame = this.finished();
		} while (newGame);
	}
	
	protected abstract void start();
	protected abstract boolean play();
	protected abstract boolean finished();

}
