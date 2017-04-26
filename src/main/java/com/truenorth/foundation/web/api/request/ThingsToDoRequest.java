package com.truenorth.foundation.web.api.request;



public class ThingsToDoRequest {
	
	private String thingsToDo;

	
	
	public String getThingsToDo() {
		return thingsToDo;
	}

	public void setThingsToDo(String thingsToDo) {
		this.thingsToDo = thingsToDo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((thingsToDo == null) ? 0 : thingsToDo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ThingsToDoRequest other = (ThingsToDoRequest) obj;
		if (thingsToDo == null) {
			if (other.thingsToDo != null)
				return false;
		} else if (!thingsToDo.equals(other.thingsToDo))
			return false;
		return true;
	}
	

}
