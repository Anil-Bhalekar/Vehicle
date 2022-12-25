package com.bla.bla.backend.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateHelper {

	public final static String DATE_FORMAT = "yyyy/MM/dd hh:mm:ss a";
	public final static String DATE_FORMAT_1 = "yyyy/MM/dd";

	
	public static Date getCUrrentDate() {

		return new Date();
	}

	public static Date getCUrrentDate(String format) throws ParseException {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
		return simpleDateFormat.parse(simpleDateFormat.format(new Date()));
	}

	public static String getCUrrentDateString(String format) throws ParseException {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
		return simpleDateFormat.format(new Date());
	}

	public static void main(String[] args) {
		try {
			System.out.println(DateHelper.getCUrrentDateString(DateHelper.DATE_FORMAT));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
