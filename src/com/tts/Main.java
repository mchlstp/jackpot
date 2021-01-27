package com.tts;

import java.util.Scanner;

public class Main {




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printNumbers();
        printUpperCaseLetters();
        printLowerCaseLetters();
        String myName = setMyName();
        boolean moveOn = letsContinue();
//        while (moveOn){
//            //question 1
//            //question 2
//            moveOn = letsContinue();
        String carColor = redCar();
        String favPet = petName();
        Integer oldPet = petAge();
        Integer newNum = favNum();
//        String favQb = qB();
        boolean favQb = qB();
        Integer shirtNum = jersNum();
        Integer carNum = carYear();
        String favAct = actName();
        String pickNum = randNum();
        Integer randomNumber1 = shirtNum + carNum + oldPet;
        Integer randomNumber2 = shirtNum + carNum + newNum;
        Integer randomNumber4 = carNum + newNum;
//        Integer randomNumber5 = randomNumber1 - randNum("int");
//        Integer randomNumber3 =
        int randomNumber3 = favPet.charAt(3);
        System.out.println("I'm a psychic!\n You're winning lottery " +
                "numbers are below. \n Do you feel lucky?\n Well... Do " +
                "ya?\n\n\n");
        System.out.printf("You're lottery numbers are: %d %d %d %d",
                randomNumber1, randomNumber2, randomNumber3, randomNumber4 );

    }
//        System.out.println("Here we go, " + myName);


    //ASCII is a 7-bit character set containing 128 characters. It contains the numbers from 0-9, the upper and lower case English letters from A to Z, and some special characters.
//  0-9
    public static void printNumbers() {
//        for(int i = 0; i < 10; i++)
        for(int i = '0';  i <=  '9'; i++)
            System.out.println(i);

    }
    //65 - 90
    public static void printUpperCaseLetters() {
        for(int i = 'A';  i <=  'Z'; i++)
            System.out.println(i);

    }

    //97 to 122
    public static void printLowerCaseLetters() {
        for(int i = 'a';  i <=  'z'; i++)
            System.out.println(i);

    }

    public static String setMyName() {



        Scanner myName = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please enter your name:\n");
        String name = myName.nextLine();
        System.out.println(name + ", I hope you brought your coding " +
                "boots!\n");
        return name;
    }

    public static boolean letsContinue() {



        // Create a Scanner object
        Scanner goOn = new Scanner(System.in);
        System.out.println("Would you like to continue?\n");


        String moveOn = goOn.nextLine();

        if (moveOn.equals ("yes")) {
            System.out.println("Great! Let's continue!\n");
            return true;

        } else {

            System.out.println(" Please return later to complete the survey.");
            System.exit(0);
            return false;


        }

    }

    public static String redCar() {


        Scanner carColor = new Scanner(System.in);  // Create a Scanner
        // object
        System.out.println("Do you have a red car?\n");
        String name = carColor.nextLine();
        System.out.println("Too, bad. Red cars have much horsepower!\n");
        return name;
    }

    public static String petName() {


        Scanner favPet = new Scanner(System.in);  // Create a Scanner
        // object
        System.out.println("What is the name of your favorite pet?\n");
        String name = favPet.nextLine();

        System.out.println(name + "! That's a super nifty name!\n");
        return name;
    }


    public static Integer petAge() {


        Scanner favPet = new Scanner(System.in);  // Create a Scanner
        // object
        System.out.println("How old is that fur baby?\n");
        Integer name = favPet.nextInt();

        System.out.println(name + " is basically 7 in doggo years!\n");
        return name;
    }


    public static Integer favNum() {


        Scanner newNum = new Scanner(System.in);  // Create a Scanner
        // object
        System.out.println("Tell me your lucky number between 1 and 1," +
                "000:\n");
        Integer name = newNum.nextInt();

        System.out.println(name + "!!!????  Much WOW!!! That's my " +
                "favorite number too!\n");
        return name;
    }


    public static boolean qB() {



        // Create a Scanner object
        Scanner moveOn = new Scanner(System.in);
        System.out.println("Do you have a favorite quarterback?\n Please" +
                " enter 'y' or 'n': ");


        String next = moveOn.nextLine();

        if (next.equals ("y")) {
            System.out.println("Cool!\n");
            return true;

        } else {

            System.out.println("That's fine. Let's pretend you picked " +
                    "Tom Brady.\n");
//            System.exit(0);
            return false;


        }

    }

    public static Integer jersNum() {


        Scanner shirtNum = new Scanner(System.in);  // Create a Scanner
        // object
        System.out.println("What's the jersey number?\n");
        Integer name = shirtNum.nextInt();

        System.out.println(name + "? Let's hope your car is newer!\n");
        return name;
    }

    public static Integer carYear() {


        Scanner carNum = new Scanner(System.in);  // Create a Scanner
        // object
        System.out.println("What year is your car? I only need the last " +
                "two digits of the year.\n");
        Integer name = carNum.nextInt();

        System.out.println(name + " is the best year for that car!\n");
        return name;
    }

    public static String actName() {


        Scanner favAct = new Scanner(System.in);  // Create a Scanner
        // object
        System.out.println("What is the first name of your favorite " +
                "actor or actress?\n");
        String name = favAct.nextLine();

        System.out.println(name + " is one of my favorites too!\n");
        return name;
    }

    public static String randNum() {


        Scanner pickNum = new Scanner(System.in);
        System.out.println("Pick a random number between 1 and 50:\n");
        String name = pickNum.nextLine();
        System.out.println(name + "!? OMG! Did you read my mind? That's " +
                "exactly what I was thinking! How bizarre!");
        return name;
    }
























//    public static String qB() {
//
//
//        Scanner favQb = new Scanner(System.in);  // Create a Scanner
//        // object
//        System.out.println("Do you have a favorite Quarterback?\n");
//        String name = favQb.nextLine();
//
//        System.out.println(name + "");
//        return name;
//    }














//    public static int petAge(String petName1) {
//        petName1 = petName.
//
//
//        Scanner oldPet = new Scanner(System.in);  // Create a Scanner
//        // object
//        System.out.println("How old is" + name);
//        Integer petAge = oldPet.nextInt();
//        System.out.println(petAge + ", Is the perfect age!");
//        return name;
//    }

}


















////single line comment
///*
//*
//* Multi line comment
//*
//*
//*
//*
//* */
////Below is a class
////it is the blueprint for objects in java
////everything in java is in a class
//public class Main {
////below is my main maethod
////    this serves as my entry point
////    my interpreter will look for this method to have acces to my PROGRAM
//    private static int myInt = 4;
//    public int myOtherInt = 5;
//public static void main(String[] args) {
//	System.out.println("Hello World");
//    System.out.println(myInt);
////Main() is calling the contructor which gives us a new instance
//    Main myMain = new Main();
////    below is a function of java, but we will call it a method moving forward
////    strictly speaking - methods are functions that live on objects
//    System.out.println(myMain.myOtherInt);
//    }
//}
