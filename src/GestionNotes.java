import java.util.Scanner;

public class GestionNotes {
    public static void main(String[] args) {
        final double poids1 = 0.4, poids2 = 0.6;
        final int coef_algo = 3, coef_based = 2, coef_ang = 1;

        int sommeCoefs = coef_algo + coef_based + coef_ang;

        double algo_classe = 0, algo_exam = 0, based_classe = 0, based_exam = 0, ang_class = 0, ang_exam = 0;
        double moyenneAglo =0, moyenneBase=0, moyenneAng=0, moyenneGen = 0;

        Scanner clavier = new Scanner(System.in);

//        Etape 1: En-tete de l'etudiant

        System.out.println("==============================");
//        System.out.print("==============================\n\t RELEVÉ DE NOTES - L2  \t\n==============================");
        System.out.println("     RELEVÉ DE NOTES - L2    ");
        System.out.println("==============================");

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

//       5 - Saisie des 3 notes
        System.out.println("\n===================================");
        System.out.println("    Entrez vos differentes notes    ");
        int i;
        for (i = 0; i < 6; i++) {
            switch (i) {
                case 0:
                    do {
                        System.out.printf("Note de classe d'algo:\t");
                        algo_classe = clavier.nextDouble();

                        if (0 > algo_classe || algo_classe > 20) {
                            System.out.printf("Cette note n'est pas valide\n");
                        }
                    } while (0 > algo_classe || algo_classe > 20);
                    break;

                case 1:
                    do {
                        System.out.printf("Note d'examen d'algo:\t");
                        algo_exam = clavier.nextDouble();

                        if (0 > algo_exam || algo_exam > 20) {
                            System.out.printf("Cette note n'est pas valide\n");
                        }
                    } while (0 > algo_exam || algo_exam > 20);
                    break;
                case 2:
                    do {
                        System.out.printf("Note de classe SGBD:\t");
                        based_classe = clavier.nextDouble();

                        if (0 > based_classe || based_classe > 20) {
                            System.out.printf("Cette note n'est pas valide\n");
                        }
                    } while (0 > based_classe || based_classe > 20);
                    break;
                case 3:
                    do {
                        System.out.printf("Nbased_exam SGBD:\t");
                        based_exam = clavier.nextDouble();

                        if (0 > based_exam || based_exam > 20) {
                            System.out.printf("Cette note n'est pas valide\n");
                        }
                    } while (0 > based_exam || based_exam > 20);
                    break;
                case 4:
                    do {
                        System.out.printf("Note de classe Anglais:\t");
                        ang_class = clavier.nextDouble();

                        if (0 > ang_class || ang_class > 20) {
                            System.out.printf("Cette note n'est pas valide\n");
                        }
                    } while (0 > ang_class || ang_class > 20);
                    break;
                case 5:
                    do {
                        System.out.printf("Note d'examen Anglais:\t");
                        ang_exam = clavier.nextDouble();

                        if (0 > ang_exam || ang_exam > 20) {
                            System.out.printf("Cette note n'est pas valide\n");
                        }
                    } while (0 > ang_exam || ang_exam > 20);
                    break;
            }
        }

//        Calcul des moyennes

        moyenneAglo = poids1 * algo_classe + poids2 * algo_exam;
        moyenneBase = poids1 * based_classe + poids2 * based_exam;
        moyenneAng = poids1 * ang_class + poids2 * ang_exam;

//        La moyenne Generale

        moyenneGen = (double) (moyenneAglo*coef_algo + moyenneBase*coef_based + moyenneAng*coef_ang)/sommeCoefs;

        System.out.println("\n===================================");
        System.out.println("        Affichage des Moyennes");
        System.out.println("Moyenne Algo: " + moyenneAglo + "\nMoyenne SGBD: " + moyenneBase + "\nMoyenne Anglais: " + moyenneAng + "\nMoyenne General: " + moyenneGen);

//        System.out.printf("Etudiant : %s %s (%d ans)\nMatricule : %s", prenom, nom, age, matricule);
        System.out.print("\nEtudiant : " + prenom + " " + nom + " (" + age + " ans)\n" + "Matricule : " + matricule);


    }
}