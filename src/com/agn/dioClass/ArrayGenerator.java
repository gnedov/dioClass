package com.agn.dioClass;

public class ArrayGenerator implements IArrayGenerator {


    public ArrayGenerator() {
    }
    @Override
    public int[] initLeftArray() {
        return initLeftArray(EnumOperationType.LEFT_UNION);
    }
    @Override
    public int[] initLeftArray(EnumOperationType eopTypeName){
        int[] resArr;
        switch (eopTypeName){
            case LEFT_UNION:
                resArr = new int[]{1, 5, 4, 23, 65, 32, 78}; break;
            case RIGHT_UNION:
                resArr = new int[]{}; break;
            case INNER_UNION:
                resArr = new int[]{}; break;
            case OUTER_UNION:
                resArr = new int[]{}; break;
            case DISTINCT_UNION:
                resArr = new int[]{1,5,4,23,65,32,78}; break;
            default:
                resArr = new int[]{}; break;
        }
        return resArr;
    }
    @Override
    public int[] initRightArray() {
        return initRightArray(EnumOperationType.LEFT_UNION);
    }

    @Override
    public int[] initRightArray(EnumOperationType eopTypeName){
        int[] resArr;
        switch (eopTypeName){
            case LEFT_UNION:
                resArr = new int[]{3, 5, 24, 4, 1, 2, 34, 45, 32, 5}; break;
            case RIGHT_UNION:
                resArr = new int[]{}; break;
            case INNER_UNION:
                resArr = new int[]{}; break;
            case OUTER_UNION:
                resArr = new int[]{}; break;
            case DISTINCT_UNION:
                resArr = new int[]{3,5,24,54,1,2,34,45,32}; break;
            default:
                resArr = new int[]{}; break;
        }
        return resArr;
    }
}
