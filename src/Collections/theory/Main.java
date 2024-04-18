package Collections.theory;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Card> deck = Card.getStandardDeck();

        Collections.shuffle(deck);
        Card.printDeck(deck);

        List<Integer> integers = new ArrayList<>(List.of(1,2,3,4,5,6,7));
        int[] intarr = {1,2,3,4};
        int indx = Arrays.binarySearch(intarr, 2);
        //System.out.println(intarr[indx]);

        int index = Collections.binarySearch(integers,4);

        //System.out.println(integers.get(index));

        List<Integer> given = new ArrayList<>(List.of(1,1,2,2,3,3,4,4,5,5,6));
        List<Integer> resultList = removeWithSet(given);
        System.out.println(resultList);


    }




    public static <T> List<T> removeDuplicates (List<T> withDuplicates){
        List<T> noDuplicatesList = new ArrayList<>();

        withDuplicates.forEach(el -> {
            if(!noDuplicatesList.contains(el)) noDuplicatesList.add(el);
        });
        return noDuplicatesList;
    }

    public static <T> List<T> removeWithSet(List<T> withDuplicates)
    {
        Set<T> noDuplicatesSet = new LinkedHashSet<>(withDuplicates);
        return new ArrayList<>(noDuplicatesSet);
    }
}
