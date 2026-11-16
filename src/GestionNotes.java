import java.util.Scanner;

public class GestionNotes {
    public static void main(String[] args) {
        //Declaration des constantes

        final double POIDS1 = 0.4, POIDS12 = 0.6;
        final int COEFALGO = 3, COEFBASED = 2, COEFANG = 1;
        int sommeCoefs = COEFALGO + COEFBASED + COEFANG;

//        Declaration des coefficients
        double devoirAlgo = 0, examAlgo = 0, devoirBd = 0, examBd = 0, devoirAng = 0, examAng = 0;
        double moyenneAglo = 0, moyenneBase = 0, moyenneAng = 0, moyenneGen = 0;

        Scanner clavier = new Scanner(System.in);

//        Etape 1: En-tete de l'etudiant

        System.out.println("==============================");
//        System.out.print("==============================\n\t RELEVÉ DE NOTES - L2  \t\n==============================");
        System.out.println("     RELEVÉ DE NOTES - L2    ");
        System.out.println("==============================");

//        Etape 2: Déclaration des variables et Lecture au clavier

        System.out.print("Prénom : ");
        String prenom = clavier.nextLine();

        System.out.print("Nom : ");
        String nom = clavier.nextLine();

        System.out.print("Age : ");
        int age = clavier.nextInt();
        clavier.nextLine();

        System.out.print("Matricule : ");
        String matricule = clavier.nextLine();

//       5 - Saisie des 3 notes
//        System.out.println("\n===================================");
//        System.out.println("\n   Entrez vos differentes notes    ");
        int i;
        for (i = 0; i < 6; i++) {
            switch (i) {
                case 0:
                    do {
                        System.out.printf("Algorithmique, note de classe:\t");
                        devoirAlgo = clavier.nextDouble();

                        if (0 > devoirAlgo || devoirAlgo > 20) {
                            System.out.printf("Cette note n'est pas valide\n");
                        }
                    } while (0 > devoirAlgo || devoirAlgo > 20);
                    break;

                case 1:
                    do {
                        System.out.printf("Algorithmique, note d'examen:\t");
                        examAlgo = clavier.nextDouble();

                        if (0 > examAlgo || examAlgo > 20) {
                            System.out.printf("Cette note n'est pas valide\n");
                        }
                    } while (0 > examAlgo || examAlgo > 20);
                    break;
                case 2:
                    do {
                        System.out.printf("Base de données, note de classe :\t");
                        devoirBd = clavier.nextDouble();

                        if (0 > devoirBd || devoirBd > 20) {
                            System.out.printf("Cette note n'est pas valide\n");
                        }
                    } while (0 > devoirBd || devoirBd > 20);
                    break;
                case 3:
                    do {
                        System.out.printf("Base de données, note d'examen :\t");
                        examBd = clavier.nextDouble();

                        if (0 > examBd || examBd > 20) {
                            System.out.printf("Cette note n'est pas valide\n");
                        }
                    } while (0 > examBd || examBd > 20);
                    break;
                case 4:
                    do {
                        System.out.printf("Anglais, note de classe :\t");
                        devoirAng = clavier.nextDouble();

                        if (0 > devoirAng || devoirAng > 20) {
                            System.out.printf("Cette note n'est pas valide\n");
                        }
                    } while (0 > devoirAng || devoirAng > 20);
                    break;
                case 5:
                    do {
                        System.out.printf("Anglais, note d'examen :\t");
                        examAng = clavier.nextDouble();

                        if (0 > examAng || examAng > 20) {
                            System.out.printf("Cette note n'est pas valide\n");
                        }
                    } while (0 > examAng || examAng > 20);
                    break;
            }
        }

//        Calcul des moyennes

//        int masse =0;
        moyenneAglo = POIDS1 * devoirAlgo + POIDS12 * examAlgo;
        moyenneBase = POIDS1 * devoirBd + POIDS12 * examBd;
        moyenneAng = POIDS1 * devoirAng + POIDS1 * examAng;

//        La moyenne Generale

        moyenneGen = (double) (moyenneAglo * COEFALGO + moyenneBase * COEFBASED + moyenneAng * COEFANG) / sommeCoefs;

//        Affichage apres la saisie de toutes les imformations sur l'etudiant

//        System.out.printf("Etudiant : %s %s (%d ans)\nMatricule : %s", prenom, nom, age, matricule);
        System.out.println("\nEtudiant : " + prenom + " " + nom + " (" + age + " ans)\n" + "Matricule : " + matricule);

        System.out.println("-----------------------------");
        System.out.printf("Algorithmique (coef %d)    : %.2f\n", COEFALGO, moyenneAglo);
        System.out.printf("Base de données (coef %d)  : %.2f\n", COEFBASED, moyenneBase);
        System.out.printf("Anglais (coef %d)          : %.2f\n", COEFANG, moyenneAng);
        System.out.println("-----------------------------");
        System.out.printf("Moyenne générale       : %.2f\n / 20", moyenneGen);
        
    }
}