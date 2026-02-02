package inventory;

public class Laptop extends Device {
    int ram;

    public Laptop(String brand, double price, int ram) {
        super(brand, price);
        this.ram = ram;
    }

    @Override
    public void showInfo() {
        System.out.println("Бренд: " + brand + ", Ціна: " + price + ", RAM: " + ram + " ГБ");
    }
}