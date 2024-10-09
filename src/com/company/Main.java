package com.company;

//import com.sun.tools.javac.util.List;

//import java.awt.*;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        //Roman Numerals Encoder
        StringBuilder numerals = new StringBuilder();
        int number = 1669;
        if (number/1000!=0){
          for (int i = 0; i < number/1000; i++)
              numerals.append("M");
        }
        if (number/100%10!=0){
            if (number/100%10<4)
            {
                for (int i = 0; i < number/100%10; i++)
                    numerals.append("C");
            }
            if (number/100%10==4)
            {
                numerals.append("CD");
            }
            if (number/100%10>4&&number/100%10<9)
            {
                numerals.append("D");
                for(int i = 0; i < number/100%10-5; i++)
                    numerals.append("C");
            }
            if (number/100%10==9)
            {
                numerals.append("CM");
            }

        }
        if (number/10%10!=0){
            if (number/10%10<4)
            {
                for (int i = 0; i < number/10%10; i++)
                    numerals.append("X");
            }
            if (number/10%10==4)
            {
                numerals.append("XL");
            }
            if (number/10%10>4&&number/10%10<9)
            {
                numerals.append("L");
                for(int i = 0; i < number/10%10-5; i++)
                    numerals.append("X");
            }
            if (number/10%10==9)
            {
                numerals.append("XC");
            }

        }
        if (number/1%10!=0){
            if (number/1%10<4)
            {
                for (int i = 0; i < number/1%10; i++)
                    numerals.append("I");
            }
            if (number/1%10==4)
            {
                numerals.append("IV");
            }
            if (number/1%10>4&&number/1%10<9)
            {
                numerals.append("V");
                for(int i = 0; i < number/1%10-5; i++)
                    numerals.append("I");
            }
            if (number/1%10==9)
            {
                numerals.append("IX");
            }

        }









        //Find The Parity Outlier
        /*int[] elements = new int[] { 1, 3, 7, 2, 0};
        int evenCounter = 0;
        int oddCounter = 0;

        for (int x: elements) {

            if (x%2==0){
                evenCounter++;
            }
            if (x%2==1){
                oddCounter++;
            }

        }
        if (oddCounter>evenCounter)
            for(int y:elements){
                if(y%2==0)
                    System.out.println(y);
            }
        if (oddCounter<evenCounter)
            for(int y:elements){
                if(y%2==1)
                    System.out.println(y);
            }
        System.out.println("evenCounter = " + evenCounter + "; oddCounter = " + oddCounter);
        System.out.println(-3%2);
        */
        //Delete occurrences of an element if it occurs more than n times
        /*
        int[] elements = new int[] { 1, 1, 3, 3, 7, 2, 2, 2, 2 };
        List<Integer> integerList = Arrays.stream(elements).boxed().toList();
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        List<Integer> deletenthList = new ArrayList<>();
        for (Integer x: integerList) {
            frequencyMap.put(x, frequencyMap.getOrDefault(x,0) + 1);
            if(frequencyMap.getOrDefault(x,0)  < 3)
                deletenthList.add(x);
        }

        //deletenthList.forEach(System.out::print);

        int[] deleteElements = new int[deletenthList.size()];
        for (int i = 0; i < deleteElements.length; i++) {
            deleteElements[i] = deletenthList.get(i);
            System.out.print(deleteElements[i]);
        }
        //System.out.println(frequencyMap);
      // integerList.stream().filter(s -> frequencyMap.containsValue(s) && frequencyMap.containsKey());




        //Map<Integer, Integer> frequency = Arrays.stream(elements).boxed().collect(Collections.singletonMap(Function.identity(), Function.identity()));
            */

        /*elements.
        int maxOccurrences = 3;
        int element = 0;
        for (int i = 0 ; i < elements.length; i++){
            elements[i] = element;
            for (int j = )
            if (elements[i] == 7)
                elements[i].
        }
*/


        /*int nFloors = 3;
        int starCounter = 1;
        char star = '*';
        char space = '_';
        String str = "";
        for (int x = 0; x < nFloors-1; x++)
        starCounter = starCounter+2;
        String[] stringArray = new String[nFloors];
        for (int i = 0; i < nFloors; i++) {
            for (int j = 0; j < starCounter; j++) {
                if (j < starCounter/2-i || j > starCounter/2+i)
                    str+=space;
                else
                str += star;
            }
            if (i!=nFloors-1)
                stringArray[i] = str + ',';
            else
                stringArray[i] = str;
            str = "";

        }
        for (String x: stringArray)
            System.out.println(x);
*/

        /*String str = "aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz";
        int counter = 0;
        for(int i = 0; i < str.length(); i++){
            if (str.charAt(i)<='m')counter++;

        }
        System.out.print(counter + "/" + str.length());*/

    //amounts of x's and o's
        /*String str = "ooxXm";
        str.toLowerCase();
        int xCounter = 0;
        int oCounter = 0;
        char[] charArray = str.toCharArray();

        for(char x: charArray){
            if (x == 'x') xCounter++;
            if (x == 'o') oCounter++;
        }
        boolean xo = xCounter == oCounter;
        System.out.println(xo);*/

        /*morseCode
        int letterCounter = 0;
        int wordCounter = 0;
        int spaceCounter = 0;
        String morseCode = " --  ..-- -- -. ";
        char[] charArray = morseCode.toCharArray();
        for (char x : charArray)
            System.out.print(x);
        System.out.println();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] != ' ') {
                ++letterCounter;
                spaceCounter = 0;
            }
            if (letterCounter > 5) {
                System.out.println(-1);
                break;
            }
            if (charArray[i] == ' ') {
                letterCounter = 0;
               ++spaceCounter;
               if (spaceCounter >= 2){
                   do {
                       i++;
                   }
                   while (charArray[i] == ' ');
                   ++wordCounter;
                   spaceCounter = 0;
               }

            }
        }
        System.out.println(spaceCounter);
        System.out.println(letterCounter);
        System.out.println(wordCounter+1);
*/
    }

}
