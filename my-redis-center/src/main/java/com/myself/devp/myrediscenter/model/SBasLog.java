package com.myself.devp.myrediscenter.model;

import java.util.Date;

public class SBasLog {
    private String logId;

    private String crtUser;

    private String crtOrg;

    private Date crtDate;

    private String ip;

    private String operateKey;

    private String operateMethod;

    private String operateContent;

    private String module;

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId == null ? null : logId.trim();
    }

    public String getCrtUser() {
        return crtUser;
    }

    public void setCrtUser(String crtUser) {
        this.crtUser = crtUser == null ? null : crtUser.trim();
    }

    public String getCrtOrg() {
        return crtOrg;
    }

    public void setCrtOrg(String crtOrg) {
        this.crtOrg = crtOrg == null ? null : crtOrg.trim();
    }

    public Date getCrtDate() {
        return crtDate;
    }

    public void setCrtDate(Date crtDate) {
        this.crtDate = crtDate;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getOperateKey() {
        return operateKey;
    }

    public void setOperateKey(String operateKey) {
        this.operateKey = operateKey == null ? null : operateKey.trim();
    }

    public String getOperateMethod() {
        return operateMethod;
    }

    public void setOperateMethod(String operateMethod) {
        this.operateMethod = operateMethod == null ? null : operateMethod.trim();
    }

    public String getOperateContent() {
        return operateContent;
    }

    public void setOperateContent(String operateContent) {
        this.operateContent = operateContent == null ? null : operateContent.trim();
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module == null ? null : module.trim();
    }
}