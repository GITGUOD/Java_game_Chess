public class Rook extends ChessPiece {

    public Rook(String color, String position) {
        super(color, position);
    }

    @Override
    public List<String> getValidMoves(Board board) {
        List<String> validMoves = new ArrayList<>();
        // Logic to calculate valid moves for a rook
        // Rooks can move horizontally or vertically any number of squares
        // Add logic to check for obstacles and board boundaries
        return validMoves;
    }
}