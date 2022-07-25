package D20220724.Alishev;

public class Human {
    public static void main(String[] args) {
        Humankind hum1 = new Humankind();
        hum1.setName("Anton");
        hum1.setAge(30);
        hum1.getInfo();
        Humankind hum2 = new Humankind();
        hum2.setName("Dimas");
        hum2.setAge(29);
        hum2.getInfo();
    }
}
class Humankind {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void getInfo() {
        System.out.println(name + ", " + age);
    }
}
