import java.util.Scanner;

public class NaEkran1 {

    public static void main(String[] args) {
        String[] TvList = {
                "Philips Smart-TV",
                "Samsung Smart-TV",
                "Panasonic Smart-TV"};

        double[] preisList = {
                399.99,
                419.99,
                549.99};

        Scanner scanner = new Scanner(System.in);

        println("Herzich willkommen in TV-Abteilung! \n");
        for (int index = 0; index < TvList.length; index++) {
            println("Heute haben wir einen (" + (index + 1) + "): " + TvList[index] + " fuer den Preis von " + preisList[index] + " €");
        }

        println("Was gefällt Sie am besten? " + "Bitte nummer eingeben:");

        int bestellung;
        do {
            bestellung = scanner.nextInt();
        } while (bestellung < 1 || bestellung > 3);

        println(TvList[bestellung - 1]);
        println("Eine gute Wahl!");
        double preis = preisList[bestellung - 1];
        println(preis + " €");

        println("Haben Sie eine Kundenkarte? " + "Bitte eingeben:" + "\n Y = Ja, oder N = Nein \n");

        if (askBool()) {
            double discount = 0.15;
            double discountPrice = preis - preis * discount;
            println("Super! Sie bekommen zusätzlich noch 15%-Rabbatt, "
                    + "\n den aktuellen Preis beträgt dann " + String.format("%.2f", discountPrice) + " € \n");
            println("Suchen Sie nach Ihrer individuellen Finanzierung? \n"
                    + "Bitte eingeben: Y = Ja, oder N = Nein \n");
            if (askBool()) {
                println("Bitte, wenden Sie sich direkt an die Kreditabteilung!");
            } else {
                println("Sie können den Betrag " + String.format("%.2f", discountPrice) + " € direkt an der Kasse bezahlen?");
            }
        } else {
            println("Sie können den Betrag " + preis + " € direkt an der Kasse bezahlen?");
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
