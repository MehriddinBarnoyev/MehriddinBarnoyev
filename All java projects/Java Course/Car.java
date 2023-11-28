public class Car {
    private String rang;
    private String model;
    private double narx;
    private boolean avtomatMexanik;

    // Konstruktor
    public Car(String rang, String model, double narx, boolean avtomatMexanik) {
        this.rang = rang;
        this.model = model;
        this.narx = narx;
        this.avtomatMexanik = avtomatMexanik;
    }

    // Getter metodi rang attributini olish uchun
    public String getRang() {
        return rang;
    }

    // Getter metodi model attributini olish uchun
    public String getModel() {
        return model;
    }

    // Getter metodi narx attributini olish uchun
    public double getNarx() {
        return narx;
    }

    // Getter metodi avtomatMexanik attributini olish uchun
    public boolean isAvtomatMexanik() {
        return avtomatMexanik;
    }

    // Ma'lumotlarni chiqarish uchun metodi
    public void getCarInfo() {
        String tuzilma = avtomatMexanik ? "Avtomat" : "Mexanik";
        System.out.println("Model: " + model + ", Rang: " + rang + ", Narx: " + narx + ", Tuzilma: " + tuzilma);
    }

    public static void main(String[] args) {
        // Car obyektlarini yaratish
        Car car1 = new Car("Oq", "Toyota Camry", 30000, true);
        Car car2 = new Car("Qora", "Chevrolet Malibu", 25000, false);

        // Ma'lumotlarni chiqarish
        car1.getCarInfo();
        car2.getCarInfo();
    }
}
 