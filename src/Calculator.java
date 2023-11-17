import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Pilih operasi:");
            System.out.println("1. Akar kuadrat");
            System.out.println("2. Pangkat");
            System.out.println("3. Logaritma natural (basis e)");
            System.out.println("4. Factorial");
            System.out.println("5. Keluar");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    squareRoot();
                    break;
                case 2:
                    power();
                    break;
                case 3:
                    naturalLogarithm();
                    break;
                case 4:
                    factorial();
                    break;
                case 5:
                    System.out.println("Terima kasih! Keluar dari program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }

    private static void squareRoot() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan angka: ");
        double number = scanner.nextDouble();
        double result = Math.sqrt(number);
        System.out.println("Akar kuadrat dari " + number + " adalah: " + result);
    }

    private static void power() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan angka: ");
        double base = scanner.nextDouble();
        System.out.println("Masukkan eksponen: ");
        double exponent = scanner.nextDouble();
        double result = Math.pow(base, exponent);
        System.out.println(base + " pangkat " + exponent + " adalah: " + result);
    }

    private static void naturalLogarithm() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan angka: ");
        double number = scanner.nextDouble();
        double result = Math.log(number);
        System.out.println("Logaritma natural dari " + number + " adalah: " + result);
    }

    private static void factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan angka: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Factorial tidak dapat dihitung untuk angka negatif.");
        } else {
            long result = 1;
            for (int i = 1; i <= number; i++) {
                result *= i;
            }
            System.out.println("Factorial dari " + number + " adalah: " + result);
        }
    }
}
