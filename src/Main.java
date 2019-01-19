import java.util.Scanner;

public class Main {
    public int he_so = 0;

    public enum seasion{mua_xuan,mua_thu,mua_dong};

    public static void main(String[] args) {
        int a;
        System.out.println("nhập vào số: ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        System.out.println("Giai thừa của " + a + " là: "
                + Main.tinhGiaithua(a));

    }
    public static long tinhGiaithua(int n) {
        long giai_thua = 1;
        if (n == 0 || n == 1) {
            return giai_thua;
        } else {
            for (int i = 2; i <= n; i++) {
                giai_thua *= i;
            }
            return giai_thua;
        }
    }

}
