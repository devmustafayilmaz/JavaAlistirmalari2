package JavaAlistirmalari2;

public class A6_split {
    public static void main(String[] args) {
        String str = "java gercekten çok çok guzel";
        //verilen str'da kac tane e harfi var olduğunu bulunuz
        str.split("e");
        String[] eArray=str.split("e");
        System.out.println("Metindeki e sayisi : "+(eArray.length-1));


    }
}