package doo.mastermind.controllers;

import doo.mastermind.models.Board;

public abstract class Controller {

	protected Board board;
	
	Controller(Board board) {
		this.board = board;
	}
}
