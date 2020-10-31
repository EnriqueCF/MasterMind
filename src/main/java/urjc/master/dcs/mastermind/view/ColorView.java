package urjc.master.dcs.mastermind.view;

import urjc.master.dcs.mastermind.model.Color;
import urjc.master.dcs.mastermind.utils.Console;

public class ColorView {
	private static final char[] INITIALS = { 'r', 'b', 'y', 'g', 'o', 'p' };

	private Color color;

	ColorView(Color color) {
		this.color = color;
	}

	static String allInitials() {
		StringBuilder bld = new StringBuilder();

		for (char character : ColorView.INITIALS) {
			bld.append(character);
		}
		return bld.toString();
	}

	static Color getInstance(char character) {
		for (int i = 0; i < ColorView.INITIALS.length; i++) {
			if (ColorView.INITIALS[i] == character) {
				return Color.values()[i];
			}
		}
		return null;
	}

	void write() {
		Console.instance().write(ColorView.INITIALS[this.color.ordinal()]);
	}

}
