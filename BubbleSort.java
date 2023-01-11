/*
 * (C) Copyright Vitesco Technologies. All rights reserved.
 */
package algorithms;

class BubbbleSort
{
    void sort(final int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
        {
            for (int j = 0; j < n - i - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    void print(final int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; i++)
        {
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(final String args[])
    {
        BubbbleSort bs = new BubbbleSort();
        int arr[] = { 5, 3, 67, 9 };
        bs.sort(arr);
        bs.print(arr);
    }
}
