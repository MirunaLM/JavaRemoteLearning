package com.iquestgroup.remotelearning.week1p22;

public class Number {

	public int value;

	public Number(int value) {
		this.value = value;
	}

	public boolean checkPrime() {
		boolean isPrime = true;

		for (int i = 2; i <= Math.sqrt(value); i++) {
			if (value % i == 0) {
				isPrime = false;
			}
		}
		return isPrime;
	}

	@Override
	public String toString() {
		String prime = "";

		if (checkPrime() == true && value != 0 && value != 1) {
			prime = "-PRIME";
		}

		return value + prime + " ";
	}

}
