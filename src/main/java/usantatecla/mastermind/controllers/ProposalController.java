package usantatecla.mastermind.controllers;

import java.util.List;

import usantatecla.mastermind.models.Combination;
import usantatecla.mastermind.models.ProposedCombination;
import usantatecla.mastermind.models.Session;
import usantatecla.mastermind.types.Color;
import usantatecla.mastermind.types.Error;
import usantatecla.mastermind.views.ColorView;
import usantatecla.mastermind.views.ErrorView;
import usantatecla.mastermind.views.ProposalView;

public class ProposalController extends InGameController {

	public ProposalController(Session session) {
		super(session);
	}

	public void read() {
		ProposedCombination combination = new ProposedCombination();

	}

	public Error addProposedCombination(List<Color> colors) {
		Error error = null;
		if (colors.size() != Combination.getWidth()) {
			error = Error.WRONG_LENGTH;
		} else {
			for (int i = 0; i < colors.size(); i++) {
				if (colors.get(i) == null) {
					error = Error.WRONG_CHARACTERS;
				} else {
					for (int j = i + 1; j < colors.size(); j++) {
						if (colors.get(i) == colors.get(j)) {
							error = Error.DUPLICATED;
						}
					}
				}
			}
		}
		if (error == null) {
			this.session.addProposedCombination(colors);
			if (this.session.isWinner() || this.session.isLooser()) {
				this.session.next();
			}
		}
		return error;
	}

	@Override
	protected void inGameControl() {

		ProposedCombination proposedCombination = new ProposalView().read();

		this.session.addProposedCombination(proposedCombination.getColors());
		if (this.session.isWinner() || this.session.isLooser()) {
			this.session.next();
		}

	}

}
