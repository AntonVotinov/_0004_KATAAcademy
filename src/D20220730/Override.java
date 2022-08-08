package D20220730;

public class Override {
    public static void main(String[] args) {
        Cat kitty = new Cat("Kitty1", 8);
        kitty.sayHello();

        Dog charlie = new Dog("Charlie", 5);
        D20220730.Animal animal = new D20220730.Animal(10002, "Pook");
        System.out.println(animal.id + animal.name);
        animal.id = 10001;
        animal.name = "Stark";

        charlie.sayHello();
        charlie.setName("CHARLY!");
        System.out.println(charlie.getName());
        System.out.println(charlie.getClass());
        System.out.println(kitty.getClass());
        System.out.println(animal.getClass());
        System.out.println(animal.id + animal.name);
    }

    public abstract static class Animal {
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void sayHello(){
            System.out.println("Animal Voice!");
        }
    }

    public static class Cat extends Animal {
        public Cat(String name, int age) {
            super(name, age);
        }

        public void sayHello() {
            System.out.println("Mew!");
        }
    }
    public static class Dog extends Animal {
        public Dog(String name, int age) {
            super(name, age);
        }

        @java.lang.Override
        public void sayHello() {
            System.out.println("GAV!");
        }
    }
}

