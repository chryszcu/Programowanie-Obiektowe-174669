import java.util.ArrayList;

public class Fabryka {
    private ArrayList<Elf> elfy;
    private double dlGeo;
    private double szGeo;

    public Fabryka() {
        this.dlGeo = dlGeo;
        this.szGeo = szGeo;
        this.elfy = new ArrayList<>();
    }

    public void dodajPracownika(Elf elf){
        this.elfy.add(elf);
    }

    public void usunPracownika(Elf elf){
        this.elfy.remove(elf);
    }


    public ArrayList<Elf> getElfy() {
        return elfy;
    }

    public void setElfy(ArrayList<Elf> elfy) {
        if(elfy == null || elfy.isEmpty()){
            System.out.println("Wprowadz poprawne dane");
        } else {
            this.elfy = elfy;
        }
    }

    public double getSzGeo() {
        return szGeo;
    }

    public void setSzGeo(int szGeo) {
        if(szGeo < -90 || szGeo > 90){
            System.out.println("Wprowadz poprawne dane");
        } else {
            this.szGeo = szGeo;
        }
    }

    public double getDlGeo() {
        return dlGeo;
    }

    public void setDlGeo(double dlGeo) {
        if(dlGeo < -180 || dlGeo > 180){
            System.out.println("Wprowadz poprawne dane");
        } else {
            this.dlGeo = dlGeo;
        }
    }

    public int najstarszyPracownik(){
        int wynik = elfy.get(0).getWiek();
        for(Elf elf : elfy){
            if(elf.getWiek() > wynik){
                wynik = elf.getWiek();
            }
        }
        return wynik;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fabryka fabryka)) return false;

        return Double.compare(getDlGeo(), fabryka.getDlGeo()) == 0 && Double.compare(getSzGeo(), fabryka.getSzGeo()) == 0 && getElfy().equals(fabryka.getElfy());
    }

    @Override
    public int hashCode() {
        int result = getElfy().hashCode();
        result = 31 * result + Double.hashCode(getDlGeo());
        result = 31 * result + Double.hashCode(getSzGeo());
        return result;
    }

    @Override
    public String toString() {
        return "Fabryka{" +
                "elfy=" + elfy +
                ", dlGeo=" + dlGeo +
                ", szGeo=" + szGeo +
                '}';
    }
}
