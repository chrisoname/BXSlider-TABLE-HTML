package com.truenorth.foundation.web.api.request;



public class AddressRequest {
	
	private String addressType;
	private String addressPrivacy;
	private String addressLine1;
	private String addressLine2;
	private String wardName;
	private String neighborhoodName;
	private String cityIndex;
	private String zipCode;
	private String sourceName;
	private String sourceId;
	
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	public String getAddressPrivacy() {
		return addressPrivacy;
	}
	public void setAddressPrivacy(String addressPrivacy) {
		this.addressPrivacy = addressPrivacy;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getWardName() {
		return wardName;
	}
	public void setWardName(String wardName) {
		this.wardName = wardName;
	}
	public String getNeighborhoodName() {
		return neighborhoodName;
	}
	public void setNeighborhoodName(String neighborhoodName) {
		this.neighborhoodName = neighborhoodName;
	}
	public String getCityIndex() {
		return cityIndex;
	}
	public void setCityIndex(String cityIndex) {
		this.cityIndex = cityIndex;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getSourceId() {
		return sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	@Override
	public String toString() {
		return "AddressRequest [addressType=" + addressType + ", addressPrivacy=" + addressPrivacy + ", addressLine1="
				+ addressLine1 + ", addressLine2=" + addressLine2 + ", wardName=" + wardName + ", neighborhoodName="
				+ neighborhoodName + ", cityIndex=" + cityIndex + ", zipCode=" + zipCode + ", sourceName=" + sourceName
				+ ", sourceId=" + sourceId + "]";
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
		result = prime * result + ((addressLine1 == null) ? 0 : addressLine1.hashCode());
		result = prime * result + ((addressLine2 == null) ? 0 : addressLine2.hashCode());
		result = prime * result + ((addressPrivacy == null) ? 0 : addressPrivacy.hashCode());
		result = prime * result + ((addressType == null) ? 0 : addressType.hashCode());
		result = prime * result + ((cityIndex == null) ? 0 : cityIndex.hashCode());
		result = prime * result + ((neighborhoodName == null) ? 0 : neighborhoodName.hashCode());
		result = prime * result + ((sourceId == null) ? 0 : sourceId.hashCode());
		result = prime * result + ((sourceName == null) ? 0 : sourceName.hashCode());
		result = prime * result + ((wardName == null) ? 0 : wardName.hashCode());
		result = prime * result + ((zipCode == null) ? 0 : zipCode.hashCode());
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
		AddressRequest other = (AddressRequest) obj;
		if (addressLine1 == null) {
			if (other.addressLine1 != null)
				return false;
		} else if (!addressLine1.equals(other.addressLine1))
			return false;
		if (addressLine2 == null) {
			if (other.addressLine2 != null)
				return false;
		} else if (!addressLine2.equals(other.addressLine2))
			return false;
		if (addressPrivacy == null) {
			if (other.addressPrivacy != null)
				return false;
		} else if (!addressPrivacy.equals(other.addressPrivacy))
			return false;
		if (addressType == null) {
			if (other.addressType != null)
				return false;
		} else if (!addressType.equals(other.addressType))
			return false;
		if (cityIndex == null) {
			if (other.cityIndex != null)
				return false;
		} else if (!cityIndex.equals(other.cityIndex))
			return false;
		if (neighborhoodName == null) {
			if (other.neighborhoodName != null)
				return false;
		} else if (!neighborhoodName.equals(other.neighborhoodName))
			return false;
		if (sourceId == null) {
			if (other.sourceId != null)
				return false;
		} else if (!sourceId.equals(other.sourceId))
			return false;
		if (sourceName == null) {
			if (other.sourceName != null)
				return false;
		} else if (!sourceName.equals(other.sourceName))
			return false;
		if (wardName == null) {
			if (other.wardName != null)
				return false;
		} else if (!wardName.equals(other.wardName))
			return false;
		if (zipCode == null) {
			if (other.zipCode != null)
				return false;
		} else if (!zipCode.equals(other.zipCode))
			return false;
		return true;
	}
	
}
