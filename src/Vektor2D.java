public class Vektor2D implements Vektor {

    double _startX;
    double _startY;
    double _zielX;
    double _zielY;
    double betrag;

    public Vektor2D(double startX, double startY, double zielX, double zielY) {
        _startX = startX;
        _startY = startY;
        _zielX = zielX;
        _zielY = zielY;

        double x = _zielX - _startX;
        double y = _zielY - _startY;
        betrag = Math.sqrt((x * x) + (y * y));
    }

    @Override
    public String toString() {
        return "Vektor2D {Startwert x=" + _startX + ", Startwert y=" + _startY +
                " Zielwert x=" + _zielX + ", Zielwert y=" + _zielY + "}\tBetrag des Vektors: " + betrag;
    }

}
