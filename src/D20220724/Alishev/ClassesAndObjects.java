package D20220724.Alishev;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person per1 = new Person();

        per1.setName("Anto");
        per1.setAge(30);

        Person per2 = new Person();

        per2.setName("Ilya");
        per2.setAge(28);

        per1.speak();
        System.out.println();
        per2.speak();

        per1.sayHello();

        System.out.println("Years to retirement for " + per1.name + " is " + per1.calculateYearsToRetirement());
        System.out.println(per2.calculateYearsToRetirement());

        per1.setNameAndAge("ANTONIO", 31);
        per1.speak();
    }
}

class Person{
    String name;
    int age;

    void speak() {
        System.out.println("My name is " + name + " I'm " + age + " years old");
    }
    void sayHello() {
        System.out.println(name + " says \" Hi! from \"");
    }
    int calculateYearsToRetirement(){
        int years = 65 - age;
        return years;
    }

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    void setNameAndAge(String name, int age) {
        this.name = name;
        this.age = age;
    }
}