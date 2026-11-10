import java.util.Scanner;

public class GestionNotes {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

//        Etape 1: En-tete de l'etudiant

        System.out.println("==============================");
//        System.out.print("==============================\n\t RELEVÉ DE NOTES - L2  \t\n==============================");
        System.out.println("     RELEVÉ DE NOTES - L2    ");

//        Etape 2: Déclaration des variables et Lecture au clavier

        System.out.print("Entrez votre prénom : ");
        String prenom = clavier.nextLine();

        System.out.print("Entrez votre nom : ");
        String nom = clavier.nextLine();

        System.out.print("Entrez votre age : ");
        int age = clavier.nextInt();
        clavier.nextLine();

        System.out.print("Entrez votre matricule : ");
        String matricule = clavier.nextLine();


//        System.out.printf("Etudiant : %s %s (%d ans)\nMatricule : %s", prenom, nom, age, matricule);
        System.out.print("\nEtudiant : " + prenom + " "+ nom + " (" + age + " ans)\n" + "Matricule : " + matricule);


    }
}