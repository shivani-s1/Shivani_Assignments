package DSA_Assignments;

import java.util.Scanner;

public class Income_tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            long slab = sc.nextLong();
            if(slab>0 && slab<180000){
                System.out.println("Need not to pay");
            } else if (slab>180001 && slab<300000) {
                System.out.println("Need to pay"+slab*0.1);
            } else if (slab>300001 && slab<500000) {
                System.out.println("Need o pay"+slab*0.2);
            }
            else if(slab>500001 && slab<1000000){
                System.out.println("Need to pay"+slab*0.3);
            }


    }
}
