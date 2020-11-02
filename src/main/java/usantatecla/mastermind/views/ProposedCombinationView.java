package usantatecla.mastermind.views;

import java.util.ArrayList;
import java.util.List;

import usantatecla.mastermind.models.ProposedCombination;
import usantatecla.mastermind.types.Color;
import usantatecla.utils.WithConsoleView;

public class ProposedCombinationView extends WithConsoleView {

	private ProposedCombination proposalCombination;

	public ProposedCombinationView(ProposedCombination proposalCombination) {
		this.proposalCombination = proposalCombination;
	}

	public ProposedCombinationView() {
	}

//	void write(int position) {
//		for (Color color : this.proposalCombination.getColors(position)) {
//			new ColorView(color).write();
//		}
//	}

	public void write(List<Color> list) {
		for (Color color : list) {
			new ColorView(color).write();
		}
	}

	public List<Color> read() {
		String characters = this.console.readString(MessageView.PROPOSED_COMBINATION.getMessage());
		List<Color> colors = new ArrayList<Color>();
		for (int i = 0; i < characters.length(); i++) {
			colors.add(ColorView.getInstance(characters.charAt(i)));
		}
		return colors;
	}

}
