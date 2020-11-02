package usantatecla.mastermind.views.console;

import usantatecla.mastermind.types.Color;
import usantatecla.utils.Console;

class ConsoleColorView extends usantatecla.mastermind.views.ColorView {

	ConsoleColorView(Color color) {
		super(color);
	}
	
	void write() {
		new Console().write(ConsoleColorView.INITIALS[this.color.ordinal()]);
	}

}
