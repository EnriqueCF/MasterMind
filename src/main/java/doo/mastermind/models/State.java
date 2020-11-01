package doo.mastermind.models;

public class State {
	private StateValue value;

	public State() {
		reset();
	}

	public void reset() {
		this.value = StateValue.INITIAL;
	}

	public void next() {
		this.value = StateValue.values()[this.value.ordinal() + 1];
	}

	public StateValue getValueState() {
		return this.value;
	}
}
