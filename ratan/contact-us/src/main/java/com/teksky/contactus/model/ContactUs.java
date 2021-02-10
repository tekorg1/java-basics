package com.teksky.contactus.model;

public class ContactUs {

    private String customerId;
    private String fName;
    private String lName;
    private String emId;
    private String requestTxt;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmId() {
        return emId;
    }

    public void setEmId(String emId) {
        this.emId = emId;
    }

    public String getRequestTxt() {
        return requestTxt;
    }

    public void setRequestTxt(String requestTxt) {
        this.requestTxt = requestTxt;
    }
}
