package com.srinivas.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="RES")
public class ReservationEvent {
	
	@Id
	private Integer reservationId;
	@Column
	private String pnrNumber;
	@Column
	private String eventType;
	public Integer getReservationId() {
		return reservationId;
	}
	public void setReservationId(Integer reservationId) {
		this.reservationId = reservationId;
	}
	public String getPnrNumber() {
		return pnrNumber;
	}
	public void setPnrNumber(String pnrNumber) {
		this.pnrNumber = pnrNumber;
	}
	public String getEventType() {
		return eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	public ReservationEvent(Integer reservationId, String pnrNumber, String eventType) {
		super();
		this.reservationId = reservationId;
		this.pnrNumber = pnrNumber;
		this.eventType = eventType;
	}
	public ReservationEvent() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ReservationEvent [reservationId=" + reservationId + ", pnrNumber=" + pnrNumber + ", eventType="
				+ eventType + "]";
	}

}
