package collectionchallenges.questionthree;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CountFrequencyOfAnElementInArrayList {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList (1, 2, 3, 4, 5, 1, 2, 1);
        int elementToCount = 1;
        int frequency = countFrequency(integerList, elementToCount);
        System.out.println("Frequency of " + elementToCount + " is: " + frequency);
    }
    public static int countFrequency(List<Integer> integerList,int element) {
        return Collections.frequency ( integerList, element );
    }
}
