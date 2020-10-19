package urjc.master.dcs.mastermind;

import urjc.master.dcs.mastermind.utils.Console;

enum Color {

	RED('r'),
	BLUE('b'), 
	YELLOW('y'), 
	GREEN('g'), 
	PINK('p'), 
	WHITE('w'), 
	NULL_COLOR;

	private char initial;
	
	private Color() {
	}

	private Color(char initial) {
		this.initial = initial;
	}

	static String getInitials() {
		StringBuilder bld = new StringBuilder();

		for (int i = 0; i < Color.length(); i++) {
			bld.append(Color.get(i).initial);
		}
		return bld.toString();
	}

	static Color getInstance(char character) {
		for (int i = 0; i < Color.length(); i++) {
			if (Color.get(i).initial == character) {
				return Color.get(i);
			}
		}
		return Color.NULL_COLOR;
	}

	static int length() {
		return Color.values().length - 1;
	}

	static Color get(int index) {
		return Color.values()[index];
	}

	void write() {
		assert this != Color.NULL_COLOR;
		new Console().write(this.initial);
	}

	boolean isNull() {
		return this == Color.NULL_COLOR;
	}

}
