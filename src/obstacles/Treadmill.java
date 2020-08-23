package obstacles;

import participants.Participant;

public class Treadmill implements Obstacle{
    private  int distance;

    public Treadmill(int distance){
        this.distance = distance;
    }

    @Override
    public void doIt(Participant p) {
        p.run(distance);

    }
}
