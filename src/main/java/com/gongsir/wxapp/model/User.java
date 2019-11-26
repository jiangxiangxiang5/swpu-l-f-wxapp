package com.gongsir.wxapp.model;

import java.io.Serializable;

/**
 * @author 龚涛
 */
public class User implements Serializable {
    /**
     * 唯一身份标识
     */
    private String userOpenid;

    /**
     * 学号
     */
    private String stuNum;

    /**
     * 昵称
     */
    private String userName;

    /**
     * 微信头像
     */
    private String userHead;

    /**
     * app类型
     */
    private String userApp;

    private static final long serialVersionUID = 1L;

    public String getUserOpenid() {
        return userOpenid;
    }

    public void setUserOpenid(String userOpenid) {
        this.userOpenid = userOpenid;
    }

    public String getStuNum() {
        return stuNum;
    }

    public void setStuNum(String stuNum) {
        this.stuNum = stuNum;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserHead() {
        return userHead;
    }

    public void setUserHead(String userHead) {
        this.userHead = userHead;
    }

    public String getUserApp() {
        return userApp;
    }

    public void setUserApp(String userApp) {
        this.userApp = userApp;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        User other = (User) that;
        return (this.getUserOpenid() == null ? other.getUserOpenid() == null : this.getUserOpenid().equals(other.getUserOpenid()))
            && (this.getStuNum() == null ? other.getStuNum() == null : this.getStuNum().equals(other.getStuNum()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getUserHead() == null ? other.getUserHead() == null : this.getUserHead().equals(other.getUserHead()))
            && (this.getUserApp() == null ? other.getUserApp() == null : this.getUserApp().equals(other.getUserApp()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserOpenid() == null) ? 0 : getUserOpenid().hashCode());
        result = prime * result + ((getStuNum() == null) ? 0 : getStuNum().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getUserHead() == null) ? 0 : getUserHead().hashCode());
        result = prime * result + ((getUserApp() == null) ? 0 : getUserApp().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userOpenid=").append(userOpenid);
        sb.append(", stuNum=").append(stuNum);
        sb.append(", userName=").append(userName);
        sb.append(", userHead=").append(userHead);
        sb.append(", userApp=").append(userApp);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}