import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Main {
    public static void main(String[] args) {
        ///zad1
        System.out.println("Zadanie 1: ");
        System.out.println("Jakub Chryszczanowicz");
        System.out.println("\n");
        ///zad2
        System.out.println("Zadanie 2: ");
        System.out.println("Jakub Chryszczanowicz".length());
        System.out.println("\n");
        ///zad3
        System.out.println("Zadanie 3: ");
        String a = "Ala,";
        String b = " Ma,";
        String c = " Kota";
        a = a + b + c;
        System.out.println(a);
        System.out.println("\n");
        ///zad4.1
        System.out.println("Zadanie 4.1: ");
        System.out.println("                    *  ");
        System.out.println("                    * *  ");
        System.out.println("                    * * * ");
        System.out.println("* * * * * * * * * * * * * *");
        System.out.println("* * * * * * * * * * * * * * *");
        System.out.println("* * * * * * * * * * * * * *");
        System.out.println("                    * * * ");
        System.out.println("                    * *  ");
        System.out.println("                    *  ");
        System.out.println("\n");
        ///zad4.2
        System.out.println("Zadanie 4.2: ");
        System.out.println("     *  ");
        System.out.println("    * *   ");
        System.out.println("   * * *  ");
        System.out.println("  * * * * ");
        System.out.println(" * * * * * ");
        System.out.println("* * * * * *");
        System.out.println(" * * * * * ");
        System.out.println("  * * * * ");
        System.out.println("   * * *  ");
        System.out.println("    * *   ");
        System.out.println("     *  ");
        System.out.println("\n");
        ///zad5
        System.out.println("Zadanie 5: ");
        String x = "Ala ma kota";
        String value = x.replace("a", "e");
        System.out.println(value);
        System.out.println("\n");
        ///zad6.1
        System.out.println("Zadanie 6.1: ");
        String value2 = x.toUpperCase();
        System.out.println(value2);
        System.out.println("\n");
        ///zad6.2
        System.out.println("Zadanie 6.2: ");
        String value3 = x.toLowerCase();
        System.out.println(value3);
        System.out.println("\n");
        ///zad7
        System.out.println("Zadanie 7: ");
        char ch = 'A';
        char ch2 = '!';
        char ch3 = '@';
        char ch4 = '>';
        char ch5 = '~';
        char ch6 = '\n';
        char ch7 = '\b';
        int as1 = ch;
        int as2 = ch2;
        int as3 = ch3;
        int as4 = ch4;
        int as5 = ch5;
        int as6 = ch6;
        int as7 = ch7;
        System.out.println(as1);
        System.out.println(as2);
        System.out.println(as3);
        System.out.println(as4);
        System.out.println(as5);
        System.out.println(as6);
        System.out.println(as7);
        System.out.println("\n");
        ///zad8
        System.out.println("Zadanie 8: ");
        char male = 'a';
        char male2 = 'z';
        int asc = male;
        int asc2 = male2;
        System.out.println("Male: "+asc+" - "+asc2);
        char duze = 'A';
        char duze2 = 'Z';
        int asc3 = duze;
        int asc4 = duze2;
        System.out.println("Duze: "+asc3+" - "+asc4);
        char cyfry = '0';
        char cyfry2 = '9';
        int asc5 = cyfry;
        int asc6 = cyfry2;
        System.out.println("Duze: "+asc5+" - "+asc6);
        ///zad9
        System.out.println("Zadanie 9: ");
        String zdanie1 = "Grzesiek nie wiedział dlaczego ... jest tak drapieżnym ... mimo, że jego ... na to nie wskazuje";
        String nowezdanie = zdanie1.replaceFirst("\\Q...\\E", "on");
        nowezdanie = nowezdanie.replace("...", "kotem");
        System.out.println(nowezdanie);
        System.out.println("\n");
        ///zad10
        System.out.println("Zadanie 10: ");
        String zdan1 = "... to  najlepsza książka napisana przez ...";
        String zdan2 = zdan1.replaceFirst("...", "Harry Potter");
        zdan2 = zdan2.replace("...", "Rowling");
        System.out.println(zdan2);
        System.out.println("\n");
        ///zad11
        System.out.println("Zadanie 11: ");
        String slowo = "wodrze";
        String nowe = "";
        for(int i = 0; i < 5; i++){
            nowe = nowe + slowo;
        }
        System.out.println(nowe);
        System.out.println("\n");
        ///zad12
        LocalDateTime data = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatData = data.format(format);
        System.out.println("Dzisiaj jest " + formatData);
        ///zad13
        System.out.println("Zadanie 13: ");
        String imieNazw = "Jakub Chryszczanowicz";
        int dlugosc12 = imieNazw.length();

        char numer1 = 54;
        char numer2 = 103;
        char numer3 = 241;
        char numer4 = 67;
        char numer5 = 9999;
        char numer6 = (char)dlugosc12;
        System.out.println(numer1);
        System.out.println(numer2);
        System.out.println(numer3);
        System.out.println(numer4);
        System.out.println(numer5);
        System.out.println(numer6);
        System.out.println("\n");
    }
}