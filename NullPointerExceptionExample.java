import java.util.Scanner;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan sebuah string: ");
            String text = scanner.nextLine();

            // Akses pada objek null (akan tetap menyebabkan NullPointerException)
            System.out.println("Panjang string: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Terjadi NullPointerException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            // Selalu tutup scanner setelah digunakan
            scanner.close();
        }
    }
}