package D20220811;

public class TryWithResources {
    static class Car implements AutoCloseable {
        public void drive() {
            System.out.println("Машина поехала.");
        }

        @Override
        public void close() {
            System.out.println("Машина закрывается...");
        }
    }

    public static void main(String[] args) {
        try (Car car = new Car()) {
            car.drive();
        } catch (Exception e) {
        }
    }
}