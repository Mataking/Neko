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
@Table(name = "astuce")
public class Astuce implements Serializable {

    /**
     * contient la liste des getter et setter necessaire pour faire le lien avec
     * la bdd
	 *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id_astuce", unique = true, nullable = false)
    private Integer idastuce;

    @Column(name = "chat_nom", length = 50)
    private String nomchat;
    @Column(name = "user_name", length = 50)
    private String username;
    @Column(name = "commentaire")
    private String commentaire;
    @Column(name = "vote", length = 50)
    private Integer vote;


    /**
     *
     */
    public Astuce() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     *
     * @param nomchat
     * @param username
     * @param commentaire
     * @param vote
     */
    public Astuce(String nomchat, String username, String commentaire, Integer vote) {
        super();
        this.nomchat = nomchat;
        this.username = username;
        this.commentaire = commentaire;
        this.vote = vote;
    }

    /**
     *
     * @return
     */
    public Integer getIdastuce() {
        return idastuce;
    }

    /**
     *
     * @param idastuce
     */
    public void setIdastuce(Integer idastuce) {
        this.idastuce = idastuce;
    }

    /**
     *
     * @return
     */
    public String getNomchat() {
        return nomchat;
    }

    /**
     *
     * @param nomchat
     */
    public void setNomchat(String nomchat) {
        this.nomchat = nomchat;
    }

    /**
     *
     * @return
     */
    public String getUsername() {
        return username;
    }

    /**
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     *
     * @return
     */
    public String getCommentaire() {
        return commentaire;
    }

    /**
     *
     * @param commentaire
     */
    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    /**
     *
     * @return
     */
    public Integer getVote() {
        return vote;
    }

    /**
     *
     * @param vote
     */
    public void setVote(Integer vote) {
        this.vote = vote;
    }
}
