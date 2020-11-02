package usantatecla.mastermind.models;

import java.util.List;

public class Memento {

	private List<ProposedCombination> proposedCombinations;
	private List<Result> results;
	private int attempts;

	public Memento(List<ProposedCombination> proposedCombinations, List<Result> results, int attempts) {
		super();
		this.proposedCombinations = proposedCombinations;
		this.results = results;
		this.attempts = attempts;
	}

	public List<ProposedCombination> getProposedCombinations() {
		return proposedCombinations;
	}

	public List<Result> getResults() {
		return results;
	}

	public int getAttempts() {
		return attempts;
	}

}
