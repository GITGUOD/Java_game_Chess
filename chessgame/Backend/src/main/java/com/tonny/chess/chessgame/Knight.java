public class Knight {
    private String color;
    private String position;

    public Knight(String color, String position) {
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
    public List<String> getValidMoves(Board board) {
        // Implement logic to calculate valid moves for the knight
        List<String> validMoves = new ArrayList<>();
        // Example logic (not complete):
        // Add positions like "g3", "f5", etc. based on knight's movement rules
        return validMoves;
    }
}
