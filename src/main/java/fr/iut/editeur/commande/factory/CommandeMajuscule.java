package fr.iut.editeur.commande.factory;

import fr.iut.editeur.commande.CommandeDocument;
import fr.iut.editeur.document.Document;

public class CommandeMajuscule extends CommandeDocument {

    public CommandeMajuscule(Document document,String[] parameters ){
        super(document,parameters);
    }

    @Override
    public void executer(){
        if (parameters.length<3){
            System.err.println("Format attendu : majusculex:debut:fin");
            return ;
        }
        Integer debut = Integer.parseInt(parameters[1]);
        Integer fin = Integer.parseInt(parameters[2]);
        this.document.majuscules(debut,fin);
        super.executer();
    }
}
