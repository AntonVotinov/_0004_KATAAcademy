package D20220717;

public class CatDog {
    public static void main(String[] args) {
        Cat.sayHello();
        Dog.sayHello();
        Dog.catchCat();
    }
    public static class Cat {
        public static void sayHello() {
            System.out.println("Мяу!");
        }
    }

    public static class Dog {
        public void sayHello() {
            System.out.println("Гав!");
        }
        public static void catchCat(Cat cat) {
            System.out.println("Кошка поймана");
            this.sayHello();
            cat.sayHello();
        }
    }
}