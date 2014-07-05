package com.agn.dioClass;

import static com.agn.dioClass.EnumOperationType.*;

//local code review (vtegza): try to keep code clean from redunt comments @ 30.06.14
public class Main {
    public static void main(String[] arg0) {

        classWork1();   // perform LeftUnion
        classWork2();   // perform DistinctUnion, InnerUnion, OuterUnion

    }

    private static void classWork1(){
        /* Class Work #1. [24-06-2014].
        Operations with arrays in Java. Create two arrays int[] with known values.
        Perform LeftUnion operation.
        Trim the result array for non used (empty) but reserved items.
        Print the result array.
        */
        ArrayOperation arrOper = new ArrayOperation();
        ArrayGenerator arrGen = new ArrayGenerator();

        int[] leftArr = arrGen.initLeftArray();      // defined {1,5,4,23,65,32,78}
        int[] rightArr = arrGen.initRightArray();    // defined {3,5,24,4,1,2,34,45,32,5}
        int[] resArr = arrOper.leftUnion(leftArr, rightArr); // expected result {1,5,4,23,65,32,78,5,4,1,32,5}

        resArr = arrOper.rightTrimArr(resArr);
        System.out.print("The result of Left union is: "); System.out.print('\n');
        arrOper.printOutInCol(resArr);
    }

    private static void classWork2() {
        /* Class Work #2. [26-06-2014].
        Operations with arrays in Java. Create two arrays int[] with known values.
        Perform DistinctUnion, InnerUnion, OuterUnion operations.
        Print the result array.
        */
        ArrayOperation arrOper = new ArrayOperation();
        ArrayGenerator arrGen = new ArrayGenerator();

        //---------------- Distinct union
        int[] leftArr = arrGen.initLeftArray(DISTINCT_UNION);    // defined [1,5,4,23,65,32,78]
        int[] rightArr = arrGen.initRightArray(DISTINCT_UNION);  // defined  [3,5,24,54,1,2,34,45,32]
        int[] resArr = arrOper.distinctUnion(leftArr, rightArr);  //expected result [1,5,4,23,65,32,78,3,24,54,2,34,45]

        System.out.print("The result of Distinct union is: ");
        arrOper.printOutInRow(resArr); System.out.print('\n');

        //---------------- Inner union
        leftArr = arrGen.initLeftArray(INNER_UNION);    // defined [1,5,4,23,65,32,78]
        rightArr = arrGen.initRightArray(INNER_UNION);  // defined  [3,5,24,4,1,2,34,45,32,5]
        resArr = arrOper.innerUnion(leftArr, rightArr);   //expected result  [5,4,32,1] OR [5, 4, 1, 32, 5] OR [1, 5, 4, 32] ??

        System.out.print("The result of Inner union is: ");
        arrOper.printOutInRow(resArr); System.out.print('\n');

        //---------------- Outer union
        leftArr = arrGen.initLeftArray(OUTER_UNION);    // defined [1,5,4,23,65,32,78]
        rightArr = arrGen.initRightArray(OUTER_UNION);  // defined  [3,5,24,4,1,2,34,45,32,5]
        resArr = arrOper.outerUnion(leftArr, rightArr);   //expected result  [23,65,78,3,24,2,34,45]

        System.out.print("The result of Outer union is: ");
        arrOper.printOutInRow(resArr); System.out.print('\n');
    }
}
