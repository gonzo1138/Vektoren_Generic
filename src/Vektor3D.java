public class Vektor3D implements Vektor {

    double _startX;
    double _startY;
    double _startZ;

    double _zielX;
    double _zielY;
    double _zielZ;

    double betrag;

    public Vektor3D(double startX, double startY, double startZ, double zielX, double zielY, double zielZ) {
        _startX = startX;
        _startY = startY;
        _startZ = startZ;
        _zielX = zielX;
        _zielY = zielY;
        _zielZ = zielZ;

        double x = _zielX - _startX;
        double y = _zielY - _startY;
        double z = _zielZ - _startZ;
        betrag = Math.sqrt((x * x) + (y * y) + (z * z));
    }

    @Override
    public String toString() {
        return "Vektor3D {Startwert x=" + _startX + ", Startwert y=" + _startY + ", Startwert z=" + _startZ +
                " Zielwert x=" + _zielX + ", Zielwert y=" + _zielY + ", Zielwert z=" + _zielZ + "}\tBetrag des Vektors: " + betrag;
    }

}
