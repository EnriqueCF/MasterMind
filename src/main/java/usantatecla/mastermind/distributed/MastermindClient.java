package usantatecla.mastermind.distributed;

import usantatecla.mastermind.Mastermind;

public class MastermindClient extends Mastermind{

	protected boolean isStandalone() {
		return false;
	}
	
	public static void main(String[] args) {
		new MastermindClient().play();
	}
}
