package ArrayFun;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayFunTest {
    @Test
    public void testThatTheNumberInAnArrayIsTheLargest(){
        ArrayFun arrayFun = new ArrayFun();
        int[] myArray = {4, 7, 9, 0, 2};
        assertEquals(9, arrayFun.maxArray(myArray));
    }

    @Test
    public void testThatNumberInArrayIsTheSmallest(){
        ArrayFun arrayFun = new ArrayFun();
        int[] myArray = {4, 7, 9, 0, 2};
        assertEquals(0,arrayFun.minArray(myArray));
    }
//    @Test
//    public void testThatNumberInMyArrayCanBeReversed(){
//        ArrayFun arrayFun = new ArrayFun();
//        int[] myArray = {4, 7, 9, 0, 2};
//        assertArrayEquals(new int[]{2,0,9,7,4},arrayFun.reverseArr(myArray));
//    }
}
