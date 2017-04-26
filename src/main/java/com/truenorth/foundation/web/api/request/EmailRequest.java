package com.truenorth.foundation.web.api.request;

public class EmailRequest {
	private String email;
	private String emailPrivacy;
	private String sourceName;
	private String sourceId;

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmailPrivacy() {
		return emailPrivacy;
	}
	public void setEmailPrivacy(String emailPrivacy) {
		this.emailPrivacy = emailPrivacy;
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
		return "EmailRequest [email=" + email + ", emailPrivacy=" + emailPrivacy + ", sourceName=" + sourceName
				+ ", sourceId=" + sourceId + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((emailPrivacy == null) ? 0 : emailPrivacy.hashCode());
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
		EmailRequest other = (EmailRequest) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (emailPrivacy == null) {
			if (other.emailPrivacy != null)
				return false;
		} else if (!emailPrivacy.equals(other.emailPrivacy))
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
