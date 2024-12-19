import java.util.Scanner;

public class DataSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Data yang akan dicari
        String[] data = {
            "John", "Alice", "Bob", "Mary", "Steve", "Diana", "George"
        };

        System.out.println("=== Program Pencarian Data ===");
        System.out.println("Data yang tersedia:");
        for (String name : data) {
            System.out.print(name + " ");
        }
        System.out.println("\n");

        // Meminta input nama yang ingin dicari
        System.out.print("Masukkan nama yang ingin dicari: ");
        String searchName = scanner.nextLine();

        // Pencarian data
        boolean found = false;
        for (String name : data) {
            if (name.equalsIgnoreCase(searchName)) {
                found = true;
                break;
            }
        }

        // Output hasil pencarian
        if (found) {
            System.out.println("Nama '" + searchName + "' ditemukan dalam data.");
        } else {
            System.out.println("Nama '" + searchName + "' tidak ditemukan dalam data.");
        }

        scanner.close();
    }
}
