package com.sitech.dto;

import java.io.Serializable;

public class guestInfoDTO implements Serializable {
	
	private String gname;
	private String gaddress;
	private Integer daysToStay;
	private Float ChargePerDay;
	private Long gContact;
	private float BillAmount;
	
	public guestInfoDTO() {
		System.out.println("guestInfoDTO.guestInfoDTO()");
	}

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public String getGaddress() {
		return gaddress;
	}

	public void setGaddress(String gaddress) {
		this.gaddress = gaddress;
	}

	public Integer getDaysToStay() {
		return daysToStay;
	}

	public void setDaysToStay(Integer daysToStay) {
		this.daysToStay = daysToStay;
	}

	public Float getChargePerDay() {
		return ChargePerDay;
	}

	public void setChargePerDay(Float chargePerDay) {
		ChargePerDay = chargePerDay;
	}

	public Long getgContact() {
		return gContact;
	}

	public void setgContact(Long gContact) {
		this.gContact = gContact;
	}

	public float getBillAmount() {
		return BillAmount;
	}

	public void setBillAmount(float billAmount) {
		BillAmount = billAmount;
	}
	
	

}
