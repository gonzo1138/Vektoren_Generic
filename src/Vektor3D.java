public class Vektor3D implements Vektor, Comparable<Vektor3D> {

    double startX;
    double startY;
    double startZ;
    double zielX;
    double zielY;
    double zielZ;
    double betrag;

    public Vektor3D(double startX, double startY, double startZ, double zielX, double zielY, double zielZ) {
        this.startX = startX;
        this.startY = startY;
        this.startZ = startZ;
        this.zielX = zielX;
        this.zielY = zielY;
        this.zielZ = zielZ;

        double x = this.zielX - this.startX;
        double y = this.zielY - this.startY;
        double z = this.zielZ - this.startZ;
        betrag = Math.sqrt((x * x) + (y * y) + (z * z));
    }

    @Override
    public String toString() {
        return "Start x=" + startX + ", y=" + startY + ", z=" + startZ + "\tZiel: x=" + zielX + ", y=" + zielY + ", z=" + zielZ + "\tBetrag: " + String.format("%1.2f", betrag);
    }

    @Override
    public int compareTo(Vektor3D ov) {             // .compareTo() returns -1 for <, 0 for =, 1 for >
        return Double.compare(this.betrag, ov.betrag);
    }
}
