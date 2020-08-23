package participants;

public class Human {

    private String name;
    private int maxJumpHeight;
    private int maxRunDistance;
    private boolean onDistance = true;

    public Human(String name, int maxJumpHeight, int maxRunDistance) {
        this.name = name;
        this.maxJumpHeight = maxJumpHeight;
        this.maxRunDistance = maxRunDistance;
        this.onDistance = true;
    }



    public void run(int distance) {
        if (distance <= maxRunDistance){
            System.out.printf("%s пробежал %d метров.\n",name,distance);
        }
        else {
            System.out.printf("%s не смогу пробежать %d метров.\n",name,distance);
            onDistance = false;
        }
    }
    public void jump(int height) {
        if (height <= maxJumpHeight){
            System.out.printf("%s пробежал %d метров.\n",name,height);
        }
        else {
            System.out.printf("%s не смогу пробежать %d метров.\n",name,height);
            onDistance = false;
        }
    }
}
