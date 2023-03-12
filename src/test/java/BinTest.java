import org.junit.Assert;
import org.junit.Test;

public class BinTest {
    @Test
    public void testConstructor(){
        // Given
        Bins bin = new Bins(2,12);

        // When
        // Then
        Assert.assertEquals(2,bin.getLow());
        Assert.assertEquals(12,bin.getHigh());
        Assert.assertEquals(11,bin.getBinMap().size());
    }

    @Test
    public void testGetBin(){
        // Given
        Bins bin = new Bins(2,12);
        int expected = 0;

        // When
        // Then
        for(int i = 2; i <= 12; i++){
            int actual = bin.getBin(i);
            Assert.assertEquals(0,actual);
        }
    }

    @Test
    public void testGetBinOutOfRange(){
        // Given
        Bins bin = new Bins(2,12);
        int expected = -1;

        // When
        int actual = bin.getBin(13);

        // Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testIncrementBin(){
        // Given
        Bins bin = new Bins(2,12);
        int expected = 2;

        // When
        bin.incrementBin(10);
        bin.incrementBin(10);
        int actual = bin.getBin(10);

        // Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testIncrementBinOutOfRange(){
        // Given
        Bins bin = new Bins(2,12);
        int expected = -1;

        // When
        int actual = bin.incrementBin(13);

        // Then
        Assert.assertEquals(expected,actual);
    }


}