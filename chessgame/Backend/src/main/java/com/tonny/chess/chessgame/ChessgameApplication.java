package com.tonny.chess.chessgame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ChessgameApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChessgameApplication.class, args);
		createBoard();
		System.out.println("Hi");

	}

	public static void createBoard() {
		// Initialize the chess board and pieces here
		Board board = new Board();
		createChessPieces(board);

		// Add more pieces as needed
		System.out.println("Board created with initial pieces.");
	}

	public void createChessPieces(Board board) {
		// Create chess pieces and add them to the board
		board.addPiece(new Pawn("WHITE", "e2"));
		board.addPiece(new Pawn("BLACK", "e7"));
		board.addPiece(new Rook("WHITE", "a1"));
		board.addPiece(new Rook("WHITE", "h1"));
		board.addPiece(new Rook("BLACK", "a8"));
		// Add more pieces as needed
		System.out.println("Chess pieces created and added to the board.");
	}	

}
