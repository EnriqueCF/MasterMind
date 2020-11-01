package usantatecla.mastermind.controllers;

import java.util.List;

import usantatecla.mastermind.models.Combination;
import usantatecla.mastermind.models.Board;
import usantatecla.mastermind.models.State;
import usantatecla.mastermind.types.Color;
import usantatecla.mastermind.types.Error;

public class ProposalController extends Controller {

	public ProposalController(Board board, State state) {
		super(board, state);
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
					for (int j = i+1; j < colors.size(); j++) {
						if (colors.get(i) == colors.get(j)) {
							error = Error.DUPLICATED;
						}
					}
				}				
			}
		}
		if (error == null){
			this.board.addProposedCombination(colors);
			if (this.board.isWinner() || this.board.isLooser()) {
				this.state.next();
			}
		}
		return error;	
	}

	public boolean isWinner() {
		return this.board.isWinner();
	}

	public boolean isLooser() {
		return this.board.isLooser();
	}
	
	public int getAttempts() {
		return this.board.getAttempts();
	}

	public List<Color> getColors(int position) {
		return this.board.getColors(position);
	}

	public int getBlacks(int position) {
		return this.board.getBlacks(position);
	}

	public int getWhites(int position) {
		return this.board.getWhites(position);
	}
	
	@Override
	public void accept(ControllersVisitor controllersVisitor) {
		controllersVisitor.visit(this);
	}

}
