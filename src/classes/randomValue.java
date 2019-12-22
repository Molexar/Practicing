package classes;

import java.util.Arrays;

public class randomValue {
    /* На вход даются два массива: массив значений и массив весов значений.
    Задание - написать программу которая будет генерировать случайный элемент из первого массива.
    Это означает, что при абсолютно случайном выборе элементов массива число выпадений
    конкретного значения из первого массива равно соотвнтствующему весу значения.
     */
    private int[] values;
    private int[] weights;
    private int[] ranges;
    private int sum;


    public randomValue(int[] values, int[] weights){
        this.values = values;
        this.weights = weights;
        ranges = new int[values.length];


        // Сумма длин всех отрезков
        sum = 0;
        for (int weigth : weights){
            sum += weigth;
        }

    }

    public int getRandom(){
        int random = (int) Math.random()*(sum - 1);

        int index = Arrays.binarySearch(ranges, random);
        return values[index >= 0 ? index : -index-2];
    }

}
