package presenter;

import java.time.LocalDate;

import model.EtypeCall;
import model.ServicePhone;

public class HandlingCalls {
	
	private ServicePhone servicePhone;

	public HandlingCalls() {
		super();
           servicePhone = new ServicePhone();
	}
	
	public boolean addPhone(String imei, String number,LocalDate manufacturingDate,String nose, int niIdea ) {
		return false;
	}
	public String findPhone(String imei) {
			  if (servicePhone.findPhone(imei)!= null) {
			  throw new Exception ("dasdas");
		  }
	   
		     if (servicePhone.getPhoneOne() == null) {
	            CellPlan planOne = new CellPlan(description, minutes);
	            Phone phoneOne = new Phone(planOne, imei, number, manufacturingDate);
	            servicePhone.setPhoneOne(phoneOne);
	            
	            return true;
	        } else if (servicePhone.getPhoneTwo() == null) {
	            CellPlan planTwo = new CellPlan(description, minutes);
	            Phone phoneTwo = new Phone(planTwo, imei, number, manufacturingDate);
	            servicePhone.setPhoneTwo(phoneTwo);
	            return true;
	        } else if (servicePhone.getPhoneThree() == null) {
	            CellPlan planThree = new CellPlan(description, minutes);
	            Phone phoneThree = new Phone(planThree, imei, number, manufacturingDate);
	            servicePhone.setPhoneThree(phoneThree);
	            return true;
	        } else {
	            // Si ya existen los tres teléfonos, no se puede agregar más
	            return false;
	        }
	}
	public int addMinutes(String imei, int minutes) { 
		
		return servicePhone.addMinutes(servicePhone.findPhone(imei));
	}
	public boolean registry(String imei,String number,int minutes) {
		
		return servicePhone.registryCall(servicePhone.findPhone(imei), minutes, EtypeCall.valueOf(number)); 
	}

}
