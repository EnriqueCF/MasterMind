package doo.mastermind;

import doo.mastermind.controllers.Logic;
import doo.mastermind.views.View;
import doo.mastermind.views.console.ViewConsole;

public class ConsoleMastermind extends Mastermind {

	public static void main(String[] args) {
		new ConsoleMastermind().play();
	}

	@Override
	protected View createView(Logic logic) {
		return new ViewConsole(logic);
	}

}
