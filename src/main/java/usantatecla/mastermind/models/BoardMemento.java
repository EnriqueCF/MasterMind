package usantatecla.mastermind.models;

import java.util.List;

public class BoardMemento {

	private List<ProposedCombination> proposedCombinations;
	private List<Result> results;
	private int attempts;

	public BoardMemento(List<ProposedCombination> proposedCombinations, List<Result> results, int attempts) {
		super();
		this.proposedCombinations = proposedCombinations;
		this.results = results;
		this.attempts = attempts;
	}

	public List<ProposedCombination> getProposedCombinations() {
		return proposedCombinations;
	}

	public void setProposedCombinations(List<ProposedCombination> proposedCombinations) {
		this.proposedCombinations = proposedCombinations;
	}

	public List<Result> getResults() {
		return results;
	}

	public void setResults(List<Result> results) {
		this.results = results;
	}

	public int getAttempts() {
		return attempts;
	}

	public void setAttempts(int attempts) {
		this.attempts = attempts;
	}

}
