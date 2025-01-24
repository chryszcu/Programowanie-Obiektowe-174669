public class Equal<T> {
    T a;
    public void setA(T a) {
        this.a = a;
    }

    public T getA() {
        return a;
    }

    public static <T> boolean isEqualOrNull(T a, T b) {
        if(a.equals(b)){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Equal<Integer> e = new Equal<>();
        e.setA(1);
        Equal<Integer> e1 = new Equal<>();
        e1.setA(1);

        System.out.println(isEqualOrNull(e.getA(), e1.getA()));
    }
}
