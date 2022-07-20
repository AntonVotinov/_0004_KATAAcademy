package D20220720;

public class ClassesHuman3312 {

    public static void main(String[] args) {
        Human human1 = new Human(30, Anton, Votinov, Basketball);
        Human human2 = new Human(28, Ilya, Trifonov, Workout);
        Human human3 = new Human(29, Dima, Konishchev, Excel);
    }

    public static class Human(int age, String name, String secondName, String favoriteSport) {
  this.age = age;
  this.name = name;
  this.secondName = secondName;
  this.favoriteSport = favoriteSport;
    }
}
