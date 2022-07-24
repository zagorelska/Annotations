package sample;

public class Actions {

    @Test(a = 2, b = 5)
    public void test(int a, int b) {
        int res = a + b;
        System.out.println(a + " + " + b + " = " + res);
    }

}
