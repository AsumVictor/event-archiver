public class Person {
    private String name;
    private String occupation;
    private String bio;

    public  Person(String name, String occupation, String bio){
         this.bio = bio;
         this.name = name;
         this.occupation = occupation;
    }

    public String getName() {
        return name;
    }

    public String getBio() {
        return bio;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
