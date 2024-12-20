import java.util.ArrayList;

public class Sanie {
    private ArrayList<Renifer> renifers;

    public Sanie() {
        this.renifers = new ArrayList<>();
    }

    public void dodajRenifera(Renifer renifer) {
        renifers.add(renifer);
    }

    public ArrayList<Renifer> getRenifers() {
        return renifers;
    }

    public void setRenifers(ArrayList<Renifer> renifers) {
        if(renifers == null || renifers.isEmpty()){
            System.out.println("Nie poprawne dane");
        }
        else{
            this.renifers = renifers;
        }
    }

    public void sumaPredkosci(){
        int wynik = 0;
        for (Renifer renifer : renifers) {
            wynik += renifer.getPredkosc();
        }
        System.out.println(wynik);
    }

    public int najwolniejszyRenifer(){
        int wynik = renifers.get(0).getPredkosc();
        for (Renifer renifer : renifers) {
            if(renifer.getPredkosc() < wynik){
                wynik = renifer.getPredkosc();
            }
        }
        return wynik;

    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sanie sanie)) return false;

        return getRenifers().equals(sanie.getRenifers());
    }

    @Override
    public int hashCode() {
        return getRenifers().hashCode();
    }

    @Override
    public String toString() {
        return "Sanie{" +
                "renifers=" + renifers +
                '}';
    }
}
