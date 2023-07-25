package DSA_Assignments;

public class Simple_CompoundInterest {
    public static void main(String[] args) {
        int p=2000,t=4*12;
        double r=0.5;

        double SI = (p*t*r)/100;
        System.out.println("simple interest: "+SI);
        double CI = p*Math.pow(1.0+r/100.0,t) - p;
        System.out.println("Compound interest :"+CI);
    }
}
