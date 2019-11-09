import java.util.Arrays; //importation  java.util.Arrays usage des listes
import java.util.HashSet; //importation java.util.HashSet class  mécanisme de hachage
import java.util.Set; //importation jav.util.Set  empêche les doublons
//déclaration de la méthode
public class MergeNames {
    public static String[] uniqueNames(String[] listnames1, String[] listnames2) {
        Set<String> listnames = new HashSet<>(Arrays.asList(listnames1));
        listnames.addAll(Arrays.asList(listnames2));
        return listnames.toArray(new String[0]);
    }
    //méthode principale
    public static void main(String[] args) {
        String[] listnames1 = new String[] {"Ava", "Emma", "Olivia"};//list 1
        String[] listnames2 = new String[] {"Olivia", "Sophia", "Emma"};//list 2
        System.out.println(String.join(", ", MergeNames.uniqueNames(listnames1, listnames2))); // should print Ava, Emma, Olivia, Sophia
    }
}
