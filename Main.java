//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void trojkiPitagorejskie(int n){
        for(int a = 1; a <= n; a++){
            for(int b = a; b <= n; b++){
                int c = (int)Math.sqrt(a*a + b*b);
                if(a*a + b*b == c*c && c <= n){
                    System.out.println("Trójka pitagorejska ("+ a + ", " + b + ", " + c +")");
                }
            }
        }
    }

    public static void funKwaRozwiazania(int n){
        for(int a = -n; a <= n; a++){
            if(a == 0){
                continue;
            }
            for(int b = -n; b <= n; b++){
                for(int c = -n; c <= n; c++){
                    if(b*b - 4*a*c >= 0){
                        System.out.println("Zestawy współczynników funckji kwadratowej: (" + a + ", " + b + ", " + c + ")");
                    }
                }
            }
        }
    }

    public static void funKwaDelta(int n){
        for(int a = -n; a <= n; a++){
            if(a == 0){
                continue;
            }
            for(int b = -n; b <= n; b++){
                for(int c = -n; c <= n; c++){
                    int delta = b*b - 4*a*c;
                    if (delta >= 0){
                        int pierDel = (int)Math.sqrt(delta);
                        if(pierDel * pierDel == delta){
                            System.out.println("Zestawy współczynników funckji kwadratowej: (" + a + ", " + b + ", " + c + ") ");
                        }
                    }
                }
            }
        }
    }

    public static void liczbyPierwsze(int n){
        for(int i = 2; i<= Math.sqrt(n); i++){
            if(n % i == 0){

            }
        }
    }

    public static void silnia(int n){
        int silnia = 1;
        for(int a = 1; a <= n; a++){
            silnia = silnia * a;
        }
        System.out.println(silnia);
    }

    public static void silniaPodwojna(int n){
        int silnia = 1;
        for (int a = n; a > 0; a-= 2) {
            silnia = silnia * a;
        }
        System.out.println(silnia);
    }

    public static void dwumianNewtona(int n, int k){
        int n1 = 1;
        for(int a = 1; a <= n; a++){
            n1 = n1 * a;
        }
        int k1 = 1;
        for(int a = 1; a <= k; a++){
            k1 = k1 * a;
        }

        int nawias = n - k;
        int c1 = 1;
        for(int a = 1; a <= nawias; a++){
            c1 = c1 * a;
        }
        int suma = n1 / (k1 * c1);

        System.out.println("Wynik dwumianu Newtona: "+suma+" ");
    }

    public static int ciagFibonacciego(int n){
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        else{
            return ciagFibonacciego(n-1) + ciagFibonacciego(n-2);
        }
    }

    public static void main(String[] args) {

        int n = 7;
        System.out.println(ciagFibonacciego(n));
        /*
        int n = 5;
        int k = 3;
        dwumianNewtona(n, k);*/
        /*
        int n = 8;
        silniaPodwojna(n);*/
        /*
        int n = 10;
        silnia(n);*/
        /*
        int n = 10;
        liczbyPierwsze(n);*/
        /*
        int n = 1;
        funKwaDelta(n);*/
        /*
        int n = 2;
        funKwaRozwiazania(n);*/
        /*
        int n = 20;
        trojkiPitagorejskie(n);*/
    }
}