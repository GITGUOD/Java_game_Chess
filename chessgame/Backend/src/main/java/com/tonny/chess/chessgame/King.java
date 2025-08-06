public class King extends ChessPiece {

    public King(String color, Position position) {
        super(color, position);
    }

    @Override
    public List<String> getValidMoves(Board board) {
        List<String> validMoves = new ArrayList<>();
        // Logic to calculate valid moves for the King piece
        // The King can move one square in any direction
        String[] directions = {"N", "NE", "E", "SE", "S", "SW", "W", "NW"};
        
        for (String direction : directions) {
            String newPosition = calculateNewPosition(getPosition(), direction);
            if (isValidMove(newPosition, board)) {
                validMoves.add(newPosition);
            }
        }
        
        return validMoves;
    }

    private String calculateNewPosition(String currentPosition, String direction) {
        // Logic to calculate the new position based on the current position and direction
        // This is a placeholder implementation
        return currentPosition; // Replace with actual logic
    }

    private boolean isValidMove(String position, Board board) {
        // Logic to check if the move is valid (e.g., not occupied by own piece, within bounds)
        Piece pieceAtPosition = board.getPieceAt(position);
        return pieceAtPosition == null || !pieceAtPosition.getColor().equals(getColor());
    }

}
