public class Rook {
    private String color;
    private String position;

    public Rook(String color, String position) {
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
        List<String> validMoves = new ArrayList<>();
        // Logic to calculate valid moves for a rook
        // Rooks can move horizontally or vertically any number of squares
        // Add logic to check for obstacles and board boundaries
        return validMoves;
    } 
}
