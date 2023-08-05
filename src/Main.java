// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Random;
public class Main {

    public static int generateRandomNumber (int randomInt) {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        return number;
    }
    public static void main(String[] args) {

        Gryffindor harryPotter = new Gryffindor("Harry Potter", generateRandomNumber(100), generateRandomNumber(100), generateRandomNumber(100), generateRandomNumber(100), generateRandomNumber(100));
        Gryffindor hermioneGranger = new Gryffindor("Hermione Granger", generateRandomNumber(100), generateRandomNumber(100), generateRandomNumber(100), generateRandomNumber(100), generateRandomNumber(100));

        Slytherin dracoMalfoy = new Slytherin("Draco Malfoy", generateRandomNumber(100), generateRandomNumber(100), generateRandomNumber(100), generateRandomNumber(100), generateRandomNumber(100), generateRandomNumber(100), generateRandomNumber(100));
        Slytherin gregoryGoyle = new Slytherin("Gregory Goyle", generateRandomNumber(100), generateRandomNumber(100), generateRandomNumber(100), generateRandomNumber(100), generateRandomNumber(100), generateRandomNumber(100), generateRandomNumber(100));

        System.out.println(harryPotter);
        System.out.println(hermioneGranger);
        System.out.println(gregoryGoyle);
        System.out.println(dracoMalfoy);
        System.out.println();

        harryPotter.compareScore(hermioneGranger);
        dracoMalfoy.compareScore(gregoryGoyle);
        harryPotter.compareScore(dracoMalfoy);
        harryPotter.compareScore(gregoryGoyle);
    }
}