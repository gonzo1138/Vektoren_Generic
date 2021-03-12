public class GenericOperations<Vektor> {


    public Vektor2D vektorSubtraktion2D(Vektor2D v1, Vektor2D v2) {
        return new Vektor2D(v1._startX - v2._startX,
                            v1._startY - v2._startY,
                            v1._zielX - v2._zielX,
                            v1._zielY - v2._zielY
                            );
    }


    public double betragErgebnisVektor2D(Vektor2D v) {
        double x = v._zielX - v._startX;
        double y = v._zielY - v._startY;
        return Math.sqrt((x * x) + (y * y));

    }




    public Vektor3D vektorSubtraktion3D(Vektor3D v1, Vektor3D v2) {
        return new Vektor3D(v1._startX - v2._startX,
                            v1._startY - v2._startY,
                            v1._startZ - v2._startZ,
                            v1._zielX - v2._zielX,
                            v1._zielY - v2._zielY,
                            v1._zielZ - v2._zielZ
                            );
    }


    public double betragErgebnisVektor3D(Vektor3D v) {
        double x = v._zielX - v._startX;
        double y = v._zielY - v._startY;
        double z = v._zielZ - v._startZ;

        return Math.sqrt((x * x) + (y * y) + (z * z));
    }




}
