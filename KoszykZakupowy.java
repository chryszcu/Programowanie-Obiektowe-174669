import java.util.ArrayList;
import java.util.List;

public class KoszykZakupowy {
    private ArrayList<Produkt> lista_produktow;
    private ArrayList<Integer> iloscp;

    public KoszykZakupowy() {
        this.lista_produktow = new ArrayList<>();
        this.iloscp = new ArrayList<>();
    }

    public void dodajProdukt(Produkt produkt, int ilosc) {
        if(produkt.getIloscNaMagazynie() > 0){
            lista_produktow.add(produkt);
            iloscp.add(ilosc);
            produkt.usubZMagazynu(ilosc);
        }
    }

    public void wyswietlProdukt() {
        int i = 0;
        for(Produkt produkt : lista_produktow){
            System.out.println("Produkt: " + produkt.getNazwa() + " Ilosc: " + iloscp.get(i) + " Cena: " + produkt.getCena());
            i++;
        }
    }

}
