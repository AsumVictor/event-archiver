import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class EventRepository {
    static private List<Event> events = new ArrayList<>();

    // add event
   public static String addEvent(Event newEvent){
       events.add(newEvent);

       return newEvent.getTitle() + " has successfully added (:";
   }

    // delete event
public static String delete(long id){
       Event foundEvent = getEventById(id);
       if(foundEvent == null){
           return "Event with id: " + id + " not found to be deleted";
       }

       events.remove(foundEvent);

       return foundEvent.getTitle() + " has been successfully deleted (:";
}
    // update event

    // get all events
public static List<Event> allEvents(){
       return events;
}

    // getEventById
public static Event getEventById(long id){
       for(Event event: events){
           if(event.getId() == id) return event;
       }

       return null;
}

public static void trashAll(){
      events = new ArrayList<>();
    }


    // search
public static List<Event> search(String title){
       List<Event> resultEvents = new ArrayList<>();
       HashSet<String> queryKeywords = new HashSet<>(Arrays.asList(title.toLowerCase().split(" ")));

       for(Event event: events){

           List<String> currEventKeywords = new ArrayList<>(Arrays.asList(event.getTitle().toLowerCase().split(" ")));
           boolean flag = true;

           for(String word: currEventKeywords){

               if(queryKeywords.contains(word) && flag){
                   resultEvents.add(event);
                   flag = false;
               }
           }


       }

       return resultEvents;
}

    // event On same Date
    public static List<Event> getEventOndate(EventDate date){
        List<Event> resultEvents = new ArrayList<>();

        for(Event event: events){
            if(event.getDate().equal(date)){
                resultEvents.add(event);
            }
        }

        return resultEvents;
    }

    // event on same Location
    public static List<Event> getEventOnLocation(Location location){
        List<Event> resultEvents = new ArrayList<>();

        for(Event event: events){
            if(event.getLocation().equals(location)){
                resultEvents.add(event);
            }
        }

        return resultEvents;
    }

}
