import java.util.Map;

public class Simulation {
    private int numberOfDices;
    private int numberOfTosses;
    Dice dice;
    public static void main(String[] args) {
        Simulation sim = new Simulation(2,100000);
        sim.runSimulation();
        sim.printResult();
    }
    public Simulation(int numberOfDices, int numberThrows) {
        this.numberOfDices = numberOfDices;
        this.numberOfTosses = numberThrows;
        dice = new Dice(numberOfDices);
    }

    public int getNumberOfDices() {
        return numberOfDices;
    }

    public void setNumberOfDices(int numberOfDices) {
        this.numberOfDices = numberOfDices;
    }

    public int getNumberOfTosses() {
        return numberOfTosses;
    }

    public void setNumberOfTosses(int numberOfTosses) {
        this.numberOfTosses = numberOfTosses;
    }

    public Dice getDice() {
        return dice;
    }

    public void setDice(Dice dice) {
        this.dice = dice;
    }

    public void runSimulation() {
        for(int i = 1; i <= numberOfTosses; i++){
            dice.tossAndSum();
        }
    }

    public void printResult() {
        System.out.format("***\n"
                +"Simulation of %d dice tossed for %d times.\n"
                +"***\n\n",numberOfDices,numberOfTosses);
        for(Map.Entry<Integer,Integer> tossResult
                : dice.getBin().getBinMap().entrySet()){
            double percentage = (double)tossResult.getValue()/numberOfTosses;
            System.out.format("%2d : %7d: %.2f %s\n",
                    tossResult.getKey(),
                    tossResult.getValue(),
                    percentage,
                    getAsterisk((int) (percentage*100)));
        }
    }

    public String getAsterisk(int num){
        StringBuilder asterisks = new StringBuilder("");
        for(int i = 0 ; i < num; i++){
            asterisks.append("*");
        }
        return asterisks.toString();
    }

}//last