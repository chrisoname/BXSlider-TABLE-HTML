package com.truenorth.foundation.web.api.request;

import org.neo4j.ogm.annotation.Property;

public class FacilityRequest {
	private String facilityType;
	private String facilityName;
	private String facilityCapacity;
	private String sourceName;
	
	public String getFacilityType() {
		return facilityType;
	}
	public void setFacilityType(String facilityType) {
		this.facilityType = facilityType;
	}
	public String getFacilityName() {
		return facilityName;
	}
	public void setFacilityName(String facilityName) {
		this.facilityName = facilityName;
	}
	public String getFacilityCapacity() {
		return facilityCapacity;
	}
	public void setFacilityCapacity(String facilityCapacity) {
		this.facilityCapacity = facilityCapacity;
	}
	public String getSourceName() {
		return sourceName;
	}
	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((facilityCapacity == null) ? 0 : facilityCapacity.hashCode());
		result = prime * result + ((facilityName == null) ? 0 : facilityName.hashCode());
		result = prime * result + ((facilityType == null) ? 0 : facilityType.hashCode());
		result = prime * result + ((sourceName == null) ? 0 : sourceName.hashCode());
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
		FacilityRequest other = (FacilityRequest) obj;
		if (facilityCapacity == null) {
			if (other.facilityCapacity != null)
				return false;
		} else if (!facilityCapacity.equals(other.facilityCapacity))
			return false;
		if (facilityName == null) {
			if (other.facilityName != null)
				return false;
		} else if (!facilityName.equals(other.facilityName))
			return false;
		if (facilityType == null) {
			if (other.facilityType != null)
				return false;
		} else if (!facilityType.equals(other.facilityType))
			return false;
		if (sourceName == null) {
			if (other.sourceName != null)
				return false;
		} else if (!sourceName.equals(other.sourceName))
			return false;
		return true;
	}
	

}
