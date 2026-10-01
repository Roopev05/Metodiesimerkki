public class App {
    public static void main(String[] args) throws Exception {
        tulostaOhjelmanNimi();
        laksePintaAla(5, 10);
        
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
