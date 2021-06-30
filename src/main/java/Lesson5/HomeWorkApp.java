package Lesson5;

import java.util.Arrays;

public class HomeWorkApp {

    static final int SIZE = 10000000;
    static final int HALF = SIZE / 2;


    public static void main(String[] args) {
        doCalculationOne(createArr());
        doCalculationTwo(createArr());

    }

    public static float[] createArr(){
        float[] arr = new float[SIZE];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }
        return arr;
    }

    private static void doCalculationOne(float[] arr){
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("Время выполнения 1-го массива: " + (System.currentTimeMillis() - a) + " ms.");
    }

    private static void doCalculationTwo(float[] arr){
        long b = System.currentTimeMillis();

        float[] arrOne = new float[HALF];
        float[] arrTwo = new float[HALF];
        System.arraycopy(arr, 0, arrOne, 0, HALF);
        System.arraycopy(arr, HALF, arrTwo, 0, HALF);
        Thread calcOne = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < arrOne.length; i++) {
                    arrOne[i] = (float)(arrOne[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });
        calcOne.start();

        Thread calcTwo = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < arrTwo.length; i++) {
                    arrTwo[i] = (float) (arrTwo[i] * Math.sin(0.2f + (i+HALF) / 5) * Math.cos(0.2f + (i+HALF) / 5) * Math.cos(0.4f + (i+HALF) / 2));
                }
            }

        });
        calcTwo.start();

        try {
            calcOne.join();
            calcTwo.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Время выполнения 2-го массива: " + (System.currentTimeMillis() - b) + " ms.");
    }

}
