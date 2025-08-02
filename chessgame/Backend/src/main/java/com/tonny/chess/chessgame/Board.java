public class Board {
    private List<Piece> pieces;

    public Board() {
        pieces = new ArrayList<>();
    }

    public void addPiece(Piece piece) {
        pieces.add(piece);
    }

    public List<Piece> getPieces() {
        return pieces;
    }

    public Piece getPieceAt(String position) {
        for (Piece piece : pieces) {
            if (piece.getPosition().equals(position)) {
                return piece;
            }
        }
        return null;
    }
}
