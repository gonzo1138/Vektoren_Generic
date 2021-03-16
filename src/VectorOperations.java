public class VectorOperations {

    public Vektor2D subtractV2D(Vektor2D v1, Vektor2D v2) {
        return new Vektor2D(v1.startX - v2.startX,
                            v1.startY - v2.startY,
                            v1.zielX - v2.zielX,
                            v1.zielY - v2.zielY
                            );
    }

    public double betragV2D(Vektor2D v) {
        double x = v.zielX - v.startX;
        double y = v.zielY - v.startY;

        return Math.sqrt((x * x) + (y * y));
    }

    public Vektor3D subtractV3D(Vektor3D v1, Vektor3D v2) {
        return new Vektor3D(v1.startX - v2.startX,
                            v1.startY - v2.startY,
                            v1.startZ - v2.startZ,
                            v1.zielX - v2.zielX,
                            v1.zielY - v2.zielY,
                            v1.zielZ - v2.zielZ
                            );
    }

    public double betragV3D(Vektor3D v) {
        double x = v.zielX - v.startX;
        double y = v.zielY - v.startY;
        double z = v.zielZ - v.startZ;

        return Math.sqrt((x * x) + (y * y) + (z * z));
    }
}
