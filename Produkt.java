public class Produkt {
    private String nazwa;
    private int cena;
    private int iloscNaMagazynie;


    public Produkt(String nazwa, int cena, int iloscNaMagazynie) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.iloscNaMagazynie = iloscNaMagazynie;
    }

    public void wyswietlInformacje(){
        System.out.println("Nazwa: " + nazwa);
        System.out.println("Cena: " + cena);
        System.out.println("Ilosc na Magazynie: " + iloscNaMagazynie);
    }

    public void dodajDoMagazynu(int ilosc){
        iloscNaMagazynie+= ilosc;
    }

    public void usubZMagazynu(int ilosc){
        if(iloscNaMagazynie > ilosc){
            iloscNaMagazynie -= ilosc;
        }
    }

    public int getIloscNaMagazynie() {
        return iloscNaMagazynie;
    }

    public int getCena() {
        return cena;
    }

    public String getNazwa() {
        return nazwa;
    }
}
