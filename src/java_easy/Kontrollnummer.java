package java_easy;

public class Kontrollnummer {

    private String eurokontrollnummer;
    private String laenderbuchstabe;
    private String land;
    private long geldscheinzahl;
    private int pruefziffer;
    private int letzteStelle;
    private int laenderzahl;

    public Kontrollnummer() {
        eurokontrollnummer = "";
        laenderbuchstabe = "";
        land = "";
        geldscheinzahl = 0;
        pruefziffer = 0;
        letzteStelle = 0;
    }

    private int berechneQuersumme() {
        long temp = geldscheinzahl;
        int quersumme = 0;
        while(geldscheinzahl != 0) {
            quersumme = quersumme + (int) (geldscheinzahl % 10);
            geldscheinzahl = geldscheinzahl / 10;
        }
        geldscheinzahl = temp;
        return  quersumme;
    }

    /**
     * 1.4.3:   Als erstes initialisieren wir eine temporäre Variable namens temp mit dem Wert des longs der Variable 'geldscheinzahl'.
     *              Als nächstes durchlaufen wir solange bis die geldscheinzahl nicht 0 ist. In diesem Durchlauf berechnen wir zuerst die quersumme, indem wir
     *                  die quersumme zuerst, vor dem Durchlauf, auf 0 initialisiert haben und nun die quersumme plus das modulo 10 der Variable geldscheinzahl.
     *                  Somit wird der jetzige Wert der Variable quersumme plus den Rest einer Ganzzahldivision 10 von der Variable 'geldscheinzahl' gerechnet.
     *                  Als nächstes setzen wir unsere Variable 'geldscheinzahl' auf den Wert, welchen wir bekommen wenn wir den Variablenwert durch 10 teilen.
     */

    private void berechnePruefziffer() {
        int rest;
        ermittelnLand();
        pruefziffer = laenderzahl;
        ermittelnLand();
        pruefziffer = pruefziffer + berechneQuersumme();
        rest = 8 - pruefziffer % 9;
        if (rest == 0) {
            pruefziffer = 8;
        } else {
            pruefziffer = rest;
        }
    }

    public void ermittelnLand() {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        laenderbuchstabe = eurokontrollnummer.substring(0, 1);
        laenderzahl = alphabet.indexOf(laenderbuchstabe) + 1;
        switch (laenderbuchstabe.charAt(0)) {
            case 'Z': land = "Belgien"; break;
            case 'Y': land = "Griechenland"; break;
            case 'N': land = "Österreich"; break;
            case 'X': land = "Deutschland"; break;
            case 'V': land = "Spanien"; break;
            case 'U': land = "Frankreich"; break;
            case 'T': land = "Irland"; break;
            case 'S': land = "Italien"; break;
            case 'R': land = "Luxemburg"; break;
            case 'P': land = "Niederlange"; break;
            case 'M': land = "Portugal"; break;
            case 'L': land = "Finnland"; break;
            case 'J': land = "England"; break;
            case 'H': land = "Slowenien"; break;
            case 'G': land = "Zypern"; break;
            case 'F': land = "Malta"; break;
            case 'E': land = "Slowakai"; break;
            case 'D': land = "Estland"; break;
            case 'C': land = "Lettland"; break;
            default:land = "kein gültiges land";
        }
    }
    /**
     * 1.4.2: b) Wir haben einen String, welcher jeden Buchstaben des Alphabets enthält. Nun nehmen wir vom gewählten Land den ersten Buchstaben durch einen substring(0,1).
     *              Als nächstes wird die Länderzahl zur der Position gesettet, welche der erste Buchstabe des Landes im Alphabet + 1 hat.
     *              Somit ist die Länderzahl einfach der Alphabetsindex des ersten Buchstaben des Landes.
     */
    
}
