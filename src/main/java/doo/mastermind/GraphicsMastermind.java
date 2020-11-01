package doo.mastermind;

import doo.mastermind.controllers.Logic;
import doo.mastermind.views.View;
import doo.mastermind.views.graphics.ViewGraphics;

public class GraphicsMastermind extends Mastermind {

	public static void main(String[] args) {
		new GraphicsMastermind().play();
	}

	@Override
	protected View createView(Logic logic) {
		return new ViewGraphics(logic);
	}
}
