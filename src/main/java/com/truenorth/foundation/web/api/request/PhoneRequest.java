package com.truenorth.foundation.web.api.request;

public class PhoneRequest {

	private String phone;
	private String phonePrivacy;
	private String phoneType;
	private String sourceName;
	private String sourceId;
	

	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhonePrivacy() {
		return phonePrivacy;
	}
	public void setPhonePrivacy(String phonePrivacy) {
		this.phonePrivacy = phonePrivacy;
	}
	public String getPhoneType() {
		return phoneType;
	}
	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}

	public String getSourceName() {
		return sourceName;
	}
	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}
	public String getSourceId() {
		return sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}
	
	@Override
	public String toString() {
		return "PhoneRequest [phone=" + phone + ", phonePrivacy=" + phonePrivacy + ", phoneType=" + phoneType
				+ ", sourceName=" + sourceName + ", sourceId=" + sourceId + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((phonePrivacy == null) ? 0 : phonePrivacy.hashCode());
		result = prime * result + ((phoneType == null) ? 0 : phoneType.hashCode());
		result = prime * result + ((sourceId == null) ? 0 : sourceId.hashCode());
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
		PhoneRequest other = (PhoneRequest) obj;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (phonePrivacy == null) {
			if (other.phonePrivacy != null)
				return false;
		} else if (!phonePrivacy.equals(other.phonePrivacy))
			return false;
		if (phoneType == null) {
			if (other.phoneType != null)
				return false;
		} else if (!phoneType.equals(other.phoneType))
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
		return true;
	}

}
