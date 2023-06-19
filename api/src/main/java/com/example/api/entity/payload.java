package com.example.api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "payload")
public class payload {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Load_Id")
    private Long id;
	
	@Column(name = "Loading_Point")
    private String loadingPoint;
	
	@Column(name = "Unloading_Point")
    private String unloadingPoint;
	
	@Column(name = "Product_Type")
    private String productType;
	
	@Column(name = "Truck_Type")
    private String truckType;
	
	@Column(name = "No_of_trucks")
    private String noOfTrucks;
	
	@Column(name = "Weight")
    private String weight;
	
	@Column(name = "Optional_Comment", nullable = true)
    private String comment;
	
	@Column(name = "Shipper_Id")
    private String shipperId;
	
	@Column(name = "Date")
    private String date;
    
	public payload() {
		super();
		// TODO Auto-generated constructor stub
	}

	public payload(String loadingPoint, String unloadingPoint, String productType, String truckType, String noOfTrucks,
			String weight, String comment, String shipperId, String date) {
		super();
		this.loadingPoint = loadingPoint;
		this.unloadingPoint = unloadingPoint;
		this.productType = productType;
		this.truckType = truckType;
		this.noOfTrucks = noOfTrucks;
		this.weight = weight;
		this.comment = comment;
		this.shipperId = shipperId;
		this.date = date;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLoadingPoint() {
		return loadingPoint;
	}

	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}

	public String getUnloadingPoint() {
		return unloadingPoint;
	}

	public void setUnloadingPoint(String unloadingPoint) {
		this.unloadingPoint = unloadingPoint;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getTruckType() {
		return truckType;
	}

	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}

	public String getNoOfTrucks() {
		return noOfTrucks;
	}

	public void setNoOfTrucks(String noOfTrucks) {
		this.noOfTrucks = noOfTrucks;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getShipperId() {
		return shipperId;
	}

	public void setShipperId(String shipperId) {
		this.shipperId = shipperId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
}