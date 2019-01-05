package com.company;

public class Main {
    public static int[] A = {15,9,8,1,4,11,7,12,13,6,5,3,16,2,10,14};
    public static void main(String[] args) {
	    sort();
    }
    public static void sort(){
        for (int min = 0; min < A.length-1; min++){
            int least = min;
            for (int j = min+1; j<A.length; j++){
                if(A[j] < A[least]){
                    least = j;
                }
            }
            int tmp = A[min];
            A[min] = A[least];
            A[least] = tmp;
        }
    }
}
