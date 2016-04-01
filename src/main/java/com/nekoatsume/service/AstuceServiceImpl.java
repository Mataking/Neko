package com.nekoatsume.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nekoatsume.dao.AstuceDAO;
import com.nekoatsume.model.AjoutAstuce;
import com.nekoatsume.model.Astuce;

//déclaration du webservice astuceService, lié avec AstuceDAO
@Service("astuceService")
@Transactional
public class AstuceServiceImpl implements AstuceService {

    @Autowired
    private AstuceDAO astuceDAO;

    @Override
    public List<Astuce> getAllAstuce() {
        return astuceDAO.getAllAstuce();
    }

    @Override
    public List<Astuce> getAstuce(String chatname) {
        return astuceDAO.getAstuce(chatname);
    }

    @Override
    public void addAstuce(AjoutAstuce astuce) {
        astuceDAO.addAstuce(astuce);
    }

    @Override
    public void addPlus(Astuce astuce) {
        astuceDAO.addPlus(astuce);

    }

    @Override
    public void addMoins(Astuce astuce) {
        astuceDAO.addMoins(astuce);

    }

    @Override
    public Astuce getAstuceById(int id) {
        return astuceDAO.getAstuceById(id);
    }

    @Override
    public void deleteAstuce(int id) {
        astuceDAO.deleteAstuce(id);
    }
}