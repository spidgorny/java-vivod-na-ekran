import java.util.Scanner;

public class NaEkran1 {

    public static void main(String[] args) {
        String Tv1 = "Philips Smart-TV";
        String Tv2 = "Samsung Smart-TV";
        String Tv3 = "Panasonic Smart-TV";

        double preis1 = 399.99;
        double preis2 = 419.99;
        double preis3 = 549.99;

        //double preis = 0;

        int id1 = 1;
        int id2 = 2;
        int id3 = 3;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Herzich willkommen in TV-Abteilung! \n");

        System.out.println("Heute haben wir einen " + Tv1 + " fuer den Preis von " + preis1 + " €\n" + Tv2
                + "-Smart-TV, fuer den Preis von " + preis2 + " € \n" + Tv3 + "-Smart-TV, fuer den Preis von " + preis3
                + " € \n");

        System.out.println("Was gefällt Sie am besten? " + "Bitte eingeben:"
                + "\n 1 = Philips, \n 2 = Samsung oder \n 3 = Panasonic \n");

        int bestellung = scanner.nextInt();
//        println("Auswahl: " + );
        if (bestellung == 1) {
            println("Eine gute Wahl! \n");
            println("Haben Sie eine Kundenkarte? " + "Bitte eingeben:" + "\n Y = Ja, oder N = Nein \n");
        }

        if (askBool()) {
            println("Super! Sie bekommen zusätzlich noch 15%-Rabbatt, "
                    + "\n den aktuellen Preis beträgt dann " + (preis1 - preis1 * 0.15) + " € \n");
            println("Suchen Sie nach Ihrer individuellen Finanzierung? \n"
                    + "Bitte eingeben: Y = Ja, oder N = Nein \n");
        } else {
            println("Sie können den Betrag " + (preis1 - preis1 * 0.15) + " € direkt an der Kasse bezahlen?");
        }

        if (askBool()) {
            println("Bitte, wenden Sie sich direkt an die Kreditabteilung!");
        } else {
            println("Sie können den Betrag " + preis1 + " € direkt an der Kasse bezahlen?");
            if (bestellung == 2) {
                println("Eine gute Wahl! \n");
                println("Haben Sie eine Kundenkarte? " + "Bitte eingeben:" + "\n Y = Ja, oder N = Nein \n");
            }

            if (bestellung == 3) {
                println("Eine gute Wahl! \n");
                println("Haben Sie eine Kundenkarte? " + "Bitte eingeben:" + "\n Y = Ja, oder N = Nein \n");
            }
        }
    }

    static void println(String text) {
        System.out.println(text);
    }

    static boolean askBool() {
        Scanner scanner = new Scanner(System.in);
        do {
            String kundenkarte = scanner.nextLine();
            Boolean yes = checkAnswer(kundenkarte);
            if (yes != null) {
                if (yes) {
                    return true;
                } else {
                    return false;
                }
            }
            println("Nicht verstanden. Ja oder nein?");
        } while (true);
    }

    static Boolean checkAnswer(String answer) {
        String JA = "ja";
        String NEIN = "nein";

        if (answer.length() == 0) {
            return null;
        }

        if (answer.toLowerCase().equals(JA)) {
            return true;
        }
        if ((answer.toCharArray()[0] + "").toLowerCase().equals("j")) {
            return true;
        }
        if ((answer.toCharArray()[0] + "").toLowerCase().equals("y")) {
            return true;
        }

        if (answer.toLowerCase().equals(NEIN)) {
            return false;
        }
        if ((answer.toCharArray()[0] + "").toLowerCase().equals("n")) {
            return false;
        }
        return null;
    }

}
