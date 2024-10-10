import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Zadanie 1: ");
        System.out.println("23.0+76 = double");
        System.out.println("41*2.0+3 = double");
        System.out.println("5-33 = int");
        System.out.println("109 % 3 = int");
        System.out.println("50 / 2 = int");
        System.out.println("4 / 2 = int");
        System.out.println("3^5 = int");
        System.out.println("7&9 = int");
        System.out.println("\n");

        System.out.println("Zadanie 2: ");
        double dzialanie = ((Math.sqrt(7) - 1)/2) + (Math.pow(3, 3) % 2);
        int rzut = (int)dzialanie;
        System.out.println(rzut);

        int dzialanie2 = 2003 / (12 * 6);
        System.out.println(dzialanie2);

        double dzialanie3 = (3 + Math.sqrt(3) / (Math.sqrt(5)/2) / 3) + 1;
        int rzut2 = (int)dzialanie3;
        System.out.println(rzut2);

        double dzialanie4 = 30%19%6;
        int rzut3 = (int)dzialanie4;
        System.out.println(rzut3);

        double dzialanie5 = 15 % 5 + 1 / Math.pow(2, 1/4);
        int rzut4 = (int)dzialanie5;
        System.out.println(rzut4);

        System.out.println("\n");

        System.out.println("Zadanie 3: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj słowo: ");
        String slowo = scanner.nextLine();

        System.out.println("Podaj drugie słowo: ");
        String drugie = scanner.nextLine();

        System.out.println(slowo + "  " + drugie);

        System.out.println("\n");

        System.out.println("Zadanie 4: ");
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int liczba1 = scanner2.nextInt();

        System.out.println("Podaj druga liczbe: ");
        int liczba2 = scanner2.nextInt();

        int suma = liczba1 + liczba2;
        int roznica = liczba1 - liczba2;
        int iloczyn = liczba1 * liczba2;
        int iloraz = liczba1 / liczba2;
        System.out.println("Suma: " + suma);
        System.out.println("Roznica: " + roznica);
        System.out.println("Iloczyn: " + iloczyn);
        System.out.println("Iloraz: " + iloraz);
        System.out.println("\n");

        System.out.println("Zadanie 5: ");
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Podaj liczbe x: ");
        int liczba5 = scanner3.nextInt();
        int a = liczba5 + 140;
        int b = liczba5 - 31;
        int c = liczba5 * 7;
        int d = liczba5 / 13;
        int e = liczba5 % 7;
        int k = liczba5 / 4;
        double f = Math.pow(liczba5, 45);
        int g = liczba5 & 67;
        int h = liczba5 | 59;
        int j = liczba5 ^ 23;
        int l = liczba5 << 5;
        int m = liczba5 >> 6;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(k);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(j);
        System.out.println(l);
        System.out.println(m);
        scanner.close();
        scanner2.close();
        scanner3.close();
        }
}
