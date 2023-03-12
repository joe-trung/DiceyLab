import org.junit.Assert;
import org.junit.Test;

public class SimulationTest {
    @Test
    public void testConstructor(){
        //Given
        Simulation sim = new Simulation(2, 100);

        // When Then
        Assert.assertEquals(2,sim.getNumberOfDices());
        Assert.assertEquals(100,sim.getNumberOfTosses());
    }

    @Test
    public void testGetAsterisk(){
        // Given
        Simulation sim = new Simulation(2, 10000);
        int numAst = 5;
        String expected = "*****";

        // When
        String actual = sim.getAsterisk(numAst);

        // Then
        Assert.assertEquals(expected,actual);
    }
}