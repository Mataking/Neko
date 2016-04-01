package com.nekoatsume.service;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nekoatsume.dao.UserDAO;
import com.nekoatsume.model.User;
import com.nekoatsume.model.UserRole;
//déclaration du webservice userService, lié avec les DAO

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Resource(name = "sessionFactory")
    private SessionFactory sessionFactory;

    @Override
    public User getUser(String login) {
        return userDAO.getUser(login);
    }

    @Override
    public void addUser(User user) {
        userDAO.add(user);
    }

    @Override
    public void editUser(User user) {
        Session session = sessionFactory.getCurrentSession();
        User exist = (User) session.get(User.class, user.getId());
        exist.setLogin(user.getLogin());
        exist.setPassword(user.getPassword());
        session.save(exist);
    }

    @Override
    public User getUserById(int id) {
        return userDAO.getUserById(id);
    }

    @Override
    public void updateUser(User user) {
        User entity = userDAO.getUserById(user.getId());
        if (entity != null) {
            entity.setLogin(user.getLogin());
            entity.setPassword(user.getPassword());
        }
    }

    @Override
    public List<User> listeUser() {
        return userDAO.listeUser();
    }

    @Override
    public void bannirUser(User user) {
        userDAO.bannirUser(user);
    }

    @Override
    public UserRole getByUserId(int id) {
        return userDAO.getByUserId(id);
    }

    @Override
    public void revaliderUser(User user) {
        userDAO.revaliderUser(user);
    }

    @Override
    public User findByEmail(String mail) {
        return userDAO.findByEmail(mail);
    }
}
