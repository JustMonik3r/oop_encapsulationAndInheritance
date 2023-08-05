public class Ravenclaw extends Hogwarts {
    private int intelligence;

    private int wisdom;

    private int wit;

    private int creativity;

    public Ravenclaw(String name, int magicPotency, int transgressionDistance, int intelligence, int wisdom, int wit, int creativity) {
        super(name, magicPotency, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    @Override
    public int calculateFacultyScore() {
        return intelligence + wisdom + wit + creativity;
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                "intelligence=" + intelligence +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity +
                "} " + super.toString();
    }
}
