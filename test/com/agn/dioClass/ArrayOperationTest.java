package com.agn.dioClass;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
/* К домашнему заданию по работе с массивами написать тесты с покрытием вариантов поведения
Дополнительные сценарии поведения:
- пустой первый массив
- пустой второй массив
- первый массив - null
- второй массив - null
- большой второй массив (size IInteger.MAX_VALUE)
- большой первый массив (size IInteger.MAX_VALUE)
- тест с дубликатами
 */

public class ArrayOperationTest {
    private ArrayOperation testClass;

    @Before
    public void setup() {
        testClass = new ArrayOperation();
    }
    @After
     //
    @Test  //- пустой первый массив
    public void testLeftUnion_LeftArrayIsEmpty() throws Exception {
        int[] leftArray = new int[0]; // {1, 5, 4, 23, 65, 32, 78};
        int[] rightArray = new int[]{3, 5, 24, 4, 1, 2, 34, 45, 32, 5};
        int[] expected = new int[rightArray.length];
        //invoke
        int[] returnedValue = testClass.leftUnion(leftArray, rightArray);
        //assert return
        assertArrayEquals(expected, returnedValue);
    }

    @Test    // - пустой второй массив
    public void testLeftUnion_RightArrayIsEmpty() throws Exception{
        int[] leftArray = new int[] {1, 5, 4, 23, 65, 32, 78};
        int[] rightArray = new int[0]; //{3, 5, 24, 4, 1, 2, 34, 45, 32, 5};
        //invoke
        int[] returnedValue = testClass.leftUnion(leftArray, rightArray);
        //assert return
        assertArrayEquals(leftArray, returnedValue); // return the same array as leftArray
    }

    @Test  // - первый массив - null
    public void testLeftUnion_LeftArrayIsNull() throws Exception {
        int[] leftArray = null;
        int[] rightArray = new int[]{3, 5, 24, 4, 1, 2, 34, 45, 32, 5};

        int[] returnedValue = testClass.leftUnion(leftArray, rightArray);

        assertNull(returnedValue);
    }

    @Test //    - второй массив - null
    public void testLeftUnion_RightArrayIsNull() throws Exception {
        int[] leftArray = new int[]{1, 5, 4, 23, 65, 32, 78};
        int[] rightArray = null;

        int[] returnedValue = testClass.leftUnion(leftArray, rightArray);

        assertNull(returnedValue);
    }

    @Test  // - большой первый массив (size IInteger.MAX_VALUE)
    public void testLeftUnion_LeftArraySizeTooBig() throws Exception {
        int[] leftArray = new int[Integer.MAX_VALUE];
        int[] rightArray = new int[]{3, 5, 24, 4, 1, 2, 34, 45, 32, 5};
        // how to handle OutOfMemory error in tests?
        testClass.leftUnion(leftArray, rightArray);
    }

    @Test  // - большой второй массив (size IInteger.MAX_VALUE)
    public void testLeftUnion_RightArraySizeTooBig() throws Exception {
        // todo: handle OutOfMemory error
    }

    @Test //- тест с дубликатами
    public void testDistinctUnion_LeftArrayIsEmpty() {
        int[] leftArray = new int[0]; // {1, 5, 4, 23, 65, 32, 78};
        int[] rightArray = new int[]{3, 5, 24, 4, 1, 2, 34, 45, 32, 5};

        int[] returnedValue = testClass.distinctUnion(leftArray, rightArray);
        assertArrayEquals(rightArray, returnedValue);
    }

    @Test
    public void testDistinctUnion_ArraysAreEqual() {
        int[] leftArray = new int[]{1, 1, 1, 1, 1, 1, 1};
        int[] rightArray = new int[]{1, 1, 1, 1, 1, 1, 1};

        int[] returnedValue = testClass.distinctUnion(leftArray, rightArray);
        assertArrayEquals(leftArray, returnedValue);
    }

    @Test
    public void testOuterUnion_ArraysAreEqual() {
        int[] leftArray = new int[]{1, 1, 1, 1, 1, 1, 1};
        int[] rightArray = new int[]{1, 1, 1, 1, 1, 1, 1};
        int[] expectedValue = new int[0];
        int[] returnedValue = testClass.outerUnion(leftArray, rightArray);
        assertArrayEquals(expectedValue, returnedValue);
    }
}
