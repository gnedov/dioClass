package com.agn.dioClass;

public interface IArrayUnion {
    //local code review (vtegza): in interface all methods are public by default @ 30.06.14
    public int[] leftUnion(int[] leftArray, int[] rightArray);
    
    public int[] distinctUnion(int[] leftArray, int[] rightArray);
    public int[] innerUnion(int[] leftArray, int[] rightArray);
    public int[] outerUnion(int[] leftArray, int[] rightArray);
}
