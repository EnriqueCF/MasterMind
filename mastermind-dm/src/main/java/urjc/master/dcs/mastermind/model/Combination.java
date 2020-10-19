package urjc.master.dcs.mastermind.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Combination {

	public static final int MAX_SIZE = 5;
	
	protected List<Color> colors;

	protected Combination() {
		this.colors = new ArrayList<Color>();
	}
}
