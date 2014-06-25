package com.agn.dioClass;

public class Main {
    public static void main(String[] arg0) {

        classWork1();

    }
    private static void classWork1(){
        /* Class Work #1. [24-06-2014].
        Operations with arrays in Java. Create two arrays int[] with known values.
        Perform LeftUnion operation.
        Trim the result array for non used (empty) but reserved items.
        Print the result array.
        */
        ArrayOperation arrOper = new ArrayOperation();
        int[] leftArr = arrOper.initLeftArray();      // defined {1,5,4,23,65,32,78}
        int[] rightArr = arrOper.initRightArray();    // defined {3,5,24,4,1,2,34,45,32,5}
        int[] resArr = arrOper.leftUnion(leftArr, rightArr); // expected result {1,5,4,23,65,32,78,5,4,1,32,5}

        // Trim Array - remove all "zero" values in reverse direction (from end to start)
        resArr = arrOper.rightTrimArr(resArr);
        // Print out result
        if (resArr != null) {
            int k = 0;
            for (int i : resArr) {
                System.out.println("Index [" + k + "]: " + i);
                ++k;
            }
        }

    }
}
