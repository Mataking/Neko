package com.nekoatsume.service;

import com.nekoatsume.model.Role;
//joue le rôle du webservice pour les fonctions dédié pour les roles

/**
 *
 * @author Mata
 */
public interface RoleService {

    /**
     *
     * @param id
     * @return
     */
    public Role getRole(int id);
}
