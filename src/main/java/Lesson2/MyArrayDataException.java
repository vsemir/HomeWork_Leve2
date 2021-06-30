package Lesson2;

public class MyArrayDataException extends RuntimeException{

    public int i;
    public int j;

    MyArrayDataException(int i, int j) {
        this.i = i;
        this.j = j;

    }
    public MyArrayDataException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyArrayDataException(String message) {
        super(message);
    }

}
