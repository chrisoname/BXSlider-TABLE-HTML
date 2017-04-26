package com.truenorth.foundation.web.api.request;



public class MediaLinkRequest {
	
	private String mediaType;
	private String mediaURL;
	/**
	 * @return the mediaType
	 */
	public String getMediaType() {
		return mediaType;
	}
	/**
	 * @param mediaType the mediaType to set
	 */
	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}
	/**
	 * @return the mediaURL
	 */
	public String getMediaURL() {
		return mediaURL;
	}
	/**
	 * @param mediaURL the mediaURL to set
	 */
	public void setMediaURL(String mediaURL) {
		this.mediaURL = mediaURL;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mediaType == null) ? 0 : mediaType.hashCode());
		result = prime * result + ((mediaURL == null) ? 0 : mediaURL.hashCode());
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
		MediaLinkRequest other = (MediaLinkRequest) obj;
		if (mediaType == null) {
			if (other.mediaType != null)
				return false;
		} else if (!mediaType.equals(other.mediaType))
			return false;
		if (mediaURL == null) {
			if (other.mediaURL != null)
				return false;
		} else if (!mediaURL.equals(other.mediaURL))
			return false;
		return true;
	}
	
	
	
	
	
	
	

}
