package JavaAlistirmalari2;

import ders18_Arrays.C04_Arrays;
import ders18_Arrays.C05_Arrays;
import ders18_Arrays.C06_Arrays;

import java.util.Arrays;

public class A3_methodlariKullanma {
    public static void main(String[] args) {
        // verilen bir int arrayin en buyuk ve enkucuk sayisini veren methodu çağırın.
        int[] abc={5,3,90,87};

        A2_Arrays.enBuyukEnKucukElemntYazdir(abc);
        C05_Arrays.elemanAra(abc,91);
        System.out.println(C04_Arrays.sayilarinToplami(abc));
        int[] yeniArray = C06_Arrays.arrayOlustur();
        System.out.println("yeni array :"+ Arrays.toString(yeniArray));

    }
}
