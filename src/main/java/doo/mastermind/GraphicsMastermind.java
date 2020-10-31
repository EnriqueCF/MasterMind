package doo.mastermind;

import doo.mastermind.models.Board;
import doo.mastermind.views.View;
import doo.mastermind.views.graphics.ViewGraphics;

public class GraphicsMastermind extends Mastermind {

	@Override
	protected View createView(Board board) {
		return new ViewGraphics(board);
	}

	public static void main(String[] args) {
		new GraphicsMastermind().play();
	}
}
