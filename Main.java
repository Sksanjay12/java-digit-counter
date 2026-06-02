public class Main {
    public static void main(String args[]) {
        int a = 1234;
        int d = 0;
        while (a != 0) {
            a = a / 10;
            d++;
        }
        System.out.print(d);
    }
}
