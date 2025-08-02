import java.util.*;

public interface Piece {
    // Get the color of the piece (e.g., "WHITE" or "BLACK")
    String getColor();

    // Get the current position of the piece on the board (e.g., "e4")
    String getPosition();

    // Set the position of the piece (after a move)
    void setPosition(String position);

    // Get all possible valid moves for this piece from its current position
    List<String> getValidMoves(Board board);

}