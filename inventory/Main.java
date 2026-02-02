package inventory;

public class Main {
    public static void main(String[] args) {
        Device[] warehouse = new Device[4];

        warehouse[0] = new Device("Базовий пристрій", 50.0);
        warehouse[1] = new Phone("Samsung", 500.0, 108);
        warehouse[2] = new Phone("iPhone", 999.0, 48);
        warehouse[3] = new Laptop("Asus", 1200.0, 16);

        for (Device device : warehouse) {
            device.showInfo();
        }
    }
}