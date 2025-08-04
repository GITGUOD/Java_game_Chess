public abstract ChessPiece implements Piece {
    private String color;
    private Position position;

    public ChessPiece(String color, Position position) {
        this.color = color;
        this.position = position;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public Position getPosition() {
        return position;
    }

    @Override
    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public abstract List<String> getValidMoves(Board board);
}