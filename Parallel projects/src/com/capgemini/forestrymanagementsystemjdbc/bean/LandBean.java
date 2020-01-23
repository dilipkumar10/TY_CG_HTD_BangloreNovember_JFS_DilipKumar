package com.capgemini.forestrymanagementsystemjdbc.bean;

import java.io.Serializable;

public class LandBean implements Serializable{
private int landId;
private String landOwner;
private String product;
private int landSize;
public int getLandId() {
	return landId;
}
public void setLandId(int landId) {
	this.landId = landId;
}
public String getLandOwner() {
	return landOwner;
}
public void setLandOwner(String landOwner) {
	this.landOwner = landOwner;
}
public String getProduct() {
	return product;
}
public void setProduct(String product) {
	this.product = product;
}
public int getLandSize() {
	return landSize;
}
public void setLandSize(int landSize) {
	this.landSize = landSize;
}
/*@Override
public String toString() {
	return "\n LandBean [landId=" + landId + ", landOwner=" + landOwner + ", product=" + product + ", landSize=" + landSize
			+ "]";
}*/
public String toString() {
	return "\n Land ID="+landId +"\n LandOwner="+landOwner+"\n "
			+ "product="+product+"\n LandSize="+landSize+"\n*****************";
}

}
