/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.damduy.mathulti.core;

import com.damduy.mathutil.core.MathUtil;
import org.junit.Assert;


import org.junit.Test;






/**
 *
 * @author ASUS
 */
public class FactorialTest {
    
    @Test //bien 1 ham di kem cai annotation nay thanh ham main()
    public void checkFactorialGivenRightArgumentReturnsWell() {
        long expecteds = 120; //tui hy vong 120 tra ve, neu 
        long actuals = MathUtil.getFactorial(5); // neu tui tinh 5!
        Assert.assertEquals(expecteds, actuals);
        Assert.assertEquals(720, MathUtil.getFactorial(6));
        Assert.assertEquals(1, MathUtil.getFactorial(0));
    }
    //bat xem, test xem ham co nem ve ngoai le nhu ki vong hay khong
    //vi du neu ta tinh F(5) - > the, nem ra ngoai le
    //neu dung goi ham getF(-5) ma ham nem ra ngoai le tuong ung -> ham viet
    //dung, ta co mau xanh.
    //ham duoc thiet ke dua am nem ngoai le
    //co ngia ham dung nhu ki vong thi mau xanh
    //JUnit 4 coi ngoai le ko la gia tri, ko AssertEqual(ngoai le, actual)
    @Test(expected = IllegalArgumentException.class)
    public void checkFactorialGivenWrongArgumentThrowsException() {
        MathUtil.getFactorial(-25); //phai nem ngoai le thi moi la dung
    }
    }
    


//Chot ha cho xanh do
//xanh: khi tat ca CAC TINH HUONG TEST PHAI LA MAU XANH, TUC LA MOI EXPECTED 
//VA ACTUAL PHAI KHOP NHAU

//* DO: CHI CAN 1 CAI DO, TAT CA COI NHU LA DO

//LOGIC: HAM DA DUNG THI PHAI DUNG CHO MOI TINH HUONG TEST
//       KO CHAP NHAN LUC DUNG LUC SAI
