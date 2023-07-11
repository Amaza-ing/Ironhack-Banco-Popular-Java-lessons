package com.ironhack.w1.d2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        ARRAYS

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(days);
        System.out.println(days[0]);
        System.out.println(Arrays.toString(days));
        Arrays.sort(days);
        System.out.println(Arrays.toString(days));

        String[] subjectsArray = createSubjectsArray();
        System.out.println(subjectsArray[2]);
        System.out.println(subjectsArray.length);


//        FOR LOOP

        for (int i = 0; i < subjectsArray.length; i++) {
//            if (subjectsArray[i].equals("Language")) continue;
            System.out.println(i + " " + subjectsArray[i]);
//            if (subjectsArray[i].equals("History")) break;
        }



    }

    public static String[] createSubjectsArray() {
        String[] subjects = new String[5];
        subjects[0] = "Math";
        subjects[1] = "Language";
        subjects[2] = "History";
        subjects[3] = "Biology";
        subjects[4] = "Chemistry";

        return subjects;
    }
}
