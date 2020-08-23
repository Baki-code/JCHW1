import com.sun.org.apache.xml.internal.utils.ObjectStack;
import obstacles.Treadmill;
import obstacles.Wall;
import participants.Cat;
import participants.Human;
import participants.Participant;
import participants.Robot;
import obstacles.Obstacle;

public class Main {
    public static void main(String[] args) {

        Participant[] participants = {
                new Human("Федор", 500, 800),
                new Cat("Мурзик", 400, 900),
                new Robot("R2D2", 200, 500)
        };

        Obstacle [] obstacles = {
                new Treadmill(900),
                new Wall(400),
        };

        for (Participant p : participants) {
            for (Obstacle o : obstacles) {
                o.doIt(p);
                if (!p.isOnDistance());
            }

        }


    }
}
