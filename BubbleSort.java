package DSA_Assignments;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[]{5,12,14,6,78,19,1,23,26,35,27,7,52,86,47};

        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
