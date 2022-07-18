package D20220717;

public class CatDog {
    public void main(String[] args) {
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
        public static void sayHello() {
            System.out.println("Гав!");
        }
        public static void catchCat() {
            System.out.println("Кошка поймана");
            Dog.sayHello();
            Cat.sayHello();
        }
    }
}