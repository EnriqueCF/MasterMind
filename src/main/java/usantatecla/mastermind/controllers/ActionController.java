package usantatecla.mastermind.controllers;

import java.util.List;

import usantatecla.mastermind.models.Result;
import usantatecla.mastermind.models.Session;
import usantatecla.mastermind.types.Color;
import usantatecla.mastermind.types.Error;

public class ActionController extends UseCaseController {

	public ActionController(Session session) {
		super(session);
	}

	public Error addProposedCombination(List<Color> colors) {
		Error error = this.session.addProposedCombination(colors);
		if (error == null) {
			this.session.next();
		}
		return error;
	}

	public int getAttemps() {
		return this.session.getAttempts();
	}

	public Result getResult(int attempt) {
		return this.session.getResult(attempt);
	}

	public boolean isWinner() {
		return this.session.isWinner();
	}

	public boolean isLooser() {
		return this.session.isLooser();
	}

	public int getAttempts() {
		return this.session.getAttempts();
	}

	public int getBlacks(int position) {
		return this.session.getBlacks(position);
	}

	public List<Color> getColors(int position) {
		return this.session.getColors(position);
	}

	public int getWhites(int position) {
		return this.session.getWhites(position);
	}
}
