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
    public void testDateEquals1(){
       EventDate date1 = new EventDate(03, 2013, "December");
        EventDate date2 = new EventDate(03, 2013, "December");
        assertTrue(date1.equal(date2));
    }

    @Test
    public void testDateEquals2(){
        EventDate date1 = new EventDate(03, 2013, "December");
        EventDate date2 = new EventDate(02, 2013, "December");
        assertFalse(date1.equal(date2));
    }


    //////////////////////////////////////////////////
    //          TESTING FOR LOCATION CLASS          //
    /////////////////////////////////////////////////


    @Test
    public void testGetCountry(){
        Location loc1 = new Location("Berekuso", "Ghana", "Ashesi University Campus");
        assertEquals("Ghana", loc1.getCountry());
    }

    @Test
    public void testGetCity(){
        Location loc1 = new Location("Berekuso", "Ghana", "Ashesi University Campus");
        assertEquals("Berekuso", loc1.getCity());
    }

    @Test
    public void testLocationEquals1(){
        Location loc1 = new Location("Berekuso", "Ghana", "Ashesi University Campus");
        Location loc2 = new Location("Narobi", "Kenya", "Adoina Beach");
        assertFalse(loc2.equals(loc1));
    }

    @Test
    public void testLocationEquals2(){
        Location loc1 = new Location("Berekuso", "Ghana", "Ashesi University Campus");
        Location loc2 = new Location("Berekuso", "Ghana", "Ashesi University Campus");
        assertTrue(loc2.equals(loc1));
    }


    //////////////////////////////////////////////////
    //          TESTING FOR EVENT CLASS            //
    /////////////////////////////////////////////////

    @Test
    public void testGetTitle(){
        Event event1 = new Event("Stop Galamsey Protest",
                "Groups of Ghanaian protested to fight against illigal mining",
                new Location("Accra", "Ghana", "Cantonment"),
                new EventDate(12, 2024, "March"),
                "BBC news",
                new Person("Victor Asum", "Student", "Victor is an environment climate change advocate")
        );

        assertEquals("Stop Galamsey Protest", event1.getTitle());
    }

    @Test
    public void testGetOrganizer(){
        Person organizer1=  new Person("Victor Asum", "Student", "Victor is an environment climate change advocate");
        Event event1 = new Event("Stop Galamsey Protest",
                "Groups of Ghanaian protested to fight against illigal mining",
                new Location("Accra", "Ghana", "Cantonment"),
                new EventDate(12, 2024, "March"),
                "BBC news",
                organizer1
        );

        assertEquals(organizer1, event1.getOrganizer());
    }

    @Test
    public void testHappenOnsameLocation1(){
        Person organizer1=  new Person("Victor Asum", "Student", "Victor is an environment climate change advocate");
        Event event1 = new Event("Stop Galamsey Protest",
                "Groups of Ghanaian protested to fight against illigal mining",
                new Location("Accra", "Ghana", "Cantonment"),
                new EventDate(12, 2024, "March"),
                "BBC news",
                organizer1
        );

        Event event2 = new Event("Free the Citizens",
                "People collaborated to fight for the human right again police Brutal",
                new Location("Accra", "Ghana", "Cantonment"),
                new EventDate(18, 2021, "February"),
                "Joy news"
        );

        assertTrue(event2.happenOnsameLocation(event1));
    }

    @Test
    public void testHappenOnsameLocation2(){
        Person organizer1=  new Person("Victor Asum", "Student", "Victor is an environment climate change advocate");
        Event event1 = new Event("Stop Galamsey Protest",
                "Groups of Ghanaian protested to fight against illigal mining",
                new Location("Accra", "Ghana", "Cantonment"),
                new EventDate(12, 2024, "March"),
                "BBC news",
                organizer1
        );

        Event event2 = new Event("Free the Citizens",
                "People collaborated to fight for the human right again police Brutal",
                new Location("Tamale", "Ghana", "Demi Market"),
                new EventDate(18, 2021, "February"),
                "Joy news"
        );

        assertFalse(event2.happenOnsameLocation(event1));
    }

    @Test
    public void testHappenOnsameDay(){
        Person organizer1=  new Person("Victor Asum", "Student", "Victor is an environment climate change advocate");
        Event event1 = new Event("Stop Galamsey Protest",
                "Groups of Ghanaian protested to fight against illigal mining",
                new Location("Accra", "Ghana", "Cantonment"),
                new EventDate(12, 2024, "March"),
                "BBC news",
                organizer1
        );

        Event event2 = new Event("Free the Citizens",
                "People collaborated to fight for the human right again police Brutal..",
                new Location("Tamale", "Ghana", "Demi Market"),
                new EventDate(18, 2021, "February"),
                "Joy news"
        );

        assertFalse(event2.happenOnsameDay(event1));
    }


    ////////////////////////////////////////////////////////
    //      TESTING FOR EVENT REPOSITORY CLASS            //
    ////////////////////////////////////////////////////////

    @Test
    public void testAddEvent1(){
        Person organizer1=  new Person("Victor Asum", "Student", "Victor is an environment climate change advocate");
        Event event1 = new Event("Stop Galamsey Protest",
                "Groups of Ghanaian protested to fight against illigal mining",
                new Location("Accra", "Ghana", "Cantonment"),
                new EventDate(12, 2024, "March"),
                "BBC news",
                organizer1
        );
        String response = EventRepository.addEvent(event1);
        assertEquals("Stop Galamsey Protest has successfully added (:", response);
    }

    @Test
    public void testAddEvent2(){

        Event event1 = new Event("Black life matter",
                "Peopple advocated for black people in USA",
                new Location("Los Angelos", "USA", "Street 123"),
                new EventDate(12, 2020, "March"),
                "BBC news",
                new ArrayList<>(Arrays.asList(
                        new Image("www.sdsadsa.ccac", "JPEG"),
                        new Image("www.sdsadsa.ccac", "GIF"),
                        new Image("vasdvvver.fwefwe", "GIF")
                ))
        );
        String response = EventRepository.addEvent(event1);
        assertEquals("Black life matter has successfully added (:", response);
    }

    @Test
    public void testDelete1(){

        Event event1 = new Event("Black life matter",
                "Peopple advocated for black people in USA",
                new Location("Los Angelos", "USA", "Street 123"),
                new EventDate(12, 2020, "March"),
                "BBC news"
        );
        Event event2 = new Event("End curruption Now",
                "People advocated to end curruption",
                new Location("Kasoa", "Ghana", "Street"),
                new EventDate(12, 2020, "March"),
                "BBC news"
        );
        Event event3 = new Event("Sample event Title",
                "Peopple advocated for black people in USA",
                new Location("Los Angelos", "USA", "Street 123"),
                new EventDate(12, 2020, "March"),
                "BBC news"
        );

        long _id = event3.getId();

        EventRepository.addEvent(event1);
        EventRepository.addEvent(event2);
        EventRepository.addEvent(event3);
        String res = EventRepository.delete(_id);
        assertEquals("Sample event Title has been successfully deleted (:", res);
    }

    @Test
    public void testDelete2(){

        Event event1 = new Event("Black life matter",
                "Peopple advocated for black people in USA",
                new Location("Los Angelos", "USA", "Street 123"),
                new EventDate(12, 2020, "March"),
                "BBC news"
        );
        Event event2 = new Event("End curruption Now",
                "People advocated to end curruption",
                new Location("Kasoa", "Ghana", "Street"),
                new EventDate(12, 2020, "March"),
                "BBC news"
        );
        Event event3 = new Event("Sample event Title",
                "Peopple advocated for black people in USA",
                new Location("Los Angelos", "USA", "Street 123"),
                new EventDate(12, 2020, "March"),
                "BBC news"
        );

        long _id = event3.getId();

        // I added additional value to the original ID to make it fake Id
        _id *= 4000;

        EventRepository.addEvent(event1);
        EventRepository.addEvent(event2);
        EventRepository.addEvent(event3);
        String res = EventRepository.delete(_id);
        assertEquals("Event with id: " + _id +  " not found to be deleted", res);
    }

    @Test
    public void testGetAllEvents(){

        // I need to delete all added events in the previous test so that I can validate the get All events methos.
        // I did this to ensure that only this below events are in the repository
        EventRepository.trashAll();

        Event event1 = new Event("Black life matter",
                "Peopple advocated for black people in USA",
                new Location("Los Angelos", "USA", "Street 123"),
                new EventDate(12, 2020, "March"),
                "BBC news"
        );
        Event event2 = new Event("End curruption Now",
                "People advocated to end curruption",
                new Location("Kasoa", "Ghana", "Street"),
                new EventDate(12, 2020, "March"),
                "BBC news"
        );
        Event event3 = new Event("Sample event Title",
                "Peopple advocated for black people in USA",
                new Location("Los Angelos", "USA", "Street 123"),
                new EventDate(12, 2020, "March"),
                "BBC news"
        );

        ArrayList<Event> expected = new ArrayList<>(Arrays.asList(
                event1,
                event2,
                event3
        ));


        EventRepository.addEvent(event1);
        EventRepository.addEvent(event2);
        EventRepository.addEvent(event3);

        assertEquals(expected, EventRepository.allEvents());
    }

    @Test
    public void testSearch(){

        // Deleting all previous events added so that I can focus on only the below events
        EventRepository.trashAll();

        Event event1 = new Event("Black life matter",
                "Peopple advocated for black people in USA",
                new Location("Los Angelos", "USA", "Street 123"),
                new EventDate(12, 2020, "March"),
                "BBC news"
        );
        Event event2 = new Event("End curruption Now",
                "People advocated to end curruption",
                new Location("Kasoa", "Ghana", "Street"),
                new EventDate(12, 2020, "March"),
                "BBC news"
        );
        Event event3 = new Event("Black is beautiful",
                "event organised to promte black awareness",
                new Location("Los Angelos", "USA", "Street 123"),
                new EventDate(12, 2020, "March"),
                "BBC news"
        );

        Event event4 = new Event("No sweetness here",
                "Sample event summary",
                new Location("Mim", "Ghana", "435 locations"),
                new EventDate(12, 2020, "March"),
                "BBC news"
        );

        Event event5 = new Event("Blacks Women in STEM",
                "event organised to awareness in STEM",
                new Location("Florida", "USA", "Street 123"),
                new EventDate(12, 2020, "March"),
                "BBC news"
        );
        EventRepository.addEvent(event1);
        EventRepository.addEvent(event2);
        EventRepository.addEvent(event3);
        EventRepository.addEvent(event4);
        EventRepository.addEvent(event5);


        // Searching for this event title
        String searchingWord = "Black life in General";

        // Black is a keyword in event 1, 3, 5. We expect to get them
        ArrayList<Event> expected = new ArrayList<>(Arrays.asList(
                event1,
                event3,
                event5
        ));

        assertEquals(expected, EventRepository.search(searchingWord));



    }

}
