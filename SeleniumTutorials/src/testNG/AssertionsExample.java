package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsExample {

	String name = "Arivu";

	@Test
	public void checkEqual() {
		/*
		 * if (name.equals("Arivu")) { System.out.println("Name is equal"); } else {
		 * System.out.println("Name is not equal"); }
		 */

		Assert.assertNotEquals(name, "Arivu");
	}
}
