package urjc.master.dcs.mastermind.model;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Secret extends Combination {

	public Secret() {
		super();
		Set<Integer> alreadyUsedNumbers = new HashSet<Integer>();
		Random random = new Random();

		while (alreadyUsedNumbers.size() < MAX_SIZE) {
			int randomNumber = random.nextInt(super.MAX_SIZE);
			if (!alreadyUsedNumbers.contains(randomNumber)) {
				this.colors.add(Color.get(randomNumber));
				alreadyUsedNumbers.add(randomNumber);
			}
		}
		Collections.shuffle(this.colors);
	}
	
	public List<Color> getCombination(){
		return this.colors;
	}

}
