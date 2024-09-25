
    package com.example.view;

import java.util.List;
import java.util.Scanner;
import com.example.entities.Medecin;
import com.example.entities.Rv;
import com.example.repository.MedecinRepository;
import com.example.repository.database.MedecinRepositoryBDImpl;
import com.example.services.Impl.MedecinServiceImpl;


public class Main {
    public static void main(String[] args) {
        int choix;
        Scanner scanner = new Scanner(System.in);
       

        do {
            System.out.println("Que souhaitez-vous faire:");
            System.out.println("1-Enregistrer un medecin");
            System.out.println("2-Enregistrer un rendez-vous");
            System.out.println("3-lister un rendez-vous");
            System.out.println("4-Afficher un medecin");
            System.out.println("5-filtrer par date");
            System.out.println("6-Quitter");
            choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                    Medecin medecin = new Medecin();
                    System.out.println("Entrer le nom du medecin");
                    medecin.setNom(scanner.nextLine());
                    System.out.println("Entrer le prenom du medecin");
                    medecin.setPrenom(scanner.nextLine());
                    System.out.println("Entrer l'id du rendez-vous");
                    medecin.setIdRv(scanner.nextLine());
                    System.out.println("Entrer la date du rendez-vous");
                    medecin.setDate(scanner.nextLine());
                    System.out.println("Entrer l'heure du rendez-vous");
                    medecin.setHeure(scanner.nextLine());
            
                    break;
                case 2:
                Rv rv = new Rv();
                
                System.out.println("Entrer la date du rendez-vous");
                rv.setDate(scanner.nextLine());
                System.out.println("Entrer l'heure du rendez-vous");
                rv.setDate(scanner.nextLine());
                break;
                case 3:
                
                    break;
                case 4:
                    
                case 5:
                   
                case 6:
                    System.out.println("Au revoir!");
                    break;
                default:
                    break;
            }

        } while (choix != 6);

        scanner.close();
    }

    


    
}
