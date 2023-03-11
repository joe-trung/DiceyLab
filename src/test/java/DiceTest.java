import junit.framework.TestCase;

public class DiceTest extends TestCase {
    @Test
    public void testDiceConstructor(){
        int expected = 4;
        Dice dice = new Dice(4);

        int actual = dice.getNumberOfToss();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testTossAndSum(){
        int expected = 2;
        Dice dice = new Dice(2);

        int actual = dice.tossAndSum();

        Assert.assertEquals(expected,actual);
    }

}
