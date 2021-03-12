public class Main {

    public static void main(String[] args) {

        GenericOperations go = new GenericOperations();

        Vektor2D v1 = new Vektor2D(0, 0, 2, -8);
        Vektor2D v2 = new Vektor2D(0, 0, 0, 0);

        System.out.println("Vektor 1: " + v1 + "\n" + "Vektor 2: " + v2 + "\nBetrag des Ergebnisvektors: "
                            + go.betragErgebnisVektor2D(go.vektorSubtraktion2D(v1, v2)));

        
        System.out.println();


        Vektor3D v3 = new Vektor3D(0, 0, 0, 2,2,2);
        Vektor3D v4 = new Vektor3D(0, 0, 0, 1,1,1);

        System.out.println("Vektor 3: " + v3 + "\n" + "Vektor 4: " + v4 + "\nBetrag des Ergebnisvektors: "
                            + go.betragErgebnisVektor3D(go.vektorSubtraktion3D(v3, v4)));


    }
}
