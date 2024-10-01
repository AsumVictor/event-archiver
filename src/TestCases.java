import java.util.*;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCases {

    //////////////////////////////////////////////////
    //          TESTING FOR DATE CLASS              //
    /////////////////////////////////////////////////

    @Test
    public void testGetDay(){
       assertEquals("July", new EventDate(12,2024, "July").getMonth());
    }

    @Test
    public void testGetYear(){
        assertEquals(2024,  new EventDate(12,2024, "July").getYear());
    }

    @Test
    public void testEquals1(){
       EventDate date1 = new EventDate(03, 2013, "December");
        EventDate date2 = new EventDate(03, 2013, "December");
        assertTrue(date1.equal(date2));
    }

    @Test
    public void testEquals2(){
        EventDate date1 = new EventDate(03, 2013, "December");
        EventDate date2 = new EventDate(02, 2013, "December");
        assertFalse(date1.equal(date2));
    }

}
