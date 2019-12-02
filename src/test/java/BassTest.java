import instruments.Bass;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BassTest {

    Bass bass;
    @Before
    public void before() {
        bass = new Bass("Marcus Miller", "V7 Swamp Ahs-4", 400, 2000, "Jazz Bass");
    }

    @Test
    public void hasMake(){
        assertEquals("Marcus Miller", bass.getMake());
    }
    @Test
    public void hasModel(){
        assertEquals("V7 Swamp Ahs-4", bass.getModel());
    }
    @Test
    public void hasStyle(){
        assertEquals("Jazz Bass", bass.getStyle());
    }
    @Test
    public void hasCostPrice() {
        assertEquals(400, bass.getCostPrice(), 0.01);
    }
    @Test
    public void hasSellPrice() {
        assertEquals(2000, bass.getSellPrice(), 0.01);
    }

    @Test
    public void canPlay() {
        assertEquals("Duuuuuuuummmmm", bass.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(1600, bass.calculateMarkup(), 0.01);
    }





}
