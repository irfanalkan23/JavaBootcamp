package day01;

import java.util.Arrays;
import java.util.List;

public class CustomMethods<T> { // T: Dynamic Type =======> works with multiple different types (non-primitives

    public void print(T[] array){
        for (T each : array) {
            System.out.println(each);
        }
    }

    public void printReverse(T[] array){
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }


    /*
    public T max(T[] array){

    }

    public T min(T[] array){

    }

    public T[] reverse(T[] array){

    }
*/

    public static void main(String[] args) {
       // String[] words = {"Java", "Python", "C#", "Selenium", "API"};
        Integer[] nums = {1, 2, 3, 4, 5, 6, 7, 8};

        CustomMethods<Integer> obj = new CustomMethods<>();
       // obj.print(nums);
        obj.printReverse(nums);

        System.out.println("---------------------------------------------------------");

        int[] arr1 = {1, 2, 3, 4, 5};

        printArrayElement(arr1);

        System.out.println("------------------------------------------");


        int[] arr2 = {10, 20, 30, 40, 50};

        printArrayElement(arr2);


        System.out.println("------------------------------------------");

        int[] arr3 = {100, 200, 300, 400, 500};

        printArrayElement(arr3);

        System.out.println("------------------------------------------");

        int max = maxNumOfIntArray(arr3);




    }


    public static void printArrayElement(int[] array) {
        for (int each : array) {
            System.out.println(each);
        }
    }

    public static void printArrayElement(double[] array) {
        for (double each : array) {
            System.out.println(each);
        }
    }


    public static int maxNumOfIntArray(int[] array){
        Arrays.sort(array);
        return array[array.length-1];
    }


}
