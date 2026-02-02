package inventory;

public class Phone extends Device {
    int cameraResolution;

    public Phone(String brand, double price, int cameraResolution) {
        super(brand, price);
        this.cameraResolution = cameraResolution;
    }

    @Override
    public void showInfo() {
        System.out.println("Бренд: " + brand + ", Ціна: " + price + ", Камера: " + cameraResolution + " Мп");
    }
}