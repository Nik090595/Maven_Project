package com.Utilites;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date {

	public static String TimeStamp() {
		DateTimeFormatter d = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm-ss");
		LocalDateTime current = LocalDateTime.now();
		String S = d.format(current);
		return S;
	}
	
	public static void main(String[] args) {
		String Time = Date.TimeStamp();
		System.out.println(Time);
	}
}
