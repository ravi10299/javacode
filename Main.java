package com.ravi;
import java.util.*;

public class Main {

    public static void printArray(int arr[])
    {
        for(int i=0;i< arr.length;i++)   //desending  order print array  for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }

    }

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter the number of the array: ");
        for(int i=0;i< arr.length;i++)
        {
            arr[i]= sc.nextInt();
        }

      //  int arr[] = {7, 8, 3,5 1, 2};
        //bubble sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
        System.out.println("sorted is array is given : ");
         printArray(arr);
    }
}
