import org.jointheleague.graphical.robot.Robot;

public class robotGraffiti {
public static void main(String[] args) {
	
	Robot ro = new Robot();
	ro.penDown();
	ro.setSpeed(100);
	ro.move(200);
	ro.turn(135);
	ro.move(100);
	ro.turn(-90);
	ro.move(100);
	ro.turn(135);
	ro.move(200);
	ro.turn(-90);
	ro.penUp();
	ro.move(50);
	ro.penDown();
	ro.turn(-70);
	ro.move(220);
	ro.turn(140);
	ro.move(220);
	ro.turn(180);
	ro.move(125);
	ro.turn(-70);
	ro.move(68);
	ro.turn(180);
	ro.penUp();
	ro.move(175);
	ro.penDown();
	ro.turn(-90);
	ro.move(85);
	ro.turn(180);
	ro.move(210);
	ro.turn(-90);
	for(int i = 0 ; i < 180 ; i++) {
	ro.turn(-1);
	ro.move(2);
	}
	ro.penUp();
	ro.turn(180);
	ro.move(175);
	ro.penDown();
	ro.turn(90);
	ro.move(200);
	ro.turn(-90);
	ro.penUp();
	ro.move(50);
	ro.penDown();
	ro.move(25);
	for(int i = 0 ; i < 180 ; i++) {
		ro.turn(-1);
		ro.move(1);
		}
	for(int i = 0 ; i < 180 ; i++) {
		ro.turn(1);
		ro.move(1);
		}
	ro.move(25);
	ro.penUp();
	ro.move(150);
	ro.penDown();
	for(int i = 0 ; i < 360 ; i++) {
		ro.turn(1);
		ro.move(2);
		}
	ro.penUp();
	ro.move(150);
	ro.penDown();
	ro.turn(90);
	ro.move(200);
	ro.turn(180);
	ro.move(200);
	ro.turn(135);
	ro.move(250);
	ro.turn(-135);
	ro.move(200);
}	
}
