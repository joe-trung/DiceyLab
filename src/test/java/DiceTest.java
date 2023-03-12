import org.junit.Assert;
import org.junit.Test;

public class DiceTest {

    @Test
    public void testConstructor(){
        // Given
        Dice dice = new Dice(2);

        // When // Then
        Assert.assertEquals(2,dice.getLow());
        Assert.assertEquals(12,dice.getHigh());
        Assert.assertEquals(2,dice.getNumberOfDies());
    }

    @Test
    public void testDiceToss(){
        // Given
        Dice dice = new Dice(2);

        // When tossing 100 times
        for(int i = 0; i < 100; i++){
            Integer tossResult = dice.tossAndSum();

            // Then
            Assert.assertTrue(tossResult>=2 && tossResult<=12);
        }

    }




}