package Lesson1;

public class Wall implements Move{

    private int high;

    public Wall(String name, int high) {
        this.high = high;
    }

    public int getHigh() {
        return high;
    }

    @Override
    public boolean move(ActionInterface player) {
        return player.Jump(high);
    }
}
