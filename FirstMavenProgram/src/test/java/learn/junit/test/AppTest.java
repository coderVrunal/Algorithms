package learn.junit.test;

import org.junit.Test;

import learn.junit.test.TwoSum;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test.
     */

    TwoSum sum = new TwoSum();
    @Test
    public void testAppNormalInput() {
        int [] expectedOut = new int[]{0,4};
        int [] possibleInput =sum.twoSum(new int[] {2,4,-5,1,6,5,0,4,8,9}, 8);
        assertArrayEquals( expectedOut, possibleInput);
    }

    @Test
    public void testAppWrongAnswer(){
        int [] expectedOut = new int[]{0,3};
        int [] possibleInput =sum.twoSum(new int[] {2,4,-5,1,6,5,0,4,8,9}, 8);
        assertArrayEquals( expectedOut, possibleInput);
    }
}
