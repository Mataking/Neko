package com.nekoatsume.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nekoatsume.dao.RoleDAO;
import com.nekoatsume.model.Role;
//déclaration du webservice, lié avec RoleDAO

/**
 *
 * @author Mata
 */
@Service
@Transactional
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDAO roleDAO;

    /**
     *
     * @param id
     * @return
     */
    public Role getRole(int id) {
        return roleDAO.getRole(id);
    }

}
