public class Location {
    private String city;
    private String country;
    private String address;

    public Location(String city, String country, String address){
        this.address = address;
        this.city = city;
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    public boolean equals(Location location) {
        return this.country.equals(location.getCountry()) && this.city.equals(location.getCity()) && this.address.equals(location.getAddress()) ;
    }

    @Override
    public String toString() {
        return "{" +
                "city='" + this.city + '\'' +
                ", country='" + this.country + '\'' +
                ", address='" + this.address + '\'' +
                '}';
    }
}
