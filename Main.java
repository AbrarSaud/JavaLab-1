import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

/*  Q1 Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of
    two numbers , takes two numbers as input */
        System.out.println("*************************");
        System.out.println("--- Math ---");
        System.out.print("Please enter first number: ");
        int first_num_Q1 = input.nextInt();
        System.out.print("Please enter second number: ");
        int second_num_Q1 = input.nextInt();
        int sum = (first_num_Q1 + second_num_Q1);
        int subtract = (first_num_Q1 - second_num_Q1);
        int multiply = (first_num_Q1 * second_num_Q1);
        int divide = (first_num_Q1 / second_num_Q1);
        int mod = (first_num_Q1 % second_num_Q1);
//        math operations
        System.out.println(first_num_Q1 + " + " + second_num_Q1 + " = " + sum);
        System.out.println(first_num_Q1 + " - " + second_num_Q1 + " = " + subtract);
        System.out.println(first_num_Q1 + " * " + second_num_Q1 + " = " + multiply);
        System.out.println(first_num_Q1 + " / " + second_num_Q1 + " = " + divide);
        System.out.println(first_num_Q1 + " mod " + second_num_Q1 + " = " + mod);
//      Q 2 Write a Java program that takes a number as input and prints its multiplication table up to 10
        System.out.println("*************************");
        System.out.println("--- multiplication ---");
        System.out.print("Please enter  number: ");
        int num_of_Q2 = input.nextInt();
        int sum_of_Q2 = 1;
//         Loop to multiplication table (from 1 to 10)
        for (int i = 1; i <= 10; i++) {
            sum_of_Q2 = num_of_Q2 * i; // // Multiply the number by i
            System.out.println(num_of_Q2 + " x " + i + " = " + sum_of_Q2);
        }
//       Q3 Write a Java program to print the area and perimeter of a circle.
        System.out.println("*************************");
        System.out.println("--- Area and Perimeter of a circle ---");
        System.out.print("Please enter  Radius: ");
        double radius_circle = input.nextDouble();
        double perimeter_circle = 2 * Math.PI * radius_circle; //  Calculate perimeter
        double area_circle = Math.PI * radius_circle * radius_circle; //  // Calculate area
        System.out.println("Perimeter is = " + perimeter_circle);
        System.out.println("Area is = " + area_circle);
//       Q4 Java program to find out the average of a set of integers
        System.out.println("*************************");
        System.out.println("--- Average ---");
        System.out.print("Please enter  count of numbers: ");
        int count = input.nextInt();
        int num_of_Q4;
        double sum_of_Q4 = 0;
//         Loop to take multiple numbers as input
        for (int i = 1; i <= count; i++) {
            System.out.print("Enter an integer " + (i) + " :");
            num_of_Q4 = input.nextInt();
            sum_of_Q4 += num_of_Q4; // Add the number to the sum
        }
        System.out.print("The average is: " + sum_of_Q4 / count);
/*      Q5 Write a Java program that accepts three integers as input, adds the first two integers
          together, and then determines whether the sum is equal to the third integer*/
        System.out.println("*************************");
        System.out.println("---  IF Sum Equals Third Integer ---");
        System.out.print("Please enter first number: ");
        int first_num_Q2 = input.nextInt();
        System.out.print("Please enter second number: ");
        int second_num_Q2 = input.nextInt();
        System.out.print("Please enter third number ");
        int third_num_Q2 = input.nextInt();
        // Check if the sum of the  two numbers equals the third
        if ((first_num_Q2 + second_num_Q2) == third_num_Q2) {
            System.out.print("The result is: " + true);
        } else {
            System.out.print("The result is: " + false);
        }
//        Q6  Write a Java program to reverse a word.
        System.out.println("*************************");
        System.out.println("---  Reverse  Word ---");
        System.out.print("Please enter word: ");
        String word = input.nextLine();
        String reversed = "";
//         Loop through the word from the last character to the first
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i); // // Add each character to the reversed string
        }
        System.out.println("Reversed Word: " + reversed);
//      Q7  Java program to check whether the given number is even or odd
        System.out.println("*************************");
        System.out.println("--- even number  / odd number   ---");
        System.out.print("Please enter  number  : ");
        int num_Q7 = input.nextInt();
//         Check if the number is even or odd
        if (num_Q7 % 2 != 0) {
            System.out.println("This number ( " + num_Q7 + " ) is Odd");
        } else {
            System.out.println("This number ( " + num_Q7 + " ) is Even");

        }
//        Q8 Java program to convert the temperature in Centigrade to Fahrenheit
        System.out.println("*************************");
        System.out.println("--- Convert Centigrade (°C) to Fahrenheit (°F)  ---");
        System.out.print("Please enter temperature in Centigrade : ");
        int centigrade = input.nextInt();
        double fahrenheit = centigrade * (1.8) + 32; // Convert Celsius to Fahrenheit
        System.out.println("Temperature in Fahrenheit is: " + String.format("%.1f", fahrenheit) + " °F");
//        Q9 Write a Java program that takes a string and a number from the user,then prints the character in the given index.
        System.out.println("*************************");
        System.out.println("--- index ---");
        System.out.print("Please enter Staring: ");
        String str_Q9 = input.nextLine();
        System.out.print("Please enter (number) index: ");
        int index = input.nextInt();
//         Check if index is within the valid range
        if (index >= 0 && index < str_Q9.length()) {
            System.out.println("The character at index " + index + " is: " + str_Q9.charAt(index));
        } else {
            System.out.println("Error!!");
        }
//       Q 10  Write a Java program to print the area and perimeter of a rectangle.
        System.out.println("*************************");
        System.out.println("--- Area and Perimeter of a rectangle ---");
        double width = 5.5, height = 8.5;
        double area_rectangle = width * height;
        double perimeter_rectangle = 2 * (width + height);
        System.out.println("Area is " + width + " * " + height + " = " + area_rectangle);
        System.out.println("perimeter is  2 * ( " + width + " + " + height + " ) = " + perimeter_rectangle);
//      Q 11 Write a Java program to compare two numbers.
        System.out.println("*************************");
        System.out.println("--- compare ---");
        System.out.print("Please enter first number: ");
        int first_num_Q11 = input.nextInt();
        System.out.print("Please enter second number: ");
        int second_num_Q11 = input.nextInt();
        System.out.println(first_num_Q11 + " !=" + second_num_Q11);
        System.out.println(first_num_Q11 + " < " + second_num_Q11);
        System.out.println(first_num_Q11 + " <= " + second_num_Q11);
//      Q 12 Write a Java program to convert seconds to hours, minutes and seconds.
        System.out.println("*************************");
        System.out.println("--- Time ---");
        System.out.print("Input seconds:");
        int num_Q12 = input.nextInt();
        int hours = num_Q12 / 60, minutes = hours % 60, seconds = num_Q12 % 60; // Convert Time
        hours = hours / 60;
        System.out.print("The Time is ( " + hours + ":" + minutes + ":" + seconds + " )");
//       Q13  Write a Java program that accepts four integers from the user and prints equal if all four are equal, and not equal otherwise.
        System.out.println("*************************");
        System.out.println("--- Numbers equal  OR not---");
        System.out.print("Input first number: ");
        int first_num_Q13 = input.nextInt();
        System.out.print("Input second number: ");
        int second_num_Q13 = input.nextInt();
        System.out.print("Input third number: ");
        int third_num_Q13 = input.nextInt();
        System.out.print("Input fourth number: ");
        int fourth_num_Q13 = input.nextInt();
        // Check if all numbers are equal
        if (first_num_Q13 == second_num_Q13 && second_num_Q13 == third_num_Q13 && third_num_Q13 == fourth_num_Q13) {
            System.out.println("Numbers are equal!");
        } else {
            System.out.println("Numbers are not equal!");
        }
//      Q14 Write a Java program that reads an integer and check whether it is negative, zero, or positive
        System.out.println("*************************");
        System.out.println("--- Numbers equal  OR not---");
        System.out.print("Please enter first number(s negative, zero, or positive): ");
        int num_Q14 = input.nextInt();
        // Check if the number is positive, negative, or zero
        if (num_Q14 > 0) {
            System.out.println("Number is positive");
        } else if (num_Q14 < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }
/*        Q15 Write a program to enter the numbers till the user wants and at the end it
          should display the count of positive, negative and zeros entered (End loop use -1 ,  Don’t count -1)*/
        int num_Q15;
        int positiveSum = 0, negativeSum = 0, zerosSum = 0;
        System.out.println("--- count of positive, negative and zeros ---");
        do {
            System.out.print("Please enter  number  or ( -1 ) to exit : ");
            num_Q15 = input.nextInt();
            if (num_Q15 > 0) {
                positiveSum++;
            } else if (num_Q15 < 0 && num_Q15 != -1) {
                negativeSum++;
            } else if (num_Q15 == 0) {
                zerosSum++;
            }
        } while (num_Q15 != -1);
        System.out.println(" The  sum of positives number: " + positiveSum);
        System.out.println(" The sum of zeros number : " + zerosSum);
        System.out.println(" The sum of negatives number : " + negativeSum);
//         Q16 Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
        System.out.println("*************************");
        System.out.println("--- Reverse of number ---");
        System.out.print("Please enter  number :");
        int num_Q16 = input.nextInt();
        int reverse_num = 0;
        while (num_Q16 > 0) {
            reverse_num = reverse_num * 10 + num_Q16 % 10; // /Extracts the last digit and adds it to the "reverse_num"
            num_Q16 = num_Q16 / 10; // removes the last digit
        }
        System.out.println("reverse of number " + reverse_num);
//       Q17 Write a program to enter the numbers till the user wants and at the end the program should display the largest and smallest numbers entered.
        System.out.println("*************************");
        System.out.println("---  smallest OR large ---");
        int num_Q17;
        int smallest = 0, large = 0;
        do {
            System.out.print("Please enter  number or 0  to exit : ");
            num_Q17 = input.nextInt();
            //comparing each time entered number with "large" one
            if (num_Q17 > large) {
                large = num_Q17;

            }
            //comparing each time entered number with "smallest" one
            if (num_Q17 < smallest) {
                smallest = num_Q17;
            }
        } while (num_Q17 != 0);
        System.out.println("the largest is:" + large);
        System.out.println("Smallest no is : " + smallest);
        //      Q18 Determine and print the number of times the character ‘a’ appears in the input entered by the user
        System.out.println("*************************");
        System.out.println("---  smallest OR large ---");
        System.out.print("Please enter a word: ");
        String word_Q18 = input.nextLine();
        System.out.print("Please enter character: ");
        char character = input.next().charAt(0);
        int res = 0;
        for (int i = 0; i < word_Q18.length(); i++) {
            // checking character in string
            if (word_Q18.charAt(i) == character) {
                res++;
            }
        }
        System.out.print("Number of " + character + "'s : " + res);

    }
}



