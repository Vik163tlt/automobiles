public class Passenger extends Car implements Competing {
    public enum BodyType {
        SEDAN("Седан"),
        HATCHBACK("Хетчбек"),
        COUPE("Купе"),
        STATION_WAGON("Универсал"),
        SUV("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP_TRUCK("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");
        private final String modelBodyType;
        BodyType(String modelBodyType) {
            this.modelBodyType = modelBodyType;
        }
        public String getModelBodyType() {
            return modelBodyType;
        }
    }
    private final BodyType bodyType;
    public Passenger(String brand, String model, double engineVolumeL, BodyType bodyType) {
        super(brand, model, engineVolumeL);
        this.bodyType = bodyType;
    }
    public BodyType getBodyType() {
        return bodyType;
    }
    public void start() {
        System.out.println("Начать движение.");
    }
    public void end() {
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
    public void printBodyType() {
        if (bodyType != null) {
            System.out.println(getBrand() + " " + getModel() + " в кузове " + bodyType.getModelBodyType());
        } else {
            System.out.println("Данных недостаточно");
        }
    }
    public boolean passDiagnostic() {
        return Math.random() > 0.5;
    }
}
