package com.example.gallerydemoandroid;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Result{

	@SerializedName("propertyTypes")
	private PropertyTypes propertyTypes;

	@SerializedName("amenities")
	private List<String> amenities;

	@SerializedName("own_parking")
	private boolean ownParking;

	@SerializedName("propertyLong")
	private Object propertyLong;

	@SerializedName("designStructure")
	private List<Object> designStructure;

	@SerializedName("propertyCarpetArea")
	private String propertyCarpetArea;

	@SerializedName("propertiesImages")
	private List<String> propertiesImages;

	@SerializedName("balconies")
	private List<String> balconies;

	@SerializedName("videos")
	private List<Object> videos;

	@SerializedName("propertyTotalArea")
	private String propertyTotalArea;

	@SerializedName("propertyDeveloper")
	private PropertyDeveloper propertyDeveloper;

	@SerializedName("deletedBy")
	private Object deletedBy;

	@SerializedName("presentation")
	private String presentation;

	@SerializedName("propertyCity")
	private String propertyCity;

	@SerializedName("propertyStatus")
	private Object propertyStatus;

	@SerializedName("createdAt")
	private String createdAt;

	@SerializedName("bhkType")
	private String bhkType;

	@SerializedName("propertyId")
	private int propertyId;

	@SerializedName("others")
	private List<String> others;

	@SerializedName("updatedAt")
	private Object updatedAt;

	@SerializedName("propertyLat")
	private Object propertyLat;

	@SerializedName("resaleProperty")
	private Object resaleProperty;

	@SerializedName("brochure")
	private String brochure;

	@SerializedName("propertyAddress")
	private String propertyAddress;

	@SerializedName("propertyPincode")
	private int propertyPincode;

	@SerializedName("propertyState")
	private String propertyState;

	@SerializedName("propertyArea")
	private String propertyArea;

	@SerializedName("deletedAt")
	private Object deletedAt;

	@SerializedName("propertyName")
	private String propertyName;

	@SerializedName("propertyCountry")
	private String propertyCountry;

	public Result(String name, String imageurl) {
	}

	public void setPropertyTypes(PropertyTypes propertyTypes){
		this.propertyTypes = propertyTypes;
	}

	public PropertyTypes getPropertyTypes(){
		return propertyTypes;
	}

	public void setAmenities(List<String> amenities){
		this.amenities = amenities;
	}

	public List<String> getAmenities(){
		return amenities;
	}

	public void setOwnParking(boolean ownParking){
		this.ownParking = ownParking;
	}

	public boolean isOwnParking(){
		return ownParking;
	}

	public void setPropertyLong(Object propertyLong){
		this.propertyLong = propertyLong;
	}

	public Object getPropertyLong(){
		return propertyLong;
	}

	public void setDesignStructure(List<Object> designStructure){
		this.designStructure = designStructure;
	}

	public List<Object> getDesignStructure(){
		return designStructure;
	}

	public void setPropertyCarpetArea(String propertyCarpetArea){
		this.propertyCarpetArea = propertyCarpetArea;
	}

	public String getPropertyCarpetArea(){
		return propertyCarpetArea;
	}

	public void setPropertiesImages(List<String> propertiesImages){
		this.propertiesImages = propertiesImages;
	}

	public List<String> getPropertiesImages(){
		return propertiesImages;
	}

	public void setBalconies(List<String> balconies){
		this.balconies = balconies;
	}

	public List<String> getBalconies(){
		return balconies;
	}

	public void setVideos(List<Object> videos){
		this.videos = videos;
	}

	public List<Object> getVideos(){
		return videos;
	}

	public void setPropertyTotalArea(String propertyTotalArea){
		this.propertyTotalArea = propertyTotalArea;
	}

	public String getPropertyTotalArea(){
		return propertyTotalArea;
	}

	public void setPropertyDeveloper(PropertyDeveloper propertyDeveloper){
		this.propertyDeveloper = propertyDeveloper;
	}

	public PropertyDeveloper getPropertyDeveloper(){
		return propertyDeveloper;
	}

	public void setDeletedBy(Object deletedBy){
		this.deletedBy = deletedBy;
	}

	public Object getDeletedBy(){
		return deletedBy;
	}

	public void setPresentation(String presentation){
		this.presentation = presentation;
	}

	public String getPresentation(){
		return presentation;
	}

	public void setPropertyCity(String propertyCity){
		this.propertyCity = propertyCity;
	}

	public String getPropertyCity(){
		return propertyCity;
	}

	public void setPropertyStatus(Object propertyStatus){
		this.propertyStatus = propertyStatus;
	}

	public Object getPropertyStatus(){
		return propertyStatus;
	}

	public void setCreatedAt(String createdAt){
		this.createdAt = createdAt;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public void setBhkType(String bhkType){
		this.bhkType = bhkType;
	}

	public String getBhkType(){
		return bhkType;
	}

	public void setPropertyId(int propertyId){
		this.propertyId = propertyId;
	}

	public int getPropertyId(){
		return propertyId;
	}

	public void setOthers(List<String> others){
		this.others = others;
	}

	public List<String> getOthers(){
		return others;
	}

	public void setUpdatedAt(Object updatedAt){
		this.updatedAt = updatedAt;
	}

	public Object getUpdatedAt(){
		return updatedAt;
	}

	public void setPropertyLat(Object propertyLat){
		this.propertyLat = propertyLat;
	}

	public Object getPropertyLat(){
		return propertyLat;
	}

	public void setResaleProperty(Object resaleProperty){
		this.resaleProperty = resaleProperty;
	}

	public Object getResaleProperty(){
		return resaleProperty;
	}

	public void setBrochure(String brochure){
		this.brochure = brochure;
	}

	public String getBrochure(){
		return brochure;
	}

	public void setPropertyAddress(String propertyAddress){
		this.propertyAddress = propertyAddress;
	}

	public String getPropertyAddress(){
		return propertyAddress;
	}

	public void setPropertyPincode(int propertyPincode){
		this.propertyPincode = propertyPincode;
	}

	public int getPropertyPincode(){
		return propertyPincode;
	}

	public void setPropertyState(String propertyState){
		this.propertyState = propertyState;
	}

	public String getPropertyState(){
		return propertyState;
	}

	public void setPropertyArea(String propertyArea){
		this.propertyArea = propertyArea;
	}

	public String getPropertyArea(){
		return propertyArea;
	}

	public void setDeletedAt(Object deletedAt){
		this.deletedAt = deletedAt;
	}

	public Object getDeletedAt(){
		return deletedAt;
	}

	public void setPropertyName(String propertyName){
		this.propertyName = propertyName;
	}

	public String getPropertyName(){
		return propertyName;
	}

	public void setPropertyCountry(String propertyCountry){
		this.propertyCountry = propertyCountry;
	}

	public String getPropertyCountry(){
		return propertyCountry;
	}

	@Override
 	public String toString(){
		return 
			"Result{" + 
			"propertyTypes = '" + propertyTypes + '\'' + 
			",amenities = '" + amenities + '\'' + 
			",own_parking = '" + ownParking + '\'' + 
			",propertyLong = '" + propertyLong + '\'' + 
			",designStructure = '" + designStructure + '\'' + 
			",propertyCarpetArea = '" + propertyCarpetArea + '\'' + 
			",propertiesImages = '" + propertiesImages + '\'' + 
			",balconies = '" + balconies + '\'' + 
			",videos = '" + videos + '\'' + 
			",propertyTotalArea = '" + propertyTotalArea + '\'' + 
			",propertyDeveloper = '" + propertyDeveloper + '\'' + 
			",deletedBy = '" + deletedBy + '\'' + 
			",presentation = '" + presentation + '\'' + 
			",propertyCity = '" + propertyCity + '\'' + 
			",propertyStatus = '" + propertyStatus + '\'' + 
			",createdAt = '" + createdAt + '\'' + 
			",bhkType = '" + bhkType + '\'' + 
			",propertyId = '" + propertyId + '\'' + 
			",others = '" + others + '\'' + 
			",updatedAt = '" + updatedAt + '\'' + 
			",propertyLat = '" + propertyLat + '\'' + 
			",resaleProperty = '" + resaleProperty + '\'' + 
			",brochure = '" + brochure + '\'' + 
			",propertyAddress = '" + propertyAddress + '\'' + 
			",propertyPincode = '" + propertyPincode + '\'' + 
			",propertyState = '" + propertyState + '\'' + 
			",propertyArea = '" + propertyArea + '\'' + 
			",deletedAt = '" + deletedAt + '\'' + 
			",propertyName = '" + propertyName + '\'' + 
			",propertyCountry = '" + propertyCountry + '\'' + 
			"}";
		}
}