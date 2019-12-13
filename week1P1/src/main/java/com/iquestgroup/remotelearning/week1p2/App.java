package com.iquestgroup.remotelearning.week1p22;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		ArrayList<Number> listNumber = new ArrayList<Number>();

		for (int i = 1; i < n; i++) {
			Number number = new Number(i);
			listNumber.add(number);
		}

		System.out.println(listNumber.toString());

	}
}
