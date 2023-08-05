import java.util.Objects;

public abstract class Hogwarts {
    private String name;
    private int magicPotency;
    private int apparitionDistance;

    public Hogwarts(String name, int magicPotency, int apparitionDistance) {
        this.name = name;
        this.magicPotency = magicPotency;
        this.apparitionDistance = apparitionDistance;
    }

    abstract public int calculateFacultyScore();

    public void compareScore (Hogwarts hogwarts) {
        if (this.getClass().equals(hogwarts.getClass())) {
            compageSchoolScore(hogwarts);
            compareFacultyScore(hogwarts);
            System.out.println();
        } else {
            compageSchoolScore(hogwarts);
            System.out.println();
        }
    }

    private void compageSchoolScore (Hogwarts hogwarts) {
        System.out.println("Сравнение общешкольных данных:");
        int thisScore = this.getMagicPotency() + this.getApparitionDistance();
        int otherScore = hogwarts.getMagicPotency() + hogwarts.getApparitionDistance();

        if (thisScore > otherScore) {
            System.out.println(this.getName() + " сильнее чем " + hogwarts.getName());
        } else if (thisScore < otherScore) {
            System.out.println(hogwarts.getName() + " сильнее чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + hogwarts.getName() + " равны по силе");
        }
    }

    private void compareFacultyScore(Hogwarts hogwarts) {
        System.out.println("Сравнение факультетских данных:");
        int thisScore = this.calculateFacultyScore();
        int otherScore = hogwarts.calculateFacultyScore();

        if (thisScore > otherScore) {
            System.out.println(this.getName() + " лучше воплощает в себе качества факультета, чем " + hogwarts.getName());
        } else if (thisScore < otherScore) {
            System.out.println(hogwarts.getName() + " лучше воплощает в себе качества факультета, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + hogwarts.getName() + " образцовые представители факультета");
        }
    }

    public String getName() {
        return name;
    }


    public int getMagicPotency() {
        return magicPotency;
    }


    public int getApparitionDistance() {
        return apparitionDistance;
    }



    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", magicPotency=" + magicPotency +
                ", apparitionDistance=" + apparitionDistance +
                '}';
    }
}
