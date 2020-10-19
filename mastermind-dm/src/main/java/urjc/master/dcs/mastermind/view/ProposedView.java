package urjc.master.dcs.mastermind.view;

import java.util.ArrayList;
import java.util.List;

import urjc.master.dcs.mastermind.model.Color;
import urjc.master.dcs.mastermind.model.Combination;
import urjc.master.dcs.mastermind.model.Error;
import urjc.master.dcs.mastermind.model.Proposed;
import urjc.master.dcs.mastermind.utils.Console;

public class ProposedView {

	private Proposed proposedCombination;
	
	public ProposedView(Proposed proposedCombination) {
		this.proposedCombination = proposedCombination;
		
	}
	
	
	public void write() {
		for (Color color : this.proposedCombination.getColors()) {
			new ColorView(color).write();
		}
	}
	
	public void read() {
		List<Color> color;
		Error error;
		do {
			MessageView.PROPOSED_COMBINATION.write();
			error = checkInput(Console.instance().readString());
			new ErrorView(error).writeln();
			if(!error.isNull()) {
				color = new ArrayList<Color>();
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
			this.proposedCombination.getColors().add(color);
		}
		return Error.NULL;
	}
	
	
}
