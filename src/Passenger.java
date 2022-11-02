public class Passenger extends Car implements Competing{
    public Passenger(String brand, String model, double enginVolume_L) {
        super(brand, model, enginVolume_L);
    }
    public void start(){
        System.out.println("Начать движение.");
    }
    public void end(){
        System.out.println("Закончить движение.");
    }

    @Override
    public void pitStop() {
        System.out.println("Заезд на пит-стоп легкового автомобиля");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга легкового автомобиля");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скоростьость легкового автомобиля");
    }
}
