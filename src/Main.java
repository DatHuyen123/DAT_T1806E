import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("nhập vào số n: ");
        int n = scanner.nextInt();
        System.out.print("các số nguyên tố nhỏ hơn " + n + "là: ");
        if (n == 2) {
            System.out.print(2);
        } else {
            for (int i = 3; i < n; i += 2) {
                if (Xetsonguyento(i)) {
                    System.out.print(i + ",");
                }
            }
        }
    }


    public static boolean Xetsonguyento(int n) {
        if (n < 2) {
            return false;
        }
        int canbachai = (int) Math.sqrt(n);
        for (int i = 2; i <= canbachai; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

