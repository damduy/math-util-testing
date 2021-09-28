/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.damduy.mathutil.core;

/**
 *
 * @author ASUS
 */
public class MathUtil {

    //viet ham toan hoc n giai thua n!= 1.2.3...n
    //quy uoc 0! = 1! = 1
    //ko co giai thua cua so am
    //21! tran kieu long, long: 18 so 0
    //tum lai: ham tinh giai thua cua n = 0. ..20
    //ta sai luon ki thuat lap trinh TDD-Test Driven Development
                                            //Test first developmment
    //ta nghi ve test, kich ban test, bo du lieu test truoc khi code
    public static long getFactorial(int n) {
        
        if (n<0 || n>20)
            throw new IllegalArgumentException("n must be between 0..20");
        
        if (n==0 || n==1)
            return 1;
       
        
        long product =1;
        
        for (int i =2; i<=n; i++)
            product *=i;
        
        return product;
    }
    //sure , get(F)5 ->120
    //get (F) 6 ->720
}
