public class Truck extends Car implements Competing{
    public Truck(String brand, String model, double engineVolumeL) {
        super(brand, model, engineVolumeL);
    }
    public void start(){
        System.out.println("Начать движение.");
    }
    public void end(){
        System.out.println("Закончить движение.");
    }

    @Override
    public void pitStop() {
        System.out.println("Заезд на пит-стоп грузового автомобиля");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга грузового автомобиля");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скоростьость грузового автомобиля");
    }
}
