package com.nekoatsume.dao;

import java.util.List;

import com.nekoatsume.model.AjoutAstuce;
import com.nekoatsume.model.Astuce;

/**
 *
 * @author Mata
 */
public interface AstuceDAO {
    
    //récupérer les astuces de tous les chats

    /**
     *
     * @return
     */
    public List<Astuce> getAllAstuce();

    //récupérer les astuces d'un chats en fonction de son nom

    /**
     *
     * @param chatname
     * @return
     */
    public List<Astuce> getAstuce(String chatname);

    //ajouter une astuce pour un chat

    /**
     *
     * @param Ajoutastuce
     */
    public void addAstuce(AjoutAstuce Ajoutastuce);

    /**
     *
     * @param id
     * @return
     */
    public Astuce getAstuceById(int id);

    //ajoute +1 au vote plus de l'astuce

    /**
     *
     * @param astuce
     */
    public void addPlus(Astuce astuce);

    //ajoute +1 au vote moins de l'astuce

    /**
     *
     * @param astuce
     */
    public void addMoins(Astuce astuce);

    //permet a l'admin de supprimer une astuce

    /**
     *
     * @param id
     */
    public void deleteAstuce(int id);
}
