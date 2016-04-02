package com.nekoatsume.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nekoatsume.dao.AstuceDAO;
import com.nekoatsume.model.AjoutAstuce;
import com.nekoatsume.model.Astuce;

//déclaration du webservice astuceService, lié avec AstuceDAO

/**
 *
 * @author Mata
 */
@Service("astuceService")
@Transactional
public class AstuceServiceImpl implements AstuceService {

    @Autowired
    private AstuceDAO astuceDAO;

    /**
     *
     * @return
     */
    @Override
    public List<Astuce> getAllAstuce() {
        return astuceDAO.getAllAstuce();
    }

    /**
     *
     * @param chatname
     * @return
     */
    @Override
    public List<Astuce> getAstuce(String chatname) {
        return astuceDAO.getAstuce(chatname);
    }

    /**
     *
     * @param astuce
     */
    @Override
    public void addAstuce(AjoutAstuce astuce) {
        astuceDAO.addAstuce(astuce);
    }

    /**
     *
     * @param astuce
     */
    @Override
    public void addPlus(Astuce astuce) {
        astuceDAO.addPlus(astuce);

    }

    /**
     *
     * @param astuce
     */
    @Override
    public void addMoins(Astuce astuce) {
        astuceDAO.addMoins(astuce);

    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public Astuce getAstuceById(int id) {
        return astuceDAO.getAstuceById(id);
    }

    /**
     *
     * @param id
     */
    @Override
    public void deleteAstuce(int id) {
        astuceDAO.deleteAstuce(id);
    }
}