public class Pawn extends ChessPiece {

    public Pawn(String color, Position position) {
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

    public boolean isFirstMove() {
        // Logic to determine if this is the pawn's first move
        if (this.position.getRow() == 1 && this.position.getCol() == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean canPromote() {
        // Logic to determine if the pawn can be promoted
        return this.position.getRow() == 7; // Pawns can be promoted when they reach the last row
    }

    public void promote(String newPieceType) {
        // Logic to promote the pawn to a new piece type (e.g., Queen, Rook, Bishop, Knight)
        // Implement actual promotion logic here
        if (canPromote()) {
            switch (newPieceType.toLowerCase()) {
                case "queen":
                    // Replace with Queen piece
                    System.out.println("Pawn promoted to Queen");
                    break;
                case "rook":
                    // Replace with Rook piece
                    System.out.println("Pawn promoted to Rook");
                    break;
                case "bishop":
                    // Replace with Bishop piece
                    System.out.println("Pawn promoted to Bishop");
                    break;
                case "knight":
                    // Replace with Knight piece
                    System.out.println("Pawn promoted to Knight");
                    break;
                default:
                    throw new IllegalArgumentException("Invalid piece type for promotion");
            }
        } else {
            throw new IllegalStateException("Pawn cannot be promoted yet");
        }

    }

    public void movePosition() {
        // Logic to calculate the new position based on the current position and direction
        // This is a placeholder implementation

        this.position.getPosition().setRow(getPosition().getRow() + 1);
        System.out.print(this.position.getPosition().setCol(getPosition().getCol()));
    }


}
