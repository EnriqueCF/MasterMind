package urjc.master.dcs.mastermind;

import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import urjc.master.dcs.mastermind.utils.Console;

public class Secret extends Combination {

	public Secret() {
		super();
		Set<Integer> alreadyUsedNumbers = new HashSet<Integer>();
		Random random = new Random();

		while (alreadyUsedNumbers.size() < MAX_SIZE) {
			int randomNumber = random.nextInt(Color.length());
			if (!alreadyUsedNumbers.contains(randomNumber)) {
				this.colors.add(Color.get(randomNumber));
				alreadyUsedNumbers.add(randomNumber);
			}
		}
		Collections.shuffle(this.colors);
	}
	
	public void writeln() {
		Console.instance().write("Secret: ");
		this.colors.stream().forEach(p -> Message.SECRET.write());
		Console.instance().writeln();
	}
}
