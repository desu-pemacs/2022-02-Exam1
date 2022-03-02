import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;

class RobotTest {
    private static final String[] robotNames = {"Blip","Slip","Flip","Clip"};
    private static Random rand = new Random();

    @Test
    void defaultConstructor(){
        Robot robot = new Robot();
        assertEquals("C3PO:67.0",robot.toString());
    }

    @Test
    void valueConstructor(){
        String name = robotNames[rand.nextInt(robotNames.length)];
        double height = ((int)((rand.nextInt()+rand.nextDouble())*100))/100.0;
        Robot robot = new Robot(name,height);
        assertEquals(name+":"+height,robot.toString());
    }

    @Test
    void getName() {
        String name = robotNames[rand.nextInt(robotNames.length)];
        Robot robot = new Robot(name,80.5);
        assertEquals(name,robot.getName());
    }

    @Test
    void getHeightInInches() {
        String name = robotNames[rand.nextInt(robotNames.length)];
        double height = ((int)((rand.nextInt()+rand.nextDouble())*100))/100.0;
        Robot robot = new Robot(name,height);
        assertEquals(height, robot.getHeightInInches());
    }

    @Test
    void getHeightInCentiMeters() {
        String name = robotNames[rand.nextInt(robotNames.length)];
        double height = ((int)((rand.nextInt()+rand.nextDouble())*100))/100.0;
        Robot robot = new Robot(name,height);
        assertEquals(height*2.54, robot.getHeightInCentiMeters());
    }

    @Test
    void setName() {
        Robot robot = new Robot();
        String name = robotNames[rand.nextInt(robotNames.length)];
        robot.setName(name);
        assertEquals(name+":67.0",robot.toString());
    }

    @Test
    void setHeight() {
        Robot robot = new Robot();
        double height = ((int)((rand.nextInt()+rand.nextDouble())*100))/100.0;
        robot.setHeight(height);
        assertEquals("C3PO:"+height,robot.toString());
    }
}