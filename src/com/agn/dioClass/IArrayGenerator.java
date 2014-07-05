package com.agn.dioClass;

public interface IArrayGenerator {
    int[] initLeftArray();

    int[] initLeftArray(EnumOperationType eopTypeName);

    int[] initRightArray();

    int[] initRightArray(EnumOperationType eopTypeName);
}
