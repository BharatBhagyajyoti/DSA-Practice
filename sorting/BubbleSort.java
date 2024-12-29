package dsa.sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr ={1,4,2,0};
        sort(arr);
    }
    static void sort(int[] arr)
    {
        int l= arr.length;
//        boolean sorted=false;
        for(int i=0;i<l-1;i++)
        {
            for(int j=0;j<l-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
//            sorted=true;
        }

        print(arr);
    }
    static void print(int[] arr)
    {
        for (int e : arr)
        {
            System.out.print(e +" ");
        }
    }
}
