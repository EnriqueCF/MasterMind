package urjc.master.dcs.mastermind.model;

public enum Color {
	RED, 
	BLUE, 
	YELLOW, 
	GREEN, 
	ORANGE, 
	PURPLE;

	static int length() {
		return Color.values().length;
	}
}
