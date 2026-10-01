import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int pituus = 0;
        int leveys = 0;

        tulostaOhjelmanNimi();

        System.out.println("Anna pituus");
        pituus = Integer.parseInt(in.nextLine());

        System.out.println("Anna leveys");
        leveys = Integer.parseInt(in.nextLine());

        laksePintaAla(pituus, leveys);


        //laksePintaAla(5, 10);
        
    }//END OF MAIN

    public static void tulostaOhjelmanNimi() {
        System.out.println("Metodi-ohjelma");
        System.out.println("**************");
    } // tulostaOhjelmannimi-metodin loppu

    public static void laksePintaAla(int pint, int lev) {
        int pintaAla = pint * lev;
        System.out.println("Pinta-ala on " + pintaAla);

    }

}
