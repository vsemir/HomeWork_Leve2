package Lesson2;

public class HomeWorkApp {


    public static void main(String[] args){
        String[][] array = {{"1", "2", "3", "4"}, {"java", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        int a = 0;

        try {
            try {
                int result = stringArray(array, a);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("Неверно задан размер массива. Должен быть 4х4");
            }
        }
        catch (MyArrayDataException e) {
            System.out.println("Не верное значение: \"" + array[e.i][e.j] + "\" в индексе " + "[" + e.i + "][" + e.j + "]");
        }
        stringArray(array, a);
        System.out.println("Размер массива: [" + array[0].length + "][" + array.length + "]");
        System.out.println(a);
    }



    public static int stringArray(String[][] array, int a) throws NumberFormatException, MyArrayDataException {
        if (array[0].length != 4 || array.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                try {
                    a += Integer.parseInt(array[i][j]);
                }catch (NumberFormatException e){
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return a;
    }


}
