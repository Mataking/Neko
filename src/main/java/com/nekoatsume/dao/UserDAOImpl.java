package com.nekoatsume.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nekoatsume.model.User;
import com.nekoatsume.model.UserRole;

//implementation de UserDAO
@Repository
public class UserDAOImpl implements UserDAO {

    @Autowired
    private SessionFactory sessionFactory;

    //cree la connection entre la base et hibernate
    private Session openSession() {
        return sessionFactory.getCurrentSession();
    }

    //récuperer un utilisateur par son "id"
    @SuppressWarnings("unchecked")
    @Override
    public User getUserById(int id) {
        List<User> userList = new ArrayList<User>();
        Query query = openSession().createQuery("from User u where u.id = :id");
        query.setParameter("id", id);
        userList = query.list();
        if (userList.size() > 0) {
            return userList.get(0);
        } else {
            return null;
        }
    }

    @Override
    public UserRole getByUserId(int id) {
        Query query = openSession().createQuery("from UserRole where userid =" + id);

        return (UserRole) query.uniqueResult();
    }

    //récuperer un utilisateur par son "nom"
    @SuppressWarnings("unchecked")
    public User getUser(String login) {
        List<User> userList = new ArrayList<User>();
        Query query = openSession().createQuery("from User u where u.login = :login");
        query.setParameter("login", login);
        userList = query.list();
        if (userList.size() > 0) {
            return userList.get(0);
        } else {
            return null;
        }
    }

    //créer un nouvel utilisateur
    public void add(User user) {
        openSession().persist(user);
    }

    //modifier un utilisateur
    @Override
    public void edit(User user) {
        User existingUser = (User) openSession().get(User.class, user.getId());
        existingUser.setLogin(user.getLogin());
        existingUser.setPassword(user.getPassword());

        openSession().save(existingUser);

    }

    //récuperer la liste d'un utilisateur
    @SuppressWarnings("unchecked")
    @Override
    public List<User> listeUser() {
        Query query = openSession().createQuery("FROM User");
        return query.list();
    }

    //supprimer un utilisateur
    @Override
    public void bannirUser(User user) {

        User exist = (User) openSession().get(User.class, user.getId());
        exist.setId(user.getId());
        exist.setLogin(user.getLogin());
        exist.setPassword(user.getPassword());
        exist.setBanni(1);
        openSession().save(exist);
    }

    @Override
    public void revaliderUser(User user) {

        User exist = (User) openSession().get(User.class, user.getId());
        exist.setId(user.getId());
        exist.setLogin(user.getLogin());
        exist.setPassword(user.getPassword());
        exist.setBanni(0);
        openSession().save(exist);
    }

    @Override
    public User findByEmail(String mail) {

        Query query = openSession().createQuery("from User where adresse_mail ='" + mail + "'");
        return (User) query.uniqueResult();
    }
}
