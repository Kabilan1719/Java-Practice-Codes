
public class B {
    public static void main(String[] args) {
        int i = m1();
        System.out.println(i);
    }
    static int m1(){
        System.out.println("m1");
        int i = 10;
        return ++i;
    }
}
