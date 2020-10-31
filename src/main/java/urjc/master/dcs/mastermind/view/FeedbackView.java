package urjc.master.dcs.mastermind.view;

import urjc.master.dcs.mastermind.model.Feedback;

public class FeedbackView {

	private Feedback feedback;

	public FeedbackView(Feedback feedback) {
		this.feedback = feedback;
	}

	public void writeln() {
		MessageView.RESULT.writeln(this.feedback.getBlacks(), this.feedback.getWhites());
	}
}
