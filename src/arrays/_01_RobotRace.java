package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {

		// 2. create an array of 5 robots.
		Robot[] garhy = new Robot[77];
	
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < garhy.length; i++) {
			garhy[i] = new Robot();
			garhy[i].setX(15 + 25 * i);
			garhy[i].setY(950 );
			garhy[i].miniaturize();
			garhy[i].setWindowSize(1920, 1080);
			garhy[i].penDown();
			garhy[i].setRandomPenColor();
		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up

		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		boolean rip = true;
int smallesty = 1000 ;
int fr = -1 ;		
		
		
		
		
		
		
		
		while (rip) {
			for (int i = 0; i < garhy.length; i++) {
				int y = garhy[i].getY();
				garhy[i].setSpeed(10);
				if (y <= 30) {
					rip = false;
					
					JOptionPane.showMessageDialog(null, "ROBOT " + i +" WON!!  THROW A PARTY!! or if u weren't supporting them be salty... but that your choice. PARTY TIMEEEE");
					
					break;
					
					
				}
				if (y<smallesty) {
					smallesty = y ;
					if (fr != -1) {
						garhy[fr].miniaturize();
					}
					
					fr = i ;
				}
				Random hoi = new Random();
				int hi = hoi.nextInt(51);
				garhy[i].move(hi);
			}
			// 6. use a while loop to repeat step 5 until a robot has reached the top of the
			// screen.

			// 7. declare that robot the winner and throw it a party!

			// 8. try different races with different amounts of robots.

			// 9. make the robots race around a circular track.
			if (fr != -1) {
				garhy[fr].
			}
		}
	}
}