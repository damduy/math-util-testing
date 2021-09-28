/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.damduy.mathulti.core;

import com.damduy.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author ASUS
 */

//Ta se dung ki thuat  Data Driven Testing/Parameterzed Testing
//Tham so hoa bo du lieu test
//la ki thuat tach bo du lieu test ra han cau lenh kiem thu ham
//xet cho bai getF()
//Bo data, dat o txt, Excel, table/db
//0 -> 1;
//1 -> 1;
//2 -> 2;




//nhoi/fill bo data nay vao trong loi goi ham getF() + assertEqual
//tach bach data va loi goi ham check kq
@RunWith(value = Parameterized.class)
public class AdvancedFactorialTest {

    //chuan bi bo data truoc
    //neu de file ngoai, thi phai viet them doan code doc data vao...
    @Parameters
    public static Object[][] initData() {
        return new Integer[][] {
                                    {0,1},
                                    {1,1},
                                    {2,2},
                                    {3,6},
                                    {4,24},
                                    {6,7720}, //co tinh mau do xem server mau do ko
                                    {5, 120}, //bo sung de test ci
                                };
    }
    
    @Parameter(value = 0)
    public int n; //ban muon tinh may giai thua
    
    @Parameter(value = 1)
    public long expected; //ban ki vong tra ve may
    
    @Test
    public void checkFactorialGivenRightArgumentReturnsWell() {
        
        assertEquals(expected, MathUtil.getFactorial(n));
        
    }
    
    
    
}
