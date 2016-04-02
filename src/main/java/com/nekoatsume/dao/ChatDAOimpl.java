package com.nekoatsume.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nekoatsume.model.Chat;
import com.nekoatsume.model.User;
import com.nekoatsume.model.UserRole;

//implementation de ChatDAO

/**
 *
 * @author Mata
 */
@Repository
public class ChatDAOimpl implements ChatDAO {

    @Autowired
    private SessionFactory sessionFactory;

    private Session openSession() {
        return sessionFactory.getCurrentSession();
    }

    //récuperer la liste de tous les chats

    /**
     *
     * @return
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<Chat> listeChat() {
        Query query = openSession().createQuery("FROM Chat where validation=0");
        return query.list();
    }

    //methode pour la recherche par nom

    /**
     *
     * @param nom
     * @return
     */
    @Override
    public Chat rechercheParNom(String nom) {

        Query query = openSession().createQuery("from Chat where nom like '%" + nom + "%' and validation=0");

        return (Chat) query.uniqueResult();

    }

    //récuperer les chats rares

    /**
     *
     * @return
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<Chat> listeChatRare() {
        Query query = openSession().createQuery("FROM Chat where rare=1 and validation=0");
        return query.list();
    }

    //récuperer les chat communs

    /**
     *
     * @return
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<Chat> listeChatCommun() {
        Query query = openSession().createQuery("FROM Chat where rare=0 and validation=0");
        return query.list();
    }

    /**
     *
     * @param chat
     */
    @Override
    public void add(Chat chat) {
        openSession().persist(chat);
    }

    /**
     *
     * @param chat
     */
    @Override
    public void validerChat(Chat chat) {
        Chat chatexist = (Chat) openSession().get(Chat.class, chat.getIdChat());
        chatexist.setIdChat(chat.getIdChat());
        chatexist.setNom(chat.getNom());
        chatexist.setNomJaponais(chat.getNomJaponais());
        chatexist.setPersonnalite(chat.getPersonnalite());
        chatexist.setDescription(chat.getDescription());
        chatexist.setNiveau(chat.getNiveau());
        chatexist.setRare(chat.getRare());
        chatexist.setValidation(0);
        openSession().save(chatexist);
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public Chat getChatById(int id) {
        Query query = openSession().createQuery("from Chat where idChat =" + id);

        return (Chat) query.uniqueResult();
    }

    /**
     *
     * @return
     */
    @Override
    public List<Chat> listeChatAdmin() {
        Query query = openSession().createQuery("FROM Chat");
        return query.list();
    }
}
