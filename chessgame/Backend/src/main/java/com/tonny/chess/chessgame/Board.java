public class Board {
    private List<Piece> pieces;
    private int[][] board;

    public Board() {
        pieces = new ArrayList<>();
        board = new int[8][8]; // Initialize an 8x8 chess board
    }

    public void addPiece(Piece piece, Position position) {
        pieces.add(piece);
        board[position.getRow()][position.getCol()] = piece;
    }

    public List<Piece> getPieces() {
        return pieces;
    }

    public Piece getPieceAt(Position position) {
    for (Piece piece : pieces) {
        if (piece.getPosition().equals(position)) {
            return piece;
        }
    }
    return null;
}

}
