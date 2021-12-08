package testNG;

import org.testng.annotations.Test;

public class DependaciesManagement {

	// problem1: you have to admit a student to engineering
	// problem2: you have to admit a student to higher secondary
	@Test//(enabled = false)
	public void highschool() {
		System.out.println("High School");
	}

	@Test(dependsOnMethods = "highschool")
	public void highersecondary() {
		System.out.println("High Secondary School");
	}

	@Test(dependsOnMethods = "highersecondary")
	public void degree() {
		System.out.println("Engineering");
	}
}
