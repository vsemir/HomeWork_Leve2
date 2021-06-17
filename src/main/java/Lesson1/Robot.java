package Lesson1;

public class Robot implements ActionInterface{

    private String name;
    private int makeJump;
    private int makeRun;

    public Robot(String name, int makeJump, int makeRun) {
        this.name = name;
        this.makeJump = makeJump;
        this.makeRun = makeRun;
    }
    public void info(){
        System.out.println(name);
    }

    @Override
    public boolean Run(int a) {
        if (a <= makeRun) {
            //System.out.println(name + " пробежал");
            return true;}
        else
            //System.out.println(name + " не пробежал");
        return false;
    }

    @Override
    public boolean Jump(int h) {
        if (h <= makeJump){
            //System.out.println(name + " перепрыгнул");
            return true;}
        else
            //System.out.println(name + " не перепрыгнул");
        return false;
    }
}
