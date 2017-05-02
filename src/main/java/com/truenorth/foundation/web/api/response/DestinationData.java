package com.truenorth.foundation.web.api.response;

import java.util.ArrayList;

import org.springframework.data.neo4j.annotation.QueryResult;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.truenorth.foundation.web.api.request.AddressRequest;
import com.truenorth.foundation.web.api.request.AmenityRequest;
import com.truenorth.foundation.web.api.request.AttributeRequest;
import com.truenorth.foundation.web.api.request.CategoryRequest;
import com.truenorth.foundation.web.api.request.CoordinatesRequest;
import com.truenorth.foundation.web.api.request.EmailRequest;
import com.truenorth.foundation.web.api.request.FacilityRequest;
import com.truenorth.foundation.web.api.request.MediaLinkRequest;
import com.truenorth.foundation.web.api.request.PhoneRequest;
import com.truenorth.foundation.web.api.request.ThemeRequest;
import com.truenorth.foundation.web.api.request.ThingsToDoRequest;
import com.truenorth.foundation.web.api.request.WebsiteRequest;

@JsonInclude(Include.NON_NULL)
@QueryResult
public class DestinationData {
    
    private String destinationName;
    private String sourceId;
    private String fprId;
    private String govermentEndorsed; 
    private Long sourceTimestamp;    
    private String destinationPrivacy;        
    private String destinationBusinessHours;
    private String altLanguage;    
    private String altName;
    private String status;
//    private Double  latitude;
//    private Double longitude;    
	
	//TODO
	private String sourceName;
	
	private ArrayList<MediaLinkRequest> mediaLinks;
	private ArrayList<ThemeRequest> themes;
	private ArrayList<ThingsToDoRequest> thingsToDo;
	private ArrayList<FacilityRequest> facility;
	private ArrayList<AmenityRequest> amenities;
	private ArrayList<WebsiteRequest> websites;
	private ArrayList<EmailRequest> emails;
	private ArrayList<AttributeRequest> attributes;
	private ArrayList<AddressRequest> addresses;
	private ArrayList<CategoryRequest> categories;
	private ArrayList<PhoneRequest> phones;
	private ArrayList<CoordinatesRequest> coordinates;
	
	/**
	 * @return the destinationName
	 */
	public String getDestinationName() {
		return destinationName;
	}
	/**
	 * @param destinationName the destinationName to set
	 */
	public void setDestinationName(String destinationName) {
		this.destinationName = destinationName;
	}
	/**
	 * @return the sourceId
	 */
	public String getSourceId() {
		return sourceId;
	}
	/**
	 * @param sourceId the sourceId to set
	 */
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}
	/**
	 * @return the fprId
	 */
	public String getFprId() {
		return fprId;
	}
	/**
	 * @param fprId the fprId to set
	 */
	public void setFprId(String fprId) {
		this.fprId = fprId;
	}
	/**
	 * @return the govermentEndorsed
	 */
	public String getGovermentEndorsed() {
		return govermentEndorsed;
	}
	/**
	 * @param govermentEndorsed the govermentEndorsed to set
	 */
	public void setGovermentEndorsed(String govermentEndorsed) {
		this.govermentEndorsed = govermentEndorsed;
	}
	/**
	 * @return the sourceTimestamp
	 */
	public Long getSourceTimestamp() {
		return sourceTimestamp;
	}
	/**
	 * @param sourceTimestamp the sourceTimestamp to set
	 */
	public void setSourceTimestamp(Long sourceTimestamp) {
		this.sourceTimestamp = sourceTimestamp;
	}
	/**
	 * @return the destinationPrivacy
	 */
	public String getDestinationPrivacy() {
		return destinationPrivacy;
	}
	/**
	 * @param destinationPrivacy the destinationPrivacy to set
	 */
	public void setDestinationPrivacy(String destinationPrivacy) {
		this.destinationPrivacy = destinationPrivacy;
	}
	/**
	 * @return the destinationBusinessHours
	 */
	public String getDestinationBusinessHours() {
		return destinationBusinessHours;
	}
	/**
	 * @param destinationBusinessHours the destinationBusinessHours to set
	 */
	public void setDestinationBusinessHours(String destinationBusinessHours) {
		this.destinationBusinessHours = destinationBusinessHours;
	}
	/**
	 * @return the altLanguage
	 */
	public String getAltLanguage() {
		return altLanguage;
	}
	/**
	 * @param altLanguage the altLanguage to set
	 */
	public void setAltLanguage(String altLanguage) {
		this.altLanguage = altLanguage;
	}
	/**
	 * @return the altName
	 */
	public String getAltName() {
		return altName;
	}
	/**
	 * @param altName the altName to set
	 */
	public void setAltName(String altName) {
		this.altName = altName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the sourceName
	 */
	public String getSourceName() {
		return sourceName;
	}
	/**
	 * @param sourceName the sourceName to set
	 */
	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}
	public ArrayList<WebsiteRequest> getWebsites() {
		return websites;
	}
	public void setWebsites(ArrayList<WebsiteRequest> websites) {
		this.websites = websites;
	}
	public ArrayList<EmailRequest> getEmails() {
		return emails;
	}
	public void setEmails(ArrayList<EmailRequest> emails) {
		this.emails = emails;
	}
	public ArrayList<AttributeRequest> getAttributes() {
		return attributes;
	}
	public void setAttributes(ArrayList<AttributeRequest> attributes) {
		this.attributes = attributes;
	}
	public ArrayList<AddressRequest> getAddresses() {
		return addresses;
	}
	public void setAddresses(ArrayList<AddressRequest> addresses) {
		this.addresses = addresses;
	}
	public ArrayList<CategoryRequest> getCategories() {
		return categories;
	}
	public void setCategories(ArrayList<CategoryRequest> categories) {
		this.categories = categories;
	}
	public ArrayList<PhoneRequest> getPhones() {
		return phones;
	}
	public void setPhones(ArrayList<PhoneRequest> phones) {
		this.phones = phones;
	}
	public ArrayList<AmenityRequest> getAmenities() {
		return amenities;
	}
	public void setAmenities(ArrayList<AmenityRequest> amenities) {
		this.amenities = amenities;
	}
	public ArrayList<FacilityRequest> getFacility() {
		return facility;
	}
	public void setFacility(ArrayList<FacilityRequest> facility) {
		this.facility = facility;
	}
	public ArrayList<ThingsToDoRequest> getThingsToDo() {
		return thingsToDo;
	}
	public void setThingsToDo(ArrayList<ThingsToDoRequest> thingsToDo) {
		this.thingsToDo = thingsToDo;
	}
	public ArrayList<ThemeRequest> getThemes() {
		return themes;
	}
	public void setThemes(ArrayList<ThemeRequest> themes) {
		this.themes = themes;
	}
	public ArrayList<MediaLinkRequest> getMediaLinks() {
		return mediaLinks;
	}
	public void setMediaLinks(ArrayList<MediaLinkRequest> mediaLinks) {
		this.mediaLinks = mediaLinks;
	}
	
	public ArrayList<CoordinatesRequest> getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(ArrayList<CoordinatesRequest> coordinates) {
		this.coordinates = coordinates;
	}
	
	@Override
	public String toString() {
		return "DestinationData [destinationName=" + destinationName + ", sourceId=" + sourceId + ", fprId=" + fprId
				+ ", govermentEndorsed=" + govermentEndorsed + ", sourceTimestamp=" + sourceTimestamp
				+ ", destinationPrivacy=" + destinationPrivacy + ", destinationBusinessHours="
				+ destinationBusinessHours + ", altLanguage=" + altLanguage + ", altName=" + altName + ", status="
				+ status + ", sourceName=" + sourceName + ", mediaLinks=" + mediaLinks + ", themes=" + themes
				+ ", thingsToDo=" + thingsToDo + ", facility=" + facility + ", amenities=" + amenities + ", websites="
				+ websites + ", emails=" + emails + ", attributes=" + attributes + ", addresses=" + addresses
				+ ", categories=" + categories + ", phones=" + phones + ", coordinates=" + coordinates + "]";
	}
}