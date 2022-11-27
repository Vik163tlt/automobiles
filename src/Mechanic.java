import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Mechanic <T extends Car>{
    private String name;
    private String surName;
    private String company;
    private Set<Car> cars = new HashSet<>();

    public Mechanic(String name, String surName, String company) {
        this.name = name;
        this.surName = surName;
        this.company = company;
    }
    public Mechanic(String name, String lastName, String company, Set<Car> cars) {
        this.name = name;
        this.surName = lastName;
        this.company = company;
        this.cars = cars;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getCompany() {
        return company;
    }
    public boolean service(T t){
        return t.passDiagnostic();
    }
    public void repair(T t){
        t.repair();

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic<?> mechanic = (Mechanic<?>) o;
        return Objects.equals(name, mechanic.name) && Objects.equals(surName, mechanic.surName) && Objects.equals(company, mechanic.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName, company);
    }

    @Override
    public String toString() {
        return name+" "+surName+", из "+company;
    }
}
