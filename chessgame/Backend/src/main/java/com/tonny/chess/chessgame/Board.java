public class Board {
    private Piece[][] board;

    public Board() {
        board = new Piece[8][8]; // Initialize an 8x8 chess board
    }

    public void addPiece(Piece piece, Position position) {
        board[position.getRow()][position.getCol()] = piece;
        piece.setPosition(position);
    }

    public Piece getPieceAt(Position position) {
        if (!isInsideBoard(position)) {
            return null;
        }
        return board[position.getRow()][position.getCol()];
    }

    public void movePiece(Piece piece, Position newPosition) {
        if (!isValidMove(piece, newPosition)) {
            throw new IllegalArgumentException("Invalid move for piece: " + piece);
        }

        Position oldPosition = piece.getPosition();
        board[oldPosition.getRow()][oldPosition.getCol()] = null;

        // Capture if piece exists on newPosition
        Piece targetPiece = getPieceAt(newPosition);
        if (targetPiece != null) {
            // Hantera borttagning av pjäs (t.ex. ta bort från spel, uppdatera status)
        }

        piece.setPosition(newPosition);
        board[newPosition.getRow()][newPosition.getCol()] = piece;
    }

    public boolean isValidMove(Piece piece, Position newPosition) {
        if (!isInsideBoard(newPosition)) {
            return false;
        }
        // Additional rules for specific piece types can be added here
        if (getPieceAt(newPosition) != null && getPieceAt(newPosition).getColor().equals(piece.getColor())) {
            return false; // Cannot capture own piece
        }
        // Check if the move is valid for the specific piece type
        return true;
    }

    public boolean isInsideBoard(Position position) {
        return position.getRow() >= 0 && position.getRow() < 8 && position.getCol() >= 0 && position.getCol() < 8;
    }

}
