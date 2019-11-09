//corrélation entre les importations
import java.util.HashMap; //importation java.util.hashMap
import java.util.Map; //importation java.util.Map

public class TwoSum {
    public static int[] findTwoSum(int[] list, int sum) {
        if (list == null || list.length < 2 || sum < 1) return null; //définition de la condition
        //indexation 
        final Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < list.length; i++) {
            int numb = sum - list[i];
            if (indexMap.get(numb) != null) {
                return new int[]{i, indexMap.get(numb)};
            }
            indexMap.put(list[i], i);//tri de la collection pour empêcher les éventuelles
        }
        //résultat si rien retourner null
        return null;
    }
   public static void main(String[] args) {
        int[] indices = findTwoSum(new int[]{1, 3, 5, 7, 9}, 10);
        if (indices != null) {
            System.out.println(indices[0] + " " + indices[1]);// renvoie les valeurs 0 et 1 du tableau c'est à dire 1 et 3
        }
    }
}
