package D20220728;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human();
        Human human2 = new Human((byte) 30, "A", "V", "Bike");
        Human human3 = new Human((byte) 30, "I", "T");
    }


public static class Human {
    byte age;
    String name;
    String secondName;
    String favoriteSport;

    public Human() {}

    public Human(byte age, String name, String secondName, String favoriteSport) {
        this.age = age;
        this.name = name;
        this.secondName = secondName;
        this.favoriteSport = favoriteSport;
    }

    public Human(byte age, String name, String secondName) {
        this.age = age;
        this.name = name;
        this.secondName = secondName;
    }
}
}