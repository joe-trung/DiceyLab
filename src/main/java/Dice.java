import java.util.Random;

public class Dice {
    private int numberOfToss;
    public Dice(int numberOfToss) {
        this.numberOfToss = numberOfToss;
    }
    public int getNumberOfToss() {return this.numberOfToss;}
    public int tossAndSum() {
        Random random = new Random();
        int result = 0;
        for (int i=1; i<=getNumberOfToss(); i++) {
            result = result + (random.nextInt(5) +1);
        }
        return result;
    }



//    int toss = dice.tossAndSum();
//    Dice dice = new Dice(2); // for craps
//    Dice dice = new Dice(5); // for yatzee

}
