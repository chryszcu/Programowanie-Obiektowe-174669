public class Elf {
    private String imie;
    private int wiek;
    private String stanowisko;

    public Elf(String imie, int wiek, String stanowisko) {
        this.imie = imie;
        this.wiek = wiek;
        this.stanowisko = stanowisko;
    }

    public void przedstawSie(){
        System.out.println("Cześć nazywam się " +imie + ", mam " + wiek + " lat, a moje stanowisko pracy to " + stanowisko);
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        if(imie == null || imie.isEmpty()){
            System.out.println("Wprowadz poprawne dane");
        } else {
            this.imie = imie;
        }
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        if(stanowisko == null || stanowisko.isEmpty()){
            System.out.println("Wprowadz poprawne dane");
        } else {
            this.stanowisko = stanowisko;
        }
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        if(wiek < 0){
            System.out.println("Wprowadz poprawne dane");
        } else {
            this.wiek = wiek;
        }
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Elf elf)) return false;

        return getWiek() == elf.getWiek() && getImie().equals(elf.getImie()) && getStanowisko().equals(elf.getStanowisko());
    }

    @Override
    public int hashCode() {
        int result = getImie().hashCode();
        result = 31 * result + getWiek();
        result = 31 * result + getStanowisko().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Elf{" +
                "imie='" + imie + '\'' +
                ", wiek=" + wiek +
                ", stanowisko='" + stanowisko + '\'' +
                '}';
    }
}
