import java.util.ArrayList;
import java.util.List;

public class Event {
    static private long count;
    private String title;
    private Location location;
    private Date date;
    private Person organizer;
    protected long id;
    private String eventSources;
    private ArrayList<Image> images;


    public Event(String title, Location location, Date date, String eventSources){

          this.title = title;
          this.location = location;
          this.eventSources = eventSources;
          this.date = date;
          this.id = count + 1;
        count++;
    }

    public Event(String title, Location location, Date date, String eventSources, Person organizer){
        this.title = title;
        this.location = location;
        this.eventSources = eventSources;
        this.date = date;
        this.organizer = organizer;
        this.id = count + 1;
        count++;
    }

    public Event(String title, Location location, Date date, String eventSources, ArrayList<Image> images){
        this.title = title;
        this.location = location;
        this.eventSources = eventSources;
        this.date = date;
        this.images = images;
        this.id = count + 1;
        count++;
    }

    public Event(String title, Location location, Date date, String eventSources, Person organizer, ArrayList<Image> images){
        this.title = title;
        this.location = location;
        this.eventSources = eventSources;
        this.date = date;
        this.organizer = organizer;
        this.images = images;
        this.id = count + 1;
        count++;
    }

    public Person getOrganizers() {
            return organizer;
    }

    public Date getDate() {
        return date;
    }

    public List<Image> getImages() {
        return images;
    }

    public Location getLocation() {
        return location;
    }

    public String getEventSources() {
        return eventSources;
    }

    public String getTitle() {
        return title;
    }

    public long getId() {
        return id;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setEventSources(String eventSources) {
        this.eventSources = eventSources;
    }

    public void setImages(ArrayList<Image> images) {
        this.images = images;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setOrganizers(Person organizer) {
        this.organizer = organizer;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean happenOnsameLocation(Event event){
       return this.location.equals(event.getLocation());
    }

    public boolean happenOnsameDay(Event event){
        return this.date.equals(event.getDate());
    }

    @Override
    public String toString() {
        return "{" +
                "title='" + title + '\'' +
                ", location=" + location +
                ", date=" + date +
                ", organizer=" + organizer +
                ", id=" + id +
                ", eventSources='" + eventSources + '\'' +
                ", images=" + images +
                '}';
    }
}
