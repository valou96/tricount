package com.example.testtricount.Models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Tricount implements Serializable {
    private String _titre;
    private String _description;
    private String _devise;
    private Date _date;


    public Tricount(String _titre, String _description) {
        this._titre = _titre;
        this._description = _description;

    }

    public String getTitre() {
        return _titre;
    }

    public void setTitre(String titre) {
        this._titre = titre;
    }

    public String get_description() {
        return _description;
    }

    public void set_description(String _description) {
        this._description = _description;
    }
}
