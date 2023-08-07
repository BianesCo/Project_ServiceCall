import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import model.CellPlan;
import model.EtypeCall;
import model.Phone;
import model.ServicePhone;

class ServicePhoneTest {
	
	ServicePhone servicePhone = new ServicePhone();
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
	void testRegistryCall() {
		setup();
		servicePhone.setPhoneOne(phoneOne);
		assertEquals(true, servicePhone.registryCall(phoneOne, 20, EtypeCall.MOVIL));
		
	}

	@Test
	void testAddMinutes() {
		setup();
		servicePhone.setPhoneOne(phoneOne);
		assertEquals(20, servicePhone.addMinutes(phoneOne));
	}

}
