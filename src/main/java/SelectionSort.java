/**
 *Date:8/4/2021
 *Author:Zoo
 *Description:ascend sort && find the minvalue
 * 选择排序：与第一个数比较，比第一个数小的话，就交换位置，所以才会有minpos的概念
*/
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 6, 8, 1, 7, 9, 4, 2};
//        getMinPos(arr);
//        printOriArr(arr);
        printSortArr(arr);
    }
    public static void getMinPos(int[] arr){
        int minPos=0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[minPos] > arr[j]) {
                minPos=j;
            }
        }
        System.out.println("minPos is: "+minPos);
    }
    //打印排序前的数据
    public static void printOriArr(int[] arr)
    {
        System.out.print("origin arr is: ");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    //打印排序后的数据，ascend排序
    public static void printSortArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
                int minPos=i;
            for (int j = i + 1; j < arr.length-1; j++) {
                //将小的元素放在前面
                //你想交换元素的位置，必须先得拿出来，不然就是直接覆盖
                if ( arr[j]<arr[minPos] ) {
                     minPos =j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[minPos];
            arr[minPos] = temp;
        }
        System.out.print("ascend arr is: ");
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}