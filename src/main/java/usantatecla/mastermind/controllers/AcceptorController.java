package usantatecla.mastermind.controllers;

public interface AcceptorController {

	protected TCPIP tcpip;

	AcceptorController(Session session, TCPIP tcpip) {
		super(session);
		this.tcpip = tcpip;
	}

	public abstract void accept(ControllersVisitor controllersVisitor);
}
