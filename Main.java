class Orang {
    // Atribut private (Encapsulation)
    private String nama;
    private int umur;

    // Constructor
    Orang(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // Getter untuk nama
    public String getNama() {
        return nama;
    }

    // Setter untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter untuk umur
    public int getUmur() {
        return umur;
    }

    // Setter untuk umur
    public void setUmur(int umur) {
        this.umur = umur;
    }

    // Method
    public void perkenalkanDiri() {
        System.out.println("Halo, nama saya " + nama + " dan saya berumur " + umur + " tahun.");
    }
}

// Class Main
public class Main {
    public static void main(String[] args) {
        // Membuat object dengan constructor
        Orang orang1 = new Orang("Arno", 30);

        // Mengakses atribut melalui getter
        System.out.println("Nama sebelum diubah: " + orang1.getNama());

        // Mengubah atribut melalui setter
        orang1.setNama("Arno Si Pembelajar");
        orang1.setUmur(31);

        // Memanggil method setelah perubahan
        orang1.perkenalkanDiri();

        Orang orang2 = new Orang("Ahmad", 32);

        // Mengakses atribut melalui getter
        System.out.println("Nama sebelum diubah: " + orang2.getNama());

        // Mengubah atribut melalui setter
        orang2.setNama("Ahmad Si Tekhnisi");
        orang2.setUmur(33);

        // Memanggil method setelah perubahan
        orang2.perkenalkanDiri();
    }
}
