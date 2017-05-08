package com.situ.day1;

import java.util.Scanner;

import org.junit.Test;

public class training {
	public static void main(String[] args){
		int year = 2016;
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
			System.out.println(year + "年是闰年");
		    } else{
		    	System.out.println(year + "年不是闰年");
		    }
	}

	@Test
    public void test4(){
    	/**
    	 * 学生成绩等级
    	 * >=90 <=100 优秀
    	 * >=80 <90 良好
    	 * >=70 <80一般
    	 * >=60 <70及格
    	 * <60不及格
    	 * 
    	 * >100 <0
    	 */
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("请输入学生的成绩：");
		int score =scanner.nextInt();
    	System.out.println("score:" + score);
    	
    	if(score > 100 || score < 0){
    		System.out.println("学生成绩无效");
    		return;
    	} 
    	
    	if (score <= 100 && score >= 90){
    		System.out.println("学生成绩优秀");
    	} else if (score >= 80){
    		System.out.println("学生成绩良好");
    	} else if (score >= 70){
    		System.out.println("学生成绩一般");
    	} else if (score >= 60){
    		System.out.println("学生成绩及格");
    	} else {
    		System.out.println("不及格");
    	}
    }
	
	@Test
	public void Test2(){
		int num = 1;
		while (num <= 5){
			num++;
			System.out.println("helloworld!");
			}
		
	}
	
	@Test
	public void Gaosi(){
		int num1 = 1;
		int sum = 0;
		while (num1 <= 100){
			sum = sum + num1;
			num1++;
		}
		System.out.println(sum);
	}
	
	@Test
	public void for1(){
		for (int i = 1,sum = 0; i <= 100 ;sum = sum + 1, i++ ){
			System.out.println("sum:" + sum);
		}
	}
}

