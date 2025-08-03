
public class varArgs {
    public static void main(String[] args) {
        m1(1,2,3,4);
    }
    static void m1(int... a)
    {
        for(int n : a)
        {
            System.out.println(n);
        }
    }
}
