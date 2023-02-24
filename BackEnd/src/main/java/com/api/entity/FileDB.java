package com.api.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class FileDB {

    private String oltNeId;

    private String olt;

    private String type;

    private String pon;
    
    @Id
    private String serialnumber;

    private String zone;

    private String site;
    
    public FileDB(  String oltNeId, String olt, String type, String pon, String serialnumber, String zone, String site) {
		super();
		
		
		this.oltNeId = oltNeId;
		this.olt = olt;
		this.type = type;
		this.pon = pon;
		this.serialnumber = serialnumber;
		this.zone = zone;
		this.site = site;
	}
    
    
	public FileDB() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getOltNeId() {
		return oltNeId;
	}

	public void setOltNeId(String oltNeId) {
		this.oltNeId = oltNeId;
	}

	public String getOlt() {
		return olt;
	}

	public void setOlt(String olt) {
		this.olt = olt;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPon() {
		return pon;
	}

	public void setPon(String pon) {
		this.pon = pon;
	}

	public String getserialnumber() {
		return serialnumber;
	}

	public void setserialnumber(String serialnumber) {
		this.serialnumber = serialnumber;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}


	
    
    
	
	

}
