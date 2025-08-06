public class Position {
    private final int row;  // 0-7
    private final int col;  // 0-7

    public Position(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public String getPosition() {
        // Returns a string representation of the position, e.g., "A1", "H8"
        char column = (char) ('A' + col);
        return column + String.valueOf(row + 1); // Rows are 1-indexed in chess notation
    }

    // getters, equals, hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Position)) {
            return false;
        }
        Position pos = (Position) o;
        return row == pos.row && col == pos.col;
    }

    @Override
    public int hashCode() {
        return Objects.hash(row, col);
    }

    // getters
    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}
