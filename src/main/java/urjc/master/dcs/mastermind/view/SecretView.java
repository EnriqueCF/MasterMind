package urjc.master.dcs.mastermind.view;

import urjc.master.dcs.mastermind.model.Secret;
import urjc.master.dcs.mastermind.utils.Console;

public class SecretView {

	private Secret secret;

	public SecretView(Secret secret) {
		this.secret = secret;
	}

	public void writeln() {
		Console.instance().write("Secret: ");
		this.secret.getCombination().stream().forEach(p -> MessageView.SECRET.write());
		Console.instance().writeln();
	}
}
