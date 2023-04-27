package BTVN;
import java.util.Scanner;
public class bai3 {
public static void main(String[]args){
    int a, b, tmp1, tmp2, ucln, bcnn;
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap so thu nhat: ");
    a = sc.nextInt();
    System.out.println("Nhap so thu hai: ");
    b = sc.nextInt();

    tmp1 = a;
    tmp2 = b;

    while (tmp1 != tmp2){
        if (tmp1 > tmp2){
            tmp1 -= tmp2;
        }else{
            tmp2 -= tmp1;
        }
    }
    ucln = tmp1;
    System.out.println("Uoc so chung lon nhat cua " + a +" va " + b +" = " + ucln);
    System.out.println("boi so chung nho nhat của " + a + " và " + b + " = " + ((a * b) / ucln));
}


}


