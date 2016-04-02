package com.nekoatsume.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nekoatsume.model.AjoutAstuce;
import com.nekoatsume.model.Astuce;

//implementation de AstuceDAO

/**
 *
 * @author Mata
 */
@Repository
public class AstuceDAOImpl implements AstuceDAO {

    @Autowired
    private SessionFactory sessionFactory;

    private Session openSession() {
        return sessionFactory.getCurrentSession();
    }

    //récupère la liste des astuces poser

    /**
     *
     * @return
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<Astuce> getAllAstuce() {
        Query query = openSession().createQuery("from Astuce");
        return query.list();
    }

    //récupérer les astuces par id

    /**
     *
     * @param id
     * @return
     */
    @Override
    public Astuce getAstuceById(int id) {
        Query query = openSession().createQuery("from Astuce where idastuce=" + id);
        return (Astuce) query.uniqueResult();
    }

    //récuperer les astuces par chat

    /**
     *
     * @param chatname
     * @return
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<Astuce> getAstuce(String chatname) {
        Query query = openSession().createQuery("from Astuce where nomchat='" + chatname + "'");
        return query.list();
    }

    //ajouter une astuce

    /**
     *
     * @param astuce
     */
    @Override
    public void addAstuce(AjoutAstuce astuce) {
        System.out.println("astuce ajouté");
        openSession().persist(astuce);
    }

    //methode pour voter plus une astuce

    /**
     *
     * @param astuce
     */
    @Override
    public void addPlus(Astuce astuce) {
        Astuce existingAstuce = (Astuce) openSession().get(Astuce.class, astuce.getIdastuce());
        existingAstuce.setNomchat(astuce.getNomchat());
        existingAstuce.setUsername(astuce.getUsername());
        existingAstuce.setVoteplus(astuce.getVoteplus() + 1);
        existingAstuce.setVote_moins(astuce.getVote_moins());
        openSession().save(existingAstuce);
    }

    //methode pour voter contre

    /**
     *
     * @param astuce
     */
    @Override
    public void addMoins(Astuce astuce) {
        Astuce existingAstuce = (Astuce) openSession().get(Astuce.class, astuce.getIdastuce());
        existingAstuce.setNomchat(astuce.getNomchat());
        existingAstuce.setUsername(astuce.getUsername());
        existingAstuce.setVoteplus(astuce.getVoteplus());
        existingAstuce.setVote_moins(astuce.getVote_moins() + 1);
        openSession().save(existingAstuce);
    }

    //supprimer une astuce

    /**
     *
     * @param id
     */
    @Override
    public void deleteAstuce(int id) {
        Query query = openSession().createQuery("FROM Astuce where idastuce=" + id);
        Astuce astuce = (Astuce) query.uniqueResult();
        openSession().delete(astuce);
    }
}
