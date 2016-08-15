package com.txu.registrationapp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="service_plan")
public class ServicePlan {
	
	@Id
	@Column(name="service_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int service_id;
	
	private Date start_date;
	private Date end_date;
	private String plan_name;
	private String description;

	

	/**
	 * @return the service_id
	 */
	public int getServiceID() {
		return service_id;
	}



	/**
	 * @param service_id the service_id to set
	 */
	public void setServiceID(int service_id) {
		this.service_id = service_id;
	}



	/**
	 * @return the start_date
	 */
	public Date getStartDate() {
		return start_date;
	}



	/**
	 * @param start_date the start_date to set
	 */
	public void setStartDate(Date start_date) {
		this.start_date = start_date;
	}



	/**
	 * @return the end_date
	 */
	public Date getEndDate() {
		return end_date;
	}



	/**
	 * @param end_date the end_date to set
	 */
	public void setEndDate(Date end_date) {
		this.end_date = end_date;
	}



	/**
	 * @return the plan_name
	 */
	public String getPlanName() {
		return plan_name;
	}



	/**
	 * @param plan_name the plan_name to set
	 */
	public void setPlanName(String plan_name) {
		this.plan_name = plan_name;
	}



	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}



	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}



	@Override
	public String toString(){
		return service_id+"::"+plan_name+"::"+description;
	}
}