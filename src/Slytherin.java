public class Slytherin extends Hogwarts {
    private int cunning;

    private int determination;

    private int ambition;

    private int resourcefulness;

    private int thirstForPower;

    public Slytherin(String name, int magicPotency, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, magicPotency, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    @Override
    public int calculateFacultyScore() {
        return cunning + determination + ambition + resourcefulness + thirstForPower;
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", thirstForPower=" + thirstForPower +
                "} " + super.toString();
    }
}
