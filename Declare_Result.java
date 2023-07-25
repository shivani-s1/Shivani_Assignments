package DSA_Assignments;

import java.util.Scanner;

public class Declare_Result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sub1=sc.nextInt();
        int sub2=sc.nextInt();
        int sub3=sc.nextInt();

        if(sub1>=60 && sub2>=60 && sub3>=60){
            System.out.println("Result:Passed");
        } else if ((sub1>60 && sub2 >60) || (sub1>60 && sub3>60) ||(sub2>60 && sub3>60)) {
            System.out.println("Result:promoted");
        }else {
            System.out.println("Result:Failed");
        }

    }}

