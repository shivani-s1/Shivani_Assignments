package DSA_Assignments;

public class Armstrong_UnderRange {
    public static void main(String[] args) {
        int temp,d1,d2,d3,result;
        for(int num=100;num<999;num++){
            temp=num;
            d1=temp%10;
            temp=temp/10;

            d2=temp%10;
            temp=temp/10;

            d3=temp%10;
            temp=temp/10;

            result=(d1*d2*d3) + (d1*d2*d3) + (d1+d2+d3);

            if(num==result){
                System.out.println(result);
            }

        }
    }
}
