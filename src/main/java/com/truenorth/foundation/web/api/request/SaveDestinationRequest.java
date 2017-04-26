package com.truenorth.foundation.web.api.request;

import java.util.ArrayList;

//FIXME: Zipcode validation and address array
public class SaveDestinationRequest {
	private String destinationName;
	private String destination;
	private String description;
	private String destinationTips;
	private String destinationProceRange;
	private String fprId;
	private String sourceId;
	private String govtEndorsed;
	private Long sourceTimestamp;
	private String destinationPrivacy;
	private String destinationBusinessHours;
	private ArrayList<AddressRequest> addressRequest;
	private String cityName;
	private ArrayList<EmailRequest> emailsRequest;
	private ArrayList<PhoneRequest> phoneRequest;
	private ArrayList<WebsiteRequest> websites;
	private String altName;
	private String altLanguage;
	private ArrayList<CategoryRequest> categoryRequest;
	private ArrayList<CoordinatesRequest> coordinatesRequest;
	private ArrayList<FacilityRequest> facility;
	private ArrayList<AmenityRequest> amenities;
	private ArrayList<MediaLinkRequest> mediaLink;
	private String sourceName;
	private ArrayList<ThemeRequest> themesRequest;
	private ArrayList<ThingsToDoRequest> thingsToDoRequest;
	private ArrayList<AttributeRequest> attributeRequest;
	private boolean curatorNode;
	private String curatorNote;
	private String status;

	
	
	public String getDestinationName() {
		return destinationName;
	}

	public void setDestinationName(String destinationName) {
		this.destinationName = destinationName;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getFprId() {
		return fprId;
	}

	public void setFprId(String fprId) {
		this.fprId = fprId;
	}

	public String getSourceId() {
		return sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public String getGovtEndorsed() {
		return govtEndorsed;
	}

	public void setGovtEndorsed(String govtEndorsed) {
		this.govtEndorsed = govtEndorsed;
	}

	public Long getSourceTimestamp() {
		return sourceTimestamp;
	}

	public void setSourceTimestamp(Long sourceTimestamp) {
		this.sourceTimestamp = sourceTimestamp;
	}

	public String getDestinationPrivacy() {
		return destinationPrivacy;
	}

	public void setDestinationPrivacy(String destinationPrivacy) {
		this.destinationPrivacy = destinationPrivacy;
	}

	public String getDestinationBusinessHours() {
		return destinationBusinessHours;
	}

	public void setDestinationBusinessHours(String destinationBusinessHours) {
		this.destinationBusinessHours = destinationBusinessHours;
	}

	public String getAltName() {
		return altName;
	}

	public void setAltName(String altName) {
		this.altName = altName;
	}

	public String getAltLanguage() {
		return altLanguage;
	}

	public void setAltLanguage(String altLanguage) {
		this.altLanguage = altLanguage;
	}

	public String getSourceName() {
		return sourceName;
	}

	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}

	public ArrayList<AddressRequest> getAddressRequest() {
		return addressRequest;
	}

	public void setAddressRequest(ArrayList<AddressRequest> addressRequest) {
		this.addressRequest = addressRequest;
	}

	public ArrayList<CategoryRequest> getCategoryRequest() {
		return categoryRequest;
	}

	public void setCategoryRequest(ArrayList<CategoryRequest> categoryRequest) {
		this.categoryRequest = categoryRequest;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public ArrayList<PhoneRequest> getPhoneRequest() {
		return phoneRequest;
	}

	public void setPhoneRequest(ArrayList<PhoneRequest> phoneRequest) {
		this.phoneRequest = phoneRequest;
	}

	public ArrayList<AttributeRequest> getAttributeRequest() {
		return attributeRequest;
	}

	public void setAttributeRequest(ArrayList<AttributeRequest> attributeRequest) {
		this.attributeRequest = attributeRequest;
	}

	public ArrayList<ThemeRequest> getThemesRequest() {
		return themesRequest;
	}

	public void setThemesRequest(ArrayList<ThemeRequest> themesRequest) {
		this.themesRequest = themesRequest;
	}

	public ArrayList<ThingsToDoRequest> getThingsToDoRequest() {
		return thingsToDoRequest;
	}

	public void setThingsToDoRequest(ArrayList<ThingsToDoRequest> thingsToDoRequest) {
		this.thingsToDoRequest = thingsToDoRequest;
	}

	public ArrayList<FacilityRequest> getFacility() {
		return facility;
	}

	public void setFacility(ArrayList<FacilityRequest> facility) {
		this.facility = facility;
	}

	public ArrayList<AmenityRequest> getAmenities() {
		return amenities;
	}

	public void setAmenities(ArrayList<AmenityRequest> amenities) {
		this.amenities = amenities;
	}

	public ArrayList<MediaLinkRequest> getMediaLink() {
		return mediaLink;
	}

	public void setMediaLink(ArrayList<MediaLinkRequest> mediaLink) {
		this.mediaLink = mediaLink;
	}

	public ArrayList<WebsiteRequest> getWebsites() {
		return websites;
	}

	public void setWebsites(ArrayList<WebsiteRequest> websites) {
		this.websites = websites;
	}

	public ArrayList<EmailRequest> getEmailsRequest() {
		return emailsRequest;
	}

	public void setEmailsRequest(ArrayList<EmailRequest> emailsRequest) {
		this.emailsRequest = emailsRequest;
	}

	public String getDescription() {
		return description;
	}

	public String getDestinationTips() {
		return destinationTips;
	}

	public String getDestinationProceRange() {
		return destinationProceRange;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setDestinationTips(String destinationTips) {
		this.destinationTips = destinationTips;
	}

	public void setDestinationProceRange(String destinationProceRange) {
		this.destinationProceRange = destinationProceRange;
	}

	public boolean isCuratorNode() {
		return curatorNode;
	}

	public void setCuratorNode(boolean curatorNode) {
		this.curatorNode = curatorNode;
	}

	public String getCuratorNote() {
		return curatorNote;
	}

	public void setCuratorNote(String curatorNote) {
		this.curatorNote = curatorNote;
	}

	public ArrayList<CoordinatesRequest> getCoordinatesRequest() {
		return coordinatesRequest;
	}

	public void setCoordinatesRequest(ArrayList<CoordinatesRequest> coordinatesRequest) {
		this.coordinatesRequest = coordinatesRequest;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean validate() {

		boolean IsValid = true;
//		// FIXME Zipcode and CityValidation
//		if (addressRequest == null || addressRequest.equals("")) {
//			IsValid = false;
//		} else
//			for (int i = 0; i < addressRequest.size(); i++) {
//				AddressRequest address = addressRequest.get(i);
//				if (address.getAddressLine1() == null || address.getAddressLine1().trim().equals("")) {
//					IsValid = false;
//
//				}
//
//				if (phoneRequest == null || phoneRequest.equals("")) {
//					IsValid = false;
//				} else
//					for (int x = 0; x < phoneRequest.size(); x++) {
//						PhoneRequest phone = phoneRequest.get(x);
//						if (phone.getPhone() == null || phone.getPhoneType().trim().equals("")) {
//							IsValid = false;
//
//						}
//
//					}
//
//				if (emailsRequest == null || emailsRequest.equals("")) {
//					IsValid = false;
//				} else
//					for (int x = 0; x < emailsRequest.size(); x++) {
//						EmailRequest email = emailsRequest.get(x);
//						if (email.getEmail() == null || email.getEmailPrivacy().trim().equals("")) {
//							IsValid = false;
//
//						}
//
//					}
//				if (mediaLink == null || mediaLink.equals("")) {
//					IsValid = false;
//				} else
//					for (int x = 0; x < mediaLink.size(); x++) {
//						MediaLinkRequest medialinkreq = mediaLink.get(x);
//						if (medialinkreq.getMediaURL() == null || medialinkreq.getMediaType().trim().equals("")) {
//							IsValid = false;
//
//						}
//
//					}
//				if (facility == null || facility.equals("")) {
//					IsValid = false;
//				} else
//					for (int x = 0; x < facility.size(); x++) {
//						FacilityRequest facilityreq = facility.get(x);
//						if (facilityreq.getFacilityName() == null || facilityreq.getFacilityType().trim().equals("")) {
//							IsValid = false;
//
//						}
//
//					}
//
//			}
//		if (destinationName == null) {
//			IsValid = false;
//		}
//
//		if (destination == null) {
//			IsValid = false;
//		}
//
//		if (fprId == null) {
//			IsValid = false;
//		}
//		if (sourceId == null) {
//			IsValid = false;
//		}
//
//		if (govtEndorsed == null) {
//			IsValid = false;
//		}
//
//		if (sourceTimestamp == 0) {
//			IsValid = false;
//		}
//
//		if (destinationPrivacy == null) {
//			IsValid = false;
//		}
//
//		if (destinationBusinessHours == null) {
//			IsValid = false;
//		}
//
//		if (altName == null) {
//			IsValid = false;
//		}
//
//		if (altLanguage == null) {
//			IsValid = false;
//		} else
//			Languages.getEnums().contains(altLanguage.toUpperCase());
//
//		if (longitude <= 17.88988 || longitude >= 18.6462) {
//			IsValid = false;
//		}
//
//		if (longitude <= 17.88988 || longitude >= 18.6462) {
//			IsValid = false;
//		}
//
//		if (latitude >= -65.17 || latitude <= -68.1152) {
//			IsValid = false;
//		}
		
		for (int i = 0; i < coordinatesRequest.size(); i++){
			if (coordinatesRequest.get(i).getLatitude() <= 17.88988 || coordinatesRequest.get(i).getLatitude() >= 18.6462){
				IsValid = false;
				break;
			}
			if (coordinatesRequest.get(i).getLongitude() >= -65.17 || coordinatesRequest.get(i).getLongitude() <= -68.1152){
				IsValid = false;
				break;
			}
		}
//
//		if (sourceName == null) {
//			IsValid = false;
//		}
//
//
//			SourceType.getEnums().contains(sourceName.toUpperCase());

		return IsValid;

	}

	@Override
	public String toString() {
		return "SaveDestinationRequest [destinationName=" + destinationName + ", destination=" + destination
				+ ", description=" + description + ", destinationTips=" + destinationTips + ", destinationProceRange="
				+ destinationProceRange + ", fprId=" + fprId + ", sourceId=" + sourceId + ", govtEndorsed="
				+ govtEndorsed + ", sourceTimestamp=" + sourceTimestamp + ", destinationPrivacy=" + destinationPrivacy
				+ ", destinationBusinessHours=" + destinationBusinessHours + ", addressRequest=" + addressRequest
				+ ", cityName=" + cityName + ", emailsRequest=" + emailsRequest + ", phoneRequest=" + phoneRequest
				+ ", websites=" + websites + ", altName=" + altName + ", altLanguage=" + altLanguage
				+ ", categoryRequest=" + categoryRequest + ", coordinatesRequest=" + coordinatesRequest + ", facility="
				+ facility + ", amenities=" + amenities + ", mediaLink=" + mediaLink + ", sourceName=" + sourceName
				+ ", themesRequest=" + themesRequest + ", thingsToDoRequest=" + thingsToDoRequest
				+ ", attributeRequest=" + attributeRequest + ", curatorNode=" + curatorNode + ", curatorNote="
				+ curatorNote + ", status=" + status + "]";
	}


}
