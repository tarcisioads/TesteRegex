package com.teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String args[]) {
		System.out.println("Iniciando....");
		String[] regexs = new String[3];
		regexs[0] = "[\\d]([\\d])?/[\\d]([\\d])?";
		regexs[1] = "(\\d)+\\.(\\d)+";
		regexs[2] = "[a-zA-Z]([\\w\\s])*";

		String[] values = new String[4];
		values[0] = "10/02 222.00 blabkjd dlkjsj sj sjjdks ";
		values[1] = "1/2 55.34 blabkjd dlkjsj sj sjjdks ";
		values[2] = "11/2 3102334.2 blabkjd dlkjsj sj sjjdks ";
		values[3] = "1/12 2567.9 a";

		for (String value : values) {
			for (String regex : regexs) {
				Pattern pattern = Pattern.compile(regex);
				Matcher matcher = pattern.matcher(value);
				while (matcher.find()) {
					System.out.println("Regex: " + regex);
					System.out.println("Value: " + value);
					System.out.println("Start: " + matcher.start());
					System.out.println("End : " + matcher.end());
					System.out.println("Result: "
							+ value.substring(matcher.start(), matcher.end()));
					System.out.println();
				}
			}
		}
		System.out.println("Finalizando....");

	}

}
