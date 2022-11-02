public class Category_B extends Driver<Passenger>{
    public Category_B(String name) {
        super(name);
    }

    @Override
    public void driveCar(Passenger car) {
        System.out.println("Водитель " + getName() + " водит машину " + car.getBrand() + " " + car.getModel() + " и будет участвовать в заезде");
    }

    @Override
    public void start() {
        System.out.println("Начать движение");
    }

    @Override
    public void end() {
        System.out.println("Остановиться");
    }

    @Override
    public void refillCar() {
        System.out.println("Заправить авто");
    }
}