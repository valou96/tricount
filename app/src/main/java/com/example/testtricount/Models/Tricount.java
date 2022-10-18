package com.example.testtricount.Models;

import java.util.ArrayList;
import java.util.Date;

public class Tricount {
    private String titre;
    private String _description;
    private String _devise;
    private Date _date;


    public Tricount(String titre, String _description) {
        this.titre = titre;
        this._description = _description;

    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String get_description() {
        return _description;
    }

    public void set_description(String _description) {
        this._description = _description;
    }
}
