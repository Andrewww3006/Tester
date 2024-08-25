package com.company;

//import com.sun.tools.javac.util.List;

//import java.awt.*;

public class Main {

    public static void main(String[] args) {

        String[] stringArray = new String[5];
        char sym = '*';
        String str = "";
        for (int i = 0; i < 5; i++) {
            //for (int j = 0; j < i+1; j++)
            int j = 0;


            stringArray[i] = str;
            str = "";
        }
        for (String x: stringArray)
            System.out.println(x);


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
