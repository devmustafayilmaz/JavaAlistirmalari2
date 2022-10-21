package JavaAlistirmalari2;

import java.util.Arrays;

public class A1_arrays {
    public static void main(String[] args) {
        int[] arr= {4,5,6,7,8,9};

        arr=yeniArr(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] yeniArr(int[]arr){

        int bosKova=arr[arr.length-1];
        for (int i = arr.length-2; i >= 0; i--) {
            arr[i+1]=arr[i];

        } arr[0]=bosKova;


        return arr;

    }
}
