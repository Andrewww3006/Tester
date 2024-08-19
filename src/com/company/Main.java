package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
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

    }

}
