package com.example.RestdemoMain.Model;

public class CloudVendor {

    private String vendorID;
    private String vendorName;
    private String vendorAddress;
    private String vendorPhoneNumber;


    public CloudVendor() {

    }


    public CloudVendor(String vendorID, String vendorName, String vendorAddress, String vendorPhoneNumber) {
        this.vendorID = vendorID;
        this.vendorName = vendorName;
        this.vendorAddress = vendorAddress;
        this.vendorPhoneNumber = vendorPhoneNumber;
    }


    public String getVendorID() {
        return vendorID;
    }


    public String getVendorName() {
        return vendorName;
    }


    public String getVendorAddress() {
        return vendorAddress;
    }


    public String getVendorPhoneNumber() {
        return vendorPhoneNumber;
    }


    public void setVendorID(String vendorID) {
        this.vendorID = vendorID;
    }


    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }


    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }


    public void setVendorPhoneNumber(String vendorPhoneNumber) {
        this.vendorPhoneNumber = vendorPhoneNumber;
    }


    @Override
    public String toString() {
        return "CloudVendor [vendorID=" + vendorID + ", vendorName=" + vendorName + ", vendorAddress=" + vendorAddress
                + ", vendorPhoneNumber=" + vendorPhoneNumber + "]";
    }

    

}