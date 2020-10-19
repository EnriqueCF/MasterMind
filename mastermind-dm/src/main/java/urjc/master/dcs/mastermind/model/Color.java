package urjc.master.dcs.mastermind.model;

public enum Color {

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

	public static String getInitials() {
		StringBuilder bld = new StringBuilder();

		for (int i = 0; i < Color.length(); i++) {
			bld.append(Color.get(i).initial);
		}
		return bld.toString();
	}

	public static Color getInstance(char character) {
		for (int i = 0; i < Color.length(); i++) {
			if (Color.get(i).initial == character) {
				return Color.get(i);
			}
		}
		return Color.NULL_COLOR;
	}

	public static int length() {
		return Color.values().length - 1;
	}

	public static Color get(int index) {
		return Color.values()[index];
	}

	public boolean isNull() {
		return this == Color.NULL_COLOR;
	}
}