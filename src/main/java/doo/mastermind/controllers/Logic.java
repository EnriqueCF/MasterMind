package doo.mastermind.controllers;

import doo.mastermind.models.Board;
import doo.mastermind.models.ProposedCombination;
import doo.mastermind.models.Result;

public class Logic {

	private Board board;
	private PlayController playController;
	private FinishController finishController;

	public Logic() {
		this.board = new Board();
		this.playController = new PlayController(board);
		this.finishController = new FinishController(board);
	}

	public boolean isLooser() {
		return this.playController.isLooser();
	}

	public boolean isWinner() {
		return this.playController.isWinner();
	}

	public ProposedCombination getProposedCombination(int i) {
		return this.playController.getProposedCombination(i);
	}

	public Result getResult(int i) {
		return this.playController.getResult(i);
	}

	public int getAttempts() {
		return this.playController.getAttempts();
	}

	public void addProposedCombination(ProposedCombination combination) {
		this.playController.addProposedCombination(combination);
	}

	public void clear() {
		this.finishController.clear();
	}

}
