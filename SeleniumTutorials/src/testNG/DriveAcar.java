package testNG;

import org.testng.annotations.Test;

public class DriveAcar {
	@Test(priority = 0)
	public void startThecar() {
		System.out.println("Start the Car");
	}

	@Test(priority = 1)
	public void firstGear() {
		System.out.println("Put the first Gear");
	}

	@Test(priority = 2)
	public void secondGear() {
		System.out.println("Put the second gear");
	}

	@Test(priority = 3)
	public void thirdGear() {
		System.out.println("Put the third gear");
	}

	@Test(priority = 4)
	public void stopThecar() {
		System.out.println("Stop the car");
	}

}
