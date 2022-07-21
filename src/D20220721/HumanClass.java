package D20220721;

public class HumanClass {
    public static void main(String[] args) {
        Human human1 = new Human();
        Human human2 = new Human(30, "Anton", "Votinov", "Basketball");
        Human human3 = new Human(28, "Ilya", "Trifonov");
        System.out.println(human3.age);
        System.out.println(human2.favoriteSport);
    }

    public static class Human {
        private int age;
        private String name;
        private String secondName;
        private String favoriteSport;
        public Human() {
            System.out.println("From 1");
        }

        public Human(int age, String name, String secondName, String favoriteSport) {
            System.out.println("From 2");
            this.age = age;
            this.name = name;
            this.secondName = secondName;
            this.favoriteSport = favoriteSport;
        }

        public Human(int age, String name, String secondName) {
            System.out.println("From 3");
            this.age = age;
            this.name = name;
            this.secondName = secondName;
        }
    }
}