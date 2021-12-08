package testNG;

import org.testng.annotations.Test;

public class GroupingExample {

	/*
	 * scenario: a big basket is having different kind of mobiles. let us say there
	 * are apple ,moto, vivo and lenovo mobiles. i want run a test inly for vivo and
	 * moto.write a program for that.
	 */
	@Test(groups = { "Apple" })
	public void apple1() {
		System.out.println("Apple Testing");
	}

	@Test(groups = { "Apple" })
	public void apple2() {
		System.out.println("Apple Testing");
	}

	@Test(groups = { "Moto" })
	public void moto1() {
		System.out.println("Motorla Testing");
	}

	@Test(groups = { "Moto" })
	public void moto2() {
		System.out.println("Motorla Testing");
	}

	@Test(groups = { "VIVO" })
	public void vivo1() {
		System.out.println("VIVO Testing");
	}

	@Test(groups = { "VIVO" })
	public void vivo2() {
		System.out.println("VIVO Testing");
	}

	@Test(groups = { "Lenovo" })
	public void lenovo1() {
		System.out.println("Lenovo Testing");
	}

	@Test(groups = { "Lenovo" })
	public void lenovo2() {
		System.out.println("Lenovo Testing");
	}
}
