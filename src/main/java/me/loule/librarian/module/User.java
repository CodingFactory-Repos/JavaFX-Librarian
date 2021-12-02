package me.loule.librarian.module;

public class User {

    private String ColumnTitre;
    private String ColumnResume;
    private String ColumnRangee;
    private String ColumnParution;
    private String ColumnColonne;
    private String ColumnAuteur;

    public User (String ColumnTitre, String ColumnResume, String ColumnRangee, String ColumnParution,  String ColumnColonne, String ColumnAuteur ){
        this.ColumnTitre = ColumnTitre;
        this.ColumnResume = ColumnResume;
        this.ColumnRangee = ColumnRangee;
        this.ColumnParution = ColumnParution;
        this.ColumnColonne = ColumnColonne;
        this.ColumnAuteur = ColumnAuteur;
    }

    public String getColumnTitre() {
        return ColumnTitre;
    }

    public String getColumnResume() {
        return ColumnResume;
    }

    public String getColumnRangee() {
        return ColumnRangee;
    }

    public String getColumnParution() {
        return ColumnParution;
    }

    public String getColumnColonne() {
        return ColumnColonne;
    }

    public String getColumnAuteur() {
        return ColumnAuteur;
    }
}

