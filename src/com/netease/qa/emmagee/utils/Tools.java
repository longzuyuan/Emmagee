package com.netease.qa.emmagee.utils;

public class Tools {

	/**
	 * is text a positive number
	 * 
	 * @param text
	 * @return
	 */
	public static boolean isPositive(String text) {
		if(text == null || text.equals("")) return false;
		Double num;
		try {
			num = Double.parseDouble(text);
		} catch (NumberFormatException e) {
			return false;
		}
		return num >= 0;
	}

}
