// Abstract Class
abstract class Transportasi {
    private String jenis;

    Transportasi(String jenis) {
        this.jenis = jenis;
    }

    public String getjenis() {
        return jenis;
    }

    // Abstract Method (harus diimplementasikan oleh subclass)
    public abstract void deskripsiTransportasi();

    // Panggil JenisTransportasi
    public void jenisTransportasi() {
        System.out.println("Jenis Transportasi: " + jenis);
    }
}

// Class Mobil (Subclass)
class Mobil extends Transportasi {

    Mobil(String jenis) {
        super(jenis);
    }

    @Override
    public void deskripsiTransportasi() {
        System.out.println("Mobil adalah kendaraan yang digunakan di jalan raya.");
    }
}

// Class Sepeda (Subclass)
class Sepeda extends Transportasi {

    Sepeda(String jenis) {
        super(jenis);
    }

    @Override
    public void deskripsiTransportasi() {
        System.out.println("Sepeda adalah kendaraan yang digerakkan dengan pedal.");
    }
}

// Class Pesawat (Subclass)
class Pesawat extends Transportasi {

    Pesawat(String jenis) {
        super(jenis);
    }

    @Override
    public void deskripsiTransportasi() {
        System.out.println("Pesawat adalah kendaraan yang terbang di udara.");
    }
}

// Class Main
public class Main {
    public static void main(String[] args) {
        Transportasi Transportasi1 = new Mobil("Lamborghini Aventador");
        Transportasi1.jenisTransportasi();
        Transportasi1.deskripsiTransportasi();

        Transportasi Transportasi2 = new Sepeda("EVERGO");
        Transportasi2.jenisTransportasi();
        Transportasi2.deskripsiTransportasi();

        Transportasi Transportasi3 = new Pesawat("F22");
        Transportasi3.jenisTransportasi();
        Transportasi3.deskripsiTransportasi();
    }
}
