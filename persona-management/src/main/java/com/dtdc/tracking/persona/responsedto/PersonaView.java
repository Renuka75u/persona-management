package com.dtdc.tracking.persona.responsedto;

/**
 * @author Renuka Sahoo
 * @since 02/07/2024 
 */
public class PersonaView {
	
	private String personaName = "";
	private String sectionName = "";
	private String fieldName = "";
	private String createdBy = "";
	private String createdDate = "";
	private String modifiedBy = "";
	private String modifiedDate = "";
	private String editUrl= "";
	private String deleteUrl = "";
	
	
	public PersonaView() {
		
	}
	public PersonaView(String personaName, String sectionName, String fieldName, String createdBy, String createdDate, String modifiedBy, String modifiedDate, String editUrl, String deleteUrl) {
		this.personaName = personaName;
		this.sectionName = sectionName;
		this.fieldName = fieldName;
		this.createdBy  = createdBy;
		this.createdDate = createdDate;
		this.modifiedBy  = modifiedBy;
		this.modifiedDate = modifiedDate;
		this.editUrl = editUrl;
	    this.deleteUrl = deleteUrl;
	}
	public String getPersonaName() {
		return personaName;
	}
	public void setPersonaName(String personaName) {
		this.personaName = personaName;
	}
	public String getSectionName() {
		return sectionName;
	}
	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}
	public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	
	
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy ) {
		this.createdBy = createdBy;
	}
	
	
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	
	
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public String getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDae(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public String getEditUrl() {
		return editUrl;
	}
	public void setEditUrl(String editUrl) {
		this.editUrl = editUrl;
	}
	public String getDeleteUrl() {
		return deleteUrl;
	}
	public void setDeleteUrl(String deleteUrl) {
		this.deleteUrl = deleteUrl;
	}	
}
