public class Image {
    private String sources;
    private String type;

    public Image(String sources, String type){
        this.sources = sources;
        this.type = type;
    }

    public String getSources() {
        return sources;
    }

    public String getType() {
        return type;
    }

    public void setSources(String sources) {
        this.sources = sources;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "{" +
                "sources='" + sources + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
