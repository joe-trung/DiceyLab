
public class Bins {
    private int[] bin;
    private int low, high;

    public Bins(int low, int high) {
        this.low = low;
        this.high = high;
        this.bin = new int[high-low];
    }
//    Bins results = new Bins(2, 12); // for bins from 2..12
//    Integer numberOfTens = results.getBin(10); // returns the number of tens in the 10 bin

    public int getBin(int iBin) {
        return this.bin[iBin - low];
    }

    public void incrementBin(int increment) {
        this.bin[increment - low] +=1;
    }

//    results.incrementBin(10); // should increment bin # 10

}
