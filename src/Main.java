
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


    }
}