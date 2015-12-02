package com.bzw.entity;

import javax.persistence.*;

/**
 * Created by lyh on 2015/12/1.
 */
@Entity
@Table(name = "authority", schema = "", catalog = "bzw")
public class AuthorityEntity {
    private int authorityId;
    private String authorityName;
    private Integer parentid;
    private String memo;
    private String authorityCode;
    private Integer category;

    @Id
    @Column(name = "authority_id")
    public int getAuthorityId() {
        return authorityId;
    }

    public void setAuthorityId(int authorityId) {
        this.authorityId = authorityId;
    }

    @Basic
    @Column(name = "authority_name")
    public String getAuthorityName() {
        return authorityName;
    }

    public void setAuthorityName(String authorityName) {
        this.authorityName = authorityName;
    }

    @Basic
    @Column(name = "parentid")
    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    @Basic
    @Column(name = "memo")
    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AuthorityEntity that = (AuthorityEntity) o;

        if (authorityId != that.authorityId) return false;
        if (authorityName != null ? !authorityName.equals(that.authorityName) : that.authorityName != null)
            return false;
        if (memo != null ? !memo.equals(that.memo) : that.memo != null) return false;
        if (parentid != null ? !parentid.equals(that.parentid) : that.parentid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = authorityId;
        result = 31 * result + (authorityName != null ? authorityName.hashCode() : 0);
        result = 31 * result + (parentid != null ? parentid.hashCode() : 0);
        result = 31 * result + (memo != null ? memo.hashCode() : 0);
        return result;
    }

    @Basic
    @Column(name = "authority_code")
    public String getAuthorityCode() {
        return authorityCode;
    }

    public void setAuthorityCode(String authorityCode) {
        this.authorityCode = authorityCode;
    }

    @Basic
    @Column(name = "category")
    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }
}
