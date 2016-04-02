package com.nekoatsume.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Mata
 */
@Entity
@Table(name = "tablechat")
public class Chat implements Serializable {

    /**
     * contient la liste des getter et setter necessaire pour faire le lien avec
     * la bdd
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id_chat", unique = true, nullable = false)
    private Integer idChat;

    @Column(name = "NOM", length = 50)
    private String nom;
    @Column(name = "NOM_JAPONAIS", length = 50)
    private String nomJaponais;
    @Column(name = "DESCRIPTION", length = 50)
    private String description;
    @Column(name = "PERSONNALITE", length = 50)
    private String personnalite;
    @Column(name = "NIVEAU")
    private Integer niveau;
    @Column(name = "RARE")
    private Integer rare;
    @Column(name = "VALIDATION")
    private Integer validation;
//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tablechat")
//	private Set<Astuce> astuces = new HashSet<Astuce>(0);

    /**
     *
     * @return
     */
    public Integer getValidation() {
        return validation;
    }

    /**
     *
     * @param validation
     */
    public void setValidation(Integer validation) {
        this.validation = validation;
    }

    /**
     *
     */
    public Chat() {
    }

    /**
     *
     * @param nom
     * @param nomJaponais
     * @param description
     * @param personnalite
     * @param niveau
     * @param rare
     */
    public Chat(String nom, String nomJaponais, String description, String personnalite, Integer niveau,
            Integer rare) {
        this.nom = nom;
        this.nomJaponais = nomJaponais;
        this.description = description;
        this.personnalite = personnalite;
        this.niveau = niveau;
        this.rare = rare;
    }

    /**
     *
     * @return
     */
    public Integer getIdChat() {
        return this.idChat;
    }

    /**
     *
     * @param idChat
     */
    public void setIdChat(Integer idChat) {
        this.idChat = idChat;
    }

    /**
     *
     * @return
     */
    public String getNom() {
        return this.nom;
    }

    /**
     *
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     *
     * @return
     */
    public String getNomJaponais() {
        return this.nomJaponais;
    }

    /**
     *
     * @param nomJaponais
     */
    public void setNomJaponais(String nomJaponais) {
        this.nomJaponais = nomJaponais;
    }

    /**
     *
     * @return
     */
    public String getDescription() {
        return this.description;
    }

    /**
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     */
    public String getPersonnalite() {
        return this.personnalite;
    }

    /**
     *
     * @param personnalite
     */
    public void setPersonnalite(String personnalite) {
        this.personnalite = personnalite;
    }

    /**
     *
     * @return
     */
    public Integer getNiveau() {
        return this.niveau;
    }

    /**
     *
     * @param niveau
     */
    public void setNiveau(Integer niveau) {
        this.niveau = niveau;
    }

    /**
     *
     * @return
     */
    public Integer getRare() {
        return this.rare;
    }

    /**
     *
     * @param rare
     */
    public void setRare(Integer rare) {
        this.rare = rare;
    }

//	public Set<Astuce> getAstuces() {
//		return this.astuces;
//	}
//
//	public void setAstuces(Set<Astuce> astuces) {
//		this.astuces = astuces;
//	}
}
