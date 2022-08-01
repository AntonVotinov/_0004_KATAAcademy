package D20220727;

public class Equals {
    public static void main(String[] args) {
        Human human1 = new Human("A", 31, "Streetball");
        Human human2 = new Human("A", 31, "Streetball");
        System.out.println(human1.getHobby());

        System.out.println(human1.equals(human2));
    }

}
