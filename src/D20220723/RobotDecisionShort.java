/*
public static void moveRobot(Robot robot, int toX, int toY) {
if ((toX - robot.getX()) != 0) {
    if ((toX - robot.getX()) > 0) {
        while (!robot.getDirection().toString().equals("RIGHT")) {
            robot.turnRight();
        }
    } else {
        while (!robot.getDirection().toString().equals("LEFT")) {
            robot.turnRight();
        }
    }
    int moveX = Math.abs(toX - robot.getX());
    for (int iX = 0; iX < moveX; iX++) {
        robot.stepForward();
    }
}

if ((toY - robot.getY()) != 0) {
    if ((toY - robot.getY()) > 0) {
        while (!robot.getDirection().toString().equals("UP")) {
            robot.turnRight();
        }
    } else {
        while (!robot.getDirection().toString().equals("DOWN")) {
            robot.turnRight();
        }
    }
    int moveY = Math.abs(toY - robot.getY());
    for (int iY = 0; iY < moveY; iY++) {
        robot.stepForward();
    }
}
}*/
