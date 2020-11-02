package usantatecla.mastermind.views;

import usantatecla.mastermind.models.Combination;
import usantatecla.mastermind.models.ProposedCombination;
import usantatecla.mastermind.types.Color;
import usantatecla.mastermind.types.Error;
import usantatecla.utils.WithConsoleView;

public class ProposalView extends WithConsoleView {

	public ProposedCombination read() {
		ProposedCombination combination = new ProposedCombination();
		Error error;
		do {
			error = null;
			String characters = this.console.readString(MessageView.PROPOSED_COMBINATION.toString());

			if (characters.length() > Combination.getWidth()) {
				error = Error.WRONG_LENGTH;
			} else {
				for (int i = 0; i < characters.length(); i++) {
					Color color = ColorView.getInstance(characters.charAt(i));
					if (color == null) {
						error = Error.WRONG_CHARACTERS;
					} else {
						if (combination.getColors().contains(color)) {
							error = Error.DUPLICATED;
						} else {
							combination.getColors().add(color);
						}
					}
				}
			}

			if (error != null) {
				new ErrorView(error).writeln();
				combination.getColors().clear();
			}

		} while (error != null);

        return combination;
    }

}
