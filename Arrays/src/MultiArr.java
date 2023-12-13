import java.util.Arrays;
import java.util.Scanner;

public class MultiArr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        Array list
//        ArrayList<Integer> myArrList = new ArrayList<>(5);
//
//        for (int i = 0; i < 3; i++) {
//            myArrList.add(in.nextInt());
//        }
//
//        for (int i = 0; i < 3; i++) {
//            System.out.print(myArrList.get(i) + " ");
//        }
//        System.out.println();
//        System.out.println(myArrList);

//        multi arraylist
//        ArrayList<ArrayList<Integer>> Hmmm = new ArrayList<>(5);
//
////      Initialisation
//        for (int i = 0; i < 3; i++) {
//            Hmmm.add(new ArrayList<>());
//        }
//
////        Add elements
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                Hmmm.get(i).add(in.nextInt());
//            }
//        }
//
//        System.out.println(Hmmm);

        int[] myCuhArr = {1, 2, 33, 4, 5};
        System.out.println(Arrays.toString(myCuhArr));

        reverse(myCuhArr);
        System.out.println(Arrays.toString(myCuhArr));

//        swap(myCuhArr, 0, 2);
//        System.out.println(Arrays.toString(myCuhArr));

//        System.out.println(max(myCuhArr));


    }

    static void reverse(int[] any) {
        int start = 0;
        int end = any.length - 1;

        while (start < end) {
            swap(any, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] ahj, int index1, int index2) {
        int temp = ahj[index1];
        ahj[index1] = ahj[index2];
        ahj[index2] = temp;
    }

//    static int max(int[] anyArr) {
//        int startingValue = anyArr[0];
//        for (int i = 0; i < anyArr.length; i++) {
//            if (startingValue < anyArr[i]) {
//                startingValue = anyArr[i];
//            }
//        }
//
////        enhanced for syntax
////        for (int j : anyArr) {
////            if (startingValue < j) {
////                startingValue = j;
////            }
////        }
//        return startingValue;
//    }

}
