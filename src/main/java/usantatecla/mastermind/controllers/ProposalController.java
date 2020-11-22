package usantatecla.mastermind.controllers;

import java.util.List;

import usantatecla.mastermind.models.Combination;
import usantatecla.mastermind.models.Game;
import usantatecla.mastermind.models.ProposedCombination;
import usantatecla.mastermind.models.State;
import usantatecla.mastermind.types.Color;
import usantatecla.mastermind.types.Error;
import usantatecla.mastermind.views.ErrorView;
import usantatecla.mastermind.views.GameView;
import usantatecla.mastermind.views.MessageView;
import usantatecla.mastermind.views.ProposedCombinationView;

public class ProposalController extends Controller {

	public ProposalController(Game game, State state) {
		super(game, state);
	}

	public boolean isWinner() {
		return this.game.isWinner();
	}

	public boolean isLooser() {
		return this.game.isLooser();
	}

	public int getAttempts() {
		return this.game.getAttempts();
	}

	public List<Color> getColors(int position) {
		return this.game.getColors(position);
	}

	public int getBlacks(int position) {
		return this.game.getBlacks(position);
	}

	public int getWhites(int position) {
		return this.game.getWhites(position);
	}

	@Override
	public void control() {
		ProposedCombination proposedCombination = this.read();
		this.game.addProposedCombination(proposedCombination.getColors());
		new GameView(game).writeTurn();
		
		if(this.game.isFinished()) {
			if(this.game.isLooser()) {
				MessageView.PLAYER_LOST.writeln();
			} else {
				MessageView.PLAYER_WIN.writeln();

			}
			this.state.next();
		}
	}

	Error isProposedCombinationValid(List<Color> colors) {
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
		return error;
	}

	ProposedCombination read() {
		ProposedCombination proposedCombination = new ProposedCombination();
		Error error;
		do {
			List<Color> colors = new ProposedCombinationView(proposedCombination).read();
			error = this.isProposedCombinationValid(colors);
			if (error != null) {
				new ErrorView(error).writeln();
			} else {
				proposedCombination = new ProposedCombination(colors);
			}
		} while (error != null);

		return proposedCombination;
	}

}
