import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import model.CellPlan;
import model.Phone;
import presenter.HandlingCalls;

class HandlingCallsTest {
	HandlingCalls handlingCalls = new HandlingCalls();
	Phone phoneOne;
	Phone phoneTwo;
	Phone phoneThree;
	CellPlan plan1;
	
	
	@Test
	public void setup() {
		plan1 = new CellPlan("plan 1", 20);
		phoneOne = new Phone(plan1, "10024584235", "32025015407", LocalDate.of(2004,11,14));
	}
	

	@Test
	void testAddMinutes() {
		setup();
		handlingCalls.addPhone(phoneOne.getImei(), phoneOne.getNumber(),phoneOne.getManufacturingDate(), " sose se", 14);
		assertEquals(14, handlingCalls.addMinutes("1234613233", 14));
	}

	@Test
	void testRegistry() {
		
	}

}
