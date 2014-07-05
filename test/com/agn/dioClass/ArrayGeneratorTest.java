package com.agn.dioClass;

import static com.agn.dioClass.EnumOperationType.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ArrayGeneratorTest {
    private ArrayGenerator testClass;

    @Before
    public void setup() {
        testClass = new ArrayGenerator();
    }

    @Test
    public void testInitLeftArray_NoInputType(){
        int[] expectedArr = new int[]{1, 5, 4, 23, 65, 32, 78};
        int[] returnedArr = testClass.initLeftArray();
        assertArrayEquals(expectedArr, returnedArr);
    }

    @Test
    public void testInitRightArray_NoInputType(){
        int[] expectedArr = new int[]{3, 5, 24, 4, 1, 2, 34, 45, 32, 5};
        int[] returnedArr = testClass.initRightArray();
        assertArrayEquals(expectedArr, returnedArr);
    }

    @Test
    public void testInitLeftArray_InnerType(){
        int[] expectedArr = new int[]{1, 5, 4, 23, 65, 32, 78};
        int[] returnedArr = testClass.initLeftArray(INNER_UNION);
        assertArrayEquals(expectedArr, returnedArr);
    }

    @Test
    public void testInitRightArray_InnerType() {
        int[] expectedArr = new int[]{3, 5, 24, 4, 1, 2, 34, 45, 32, 5};
        int[] returnedArr = testClass.initRightArray(INNER_UNION);
        assertArrayEquals(expectedArr, returnedArr);
    }

}
