package model;

public class ServicePhone {
	
	
	private Phone phoneOne;
	private Phone phonetwo;
	private Phone phoneThree;
	
	public void setPhoneOne(Phone phone) {
		this.phoneOne= phone;
		
	}
	public void setPhoneTwo(Phone phone) {
		this.phonetwo= phone;
		
	}
	public void setPhoneThree(Phone phone) {
		this.phoneThree= phone;
		
	}
	
	public Phone getPhoneOne() {
		return phoneOne;
	}
	public Phone getPhoneTwo() {
		return phonetwo;
	}
	public Phone getPhoneThree() {
		return phoneThree;
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
                      if (phoneOne != null && phoneOne.getImei().equals(imai)) {
		        return phoneOne;
		    } else if (phonetwo != null && phonetwo.getImei().equals(imai)) {
		        return phonetwo;
		    } else if (phoneThree != null && phoneThree.getImei().equals(imai)) {
		        return phoneThree;
		    }

		    return null;
		 
	 }
	 public int addMinutes(Phone phone) {
		 if (findPhone(phone.getImei())== null) {
			return 0;
		}
		 int addMin = phone.getCellPlan().getMinutes(); 
				 
		 return addMin;  
	 }

}
