public class Date {
    private int day;
    private long year;
    private String month;

    public Date(int day, long year, String month){
        this.day = day;
        this.year = year;
        this.month = month;
    }

    public int getDay() {
            return day;
    }

    public long getYear() {
        return year;
    }

    public String getMonth() {
        return month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setYear(long year) {
        this.year = year;
    }

    public boolean equal(Date date){
        return this.month.equals(date.getMonth()) && this.day == date.getDay() && this.year == date.getYear();
    }

    @Override
    public String toString() {
        return this.day + "/" + this.month + "/" + this.year;
    }

}
