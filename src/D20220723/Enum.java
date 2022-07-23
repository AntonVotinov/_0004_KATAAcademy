package D20220723;

public class Enum {
    public static void main(String[] args) {
        System.out.println(!Direction.RIGHT.toString().equals("RIGHT"));
        System.out.println(Direction.UP.toString().equals("UP"));
    }
    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }
}

