package Arrays;

public class LargestInArray {
    public int largest(int arr[], int n)
    {
        int res=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>res){res=arr[i];}
        }
        return res;

    }
}
