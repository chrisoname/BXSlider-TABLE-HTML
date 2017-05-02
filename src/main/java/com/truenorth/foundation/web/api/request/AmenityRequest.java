package com.truenorth.foundation.web.api.request;

public class AmenityRequest {
	private String amenityType;
	private String amenityInfo;
	private String sourceName;
	
	
	public String getAmenityType() {
		return amenityType;
	}
	public void setAmenityType(String amenityType) {
		this.amenityType = amenityType;
	}
	public String getAmenityInfo() {
		return amenityInfo;
	}
	public void setAmenityInfo(String amenityInfo) {
		this.amenityInfo = amenityInfo;
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
		result = prime * result + ((amenityInfo == null) ? 0 : amenityInfo.hashCode());
		result = prime * result + ((amenityType == null) ? 0 : amenityType.hashCode());
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
		AmenityRequest other = (AmenityRequest) obj;
		if (amenityInfo == null) {
			if (other.amenityInfo != null)
				return false;
		} else if (!amenityInfo.equals(other.amenityInfo))
			return false;
		if (amenityType == null) {
			if (other.amenityType != null)
				return false;
		} else if (!amenityType.equals(other.amenityType))
			return false;
		if (sourceName == null) {
			if (other.sourceName != null)
				return false;
		} else if (!sourceName.equals(other.sourceName))
			return false;
		return true;
	}
	
	
	
	
	
	

}
