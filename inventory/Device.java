package inventory;

public class Device {
    String brand;
    double price;

    public Device(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public void showInfo() {
        System.out.println("Бренд: " + brand + ", Ціна: " + price);
    }
}