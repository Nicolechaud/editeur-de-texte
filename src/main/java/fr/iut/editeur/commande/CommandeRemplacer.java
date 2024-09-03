package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeRemplacer extends CommandeDocument{

    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);}

    public void executer() {
        if(parameters.length < 4) {
            System.err.println("Format attendu : remplacer;debut;fin;chaine");
            return;
        }
        int debut = Integer.parseInt(parameters[1]);
        int fin = Integer.parseInt(parameters[2]);

        this.document.remplacer(debut,fin,parameters[3]);
        super.executer();
    }
}
