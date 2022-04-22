package com.java.kaizen.operator;

import java.util.Date;

public class Question {
	public static void main(String[] args) {
		
		Date date = new Date();
				System.out.printf("%tT%n",date);
		System.out.printf("Hours: %1$tH Minutes: %1$tm  seconds:%1$tS%n",date);
		System.out.printf("%1$tH:%1$tM:%1$tS %1$tp %1$tL %51$tN %1$tz %n", date);
	}

}
