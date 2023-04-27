package BTVN;
import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.util.Scanner;
public class bai1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0,a;
        System.out.println("Nhap so :");
        a = sc.nextInt();
        for(int i = 1;i<=a/2;i++){
            if(a%i==0)
                sum+=i;
        }
        if(sum==a){
            System.out.println(a + "la so hoan hao");
        } else{
            System.out.println(a + "khong phai la so hoa hao");
        }

    }
}
