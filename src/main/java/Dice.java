public class Dice {
    int numberOfDies;
    int low;
    int high;
    Bins bin;

    public Dice(int numberOfDies) {
        this.numberOfDies = numberOfDies;
        this.low = numberOfDies;
        this.high = numberOfDies*6;
        this.bin = new Bins(low, high);
    }

    public int getNumberOfDies() {
        return numberOfDies;
    }

    public void setNumberOfDies(int numberOfDies) {
        this.numberOfDies = numberOfDies;
    }

    public int getLow() {
        return low;
    }

    public void setLow(int low) {
        this.low = low;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public Bins getBin() {
        return bin;
    }

    public void setBin(Bins bin) {
        this.bin = bin;
    }

    public Integer tossAndSum() {
        int sum = 0;
        for(int i = 1; i <= numberOfDies; i++){
            sum += (Math.random()*6) + 1;
        }
        bin.incrementBin(sum);
        return sum;
    }


}