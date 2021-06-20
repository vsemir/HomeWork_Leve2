package Lesson2;

public class MyArraySizeException extends RuntimeException{



    public MyArraySizeException(int length) {
        super("Длина массива ровна " + length + ". А должна быть не более 4");
    }


    public MyArraySizeException(String massage) {
        super(massage);
    }

    public MyArraySizeException() {

    }
}
