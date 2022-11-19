public class Mechanic <T extends Car>{
    private String name;
    private String surName;
    private String company;

    public Mechanic(String name, String surName, String company) {
        this.name = name;
        this.surName = surName;
        this.company = company;
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
    public String toString() {
        return name+" "+surName+", из "+company;
    }
}
