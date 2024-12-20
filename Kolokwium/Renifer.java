public class Renifer {
    private String imie;
    private int predkosc;

    public Renifer(String imie, int predkosc) {
        this.imie = imie;
        this.predkosc = predkosc;
    }

    public void nakarmRenifera() {
        this.predkosc += 5;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        if(imie == null || imie.isEmpty()) {
            System.out.println("Wprowadz poprawne dane");
        } else {
            this.imie = imie;
        }
    }

    public int getPredkosc() {
        return predkosc;
    }

    public void setPredkosc(int predkosc) {
        if(predkosc < 0) {
            System.out.println("Wprowadz poprawne dane");
        } else {
            this.predkosc = predkosc;
        }
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Renifer renifer)) return false;

        return getPredkosc() == renifer.getPredkosc() && getImie().equals(renifer.getImie());
    }

    @Override
    public int hashCode() {
        int result = getImie().hashCode();
        result = 31 * result + getPredkosc();
        return result;
    }

    @Override
    public String toString() {
        return "Renifer{" +
                "imie='" + imie + '\'' +
                ", predkosc=" + predkosc +
                '}';
    }
}
