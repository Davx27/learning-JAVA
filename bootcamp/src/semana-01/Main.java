public class Main {
    public static void main(String[] args) {
        Medicine med1 = new Medicine("Dolex", "Lafrancol", 8500);
        Medicine med2 = new Medicine("Acetaminofén", "Genfar", 6000);
        Medicine med3 = new Medicine("Amoxicilina", "Synthesis", 13500);
        Medicine med4 = new Medicine("Loratadina", "Tecnoquímicas", 15000);
        Medicine med5 = new Medicine("Omeprazol", "Bayer", 18000);

        med1.showInfo();
        med2.showInfo();
        med3.showInfo();
        med4.showInfo();
        med5.showInfo();
    }
}
