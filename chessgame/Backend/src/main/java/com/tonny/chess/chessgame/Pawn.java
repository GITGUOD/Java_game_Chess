public class Pawn extends ChessPiece {

    public Pawn(String color, String position) {
        super(color, position);
    }

    @Override
    public List<String> getValidMoves(Board board) {
        List<String> validMoves = new ArrayList<>();
        // Logic to calculate valid moves for a pawn
        // Pawns can move forward one square, or two squares from their starting position
        // Add logic to check for obstacles and board boundaries
        return validMoves;
    }
}
