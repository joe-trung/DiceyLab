import java.util.HashMap;
import java.util.Map;

public class Bins {
    private int low;
    private int high;
    Map<Integer,Integer> binMap;
    public Bins(int low, int high){
        this.low = low;
        this.high = high;
        this.binMap = initializeBin();
    }

    public int getLow() {
        return low;
    }
    public int getHigh() {
        return high;
    }
    public void setLow(int low) {
        this.low = low;
    }
    public void setHigh(int high) {
        this.high = high;
    }

    public Map<Integer, Integer> getBinMap() {
        return binMap;
    }

    public void setBinMap(Map<Integer, Integer> binMap) {
        this.binMap = binMap;
    }

    public HashMap<Integer,Integer> initializeBin(){
        HashMap<Integer,Integer> newBins = new HashMap<>();
        for(int i = this.low; i <= this.high; i++){
            newBins.put(i,0);
        }
        return newBins;
    }

    public Integer getBin(int bin) {
        if(bin >= this.low && bin <= this.high) {
            return binMap.get(bin);
        }
        return -1;
    }

    public int incrementBin(int bin) {
        if(bin >= this.low && bin <= this.high){
            binMap.put(bin, binMap.get(bin)+1);
            return binMap.get(bin);
        } else {
            return -1;
        }
    }
}