public class Hufflepuff extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int magicPotency, int apparitionDistance, int diligence, int loyalty, int honesty) {
        super(name, magicPotency, apparitionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    @Override
    public int calculateFacultyScore() {
        return diligence + loyalty + honesty;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "diligence=" + diligence +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                "} " + super.toString();
    }
}
