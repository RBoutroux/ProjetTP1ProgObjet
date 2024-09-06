package com.mycompany.priseenmain;

import java.util.Scanner;

/**
 *
 * @author Jean-Marie Normand <jean-marie.normand@ec-nantes.fr>
 */
// Rappel fichier .java doit toujours avoir le meme nom que la classe Java qu'il contient
// Rappel 2 : 1 fichier .java = 1 classe normalement

public class PriseEnMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner va permettre de lire au clavier des informations
        // c'est une classe du package java.util
        Scanner sc;

        System.out.println("Entrez un mois sous forme de nombre (p. ex. : 1 pour Janvier, etc.)");
        // on cree un Scanner qui est relie au clavier !
        // on va ainsi attendre que l'utilisateur entre une information puis appuie sur 'Enter'
        sc = new Scanner(System.in);
        // on recupere le dernier entier entre par l'utilisateur au clavier
        // si l'utilisateur ne rentre pas d'entier --> Exception et arret du programme (on verra ca en cours)
        int month = sc.nextInt();

        if (month % 2 == 0) { 
            System.out.println("Le mois est Pair");
        } else {
            System.out.println("Le mois est Impair");
        }

        // choix selon affichant le nom du mois en fonction de son numéro
        switch (month) {
            case 1:
                System.out.println("Janvier");
                break;
            case 2:
                System.out.println("Fevrier");
                break;
            case 3:
                System.out.println("Mars");
                break;
            case 4:
                System.out.println("Avril");
                break;
            case 5:
                System.out.println("Mai");
                break;
            case 6:
                System.out.println("Juin");
                break;
            case 7:
                System.out.println("Juillet");
                break;
            case 8:
                System.out.println("Aout");
                break;
            case 9:
                System.out.println("Septembre");
                break;
            case 10:
                System.out.println("Octobre");
                break;
            case 11:
                System.out.println("Novembre");
                break;
            case 12:
                System.out.println("Decembre");
                break;
            default:
                System.out.println("Mois invalide !");
                break;
        }

        // boucle "tant que" qui calcule le temps restant jusqu'au nouvel an
        int j=0;
        int i = month;
        while (i != 12) {
            i += 1;
            j++;
            System.out.println("Calcul nombre mois jusqu'au nouvel an...");
        }

        System.out.println("Nombre de mois jusqu'au nouvel an : " + j);
        
        
        // Utilisation d'un tableau
        int tab[] = new int[10];
        System.out.println("S'il vous plait entrez 10 nombres les uns apres les autres");
        for(int k=0; k<10; k++) {
            System.out.println("nombre ?");
            // on reutilise le scanner pour lire au clavier des entiers
            tab[k] = sc.nextInt();
            System.out.println("Vous venez d'entrer : "+tab[k]);
        }
        

        // Creation d'objets en utilisant la classe 'Compteur'
        Compteur monCompteur;
        monCompteur = new Compteur();
        monCompteur.compte(5);
        int cpt = monCompteur.getCompteur();
    }

}