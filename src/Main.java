import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int nearMin;
        int nearMax;
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz :");
        int number = sc.nextInt();
        int[] list = {15,12,788,1,-1,-778,2,0, number};
        System.out.println(Arrays.toString(list));

        Arrays.sort(list);
        int index = Arrays.binarySearch(list, number);
        nearMin = list[index-1];
        nearMax = list[index+1];

        System.out.println("Girilen sayıdan küçük sayı : " + nearMin);
        System.out.println("Girilen sayıdan büyük sayı  " + nearMax);
    }
}
