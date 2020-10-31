package urjc.master.dcs.mastermind.model;

import java.util.ArrayList;
import java.util.List;

public class Feedback {
	public static final int MAX_SIZE = 5;
	private List<Match> matchs;
	private int blacks;
	private int whites;

	Feedback() {
		initialize();
	}

	Feedback(Proposed proposed, Secret secret) {
		initialize();

		for (int i = 0; i < proposed.colors.size(); i++) {
			Match match = Match.NULL;
			if (proposed.contains(secret.colors.get(i), i)) {
				this.blacks++;
				match = Match.SAME_POSITION;
			} else if (proposed.contains(secret.colors.get(i))) {
				this.whites++;
				match = Match.SAME_COLOR;
			}
			matchs.add(match);
		}
	}

	private void initialize() {
		this.blacks = 0;
		this.whites = 0;
		this.matchs = new ArrayList<Match>();
	}

	public List<Match> getMatchs() {
		return matchs;
	}

	public void setMatchs(List<Match> matchs) {
		this.matchs = matchs;
	}

	public boolean hasWinner() {
		return this.matchs.stream().allMatch(n -> n == Match.SAME_POSITION);
	}

	public int getBlacks() {
		return blacks;
	}

	public int getWhites() {
		return whites;
	}

}
