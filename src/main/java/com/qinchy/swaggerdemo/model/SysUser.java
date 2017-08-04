package com.qinchy.swaggerdemo.model;

import java.util.Date;

public class SysUser {
    private Integer userId;

    private String name;

    private String loginName;

    private Integer orgId;

    private String mail;

    private String password;

    private String status;

    private String phone;

    private String address;

    private Date expireTime;

    private Date lastModifyPwdTime;

    private String remark;

    private String languageCode;

    private Integer empId;

    private String firstName;

    private String lastName;

    private String pincodeCode;

    private Short countyCode;

    private Short provCode;

    private Short regionCode;

    private Long tenantId;

    private Short isAdmin;

    private String randomValue;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail == null ? null : mail.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public Date getLastModifyPwdTime() {
        return lastModifyPwdTime;
    }

    public void setLastModifyPwdTime(Date lastModifyPwdTime) {
        this.lastModifyPwdTime = lastModifyPwdTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode == null ? null : languageCode.trim();
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName == null ? null : firstName.trim();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName == null ? null : lastName.trim();
    }

    public String getPincodeCode() {
        return pincodeCode;
    }

    public void setPincodeCode(String pincodeCode) {
        this.pincodeCode = pincodeCode == null ? null : pincodeCode.trim();
    }

    public Short getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(Short countyCode) {
        this.countyCode = countyCode;
    }

    public Short getProvCode() {
        return provCode;
    }

    public void setProvCode(Short provCode) {
        this.provCode = provCode;
    }

    public Short getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(Short regionCode) {
        this.regionCode = regionCode;
    }

    public Long getTenantId() {
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Short getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Short isAdmin) {
        this.isAdmin = isAdmin;
    }

    public String getRandomValue() {
        return randomValue;
    }

    public void setRandomValue(String randomValue) {
        this.randomValue = randomValue == null ? null : randomValue.trim();
    }
}