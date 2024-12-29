package dsa.sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int []arr={4,5,3,7,0};
        sort(arr);

    }
    static void sort(int []arr)
    {
        int l= arr.length;
        for (int i=0;i<l-1;i++)
        {
            int smallest=i;
            for (int j=i+1;j<l;j++)
            {
                if (arr[j]<arr[smallest])
                {
                    smallest=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[smallest];
            arr[smallest]=temp;

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
