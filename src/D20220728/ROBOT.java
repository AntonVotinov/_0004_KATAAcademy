package D20220728;

public class ROBOT {
}
/*
    public static void moveRobot(Robot robot, int toX, int toY) {

// robot.stepForward(); - работает
// robot.getX(); - работает
// robot.getDirection().toString().equals("RIGHT") - работает

//X axis moves start
        if ((toX - robot.getX()) != 0) {
            //rotate start
            if ((toX - robot.getX()) > 0) {
                while (!robot.getDirection().toString().equals("RIGHT")) {
                    robot.turnRight();
                }
            } else {
                while (!robot.getDirection().toString().equals("LEFT")) {
                    robot.turnRight();
                }
            }
            //rotate finish
            //movemant by X start
            int moveX = Math.abs(toX - robot.getX());
            for (int iX = 0; iX < moveX; iX++) {
                robot.stepForward();
            }
            //movemant by X finish
        }
//X axis moves finish
//Y axis moves start
        if ((toY - robot.getY()) != 0) {
            //rotate start
            if ((toY - robot.getY()) > 0) {
                while (!robot.getDirection().toString().equals("UP")) {
                    robot.turnRight();
                }
            } else {
                while (!robot.getDirection().toString().equals("DOWN")) {
                    robot.turnRight();
                }
            }
            //rotate finish
            //movemant by Y start
            int moveY = Math.abs(toY - robot.getY());
            for (int iY = 0; iY < moveY; iY++) {
                robot.stepForward();
            }
            //movemant by Y finish
        }
//Y axis moves finish
    }*/
