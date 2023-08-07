package presenter;

import java.time.LocalDate;

import model.EtypeCall;
import model.ServicePhone;

public class HandlingCalls {
	
	private ServicePhone servicePhone;

	public HandlingCalls() {
		super();
	}
	
	public boolean addPhone(String imei, String number,LocalDate manufacturingDate,String nose, int niIdea ) {
		return false;
	}
	public String findPhone(String imei) {
		return null;
	}
	public int addMinutes(String imei, int minutes) { 
		
		return servicePhone.addMinutes(servicePhone.findPhone(imei));
	}
	public boolean registry(String imei,String number,int minutes) {
		
		return servicePhone.registryCall(servicePhone.findPhone(imei), minutes, EtypeCall.valueOf(number)); 
	}

}
