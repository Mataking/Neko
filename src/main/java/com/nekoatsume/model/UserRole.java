package com.nekoatsume.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Mata
 */
@Entity
@Table(name = "user_roles")
public class UserRole {

    @Id
    @GeneratedValue
    private Integer userid;

    @Column(name = "role_id")
    private Integer roleid;

    /**
     *
     * @return
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     *
     * @param userid
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     *
     * @return
     */
    public Integer getRoleid() {
        return roleid;
    }

    /**
     *
     * @param roleid
     */
    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

}
