package urjc.master.dcs.mastermind;

import java.util.ArrayList;

import urjc.master.dcs.mastermind.utils.Console;

public class Proposed extends Combination{

	Proposed(){
	}
	
	void write() {
		assert this.colors != null;
		for (Color color : this.colors) {
			color.write();
		}
	}
	
	void read() {
		Error error;
		do {
			Message.PROPOSED_COMBINATION.write();
			error = checkInput(Console.instance().readString());
			error.writeln();
			if(!error.isNull()) {
				this.colors = new ArrayList<Color>();
			}
		} while (!error.isNull());
	}
	
	private Error checkInput(String characters) {
		if(characters.length() != Combination.MAX_SIZE) {
			return Error.WRONG_LENGTH;
		}
		
		for(int i= 0; i<characters.length(); i++) {
			Color color = Color.getInstance(characters.charAt(i));
			if(color.isNull()) {
				return Error.WRONG_CHARACTERS;
			}
			this.colors.add(color);
		}
		return Error.NULL;
	}
	
	boolean contains(Color color, int position) {
		return this.colors.get(position) == color;
	}

	boolean contains(Color color) {
		for (int i = 0; i < this.colors.size(); i++) {
			if (this.colors.get(i) == color) {
				return true;
			}
		}
		return false;
	}

}
