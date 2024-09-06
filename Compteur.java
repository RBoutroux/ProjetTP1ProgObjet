package com.mycompany.priseenmain;

/**
 *
 * @author Jean-Marie Normand <jean-marie.normand@ec-nantes.fr>
 */
public class Compteur {

    /**
     * Attribut de la classe de type entier s'appelant 'compteur'
     */
    public int compteur;

    public void setCompteur(int compteur) {
        this.compteur = compteur;
    }

    Compteur() {
        compteur = 0;
    }

    Compteur(int c) {
        //equivalent a 
        // compteur.c;
        this.compteur = c;
    }

    /**
     *
     * @param max
     */
    public void compte(int max) {
        if (max <= 0) {
            compteur = -1;
        } else {
           // On stocke la valeur dans l'attribut
           this.compteur=max;
           
           // Appel de la methode d'affichage
           this.affiche();
           // equivalent a
           // affiche();
           
           System.out.println("Je debute le comptage");
            int i = 0;
            while (i < this.compteur) {
                i += 1;
               System.out.println(i);
            }
           System.out.println("Fin du comptage");
        }
    }

   
   public void affiche() {
      System.out.println("Je suis un compteur !");
      System.out.println("Mon but est de compter jusqu'a la valeur de mon compteur qui vaut : "+this.compteur);
      // j'aurais aussi pu ecrire "[...] qui vaut : "+compteur
   }
    
    
    
    public int maMethodeIllisible(int a, int b) {
        int res = 0;
        if ((a > 2) || (b < 8)) {
            for (int i = 0; i < a + b * 4; i++) {
                res += i + 2 * a;
                if (res > 25) {
                    res -= 2;
                }
            }
        } else {
            res = 4;
        }
        return res;
    }
    
    public int maMethodeLisible(int a, int b) {
        int res = 0;
        if ((a > 2) || (b < 8)) {
            for (int i = 0; i < a + b * 4; i++) {
                res += i + 2 * a;
                if (res > 25) {
                    res -= 2;
                }
            }
        } else {
            res = 4;
        }
        return res;
    }
    
    
    /**
     * Accesseur a l'attribut 'compteur'
     * @return la valeur de l'attribut 'compteur'
     */
    public int getCompteur() {
        return this.compteur;
        // equivalent a
        // return compteur;
    }
}
