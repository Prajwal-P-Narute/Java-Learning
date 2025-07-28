package com.java.staticAndFinalMethod;

public class C extends B implements A {
	@Override
	public void demoA() {
		System.out.println("demoA() method");

	}

	public static void main(String[] args) {

		C c = new C();
		c.demoA();
		demoB();

	}
}
