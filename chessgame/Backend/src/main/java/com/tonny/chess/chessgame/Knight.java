public class Knight extends ChessPiece {

    public Knight(String color, String position) {
        super(color, position);
    }

    @Override
    public List<String> getValidMoves(Board board) {
        // Implement logic to calculate valid moves for the knight
        List<String> validMoves = new ArrayList<>();
        // Example logic (not complete):
        // Add positions like "g3", "f5", etc. based on knight's movement rules
        return validMoves;
    }
}
