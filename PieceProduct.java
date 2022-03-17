import java.util.Objects;

public class PieceProduct extends Product{
    private double weightPiece;

    public PieceProduct(String name, String description, double weightPiece) {
        super(name, description);
        if (Double.compare(weightPiece, 0.0) == -1) throw new IllegalArgumentException();
        this.weightPiece = weightPiece;
    }

    public double getWeight() {
        return weightPiece;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PieceProduct that = (PieceProduct) o;
        return Double.compare(that.weightPiece, weightPiece) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), weightPiece);
    }

    @Override
    public String toString() {
        return "PieceProduct{" +
                "weightPiece=" + weightPiece +
                '}';
    }

}
