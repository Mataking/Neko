package com.nekoatsume.dao;

import com.nekoatsume.model.Role;

/*
 ce DAO permet de récuperer le role d'un utilisateur
 */

/**
 *
 * @author Mata
 */

public interface RoleDAO {

    /**
     *
     * @param id
     * @return
     */
    public Role getRole(int id);
}
