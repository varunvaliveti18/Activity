package com.sapient.service;

public class LeapYear {
	public int year;
	public boolean isLeap(){
		if(year%4==0){
			if(year%100!=0) return true;
			else if(year%100==0 && year%400==0)
				return true;
			else return false;
		}
		else return false;
	}
}
