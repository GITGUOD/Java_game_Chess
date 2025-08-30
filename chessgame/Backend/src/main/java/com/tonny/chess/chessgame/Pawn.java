public class Pawn extends ChessPiece {

    public Pawn(String color, Position position) {
        super(color, position);
    }

    @Override
    public List<Position> getValidMoves(Board board) {
        List<Position> validMoves = new ArrayList<>();
        // Logic to calculate valid moves for a pawn
        // Pawns can move forward one square, or two squares from their starting position
        // Add logic to check for obstacles and board boundaries

        int direction = 0;
        if(this.color.equals("WHITE")) {
            direction = 1;
        } else {
            direction = -1;
        }

        //Gå framåt ett steg

        Position forward = new Position(this.position().getRow() + direction, this.position().getCol());

        //Gå framåt 2 steg vid första rörelsen

        Position firstForward = new Position(this.position().getRow() + direction * 2, this.position().getCol());
        if(board.isValidMove() && board.getPieceAt(forward) == null && !isFirstMove()) {
            validMoves.add(forward);
        } else if(isFirstMove() &&board.isValidMove() && board.getPieceAt(firstForward) == null) {
            validMoves.add(firstForward);
        }

        
        return validMoves;
    }

    public boolean isFirstMove() {
        // Logic to determine if this is the pawn's first move

        if(this.color.equals("WHITE")) {
            if(this.position.getRow() == 1) {
                return true;
            }
        } else {
            if(this.position.getRow() == 6) {
                return true;
            }
        }
        return false;
    }
    
    public boolean canPromote() {
        // Logic to determine if the pawn can be promoted
    
        if(this.color.equals("WHITE")) {
            return this.position.getRow() == 7; // Pawns can be promoted when they reach the last row
        } else {
            return this.position.getRow() == 0; // Pawns can be promoted when they reach the last row

        }
    }

    public Piece promote(String newPieceType) {
        // Logic to promote the pawn to a new piece type (e.g., Queen, Rook, Bishop, Knight)
        // Implement actual promotion logic here
        if (canPromote()) {
            switch (newPieceType.toLowerCase()) {
                case "queen":
                    // Replace with Queen piece
                    System.out.println("Pawn promoted to Queen");
                    return new Queen(this.color, this.position);
                case "rook":
                    // Replace with Rook piece
                    System.out.println("Pawn promoted to Rook");
                    return new Rook(this.color, this.position);
                case "bishop":
                    // Replace with Bishop piece
                    System.out.println("Pawn promoted to Bishop");
                    return new Bishop(this.color, this.position);
                case "knight":
                    // Replace with Knight piece
                    System.out.println("Pawn promoted to Knight");
                    return new Knight(this.color, this.position);
                    
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

        if(this.color.equals("WHITE")) {
            this.position.setRow(getPosition().getRow() + 1);
        } else {
            this.position.setRow(getPosition().getRow() - 1);
        }
    }


}
