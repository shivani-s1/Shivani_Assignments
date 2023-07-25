package DSA_Assignments;

public class SearchArrayElement {
    public static void main(String[] args) {
        int[] n = new int[]{5,12,14,6,78,19,1,23,26,35,27,7,52,86,47};

        int targetnum = 19;
        boolean isPresent = Search(n,targetnum);

        if(isPresent){
            System.out.println("Given number is present in the array");
        }
        else System.out.println("Number not present in the array");

//        boolean present = false;
//        for(int i=0;i<n.length;i++){
//            if(n[i]==19){
//                //System.out.println("Given number is present in the array");
//                present=true;
//            }
//            else if(n[i]!=19)//System.out.println("Number not present in the array");
//                present=false;
//        }
//        if(present)
//            System.out.println("Given number is present in the array");
//        else if(!present)
//            System.out.println("Number not present in the array");

    }

    public static boolean Search(int num[],int target) {
        for(int n:num){
            if(n==target){
                return true;
            }

        }
        return false;
    }
}
