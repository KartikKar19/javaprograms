package constructors;

public class App {
    public static void main(String[] args) {
        String name = "Kartik";
        int rating = 5;
        Faculty obj = new Faculty();
        Faculty obj1 = new Faculty(name);
        Faculty obj2 = new Faculty(rating);
        Faculty obj3 = new Faculty(name, rating);
        Faculty obj4 = new Faculty(rating, name);
        System.out.println(obj.name + ":" + obj.rating);
        System.out.println(obj1.name + ":" + obj1.rating);
        System.out.println(obj2.name + ":" + obj2.rating);
        System.out.println(obj3.name + ":" + obj3.rating);
        System.out.println(obj4.name + ":" + obj4.rating);
        System.out.println(obj4.toString());
    }
}
