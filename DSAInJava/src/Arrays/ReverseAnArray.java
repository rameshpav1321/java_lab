package Arrays;

public class ReverseAnArray {
    static void reverse(int arr[], int n)
    {
        int temp;
        for(int i=0;i<n/2;i++){
            temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
    }

    public static void main(String args[])
    {
        int arr[] = {10, 5, 7, 30,2}, n = 5;

        System.out.println("Before Reverse");

        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        reverse(arr, n);

        System.out.println("After Reverse");

        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
