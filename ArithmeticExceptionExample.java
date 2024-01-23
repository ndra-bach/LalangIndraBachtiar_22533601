import java.util.Scanner;

public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan angka pertama: ");
            int num1 = scanner.nextInt();

            System.out.print("Masukkan angka kedua: ");
            int num2 = scanner.nextInt();

            int result = num1 / num2; // Operasi aritmetika
            System.out.println("Hasil: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Terjadi kesalahan aritmetika: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            // Selalu tutup scanner setelah digunakan
            scanner.close();
        }
    }
}