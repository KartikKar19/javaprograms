package constructors;

public class Faculty {
    String name;
    int rating;

    public Faculty() {
        this.name = "hehe";
        this.rating = 10;
    }

    public Faculty(String name) {
        this();
        this.name = name;
    }

    public Faculty(int rating) {
        this();
        this.rating = rating;
    }

    public Faculty(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public Faculty(int rating, String name) {
        this.rating = rating;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Faculty: name = " + name + " and rating = " + rating;
    }
}