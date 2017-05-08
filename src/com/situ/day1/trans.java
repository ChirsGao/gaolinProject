package com.situ.day1;

import java.util.Scanner;

import org.junit.Test;

public class trans {
    public static void main(String[] args){
    	System.out.println("helloworld!");
    	//num1是为变量标识符 字母，数字，下划线 但不能为关键字和数字开头
    	int num_1 = 80;
    	num_1 = 90;
    	int num_2 = 100;
    	int result = num_1 + num_2;
    	System.out.println(result);
    	}
    
    @Test
    public void test1(){
    	int num1 = 5;
    	int num2 = 10;
    	System.out.println("before:" + num1);
    	System.out.println("before:" + num2);
    	//交换两个变量的值
    	int temp = num1;
    	num1 = num2;
    	num2 = temp;
    	
    	System.out.println("after:" + num1);
    	System.out.println("after:" + num2);
    }
    
    @Test
    public void test2(){
    	int num1 = 4;
    	int num2 = 9;
    	int result = num1 + num2;
    	int result1 = num2 / num1;
    	int result2 = num2 % num1;
    	System.out.println("result:" + result);
    	System.out.println("result1:" + result1);
    	System.out.println("result2:" + result2);
    }
    
    public void Fun()
}
    
  

