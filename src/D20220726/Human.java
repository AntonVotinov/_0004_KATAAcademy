package D20220726;

public class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human(int age) {
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
