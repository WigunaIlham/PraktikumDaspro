class PintuOtomatis {
    String jenis;

    void buka() {
        System.out.println("Pintu " + jenis + " terbuka secara otomatis.");
    }

    void tutup() {
        System.out.println("Pintu " + jenis + " tertutup secara otomatis.");
    }

    void alarm() {
        System.out.println("Alarm pintu " + jenis + " diaktifkan.");
    }
}

public class ContohPintuOtomatis {
    public static void main(String[] args) {
        PintuOtomatis pintuGarasi = new PintuOtomatis();
        pintuGarasi.jenis = "Garasi";

        pintuGarasi.buka();
        pintuGarasi.tutup();
        pintuGarasi.alarm();
    }
}

