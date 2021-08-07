public class BubbleSort {
    public static void main(String[] args) {
        int[] a={9,3,1,4,6,8,7,5,2};
//        sort1(a);
        sort2(a);
        for (int i : a) {
            System.out.print(i+" ");
        }
    }
    //ascend
    static void sort1(int[] a) {
        for (int i =a.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j+1]) {
                    swap(a,j,j+1);
                }
            }

        }
    }
    static void swap(int[] a,int i,int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    //将最大的数移动到最后面
    static void findMax(int[] a,int n) {
        for (int i = 0; i < n; i++) {
            if (a[i] > a[i + 1]) {
                swap(a,i,i+1);
            }
        }
    }
    static void sort2(int[] a) {
        for (int i=a.length-1;i>0;i--){
            findMax(a, 8);
        }

    }
}
