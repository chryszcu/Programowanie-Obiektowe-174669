public class Main {


    public static void main(String[] args) {
        Produkt produkt1 = new Produkt("Bułki", 5, 15);
        Produkt produkt2 = new Produkt("Masło", 7, 5);
        Produkt produkt3 = new Produkt("Szynka", 9, 19);
        Produkt produkt4 = new Produkt("Pomidor", 2, 12);
        KoszykZakupowy koszyk = new KoszykZakupowy();
        produkt4.wyswietlInformacje();
        koszyk.dodajProdukt(produkt4, 4);
        koszyk.dodajProdukt(produkt3, 3);
        koszyk.dodajProdukt(produkt2, 2);
        System.out.println();
        koszyk.wyswietlProdukt();
        System.out.println();
        produkt4.wyswietlInformacje();

    }

}