package doo.mastermind;

import doo.mastermind.controllers.FinishedController;
import doo.mastermind.controllers.PlayController;
import doo.mastermind.views.View;
import doo.mastermind.views.graphics.ViewGraphics;

public class GraphicsMastermind extends Mastermind {

	public static void main(String[] args) {
		new GraphicsMastermind().play();
	}

	@Override
	protected View createView(PlayController playController, FinishedController finishedController) {
		return new ViewGraphics(playController, finishedController);
	}
}
