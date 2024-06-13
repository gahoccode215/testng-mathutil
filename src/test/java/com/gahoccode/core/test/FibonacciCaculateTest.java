/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package com.gahoccode.core.test;

import com.gahoccode.core.FibonacciCaculate;
import static org.testng.Assert.*;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author ASUS
 */
public class FibonacciCaculateTest {
    
    
    
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testGetFibonacciGivenWrongArg_1ThrowsException() {
        FibonacciCaculate.getFibonacci(-1);
    }
}
