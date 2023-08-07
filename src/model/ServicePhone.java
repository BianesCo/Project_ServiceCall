package model;

public class ServicePhone {
	
	private Phone phone;
	
	public void setPhoneOne(Phone phone) {
		this.phone= phone;
		
	}
	public void setPhoneTwo(Phone phone) {
		this.phone= phone;
		
	}
	public void setPhoneThree(Phone phone) {
		this.phone= phone;
		
	}
	
	public Phone getPhoneOne() {
		return phone;
	}
	public Phone getPhoneTwo() {
		return phone;
	}
	public Phone getPhoneThree() {
		return phone;
	}
	 public boolean registryCall(Phone phone, int minutes, EtypeCall etypeCall) {
		 if (phone == null ) {
			return false;
		}else {
		 
		 int calMinutes = switch(etypeCall) { 
		 
		 case MOVIL -> minutes-1;
		 case FIXED -> minutes - (minutes*2);
		 case INTERNATIONAL -> minutes - (minutes*3);
		 default -> 0;
		 }; 
		 
		 int minutesRestantes = phone.getCellPlan().getMinutes()- calMinutes;
		 
		 if (minutesRestantes < 0) {
			return false; 
		}
		 phone.getCellPlan().setMinutes(minutesRestantes); 	
		 return true;
		}
	 } 
	 public Phone findPhone(String imei) {
		 return phone;
	 }
	 public int addMinutes(Phone phone) {
		 if (findPhone(phone.getImei())== null) {
			return 0;
		}
		 int addMin = phone.getCellPlan().getMinutes(); 
				 
		 return addMin;  
	 }

}
