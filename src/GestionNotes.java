public class GestionNotes {
    public static void main(String[] args) {
//        Etape 1: En-tete de l'etudiant

        System.out.println("==============================");
//        System.out.print("==============================\n\t RELEVÉ DE NOTES - L2  \t\n==============================");
        System.out.println("     RELEVÉ DE NOTES - L2    ");
        System.out.println("==============================");

//        Etape 2: Déclaration des variables
        String nom = "Ndiaye", prenom = "Awa", matricule = "ISI-2026-0142";
        int age = 20;

//        System.out.printf("Etudiant : %s %s (%d ans)\nMatricule : %s", prenom, nom, age, matricule);
        System.out.print("Etudiant : " + prenom + " "+ nom + " (" + age + " ans)\n" + "Matricule : " + matricule);


    }
}