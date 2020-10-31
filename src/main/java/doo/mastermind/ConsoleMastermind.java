package doo.mastermind;

import doo.mastermind.models.Board;
import doo.mastermind.views.View;
import doo.mastermind.views.console.ViewConsole;

public class ConsoleMastermind extends Mastermind {

	@Override
	protected View createView(Board board) {
		return new ViewConsole(board);
	}
	
	public static void main(String[] args) {
		new ConsoleMastermind().play();
	}

}
