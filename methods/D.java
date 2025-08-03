

public class D {
    public static void main(String[] args) {
        int a = 1;
        m1(a);
        System.out.println(a);
    }
    static void m1(int a)
    {
        System.out.println(a);
        a +=10;
        System.out.println(a);
    }    
}
