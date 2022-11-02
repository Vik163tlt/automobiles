public abstract class Car {
    private String brand;
    private String model;
    private double enginVolume_L;

    public Car(String brand, String model, double enginVolume_L) {
        this.brand = validOrDefult.validOrDefult(brand,"defult");
        this.model = validOrDefult.validOrDefult(model,"defult");
        this.setEnginVolume_L(enginVolume_L);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEnginVolume_L() {
        return enginVolume_L;
    }

    public Car setEnginVolume_L(double enginVolume_L) {
        this.enginVolume_L = enginVolume_L > 0.0f ? enginVolume_L : 1.5f;
        return this;
    }
    public abstract void start();
    public abstract void end();

    @Override
    public String toString() {
        return brand + " " + model + ", объем двигателя: " + enginVolume_L;
    }
}
