package obstacles;

import participants.Participant;

public class Wall implements Obstacle{
    private int distance;

    public Wall(int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Participant p) {
        p.jump(distance);

    }
}
