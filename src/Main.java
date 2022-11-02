public class Main {
    public static void main(String[] args) {

        Passenger lada = new Passenger("Lada", "Granta", 1.7);
        Passenger audi = new Passenger("Audi","A8 50 L TDI quattro", 3.0);
        Passenger hyundai = new Passenger("Hyundai", "Avante", 1.6);
        Passenger kia = new Passenger("Kia", "Sportage 4-го поколения", 2.4);

        Truck man = new Truck("Man", "tgl 8.180", 3.5);
        Truck gaz = new Truck("ГАЗ", "САЗ-3507", 3.0);
        Truck kamaz = new Truck("КамАЗ", "203", 3.3);
        Truck ural = new Truck("Урал", "375", 3.2);

        Bus ikarus = new Bus("Ikarus", "280", 2.4);
        Bus liaz = new Bus("ЛиАЗ", "507", 2.9);
        Bus volkswagen = new Bus("Volkswagen", "Microbus", 2.7);
        Bus krupp = new Bus("Krupp", "Titan", 1.8);

        System.out.println(lada);
        System.out.println(kamaz);
        audi.start();

        audi.pitStop();
        audi.bestLapTime();
        audi.maxSpeed();

        kamaz.pitStop();
        kamaz.bestLapTime();
        kamaz.maxSpeed();

        liaz.pitStop();
        liaz.bestLapTime();
        liaz.maxSpeed();

        Category_B ivanov = new Category_B("Иванов Иван Иванович");
        Category_C smirnov = new Category_C("Смирнов Алексей Алексеевич");
        Category_D sidorov = new Category_D("Сидоров Петр Алексееви");

        ivanov.driveCar(kia);
        smirnov.driveCar(ural);
        sidorov.driveCar(krupp);


    }
}