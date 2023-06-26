package Arrays;

public class RemoveDuplicatesInSortedArray {
    int remove_duplicate(int A[],int N){
        // code here
        int ind=1;
        for(int i=1;i<A.length;i++){
            if(A[i]!=A[i-1]){
                A[ind]=A[i];
                ind++;
            }
        }
        return ind;
    }
}
