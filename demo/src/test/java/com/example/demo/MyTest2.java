package com.example.demo;

import java.util.Arrays;

public class MyTest2 {

    static  int  arr[]={5,3,7};

    public static void main(String args[])
    {
        // Print array before merge sort
        System.out.println("Array before sorting:");
        printArray(arr,0,arr.length-1);
        System.out.println("-----------------------------");

        mergeSort(0,arr.length-1);

        System.out.println("-----------------------------");

        // Print array after sorting
        System.out.println("Array After sorting:");
        printArray(arr,0,arr.length-1);

    }

    // Recursive algorithm for merge sort
    public static void mergeSort(int start,int end)
    {
        int mid=(start+end)/2;
        if(start<end)
        {
            // Sort left half
            mergeSort(start,mid);
            // Sort right half
            mergeSort(mid+1,end);
            // Merge left and right half
            merge(start,mid,end);
        }

    }

    private static void merge(int start, int mid, int end) {
        // Initializing temp array and index
        int[] tempArray=new int[arr.length];
        int tempArrayIndex=start;

        System.out.print("Before Merging:  ");
        printArray(arr,start,end);

        int startIndex=start;
        int midIndex=mid+1;

        // It will iterate until smaller list reaches to the end
        while(startIndex<=mid && midIndex<=end)
        {
            if(arr[startIndex]< arr[midIndex])
            {
                System.out.println(startIndex+"KKKKKKKKKKKKKKK"+mid);
                tempArray[tempArrayIndex++]=arr[startIndex++];
            }
            else
            {
                System.out.println(midIndex+"HHHHHHHHHHHHHHHH"+end);
                tempArray[tempArrayIndex++]=arr[midIndex++];
            }
        }

        // Copy remaining elements
        while(startIndex<=mid)
        {
            System.out.println(startIndex+"KKKKKKKKKKKKKKK"+mid);
            tempArray[tempArrayIndex++]=arr[startIndex++];
        }
        while(midIndex<=end)
        {
            System.out.println(midIndex+"HHHHHHHHHHHHHHHH"+end);
            tempArray[tempArrayIndex++]=arr[midIndex++];
        }

        // Copy tempArray to actual array after sorting
        for (int i = start; i <=end; i++) {
            arr[i]=tempArray[i];
        }

        System.out.print("After merging:   ");
        printArray(tempArray,start,end);
        System.out.println();
    }

    public static void printArray(int arr[],int start,int end)
    {
        for (int i = start; i <=end; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
