package me.loule.librarian.module;

        public class User {

        private String Titre;
        private String Resume;
        private String Rangee;
        private String Parution;
        private String Colonne;
        private String Auteur;

        public User (String Titre, String Resume, String Rangee, String Parution,  String Colonne, String Auteur ){
        this.Titre = Titre;
        this.Resume = Resume;
        this.Rangee = Rangee;
        this.Parution = Parution;
        this.Colonne = Colonne;
        this.Auteur = Auteur;
        }
        

                public String getTitre() {
        return Titre;
        }

                public void setTitre(String titre) {
                        Titre = titre;
                }


                public String getResume() {
        return Resume;
        }

                public void setResume(String resume) {
                        Resume = resume;
                }


        public String getRangee() {
        return Rangee;
        }

                public void setRangee(String rangee) {
                        Rangee = rangee;
                }

        public String getParution() {
        return Parution;
        }

                public void setParution(String parution) {
                        Parution = parution;
                }

        public String getolonne() {
        return Colonne;
        }

                public void setColonne(String colonne) {
                        Colonne = colonne;
                }

        public String getAuteur() {
        return Auteur;
        }

                public void setAuteur(String auteur) {
                        Auteur = auteur;
                }
        }


