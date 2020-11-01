package doo.mastermind;

import doo.mastermind.controllers.FinishedController;
import doo.mastermind.controllers.PlayController;
import doo.mastermind.views.View;
import doo.mastermind.views.console.ViewConsole;

public class ConsoleMastermind extends Mastermind {

	public static void main(String[] args) {
		new ConsoleMastermind().play();
	}

	@Override
	protected View createView(PlayController playController, FinishedController finishedController) {
		return new ViewConsole(playController, finishedController);
	}

}
