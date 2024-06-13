/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package com.gahoccode.core.test;

import com.gahoccode.core.FibonacciCaculate;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 *
 * @author ASUS
 */
public class FibonacciCaculateDDTTest {

    @DataProvider(name = "source")
    public static Object[][] initData() {
        return new Object[][]{
            {0, 0},
            {1, 1},
            {2, 1},
            {3, 2},
            {4, 3},
            {5, 5},
            {6, 8},
            {7, 13},
            {8, 21}

        };
    }
    
    @Test(dataProvider = "source")
    public void testGetFibonacciGivenRightArgumentReturnWell(int n, long expected){
        Assert.assertEquals(expected, FibonacciCaculate.getFibonacci(n));
    }
}
