// Program ini terdiri dari dua bagian:
// 1. cKelas Lamp memiliki atribut isOn untuk mengetahui apakah lampu menyala atau mati.
// 2. Kelas Lamp memiliki dua metode, yaitu turnOn() untuk menyalakan lampu dan turnOff() untuk mematikan lampu.
// 3. Kelas ClassDanObjek digunakan untuk membuat dua objek dari kelas Lamp (LED dan halogen).
// 4. Program menjalankan metode pada objek-objek tersebut, seperti menyalakan dan mematikan lampu.

class Lamp {
    boolean isOn;

    void turnOn() {
        isOn = true;
        System.out.println("Light on? " + isOn);
    }

    void turnOff() {
        isOn = false;
        System.out.println("Light on? " + isOn);
    }
}

public class ClassDanObjek {
    public static void main(String[] args) {
        Lamp led = new Lamp();
        Lamp halogen = new Lamp();

        led.turnOn();
        halogen.turnOff();
    }
}
