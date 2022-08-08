package D20220730;

public class Test {
    public static void main(String[] args) {

    }
}

class Animal {
    int id;
    String name;

    public Animal(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @java.lang.Override
    public boolean equals(Object obj) {
        Animal otherAnimal = (Animal) obj;
        return this.id == id;
    }
}