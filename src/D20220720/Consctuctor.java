package D20220720;

public class Consctuctor {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setName("Anton");
        human1.setAge(30);

        System.out.println(human1.getAge());
    }
}

class Human {

    public Human(){
        System.out.println("New");
    }
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

}
