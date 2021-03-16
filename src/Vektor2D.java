public class Vektor2D implements Vektor, Comparable<Vektor2D>{

    double startX;
    double startY;
    double zielX;
    double zielY;
    double betrag;

    public Vektor2D(double startX, double startY, double zielX, double zielY) {
        this.startX = startX;
        this.startY = startY;
        this.zielX = zielX;
        this.zielY = zielY;

        double x = this.zielX - this.startX;
        double y = this.zielY - this.startY;
        this.betrag = Math.sqrt((x * x) + (y * y));
    }


    @Override
    public String toString() {
        return "Start x=" + startX + ", y=" + startY + "\tZiel x=" + zielX + ", y=" + zielY + "\tBetrag: " + String.format("%1.2f", betrag);
    }

    @Override
    public int compareTo(Vektor2D ov) {             // .compareTo() returns -1 for <, 0 for =, 1 for >
        return Double.compare(this.betrag, ov.betrag);
    }
}
