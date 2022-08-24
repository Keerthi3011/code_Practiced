package com.hibernatePractice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class products {
	@Column
	@Id
	private int productID;
	private String productName;
	/**
	 * @return the productID
	 */
	
	public int getProductID() {
		return productID;
	}
	/**
	 * @param productID the productID to set
	 */
	public void setProductID(int productID) {
		this.productID = productID;
	}
	/**
	 * @return the productNamw
	 */
	@Column
	public String getProductName() {
		return productName;
	}
	/**
	 * @param productNamw the productNamw to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	@Override
	public String toString() {
		return "products [productID=" + productID + ", productName=" + productName + "]";
	}
}
