/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.BestDeal.gui;

import edu.BestDeal.dao.AdministrateurDAO;
import edu.BestDeal.entites.Administrateur;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author yakoubi
 */
public class MyTableModel extends AbstractTableModel {

    List<Administrateur> listAdministrateurs = new ArrayList<Administrateur>();
    String []header = {"id","Nom","Prenom","E_mail","Pseudo","mot_de_passe"};

    public MyTableModel() { //remplissage de la liste des Administrateur
        listAdministrateurs=new AdministrateurDAO().DisplayAllAdministrateurs();
    }
    
    public int getRowCount() { //nombre de lignes de la table
        return listAdministrateurs.size();
    }

    public int getColumnCount() { //nombre de colonnes de la table
        return header.length;
    }

    //récupération de chaque élément de la table
    public Object getValueAt(int rowIndex, int columnIndex) { 
        switch (columnIndex) {// parcour par colonne
            case 0://colonne id
                return listAdministrateurs.get(rowIndex).getId();
            case 1://colonne Nom
                return listAdministrateurs.get(rowIndex).getNom();
            case 2://colonne Prenom
                return listAdministrateurs.get(rowIndex).getPrenom();
            case 3://colonne E_mail
                return listAdministrateurs.get(rowIndex).getE_mail();
            case 4://colonne mot de passe
                return listAdministrateurs.get(rowIndex).getMot_de_passe();
             case 5://colonne Pseudo
                return listAdministrateurs.get(rowIndex).getPseudo(); 
           
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) { // nom des colonnes
        return header[column]; 
    }
    

}
