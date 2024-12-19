import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        
        while (true) {
            System.out.println("\n=== Sistem Manajemen Tugas ===");
            System.out.println("1. Tambah Tugas");
            System.out.println("2. Lihat Semua Tugas");
            System.out.println("3. Hapus Tugas");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline

            switch (choice) {
                case 1: // Tambah Tugas
                    System.out.print("Masukkan nama tugas: ");
                    String newTask = scanner.nextLine();
                    tasks.add(newTask);
                    System.out.println("Tugas berhasil ditambahkan.");
                    break;

                case 2: // Lihat Semua Tugas
                    if (tasks.isEmpty()) {
                        System.out.println("Belum ada tugas yang ditambahkan.");
                    } else {
                        System.out.println("\nDaftar Tugas:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;

                case 3: // Hapus Tugas
                    if (tasks.isEmpty()) {
                        System.out.println("Belum ada tugas yang bisa dihapus.");
                    } else {
                        System.out.println("\nDaftar Tugas:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                        System.out.print("Masukkan nomor tugas yang ingin dihapus: ");
                        int taskNumber = scanner.nextInt();

                        if (taskNumber > 0 && taskNumber <= tasks.size()) {
                            tasks.remove(taskNumber - 1);
                            System.out.println("Tugas berhasil dihapus.");
                        } else {
                            System.out.println("Nomor tugas tidak valid.");
                        }
                    }
                    break;

                case 4: // Keluar
                    System.out.println("Keluar dari program. Selamat tinggal!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opsi tidak valid. Silakan pilih lagi.");
            }
        }
    }
}
