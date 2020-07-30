package usantatecla.tictactoe.views;

import usantatecla.tictactoe.models.Token;

public class TokenView {

	private Token token;

	public TokenView(Token token){
		this.token = token;
	}

	public char getToken() {
		return this.token.getChar();
	}
}