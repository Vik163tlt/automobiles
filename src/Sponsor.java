public class Sponsor {
    private String name;
    private int amount;

    public Sponsor(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }
    public void toSponsorRace(){
        System.out.printf("Спонсор \"%s\" пронспонсировал заезд на %d%n", getName(), getAmount());
    }

    @Override
    public String toString() {
        return name+ " - инвестиции: "+amount;
    }
}
