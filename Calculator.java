import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tampilkan menu operasi kalkulator
        System.out.println("=== Kalkulator Sederhana ===");
        System.out.println("Pilih operasi:");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");
        System.out.print("Masukkan pilihan (1-4): ");

        int choice = scanner.nextInt();

        // Minta input angka dari pengguna
        System.out.print("Masukkan angka pertama: ");
        double num1 = scanner.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double num2 = scanner.nextDouble();

        double result = 0;
        boolean validChoice = true;

        // Proses operasi berdasarkan pilihan
        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Hasil: " + num1 + " + " + num2 + " = " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Hasil: " + num1 + " - " + num2 + " = " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Hasil: " + num1 + " * " + num2 + " = " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Hasil: " + num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Error: Tidak bisa membagi dengan nol.");
                }
                break;
            default:
                validChoice = false;
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
        }

        scanner.close();
    }
}
