package com.nekoatsume.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/*
 Le model pour verifier le rôle d'un utilisateur
 */

/**
 *
 * @author Mata
 */

@Entity
@Table(name = "roles")
public class Role implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "role")
    private String role;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_roles",
            joinColumns = {
                @JoinColumn(name = "role_id", referencedColumnName = "id")},
            inverseJoinColumns = {
                @JoinColumn(name = "user_id", referencedColumnName = "id")})
    private Set<User> userRoles;

    /**
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getRole() {
        return role;
    }

    /**
     *
     * @param role
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     *
     * @return
     */
    public Set<User> getUserRoles() {
        return userRoles;
    }

    /**
     *
     * @param userRoles
     */
    public void setUserRoles(Set<User> userRoles) {
        this.userRoles = userRoles;
    }
}
