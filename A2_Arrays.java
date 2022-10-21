package JavaAlistirmalari2;

import java.util.Arrays;

public class A2_Arrays {
    public static void main(String[] args) {
        //verilen bir arrayde en küçük ve en büyük sayilari yazdiren bir method oluşturun.

        int[] arr={3,5,9,1,13,78,100};

            enBuyukEnKucukElemntYazdir(arr);


    }
    public static void enBuyukEnKucukElemntYazdir(int[]arr){

        Arrays.sort(arr);
        System.out.println("en buyuk sayi : " +arr[arr.length-1]);
        System.out.println("en kucuk sayi : " +arr[0]);


    }
}
