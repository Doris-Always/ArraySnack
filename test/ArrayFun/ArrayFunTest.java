package ArrayFun;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayFunTest {
    @Test
    public void testThatTheNumberInAnArrayIsTheLargest() {
        ArrayFun arrayFun = new ArrayFun();
        int[] myArray = {4, 7, 9, 0, 2};
        assertEquals(9, arrayFun.maxArray(myArray));
    }

    @Test
    public void testThatNumberInArrayIsTheSmallest() {
        ArrayFun arrayFun = new ArrayFun();
        int[] myArray = {4, 7, 9, 0, 2};
        assertEquals(0, arrayFun.minArray(myArray));
    }

    @Test
    public void testThatNumberInMyArrayCanBeReversed() {
        ArrayFun arrayFun = new ArrayFun();
        int[] myArray = {4, 7, 9, 0, 2};
        assertArrayEquals(new int[]{2, 0, 9, 7, 4}, arrayFun.reverseArr(myArray));
    }

    @Test
    public void testThatAnElementOccursInAList() {
        ArrayFun arrayFun = new ArrayFun();
        int[] myArray = {4, 7, 9, 0, 2};
        boolean foundElement = arrayFun.searchElement(myArray, 9);
        assertTrue(foundElement);
    }

    @Test
    public void testThatAllTheElementAtOddPositionsAreReturned() {
        ArrayFun arrayFun = new ArrayFun();
        int[] myArray = {4, 7, 9, 0, 2, 10, 3, 12};
        List<Integer> actual = arrayFun.printArrayAtOddPosition(myArray);
        List<Integer> result = asList(4, 9, 2, 3);
        assertEquals(result, actual);


    }

    @Test
    public void testRunningSum() {
        ArrayFun arrayFun = new ArrayFun();
        int[] myArray = {1, 2, 3, 4};
        int sum = arrayFun.runningSum(myArray);
        assertEquals(10, sum);

    }

    @Test
    public void testAlternatingElements() {
        ArrayFun arrayFun = new ArrayFun();
        int[] myArray1 = {1, 3, 5, 7};
        int[] myArray2 = {2, 4, 6, 8};
        List<Integer> result = asList(1,2,3,4,5,6,7,8);
        List<Integer> actual = arrayFun.alternateElements(myArray1, myArray2);
        assertEquals(result, actual);

    }
}

