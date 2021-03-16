import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        //VectorOperations go = new VectorOperations();

        Vektor2D v1 = new Vektor2D(0, 0, 2, -8);
        Vektor2D v2 = new Vektor2D(0, 2, 0, 0);
        Vektor2D v3 = new Vektor2D(0, 54, 34, 0);
        Vektor2D v4 = new Vektor2D(0, 0, 5, 3);

        //System.out.println("Vektor 1: " + v1 + "\n" + "Vektor 2: " + v2 + "\nBetrag des Ergebnisvektors: " + go.betragV2D(go.subtractV2D(v1, v2)));

        ArrayList<Vektor2D> vektoren2d = new ArrayList<>();
        vektoren2d.add(v1);
        vektoren2d.add(v2);
        vektoren2d.add(v3);
        vektoren2d.add(v4);

        for(Vektor2D i: vektoren2d) System.out.println(i);
        System.out.println("\nsortiert:");
        Collections.sort(vektoren2d);
        for(Vektor2D i: vektoren2d) System.out.println(i);

        System.out.println("_________________________________________________________________________________\n");

        Vektor3D v11 = new Vektor3D(0, 0, 0, 2,2,2);
        Vektor3D v12 = new Vektor3D(0, 0, 0, 1,1,1);
        Vektor3D v13 = new Vektor3D(0, 4, 2, 12,19,1);
        Vektor3D v14 = new Vektor3D(0, 3, 1, 1,13,13);

        //System.out.println("Vektor 11: " + v11 + "\n" + "Vektor 12: " + v12 + "\nBetrag des Ergebnisvektors: " + go.betragV3D(go.subtractV3D(v11, v12)));

        ArrayList<Vektor3D> vektoren3d = new ArrayList<>();
        vektoren3d.add(v11);
        vektoren3d.add(v12);
        vektoren3d.add(v13);
        vektoren3d.add(v14);

        for(Vektor3D i: vektoren3d) System.out.println(i);
        System.out.println("\nsortiert:");
        Collections.sort(vektoren3d);
        for(Vektor3D i: vektoren3d) System.out.println(i);

    }
}
