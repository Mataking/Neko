package com.nekoatsume.service;

import java.util.List;

import com.nekoatsume.model.AjoutAstuce;
import com.nekoatsume.model.Astuce;

//joue le rôle du webservice pour les fonctions dédié pour les astuces

/**
 *
 * @author Mata
 */
public interface AstuceService {

    /**
     *
     * @return
     */
    public List<Astuce> getAllAstuce();

    /**
     *
     * @param chatname
     * @return
     */
    public List<Astuce> getAstuce(String chatname);

    /**
     *
     * @param id
     * @return
     */
    public Astuce getAstuceById(int id);

    /**
     *
     * @param astuce
     */
    public void addAstuce(AjoutAstuce astuce);

    /**
     *
     * @param astuce
     */
    public void addPlus(Astuce astuce);

    /**
     *
     * @param astuce
     */
    public void addMoins(Astuce astuce);

    /**
     *
     * @param id
     */
    public void deleteAstuce(int id);
}
