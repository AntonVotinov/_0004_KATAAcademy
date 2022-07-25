package D20220724.Alishev;

public class Incapsulation {
    public static void main(String[] args) {
        PersonInc per1 = new PersonInc();
        per1.setName("");
        per1.setAge(-30);
        per1.speak();

        System.out.println(per1.getAge());
        System.out.println(per1.getName());

    }
}

class PersonInc{
    private String name;
    private int age;

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Empty name");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Negative age!");
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

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

    void setNameAndAge(String name, int age) {
        this.name = name;
        this.age = age;
    }
}