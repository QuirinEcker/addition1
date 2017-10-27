/*----------------------------------------------------------
 *                 HTL-Leonding / Klasse: 1AHITM
 * ----------------------------------------------------------
 * Übungsnr.:   addition1
 * Übungstitel: addition
 * Autoren:     Quirin Ecker
 * Version:     1.0
 * Datum:       27.20.2017
 * ----------------------------------------------------------
 * Kurzbeschreibung:
 * addition
 *
 * ----------------------------------------------------------
 * Beschreibung der grundlegenden Lösungsidee:
 * ausgabe der Addition
 *
 * ----------------------------------------------------------
*/
public class Ecker_Addition1 {

    public static void main(String[] args) {

        final int X = 5;
        final int Y = 7;
        final int ERGEBNIS = X + Y;

        System.out.printf("%2d \n" , X);
        System.out.print("+");
        System.out.println(Y);
        System.out.println("--");
        System.out.println(ERGEBNIS);
    }
}
