package Lesson1;

public class Track implements Move{

    private int dist;

    public Track(String name, int dist) {
        this.dist = dist;
    }

    public int getDist() {
        return dist;
    }

    @Override
    public boolean move(ActionInterface player) {
        return player.Run(dist);
    }
}
