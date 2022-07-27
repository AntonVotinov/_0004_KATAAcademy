package D20220727;

public class Human {
    private String name;
    private int age;
    private String hobby;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void sayHello(){
        System.out.println("Human says HELLO! I'm " + name +", my age is " + age + " my hobby is " + hobby);
    }

    public boolean equals(Object obj){
        Human otherHuman = (Human) obj;
        boolean a = (this.name == otherHuman.name)&(this.age == otherHuman.age)&(this.hobby == otherHuman.hobby);
        return a;

    }

    public Human(String name, int age, String hobby){
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

}