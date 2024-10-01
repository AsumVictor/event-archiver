import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {
    public static void main(String[] args) {

        Event event1 = new Event("Stop Gallemsey Protest",
                "Groups of Ghanaian protested to fight against illigal mining",
                new Location("Accra", "Ghana", "Cantonment"),
                new EventDate(12, 2024, "March"),
                "BBC news"
                );

        Event event2 = new Event("Free the Citizens",
                "People fought for their rights against police brutal",
                new Location("Kumasi", "Ghana", "KNUST campus"),
                new EventDate(12, 2024, "March"),
                "BBC news"
        );

        Event event3 = new Event("Free the Blacks",
                "People fought for their rights against police brutal",
                new Location("Kumasi", "Ghana", "KNUST campus"),
                new EventDate(12, 2024, "June"),
                "BBC news"
        );


        EventRepository.addEvent(event1);
        EventRepository.addEvent(event2);
        EventRepository.addEvent(event3);


        Event event7 = new Event("No sweetness here",
                "Sample event summary",
                new Location("Mim", "Ghana", "435 locations"),
                new EventDate(12, 2020, "March"),
                "BBC news"
        );

        Event event8 = new Event("Blacks Women in STEM",
                "event organised to awareness in STEM",
                new Location("Florida", "USA", "Street 123"),
                new EventDate(12, 2020, "March"),
                "BBC news"
        );
        EventRepository.addEvent(event1);
        EventRepository.addEvent(event2);
        EventRepository.addEvent(event3);



        // Searching for this event title
        String searchingWord = "Black life in General";


        EventRepository.search(searchingWord);

    }
}