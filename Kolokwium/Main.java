public class Main {
    public static void main(String[] args) {

        Elf elf = new Elf("Zielony", 32, "Pakowacz");
        Elf elf1 = new Elf("Rudy", 23, "Sprzatacz");
        Elf elf2 = new Elf("Zielony", 20, "Pakowacz");
        Elf elf3 = new Elf("Rudy", 42, "Sprzatacz");
        Fabryka fabryka = new Fabryka();
        Renifer renifer = new Renifer("Rudolf", 5);
        Renifer renifer1 = new Renifer("Maciek", 15);
        Renifer renifer2 = new Renifer("Rudolf", 5);
        Renifer renifer3 = new Renifer("Maciek", 21);
        Sanie sanie = new Sanie();
        elf.przedstawSie();
        elf1.przedstawSie();
        fabryka.dodajPracownika(elf);
        fabryka.dodajPracownika(elf1);
        fabryka.dodajPracownika(elf2);
        fabryka.dodajPracownika(elf3);
        fabryka.usunPracownika(elf);
        System.out.println(fabryka);
        System.out.println(fabryka.najstarszyPracownik());
        renifer.nakarmRenifera();
        renifer1.nakarmRenifera();
        renifer1.nakarmRenifera();
        System.out.println(renifer);
        System.out.println(renifer1);
        sanie.dodajRenifera(renifer);
        sanie.dodajRenifera(renifer1);
        sanie.dodajRenifera(renifer2);
        sanie.dodajRenifera(renifer3);
        System.out.println(sanie);
        sanie.sumaPredkosci();
        System.out.println(sanie.najwolniejszyRenifer());

    }
}