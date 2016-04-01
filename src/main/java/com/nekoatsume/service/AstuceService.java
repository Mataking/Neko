package com.nekoatsume.service;

import java.util.List;

import com.nekoatsume.model.AjoutAstuce;
import com.nekoatsume.model.Astuce;

//joue le rôle du webservice pour les fonctions dédié pour les astuces
public interface AstuceService {

    public List<Astuce> getAllAstuce();

    public List<Astuce> getAstuce(String chatname);

    public Astuce getAstuceById(int id);

    public void addAstuce(AjoutAstuce astuce);

    public void addPlus(Astuce astuce);

    public void addMoins(Astuce astuce);

    public void deleteAstuce(int id);
}
