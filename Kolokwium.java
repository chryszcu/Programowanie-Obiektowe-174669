public class Main {
    public static int ciagArytmetycznyRodzajuM(int n, int m, int a1, int[] r){
        int wynik = 0;
        for(int i = 0; i < n; i++){
            wynik = a1 + (n - 1) * r[i] + (n - 1)*(n - 1)*r[i];
        }
        return wynik;
    }

    public static int[] sekwencjaCollatza(int n, int c){
        int[] wynik = new int[n];
        for(int i = 0; i < n; i++){
            if(c % 2 == 0){
                c = c /2;
            } else {
                c = 3*c+1;
            }
            wynik[i] = c;
        }
        return wynik;
    }

    public static int podciag(int[] tab){
        int f = 0;
        int fmax = 0;
        for(int i = 0; i < tab.length; i++) {
            f = 0;
            for(int j = i + 1; j < tab.length; j++) {
                if(tab[j] > tab[i]){
                    f++;
                }
                else {
                    if(f > fmax){
                        fmax = f;
                    }
                }
            }
        }
        if(f > fmax){
            fmax = f;
        }
        return fmax;
    }

    public static void main(String[] args) {

        int[] tablica = {1, 2, 0, 3, 5, 3, 1, 4};
        System.out.println(podciag(tablica));

        int sekw = 2;
        int start = 3;
        System.out.println(sekwencjaCollatza(sekw, start));

        int element = 4;
        int rodzaj = 2;
        int wyraz = 5;
        int[] roznica = {1, 4, 9, 16};
        System.out.println(ciagArytmetycznyRodzajuM(element, rodzaj, wyraz, roznica));
    }
}