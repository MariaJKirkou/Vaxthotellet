public class Main {
    public static void main(String[] args) {
        Vaxt[] vaxter = { //här har jag använt mig av polyformism eft.
                // jag skapar en array av klassen växt men skapar obj, av subklassen
                new Kaktus("Igge", 0.2),
                new Palm("Laura", 5),
                new KottatandeVaxt("Meatloaf", 0.7),
                new Palm("Olof", 1) };

        Ägare ägare = new Ägare();

        ägare.vattna(vaxter);

    }
}