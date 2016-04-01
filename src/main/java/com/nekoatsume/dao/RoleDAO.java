package com.nekoatsume.dao;

import com.nekoatsume.model.Role;

/*
 ce DAO permet de récuperer le role d'un utilisateur
 */
public interface RoleDAO {

    public Role getRole(int id);
}
