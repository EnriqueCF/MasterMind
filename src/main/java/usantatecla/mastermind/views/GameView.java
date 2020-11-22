package usantatecla.mastermind.views;

import usantatecla.mastermind.models.Game;
import usantatecla.utils.WithConsoleView;

public class GameView extends WithConsoleView{

	private Game game;
	
	public GameView(Game game) {
		this.game = game;
	}
	
	public void writeTurn() {
		MessageView.ATTEMPTS.writeln(this.game.getAttempts());
        new SecretCombinationView().writeln();
        
        for(int i = 0; i< this.game.getAttempts(); i++){
            new ProposedCombinationView(this.game.getProposedCombination(i)).write();
            new ResultView().writeln(this.game.getBlacks(i), this.game.getWhites(i));

        }
	}
}
