/**
 * 
 */
package atulab.ie.ghseandoc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */
class CarTest {

	/**
	 * Test method for {@link atulab.ie.ghseandoc.car#getDoors()}.
	 */
	@Test
	final void testGetDoors() {
		atulab.ie.ghseandoc.car car = new car();
		car.setDoors(1);
		int j = car.getDoors();
		assertEquals(1,j);
	}

	/**
	 * Test method for {@link atulab.ie.ghseandoc.car#setDoors(int)}.
	 */
	@Test
	final void testSetDoors() {
		atulab.ie.ghseandoc.car car = new car();
		car.setDoors(0);
		int j = car.getDoors();
		assertEquals(0,j);
	}

}
