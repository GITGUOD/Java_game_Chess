public abstract ChessPiece implements Piece {
    private String color;
    private String position;

    public ChessPiece(String color, String position) {
        this.color = color;
        this.position = position;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public abstract List<String> getValidMoves(Board board);
}