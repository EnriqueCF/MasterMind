package urjc.master.dcs.mastermind.model;

import java.util.ArrayList;
import java.util.List;

public class Proposed extends Combination {

	Proposed() {
		this.colors=new ArrayList<Color>();
	}

	public List<Color> getColors() {
		return this.colors;
	}

	boolean contains(Color color, int position) {
		return this.colors.get(position) == color;
	}

	boolean contains(Color color) {
		for (int i = 0; i < this.colors.size(); i++) {
			if (this.colors.get(i) == color) {
				return true;
			}
		}
		return false;
	}

}
