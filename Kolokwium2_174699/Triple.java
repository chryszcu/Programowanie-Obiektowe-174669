public class Triple <T>{
    private T a;
    private T b;
    private T c;
    public Triple(T a, T b, T c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public T getFirst(){
        return a;
    }
    public T getSecond(){
        return b;
    }
    public T getThird(){
        return c;
    }
    public static void main(String[] args){
        Triple triple = new Triple(1,"Hej",1.1);
        System.out.println(triple.getFirst());
        System.out.println(triple.getSecond());
        System.out.println(triple.getThird());
    }
}
