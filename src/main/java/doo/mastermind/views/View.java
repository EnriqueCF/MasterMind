package doo.mastermind.views;

import doo.mastermind.controllers.Controller;

public abstract class View {
	
//	public void interact() {
//		boolean newGame;
//		do {
//			this.start();
//			boolean finished;
//			do {
//				finished = this.play();
//			} while (!finished);
//			newGame = this.isFinished();
//		} while (newGame);
//	}
//	
//	protected abstract void start();
//	protected abstract boolean play();
//	protected abstract boolean isFinished();
	
	public abstract void interact(Controller controller);

}
