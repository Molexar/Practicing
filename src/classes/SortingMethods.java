package classes;

public class SortingMethods<T> {


    public int binarySearch(double[] array, double element){
        int left = 0;
        int right = array.length-1;
        int mid = (left + right)/2;
        while ((array[mid] != element)&&(left != right)){
            if (array[mid] == element){
                return mid;
            }
            else if(array[mid] > element){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return (-1);
    }

    public int BrutForce(double[] array, double element){
        for (int i=0;i<array.length;i++){
            if (array[i] == element){
                return i;
            }
        }
        return (-1);
    }

   //Вспомогательный метод для вызова рекурсивного поиска по массиву.
    public int binarySearchRecursively(double[] array, double element){
        return binarySearchRecursively(array, 0, array.length, element);
    }


    private int binarySearchRecursively(double[] array, int left, int right, double element){
        int mid = (left + right)/2;
        if (right <= left){
            return -1;
        }
        if (array[mid] == element){
            return mid;
        }
        else if (array[mid] < element){
            return binarySearchRecursively(
                    array, (mid + 1), right, element
            );
        }
        else{
            return binarySearchRecursively(
                    array, left, (mid-1), element
            );
        }
    }


    private double[] getRandomArray(int length){
        double[] array = new double[length];
        for (int i=0;i<length;i++){
            array[i] = Math.random();
        }
        return array;
    }
}
