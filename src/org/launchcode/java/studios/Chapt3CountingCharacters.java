package org.launchcode.java.studios;

import java.util.HashMap;
import java.util.Map;

public class Chapt3CountingCharacters {
    public static void main(String[] args) {
        String hiddenFigures = "If the product of two terms is zero " +
                "then common sense says at least one of the two terms " +
                "has to be zero to start with. So if you move all the " +
                "terms over to one side, you can put the quadratics " +
                "into a form that can be factored allowing that side " +
                "of the equation to equal zero. Once you’ve done that, " +
                "it’s pretty straightforward from there.";

        char[] charactersInString = hiddenFigures.toCharArray();

        HashMap<Character, Integer> charCount = new HashMap<>();

        for (int i = 0; i < charactersInString.length; i++) {
            Integer count = 0;
            char c = charactersInString[i];

            if (charCount.containsKey(charactersInString[i])) {
                charCount.put(c, charCount.get(c) + 1);
            } else {
                charCount.put(c, 1);
            }
            }
            for (Map.Entry<Character, Integer> countChar : charCount.entrySet()) {
                System.out.println(countChar.getKey() + ": " + countChar.getValue());


        }


    }
}
