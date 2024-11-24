import java.lang.reflect.Array;
import java.util.*;
import javax.swing.RowFilter.Entry;

// To get the input from user and print it
/*public class App {
    public static void main(String[] args) throws Exception {
        // Take input and print it
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter something");
        String userInput = scanner.nextLine();
        scanner.close();
        System.out.println("You entered " + userInput);
    }
}*/

// To get the integer as input and print it
/*public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number");
        int number = scanner.nextInt();
        scanner.close();
        System.out.println("The number you entered is: " + number);
    }
}*/

// get the sentence input and print it
/*public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sentence");
        String sentence = scanner.nextLine();
        scanner.close();
        System.out.println("You entered " + sentence);
    }
}*/

// get the number as input and print the last digit of a number
/*public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        scanner.close();
        int lastDigit = number % 10;
        System.out.println(lastDigit);
    }
}*/

// print the 4th letter of a name
/*public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
        String name = scanner.nextLine();
        scanner.close();
        if (name.length() >= 4) {
            char fourthLetter = name.charAt(3);
            System.out.println(fourthLetter);
        } else {
            System.out.println("Invalid name");
        }
    }
}*/

// perform the basic operations for 2 numbers
/*public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers");
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int num1 = Integer.parseInt(numbers[0]);
        int num2 = Integer.parseInt(numbers[1]);
        scanner.close();

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num2 != 0 ? num1 / num2 : Integer.MAX_VALUE;

        System.out.println(sum);
        System.out.println(difference);
        System.out.println(product);
        System.out.println(quotient);
    }
}*/

// print second-to-lastdigit of a number
/*public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ");
        int number = scanner.nextInt();
        scanner.close();
        String numString = String.valueOf(number);
        if (numString.length() < 2) {
            System.out.println("Invalid number");
        } else {
            char secondToLastDigit = numString.charAt(numString.length() - 2);
            System.out.println(secondToLastDigit);
        }
    }
}*/

// Sum of second-to-last digits of 2 numbers
/*public class App {

    public static int getSecondToLastDigit(int num) {
        if (num < 10) {
            return -1;
        } else {
            return (num / 10) % 10;
        }
    }

    public static int sumSecondToLastDigit(int num1, int num2) {
        int digit1 = getSecondToLastDigit(num1);
        int digit2 = getSecondToLastDigit(num2);
        if (digit1 == -1 || digit2 == -1) {
            return -1;
        } else {
            return digit1 + digit2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        // Calculate and display result
        int result = sumSecondToLastDigit(num1, num2);
        if (result == -1) {
            System.out.println("Invalid number");
        } else {
            System.out.println(result);
        }
        scanner.close();
    }
}*/

// post decimal number
/*public class App {

    public static char findDigitAfterDecimal(String decimalNumber) {
        int decimalPointIndex = decimalNumber.indexOf('.');
        if (decimalPointIndex == -1 || decimalPointIndex == decimalNumber.length() - 1) {
            return ' ';
        } else {
            return decimalNumber.charAt(decimalPointIndex + 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ");
        String decimalNumber = scanner.nextLine();
        char digitAfterDecimal = findDigitAfterDecimal(decimalNumber);
        if (digitAfterDecimal != ' ') {
            System.out.println(digitAfterDecimal);
        } else {
            System.out.println("No digit");
        }
        scanner.close();
    }
}*/

// Swap 2 numbers
/*public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println(num1 + " " + num2);
        scanner.close();
    }
}*/

// Left shift and Right shift of a given number
/*public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int num = scanner.nextInt();
        int leftShift = num << 1;
        int rightShift = num >> 1;
        System.out.println("Left Shifted: " + leftShift);
        System.out.println("Right Shifted: " + rightShift);
        scanner.close();
    }
}*/

// Whether a number is odd or even
/*public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int num = scanner.nextInt();
        if(num%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        scanner.close();
    }
}*/

// Print Area and Perimeter for the given radius
/*public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ");
        double radius = scanner.nextDouble();
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        System.out.printf("Perimeter: %.4f%n", perimeter);
        System.out.printf("Area: %.4f%n", area);
        scanner.close();
    }
}*/

// ASCII value of a number
/*public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" ");
        int num = scanner.nextInt();
        if (num >= 0 && num <= 127) {
            char asciiChar = (char) num;
            System.out.println("ASCII equivalent: " + asciiChar);
        } else {
            System.out.println("Invalid");
        }
        scanner.close();
    }
}*/

// Eligibility for vote
/*public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age");
        int age = scanner.nextInt();
        if (age < 18) {
            System.out.print("Not Eligible");
        } else {
            System.out.print("Eligible");
        }
        scanner.close();
    }
}*/

// Character is Vowel or not
/*public class App {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Character");
        char ch = scanner.next().charAt(0);
        ch = Character.toLowerCase(ch);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.print("True");
        } else {
            System.out.print("False");
        }
        scanner.close();
    }
}*/

// Positive or Negative
/*public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number");
        int num = scanner.nextInt();
        if (num < 0) {
            System.out.print("negative");
        } else {
            System.out.print("positive");
        }
        scanner.close();
    }
}*/

// Number divisible by 3 and 5 or not
/*public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" ");
        int num = scanner.nextInt();
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.print("Divisible");
        } else {
            System.out.print("Not Divisible");
        }
        scanner.close();
    }
}*/

// 1st and last letter are vowels or not
/*public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" ");
        String word = scanner.nextLine();
        scanner.close();
        char firstChar = word.charAt(0);
        char lastChar = word.charAt(word.length() - 1);
        boolean isFirstVowel = isVowel(firstChar);
        boolean isLastVowel = isVowel(lastChar);
        if (isFirstVowel && isLastVowel) {
            System.out.print("Vowel");
        } else {
            System.out.print("Not Vowel");
        }
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }
}*/

// Alphabet or not
/*public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" ");
        char ch = scanner.next().charAt(0);
        scanner.close();
        boolean isAlphabet = isAlphabet(ch);
        if (isAlphabet) {
            System.out.print("Alphabet");
        } else {
            System.out.print("Not Alphabet");
        }
    }

    public static boolean isAlphabet(char ch) {
        return ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'));
    }
}*/

// Greater of the post decimal numbers
/*public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        scanner.close();
        int firstDigit = postDecimal(num1);
        int secondDigit = postDecimal(num2);
        if (firstDigit == secondDigit) {
            System.out.println("The numbers are equal");
        } else if (firstDigit > secondDigit) {
            System.out.println(firstDigit);
        } else {
            System.out.println(secondDigit);
        }
    }

    public static int postDecimal(double num) {
        String numAsString = Double.toString(num);
        int decimalIndex = numAsString.indexOf('.');
        if (decimalIndex != -1 && decimalIndex != numAsString.length() - 1) {
            return Character.getNumericValue(numAsString.charAt(decimalIndex + 1));
        } else {
            return 0;
        }
    }
}*/

// Leap year or not
/*public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" ");
        int year = scanner.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.print("leap year");
        } else {
            System.out.print("not leap year");
        }
        scanner.close();
    }
}*/

// Nature of roots
/*public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Numbers");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double discriminant = b * b - 4 * a * c;
        if(a==0){
            System.out.print("Invalid Input");
        }
        else if (discriminant > 0) {
            System.out.print("Real and distinct");
        } else if (discriminant == 0) {
            System.out.print("Real and Equal");
        } else if (discriminant < 0) {
            System.out.print("Complex");
        }
        scanner.close();
    }
}*/

// Greatest of 4 numbers
/*public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input four integers
        System.out.print("Enter four integers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        // Check for uniqueness
        if (a != b && b != c && c != d) {
            // Check for the greatest number
            if (a > b && a > c && c > d) {
                System.out.print(a + " ");
            } else if (b > c && b > d) {
                System.out.print(b + " ");
            } else if (c > d) {
                System.out.print(c + " ");
            } else {
                System.out.print(d + " ");
            }
        } else if (a == b && b == c && c == d) {
            // All numbers are equal
            System.out.print(a + " ");
        } else if (c == d) {
            // Last two numbers are equal
            System.out.print(c + " ");
        }

        scanner.close();
    }
}*/

// Day of week
/*public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number");
        int num = scanner.nextInt();
        if (num == 1) {
            System.out.println("Monday");
        } else if (num == 2) {
            System.out.println("Tuesday");
        } else if (num == 3) {
            System.out.println("Wednesday");
        } else if (num == 4) {
            System.out.println("Thursday");
        } else if (num == 5) {
            System.out.println("Friday");
        } else if (num == 6) {
            System.out.println("Saturday");
        } else if (num == 7) {
            System.out.println("Sunday");
        }
        scanner.close();
    }
}*/

// Print grades based on scores --- 2 test cases pending
/*public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Score");
        int score = scanner.nextInt();
        scanner.close();
        if (score >= 0 && score <= 39) {
            System.out.println("F");
        } else if (score >= 40 && score <= 50) {
            System.out.println("D");
        } else if (score >= 51 && score <= 60) {
            System.out.println("C");
        } else if (score >= 61 && score <= 70) {
            System.out.println("B");
        } else if (score >= 71 && score <= 80) {
            System.out.println("A");
        } else if (score >= 81 && score <= 100) {
            System.out.println("S");
        }
    }
}*/

// Message based on the temperature
/*public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Temperature");
        int temp = scanner.nextInt();
        if (temp < 0) {
            System.out.print("Freezing weather");
        } else if (temp >= 0 && temp <= 10) {
            System.out.println("Very cold weather");
        } else if (temp >= 11 && temp <= 20) {
            System.out.println("Cold weather");
        } else if (temp >= 21 && temp <= 30) {
            System.out.println("Normal in temp");
        } else if (temp >= 31 && temp <= 40) {
            System.out.println("It's hot");
        } else if (temp > 40) {
            System.out.println("It's very hot");
        }
        scanner.close();
    }
}*/

// Number of days based on month
/*public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the month number
        System.out.print("Enter the month number (1-12): ");
        int month = scanner.nextInt();
        scanner.close();

        // Use a switch statement to determine the number of days in the month
        String days;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = "30";
                break;
            case 2:
                days = "28 or 29";
                break;
            default:
                System.out.println("Invalid month number. Please enter a number between 1 and 12.");
                return;
        }
        // Print the number of days in the month
        System.out.println(days + " days");
    }
}*/

// Ticket price based on age and hour
/*public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input age and hour
        System.out.print("Enter the age: ");
        int age = scanner.nextInt();
        System.out.print("Enter the hour (in 24-hour format): ");
        int hour = scanner.nextInt();

        // Calculate ticket price
        int price = calculateTicketPrice(age, hour);

        // Output the ticket price
        System.out.println("Ticket price: $" + price);

        scanner.close();
    }

    public static int calculateTicketPrice(int age, int hour) {
        // Default ticket price
        int ticketPrice = 10;

        // Apply discounts based on age
        if (age < 12) {
            ticketPrice -= 5;
        } else if (age >= 60) {
            ticketPrice -= 4; // Seniors receive a $4 discount
        }

        // Apply discounts/surcharges based on time
        if (hour < 12) {
            ticketPrice -= 2; // Morning discount
        } else if (hour >= 18) {
            ticketPrice += 1; // Evening surcharge
        }

        return ticketPrice;
    }
}*/

// Valid Triangle or not
/*public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angle1 = scanner.nextInt();
        int angle2 = scanner.nextInt();
        int angle3 = scanner.nextInt();
        scanner.close();
        if ((angle1 + angle2 + angle3) == 180 && angle1 > 0 && angle2 > 0 && angle3 > 0) {
            System.out.print("Valid Triangle");
        } else {
            System.out.print("Invalid Triangle");
        }
    }
}*/

// Roots based on the coeffiecients
/*public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input coefficients of the quadratic equation
        System.out.print("Enter the coefficients (a, b, c): ");
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();

        // Calculate the discriminant
        float discriminant = b * b - 4 * a * c;

        // Check the nature of roots
        if (discriminant > 0) {
            // Two distinct real roots
            float root1 = (-b + (float) Math.sqrt(discriminant)) / (2 * a);
            float root2 = (-b - (float) Math.sqrt(discriminant)) / (2 * a);
            System.out.printf("Root 1: %.1f, Root 2: %.1f\n", root1, root2);
        } else if (discriminant == 0) {
            // Two equal real roots
            float root = -b / (2 * a);
            System.out.printf("Root 1: %.1f\n", root);
        } else {
            // Complex roots
            float realPart = -b / (2 * a);
            float imaginaryPart = (float) Math.sqrt(-discriminant) / (2 * a);
            System.out.printf("Root 1: %.1f + %.2fi, Root 2: %.1f - %.2fi\n", realPart, imaginaryPart, realPart,
                    imaginaryPart);
        }

        scanner.close();
    }
}*/

// Equal no. of zeros, ones, two's
/*public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        int zeroCount = 0;
        int oneCount = 0;
        int twoCount = 0;
        for (int i = 0; i < input.length(); ++i) {
            if (input.charAt(i) == '0') {
                zeroCount = zeroCount + 1;
            } else if (input.charAt(i) == '1') {
                oneCount = oneCount + 1;
            } else if (input.charAt(i) == '2') {
                twoCount = twoCount + 1;
            }
        }
        if (zeroCount == oneCount && oneCount == twoCount) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}*/

// Count of prime numbers present in an array
/*public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[6];
        System.out.println("Enter numbers");
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = scanner.nextInt();
        }
        int primeCount = countPrimeElements(arr);
        System.out.println(primeCount);
        scanner.close();
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int countPrimeElements(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (isPrime(num)) {
                count++;
            }
        }
        return count;
    }
}*/

// Eliminate 'b' and 'ac' and print remaining string
/*public class App {
    public static String eliminateAndReplace(String str) {
        char[] chars = str.toCharArray();
        int len = chars.length;
        int index = 0;
        for (int i = 0; i < len; i++) {
            if (chars[i] == 'b') {
                continue;
            } else if (i < len - 1 && chars[i] == 'a' && chars[i + 1] == 'c') {
                i++;
            } else {
                chars[index++] = chars[i];
            }
        }
        return new String(chars, 0, index);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("String");
        String input = scanner.nextLine();
        scanner.close();
        System.out.println(eliminateAndReplace(input));
    }
}*/

// Eliminate special characters and print remaining string
/*public class App {

    public static String removeSpecialCharacters(String str) {
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String input = scanner.nextLine();
        scanner.close();

        String cleanedInput = removeSpecialCharacters(input);

        System.out.println("Input: " + input);
        System.out.println("Output: " + cleanedInput);
    }
}*/

// largest product in a series
/*public class App {
    public static long findLargestProduct(String series, int K) {
        int N = series.length();
        long maxProduct = 0;
        for (int i = 0; i <= N - K; i++) {
            long product = 1;
            for (int j = i; j < i + K; j++) {
                int digit = series.charAt(j) - '0';
                product *= digit;
            }
            maxProduct = Math.max(maxProduct, product);
        }
        return maxProduct;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        scanner.nextLine();
        String series = scanner.nextLine();
        scanner.close();
        long largestProduct = findLargestProduct(series, K);
        System.out.println(largestProduct);
    }
}*/

// Fizz - multiples of 3, Buzz - multiples of 5, FizzBuzz - both
/*public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.print("Fizz" + " ");
            } else if (i % 3 != 0 && i % 5 == 0) {
                System.out.print("Buzz" + " ");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz" + " ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}*/

// Swap 1st and last element in an array -- 1 test case pending
/*public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        if (n >= 2) {
            int temp = arr[0];
            arr[0] = arr[n - 1];
            arr[n - 1] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        scanner.close();
    }
}*/

// Fibonacci Series upto n
/*public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        printFibonacciSeries(N);
        scanner.close();
    }

    public static void printFibonacciSeries(int N) {
        int a = 0, b = 1;
        while (a <= N) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}*/

// Multiplication of a number
/*public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();
        for (int i = 1; i <= 10; i++) {
            System.out.println(N + "x" + i + "=" + N * i);
        }
    }
}*/

// Armstrong number or not
/*public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isArmstrong(number)) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }

        scanner.close();
    }

    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int numberOfDigits = String.valueOf(number).length();
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numberOfDigits);
            number /= 10;
        }

        return sum == originalNumber;
    }
}*/

// Perfect number or not
/*public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isPerfect(number)) {
            System.out.println("Perfect number");
        } else {
            System.out.println("Not a perfect number");
        }

        scanner.close();
    }

    public static boolean isPerfect(int number) {
        if (number <= 1) {
            return false; // Perfect numbers are positive integers greater than 1
        }

        int sum = 1; // Start with 1 as it is always a proper divisor

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                sum += i;
                if (i != number / i) { // Avoid counting squares twice
                    sum += number / i;
                }
            }
        }

        return sum == number;
    }
}*/

// Pascal's Triangle
/*public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int numRows = scanner.nextInt();

        printPascalsTriangle(numRows);

        scanner.close();
    }

    public static void printPascalsTriangle(int numRows) {
        for (int i = 0; i < numRows; i++) {
            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}*/

// Print star pattern based on no. of rows
/*public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();

        displayPattern(numRows);

        scanner.close();
    }

    public static void displayPattern(int numRows) {
        // Outer loop for rows
        for (int i = 1; i <= numRows; i++) {
            // Inner loop for columns
            for (int j = 1; j <= i; j++) {
                System.out.print("* "); // Print '*' followed by a space
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}*/

// Print number pattern based on no. of rows
/*public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows (N): ");
        int N = scanner.nextInt();

        printNumberPattern(N);

        scanner.close();
    }

    public static void printNumberPattern(int N) {
        // Outer loop for rows
        for (int i = 1; i <= N; i++) {
            // Inner loop for columns
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " "); // Print the current column number followed by a space
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}*/

// Print number pattern
/*public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        printNumberPattern(N);

        scanner.close();
    }

    public static void printNumberPattern(int N) {
        int counter = 1; // Counter variable to track the numbers
        
        // Outer loop for rows
        for (int i = 1; i <= N; i++) {
            // Inner loop for columns
            for (int j = 1; j <= i; j++) {
                System.out.print(counter++ + " "); // Print the current number followed by a space
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}*/

// Diamond pattern
/*public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        printStarPattern(N);

        scanner.close();
    }

    public static void printStarPattern(int N) {
        // Upper part of the pattern
        for (int i = 0; i < N; i++) {
            // Print spaces
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part of the pattern
        for (int i = N - 2; i >= 0; i--) {
            // Print spaces
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/

// Take the matrix input and print it
/*public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("rows and columns");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        printMatrix(matrix);
        scanner.close();
    }

    public static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}*/

// Addition of 2 matrices
/*public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("rows and cols");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] sumMatrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        printMatrix(sumMatrix);
        scanner.close();
    }

    public static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}*/

// Average of the elements in a matrix
/*public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum += matrix[i][j];
            }
        }
        double average = (double) sum / (m * n);
        System.out.print(average);
        scanner.close();
    }
}*/

// 2 matrices are equal or not
/*public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m1 = scanner.nextInt();
        int n1 = scanner.nextInt();
        int[][] matrix1 = readMatrix(scanner, m1, n1);
        int m2 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int[][] matrix2 = readMatrix(scanner, m2, n2);
        if (areMatricesEqual(matrix1, matrix2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
        scanner.close();
    }

    public static int[][] readMatrix(Scanner scanner, int m, int n) {
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    public static boolean areMatricesEqual(int[][] matrix1, int[][] matrix2) {
        int m1 = matrix1.length;
        int n1 = matrix1[0].length;
        int m2 = matrix2.length;
        int n2 = matrix2[0].length;
        if (m1 != m2 || n1 != n2) {
            return false;
        }
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                if (matrix1[i][j] != matrix2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}*/

// Interchange the leading diagonal with other diagonal
/*public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        interchangeDiagonals(matrix);
        printMatrix(matrix);
        scanner.close();
    }

    public static void interchangeDiagonals(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            int temp = matrix[i][i];
            matrix[i][i] = matrix[i][n - i - 1];
            matrix[i][n - i - 1] = temp;
        }
    }

    public static void printMatrix(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}*/

// Upper triangular matrix of a given matrix
/*public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        printUpperTriangularMatrix(matrix);
        scanner.close();
    }

    public static void printUpperTriangularMatrix(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j >= i) {
                    System.out.print(matrix[i][j] + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }
}*/

// Lower triangular matrix of a given matrix
/*public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        printLowerTriangularMatrix(matrix);
        scanner.close();
    }

    public static void printLowerTriangularMatrix(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j <= i) {
                    System.out.print(matrix[i][j] + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }
}*/

// Mutliplication of 2 matrices

// Copy elements of an array into another array
/*public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] originalArray = new int[size];
        int[] newArray = new int[size];
        for (int i = 0; i < size; i++) {
            originalArray[i] = scanner.nextInt();
        }
        for (int i = 0; i < size; i++) {
            newArray[i] = originalArray[i];
        }
        for (int i = 0; i < size; i++) {
            System.out.print(newArray[i] + " ");
        }
        scanner.close();
    }
}*/

// Print 2nd largest element of an array
/*public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int secondLargest = findSecondLargest(array);
        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println(secondLargest);
        } else {
            System.out.println("Do not exist");
        }
        scanner.close();
    }

    public static int findSecondLargest(int[] array) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            } else if (array[i] > secondLargest && array[i] != largest) {
                secondLargest = array[i];
            }
        }
        return secondLargest;
    }
}*/

// Check whether the array is sorted or not
/*public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for(int i=0;i<size;i++){
            array[i] = scanner.nextInt();
        }
        int result = isAscending(array);
        System.out.println(result);
        scanner.close();
    }
    public static int isAscending(int[] array){
        for(int i=0;i<array.length-1;i++){
            if(array[i] > array[i+1]){
                return 0;
            }
        }
        return 1;
    }
}*/

// Separate odd & even elements and print in different lines
/*public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        ArrayList<Integer> evenArray = new ArrayList<>();
        ArrayList<Integer> oddArray = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if (array[i] % 2 == 0) {
                evenArray.add(array[i]);
            } else {
                oddArray.add(array[i]);
            }
        }
        for (int num : evenArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (int num : oddArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}*/

// Print the array in reverse order
/*public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        reverseArray(array);
        scanner.close();
    }

    public static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            array[left] = array[left] + array[right];
            array[right] = array[left] - array[right];
            array[left] = array[left] - array[right];
            left++;
            right--;
        }
    }
}*/

// Prefix sum array of an array
/*public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        int[] prefixSum = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        prefixSum[0] = array[0];
        for (int i = 1; i < size; i++) {
            prefixSum[i] = prefixSum[i - 1] + array[i];
        }
        for (int num : prefixSum) {
            System.out.print(num + " ");
        }
        System.out.println();
        scanner.close();
    }
}*/

// Suffix sum array of an array
/*public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        int[] suffixSum = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        suffixSum[size - 1] = array[size - 1];
        for (int i = size - 2; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] + array[i];
        }
        for (int num : suffixSum) {
            System.out.print(num + " ");
        }
        System.out.println();
        scanner.close();
    }
}*/

// Selection sort algorithm to sort in ascending order
/*public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        selectionSort(array);
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        scanner.close();
    }

    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }
}*/

// Bubble sort algorithm to sort in ascending order
/*public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        bubbleSort(array);
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        scanner.close();
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}*/

// Insertion sort algorithm to sort in ascending order
/*public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        insertionSort(array);
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        scanner.close();
    }

    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
}*/

// Count of alphabets, numbers, special characters
/*public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int alphabets = 0;
        int digits = 0;
        int specials = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                alphabets++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else {
                specials++;
            }
        }
        System.out.print(alphabets + " " + digits + " " + specials);
        scanner.close();
    }
}*/

// x^n manually
/*public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        int n = scanner.nextInt();
        double result = myPow(x,n);
        System.out.printf("%.2f\n", result);
        scanner.close();
    }
    public static double myPow(double x, int n){
        if(n==0){
            return 1;
        }
        if(n<0){
            x = 1/x;
            return n%2==0 ? myPow(x*x,-(n/2)) : x * myPow(x*x, -(n/2));
        }
        return n%2==0 ? myPow(x*x, n/2) : x* myPow(x*x, n/2);
    }
}*/

// toggle the case of each character
/*public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String result = toggleCase(input);
        System.out.println(result);
        scanner.close();
    }

    public static String toggleCase(String str) {
        StringBuilder modifiedString = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                modifiedString.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                modifiedString.append(Character.toUpperCase(ch));
            } else {
                modifiedString.append(ch);
            }
        }
        return modifiedString.toString();
    }
}*/

// Highest and lowest frequency of characters in the string.
/*public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each character
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) { // Exclude non-alphabetic characters
                frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
            }
        }

        // Find the highest and lowest frequency
        int maxFrequency = Collections.max(frequencyMap.values());
        int minFrequency = Collections.min(frequencyMap.values());

        // Sort characters with highest frequency
        List<Character> highestFrequencyChars = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                highestFrequencyChars.add(entry.getKey());
            }
        }
        Collections.sort(highestFrequencyChars);

        // Sort characters with lowest frequency
        List<Character> lowestFrequencyChars = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == minFrequency) {
                lowestFrequencyChars.add(entry.getKey());
            }
        }
        Collections.sort(lowestFrequencyChars);

        // Print characters with highest frequency
        System.out.print("Highest frequency character(s): ");
        for (char ch : highestFrequencyChars) {
            System.out.print(ch + " ");
        }
        System.out.println(maxFrequency);

        // Print characters with lowest frequency
        System.out.print("Lowest frequency character(s): ");
        for (char ch : lowestFrequencyChars) {
            System.out.print(ch + " ");
        }
        System.out.println(minFrequency);

        scanner.close();
    }
}*/

// Remove leading and trailing white space and print remaining string
/*public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String modifiedString = removeWhiteSpace(input);
        System.out.println(modifiedString);
        scanner.close();
    }

    public static String removeWhiteSpace(String str) {
        return str.trim();
    }
}*/

// Remove last occurrence of the given word from the string
/*public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String wordToRemove = scanner.nextLine();
        String modifiedString = removeLastOccurrence(input, wordToRemove);
        System.out.println(modifiedString);
        scanner.close();
    }

    public static String removeLastOccurrence(String str, String word) {
        int lastIndex = str.lastIndexOf(word);
        if (lastIndex != -1) {
            int startIndex = lastIndex;
            int endIndex = startIndex + word.length();
            str = str.substring(0, startIndex) + str.substring(endIndex);
        }
        return str;
    }
}*/

// Remove duplicate elements and print remaining array
/*public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] uniqueArray = removeDuplicates(arr);
        for (int num : uniqueArray) {
            System.out.print(num + " ");
        }
        scanner.close();
    }

    public static int[] removeDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();
        List<Integer> uniqueList = new ArrayList<>();
        for (int num : arr) {
            if (!set.contains(num)) {
                set.add(num);
                uniqueList.add(num);
            }
        }
        int[] uniqueArray = new int[uniqueList.size()];
        for (int i = 0; i < uniqueList.size(); i++) {
            uniqueArray[i] = uniqueList.get(i);
        }
        return uniqueArray;
    }
}*/

// Compress the string with count of letters
/*public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String compressedString = compressString(input);
        if (compressedString.length() < input.length()) {
            System.out.println(compressedString);
        } else {
            System.out.println(input);
        }
        scanner.close();
    }

    public static String compressString(String str) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i));
                compressed.append(count);
                count = 1;
            }
        }
        return compressed.toString();
    }
}*/

// Left Rotate array based on positions
/*public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Output
        int[] result = leftRotateArray(arr, d);
        for (int num : result) {
            System.out.print(num + " ");
        }
        
        scanner.close();
    }
    
    public static int[] leftRotateArray(int[] arr, int d) {
        int n = arr.length;
        d = d % n; // handling cases where d is greater than n
        
        int[] rotatedArray = new int[n];
        for (int i = 0; i < n; i++) {
            rotatedArray[i] = arr[(i + d) % n];
        }
        
        return rotatedArray;
    }
}*/

/*public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int x = scanner.nextInt();

        // Split the array
        List<Integer> greaterThanX = new ArrayList<>();
        List<Integer> lessThanOrEqualX = new ArrayList<>();
        for (int num : arr) {
            if (num > x) {
                greaterThanX.add(num);
            } else {
                lessThanOrEqualX.add(num);
            }
        }

        // Output
        for (int num : greaterThanX) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (int num : lessThanOrEqualX) {
            System.out.print(num + " ");
        }
    }
}*/

// Linked List problems
// Insert and delete nodes from the end
/*public class App {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node insert_at_end(Node head, int newData) {
        Node newNode = new Node(newData);
        if (head == null) {
            return newNode;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        return head;
    }

    static Node delete_at_end(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        return head;
    }

    static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Node head = null;
        for (int i = 0; i < n; i++) {
            int newData = scanner.nextInt();
            head = insert_at_end(head, newData);
        }
        head = delete_at_end(head);
        printList(head);
        scanner.close();
    }
}*/

// Check whether the value is present or not
/*public class App {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node insert_at_end(Node head, int newData) {
        Node newNode = new Node(newData);
        if (head == null) {
            return newNode;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        return head;
    }

    static boolean search(Node head, int x) {
        Node current = head;
        while (current != null) {
            if (current.data == x) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Node head = null;
        for (int i = 0; i < n; i++) {
            int newData = scanner.nextInt();
            head = insert_at_end(head, newData);
        }
        int x = scanner.nextInt();
        boolean found = search(head, x);
        System.out.println(found);
        scanner.close();
    }
}*/

// Reverse the linked list
/*public class App {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node insert_at_end(Node head, int newData) {
        Node newNode = new Node(newData);
        if (head == null) {
            return newNode;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        return head;
    }

    static Node reverseList(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }

        return prev;
    }
    static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Node head = null;
        for (int i = 0; i < n; i++) {
            int newData = scanner.nextInt();
            head = insert_at_end(head, newData);
        }
        
        // Reverse the linked list
        head = reverseList(head);
        
        // Print the reversed linked list
        printList(head);

        scanner.close();
    }
}*/

// Return the middle node of linked list
/*public class App {
    static class Node {
        int data;
        Node next;

        // Constructor
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    // Function to insert an element at the end of the linked list
    public static Node insert(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        return head;
    }

    // Function to find the middle node of the linked list
    public static Node findMiddleNode(Node head) {
        if (head == null) {
            return null; // Empty list
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of elements
        System.out.print("Enter the number of elements in the linked list: ");
        int n = scanner.nextInt();

        // Read the elements of the linked list
        System.out.println("Enter the elements of the linked list:");
        Node head = null;
        for (int i = 0; i < n; i++) {
            int data = scanner.nextInt();
            head = insert(head, data);
        }

        // Find the middle node
        Node middleNode = findMiddleNode(head);

        // Print the data of the middle node
        if (middleNode != null) {
            System.out.println("Middle node: " + middleNode.data);
        } else {
            System.out.println("The linked list is empty.");
        }

        scanner.close();
    }
}*/

// Linked list has a cycle or not
/*public class App {

    static class Node {
        int data;
        Node next;

        // Constructor
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static boolean hasCycle(Node head) {
        if (head == null || head.next == null) {
            return false; // No cycle if the list is empty or has only one node
        }

        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            if (slow == fast) {
                return true; // Cycle detected
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return false; // No cycle detected
    }

    // Function to insert an element at the end of the linked list
    public static Node insert(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        return head;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the linked list
        System.out.print("Enter the size of the linked list: ");
        int size = scanner.nextInt();

        // Read the elements of the linked list
        System.out.println("Enter the elements of the linked list:");
        Node head = null;
        for (int i = 0; i < size; i++) {
            int data = scanner.nextInt();
            head = insert(head, data);
        }

        // Read the position at which the tail is connected (if any)
        System.out.print("Enter the position at which the tail is connected (0 for no cycle): ");
        int cyclePosition = scanner.nextInt();

        // Connect the tail to create a cycle (if specified)
        if (cyclePosition > 0) {
            Node tail = head;
            Node cycleNode = head;
            while (cyclePosition > 1) {
                cycleNode = cycleNode.next;
                cyclePosition--;
            }
            while (tail.next != null) {
                tail = tail.next;
            }
            tail.next = cycleNode;
        }

        // Check if the linked list has a cycle
        boolean result = hasCycle(head);
        System.out.println("Does the linked list have a cycle? " + result);

        scanner.close();
    }
}*/

// Linked list that represents the sum of the 2 numbers
/*public class App {

    static class Node {
        int data;
        Node next;

        // Constructor
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to create a linked list from an array of values
    public static Node createLinkedList(int[] values) {
        Node head = null;
        Node tail = null;
        for (int value : values) {
            Node newNode = new Node(value);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        return head;
    }

    // Function to reverse a linked list
    public static Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    // Function to add two numbers represented by linked lists
    public static Node addTwoNumbers(Node l1, Node l2) {
        Node reversedL1 = reverseList(l1);
        Node reversedL2 = reverseList(l2);

        Node dummy = new Node(0);
        Node current = dummy;
        int carry = 0;

        while (reversedL1 != null || reversedL2 != null || carry != 0) {
            int sum = carry;
            if (reversedL1 != null) {
                sum += reversedL1.data;
                reversedL1 = reversedL1.next;
            }
            if (reversedL2 != null) {
                sum += reversedL2.data;
                reversedL2 = reversedL2.next;
            }
            current.next = new Node(sum % 10);
            current = current.next;
            carry = sum / 10;
        }

        return reverseList(dummy.next);
    }

    // Function to print the linked list
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size and values of the first linked list
        System.out.print("Enter the size of the first linked list: ");
        int n = scanner.nextInt();
        System.out.println("Enter the values of the first linked list:");
        int[] values1 = new int[n];
        for (int i = 0; i < n; i++) {
            values1[i] = scanner.nextInt();
        }
        Node l1 = createLinkedList(values1);

        // Read the size and values of the second linked list
        System.out.print("Enter the size of the second linked list: ");
        int m = scanner.nextInt();
        System.out.println("Enter the values of the second linked list:");
        int[] values2 = new int[m];
        for (int i = 0; i < m; i++) {
            values2[i] = scanner.nextInt();
        }
        Node l2 = createLinkedList(values2);

        // Find the sum of the two numbers
        Node result = addTwoNumbers(l1, l2);

        // Print the result
        System.out.println("Sum of the two numbers:");
        printList(result);

        scanner.close();
    }
}*/

// Group odd and even elements and print reordered linked list
/*public class App {
    static class ListNode {
        int data;
        ListNode next;

        // Constructor
        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the linked list
        int n = scanner.nextInt();

        // Build the linked list
        ListNode head = buildLinkedList(scanner, n);

        // Reorder the linked list
        head = reorderList(head);

        // Print the reordered list
        printLinkedList(head);

        scanner.close();
    }

    // Function to build a linked list from input
    public static ListNode buildLinkedList(Scanner scanner, int size) {
        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;
        for (int i = 0; i < size; i++) {
            int data = scanner.nextInt();
            ListNode newNode = new ListNode(data);
            tail.next = newNode;
            tail = newNode;
        }
        return dummyHead.next;
    }

    // Function to reorder the linked list
    public static ListNode reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return head; // Empty or single-node list
        }

        ListNode oddHead = new ListNode(0); // Dummy head for odd-indexed nodes
        ListNode evenHead = new ListNode(0); // Dummy head for even-indexed nodes
        ListNode oddTail = oddHead;
        ListNode evenTail = evenHead;

        int index = 1;
        ListNode current = head;
        while (current != null) {
            if (index % 2 == 1) { // Odd index
                oddTail.next = current;
                oddTail = current;
            } else { // Even index
                evenTail.next = current;
                evenTail = current;
            }
            current = current.next;
            index++;
        }

        oddTail.next = null; // Terminate the odd-indexed list
        evenTail.next = null; // Terminate the even-indexed list

        // Merge the odd-indexed list and the even-indexed list
        oddTail.next = evenHead.next;

        return oddHead.next;
    }

    // Function to print a linked list
    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}*/

// Sort the singly linked list
/*class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class App {

    public static Node insert(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        return head;
    }

    public static Node sortLinkedList(Node head) {
        List<Integer> values = new ArrayList<>();
        Node current = head;
        
        // Extract values from linked list and store in ArrayList
        while (current != null) {
            values.add(current.data);
            current = current.next;
        }
        
        // Sort the ArrayList
        Collections.sort(values);

        // Reconstruct the linked list with sorted values
        Node dummy = new Node(0);
        Node tail = dummy;
        for (int val : values) {
            tail.next = new Node(val);
            tail = tail.next;
        }
        
        return dummy.next;
    }

    public static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int N = scanner.nextInt();
        Node head = null;
        for (int i = 0; i < N; i++) {
            int value = scanner.nextInt();
            head = insert(head, value);
        }

        // Sort the linked list
        head = sortLinkedList(head);

        // Print the sorted linked list
        if (head == null) {
            System.out.println("Empty list");
        } else {
            printLinkedList(head);
        }

        scanner.close();
    }
}*/

// Sort the linked list with Time Complexity - O(n) and Space Complexity - O(1)
/*public class App {
  static class Node {
      int data;
      Node next;

      public Node(int data) {
          this.data = data;
          this.next = null;
      }
  }

  // Function to insert elements into the linked list
  public static Node insert(Node head, int val) {
      Node newNode = new Node(val);
      if (head == null) {
          head = newNode;
      } else {
          Node current = head;
          while (current.next != null) {
              current = current.next;
          }
          current.next = newNode;
      }
      return head;
  }

  // Function to sort the linked list containing only 0s, 1s, and 2s
public static Node sortList(Node head) {
      if (head == null || head.next == null) {
          return head;
      }

      Node zero = new Node(0);
      Node one = new Node(0);
      Node two = new Node(0);

      Node zeroPtr = zero;
      Node onePtr = one;
      Node twoPtr = two;

      Node current = head;

      while (current != null) {
          if (current.data == 0) {
              zeroPtr.next = current;
              zeroPtr = zeroPtr.next;
          } else if (current.data == 1) {
              onePtr.next = current;
              onePtr = onePtr.next;
          } else {
              twoPtr.next = current;
              twoPtr = twoPtr.next;
          }
          current = current.next;
      }

      // Link the lists together
      zeroPtr.next = one.next != null ? one.next : two.next;
      onePtr.next = two.next;

      // Mark the end of the sorted list
      twoPtr.next = null;

      return zero.next;
  }

  // Function to print the linked list
  public static void printList(Node head) {
      Node current = head;
      while (current != null) {
          System.out.print(current.data + " ");
          current = current.next;
      }
      System.out.println();
  }

  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      // Get input from the user
      System.out.print("Enter the size of the linked list: ");
      int size = scanner.nextInt();

      Node head = null;

      System.out.println("Enter the elements of the linked list (0, 1, or 2): ");
      for (int i = 0; i < size; i++) {
          int val = scanner.nextInt();
          head = insert(head, val);
      }

      // Sort the linked list
      Node sortedHead = sortList(head);

      // Print the sorted list
      System.out.println("Sorted list:");
      printList(sortedHead);

      scanner.close();
  }
}*/

// Remove all the duplicate elements from the list
/*public class App {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to insert elements into the linked list
    public static Node insert(Node head, int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        return head;
    }

    // Function to remove duplicates from sorted linked list
    public static Node removeDuplicates(Node head) {
        if (head == null) {
            return null;
        }

        Node current = head;
        Node prev = null;
        HashSet<Integer> set = new HashSet<>();

        while (current != null) {
            if (set.contains(current.data)) {
                prev.next = current.next;
            } else {
                set.add(current.data);
                prev = current;
            }
            current = current.next;
        }

        return head;
    }

    // Function to print the linked list
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter the size of the linked list: ");
        int size = scanner.nextInt();

        Node head = null;

        System.out.println("Enter the elements of the linked list (sorted): ");
        for (int i = 0; i < size; i++) {
            int val = scanner.nextInt();
            head = insert(head, val);
        }

        // Remove duplicates
        head = removeDuplicates(head);

        // Print the unique elements
        System.out.println("Output:");
        if (head == null) {
            System.out.println(" ");
        } else {
            printList(head);
        }

        scanner.close();
    }
}*/

// Remove all the occurences of the given number from the linked list
/*public class App {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to insert elements into the linked list
    public static Node insert(Node head, int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        return head;
    }

    // Function to delete all occurrences of X from the linked list
    public static Node deleteOccurrences(Node head, int X) {
        while (head != null && head.data == X) {
            head = head.next;
        }

        Node current = head;
        while (current != null && current.next != null) {
            if (current.next.data == X) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }

    // Function to print the linked list
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter the size of the linked list: ");
        int size = scanner.nextInt();
        System.out.print("Enter the value of X: ");
        int X = scanner.nextInt();

        Node head = null;

        System.out.println("Enter the elements of the linked list: ");
        for (int i = 0; i < size; i++) {
            int val = scanner.nextInt();
            head = insert(head, val);
        }

        // Delete all occurrences of X
        head = deleteOccurrences(head, X);

        // Print the modified linked list
        System.out.println("Output:");
        printList(head);

        scanner.close();
    }
}*/

// Find whether there exists a pair of elements in the linked list whose sum is equal to X.
/*public class App {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to insert elements into the linked list
    public static Node insert(Node head, int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        return head;
    }

    // Function to find pair of elements whose sum is equal to X
    public static void findPair(Node head, int X) {
        HashSet<Integer> set = new HashSet<>();
        Node current = head;
        boolean pairFound = false;

        while (current != null) {
            int complement = X - current.data;
            if (set.contains(complement)) {
                int first = Math.min(complement, current.data);
                int second = Math.max(complement, current.data);
                System.out.println(first + " " + second);
                pairFound = true;
                break;
            }
            set.add(current.data);
            current = current.next;
        }

        if (!pairFound) {
            System.out.println(-1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter the size of the linked list: ");
        int size = scanner.nextInt();
        System.out.print("Enter the value of X: ");
        int X = scanner.nextInt();

        Node head = null;

        System.out.println("Enter the elements of the linked list: ");
        for (int i=0; i < size; i++) {
            int val = scanner.nextInt();
            head = insert(head, val);
        }

        // Find pair of elements whose sum is equal to X
        System.out.println("Output:");
        findPair(head, X);

        scanner.close();
    }
}*/

// insert a new node at position i and delete the node at position j
/*public class App {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head;

    static void insert(int val, int pos) {
        Node newNode = new Node(val);
        if (pos == 1 || head == null) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node prev = head;
        for (int i = 1; i < pos - 1 && prev.next != null; i++) {
            prev = prev.next;
        }
        newNode.next = prev.next;
        prev.next = newNode;
    }
    static void delete(int pos) {
        if (head == null)
            return;
        Node temp = head;
        if (pos == 1) {
            head = temp.next;
            return;
        }
        for (int i = 1; temp != null && i < pos - 1; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null)
            return;
        temp.next = temp.next.next;
    }

    // Function to print the linked list
    static void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        System.out.println("Enter the elements of the linked list:");
        for (int i = 0; i < n; i++) {
            int val = scanner.nextInt();
            insert(val, i + 1);
        }
        System.out.print("Enter the position to insert and the element to insert: ");
        int valInsert = scanner.nextInt();
        int posInsert = scanner.nextInt();
        insert(valInsert, posInsert + 1);

        // Input the position to delete
        System.out.print("Enter the position to delete: ");
        int posDelete = scanner.nextInt();
        delete(posDelete + 1);
        printList();
    }
}*/

// Linked list is a palindrome or not
/*public class App {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node insertAtEnd(Node head, int newData) {
        Node newNode = new Node(newData);
        if (head == null) {
            return newNode;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        return head;
    }

    static boolean isPalindrome(Node head) {
        if (head == null) {
            return true;
        }

        Node fast = head;
        Node slow = head;

        // Find the middle of the linked list
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        // Reverse the second half of the linked list
        Node prev = null;
        Node next;
        while (slow != null) {
            next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        // Compare the first half with the reversed second half
        Node firstHalf = head;
        Node secondHalf = prev;
        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Node head = null;
        for (int i = 0; i < n; i++) {
            int newData = scanner.nextInt();
            head = insertAtEnd(head, newData);
        }
        boolean isPalindromic = isPalindrome(head);
        System.out.println(isPalindromic);
        scanner.close();
    }
}*/

// Delete the nth node from the end and print remaining list
/*public class App {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to insert a node at the end of the linked list
    public static Node insert(Node head, int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        return head;
    }

    // Function to remove the nth node from the end of the linked list
    public static Node removeNthFromEnd(Node head, int n) {
        Node dummy = new Node(0);
        dummy.next = head;
        Node fast = dummy;
        Node slow = dummy;

        // Move fast pointer n+1 steps ahead
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // Move fast pointer to the end, maintaining the gap of n steps
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Remove the nth node from the end
        slow.next = slow.next.next;

        return dummy.next;
    }

    // Function to print the linked list
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print("->");
            }
            current = current.next;
        }
        System.out.println("->nullptr");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter the size of the linked list: ");
        int size = scanner.nextInt();
        System.out.println("Enter the elements of the linked list: ");
        Node head = null;
        for (int i = 0; i < size; i++) {
            int val = scanner.nextInt();
            head = insert(head, val);
        }

        // Get the position of the node to remove
        System.out.print("Enter the position of the node to remove: ");
        int n = scanner.nextInt();

        // Remove the nth node from the end
        head = removeNthFromEnd(head, n);

        // Print the modified linked list
        System.out.println("Output:");
        printList(head);

        scanner.close();
    }
}*/

// Doubly linked list
// Insert a node at position K in doubly linked list
/*public class App {
   static class Node {
       int data;
       Node next;
       Node prev;

       // Constructor
       public Node(int data) {
           this.data = data;
           this.next = null;
           this.prev = null;
       }
   }

   public static Node insertNode(Node head, int k, int val) {
       Node newNode = new Node(val);
       if (k == 0) {
           newNode.next = head;
           if (head != null) {
               head.prev = newNode;
           }
           return newNode;
       }

       Node current = head;
       for (int i = 0; i < k - 1 && current != null; i++) {
           current = current.next;
       }

       if (current == null) {
           // Position exceeds the length of the list, append the new node at the end
           Node tail = head;
           while (tail.next != null) {
               tail = tail.next;
           }
           tail.next = newNode;
           newNode.prev = tail;
       } else {
           newNode.next = current.next;
           if (current.next != null) {
               current.next.prev = newNode;
           }
           current.next = newNode;
           newNode.prev = current;
       }

       return head;
   }

   public static Node insertInitialElements(Node head, int[] elements) {
       Node tail = null;
       for (int data : elements) {
           Node newNode = new Node(data);
           if (head == null) {
               head = newNode;
               tail = newNode;
           } else {
               tail.next = newNode;
               newNode.prev = tail;
               tail = newNode;
           }
       }
       return head;
   }

   public static void printList(Node head) {
       while (head != null) {
           System.out.print(head.data + " ");
           head = head.next;
       }
       System.out.println();
   }

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       // Input the size of the doubly linked list
       System.out.print("Enter the size of the doubly linked list: ");
       int n = scanner.nextInt();

       // Input the position at which to insert the node
       System.out.print("Enter the position at which to insert the node: ");
       int k = scanner.nextInt();

       // Input the value of the new node
       System.out.print("Enter the value of the new node: ");
       int val = scanner.nextInt();

       // Input the elements of the doubly linked list
       System.out.println("Enter the elements of the doubly linked list:");
       int[] elements = new int[n];
       for (int i = 0; i < n; i++) {
           elements[i] = scanner.nextInt();
       }
       Node head = insertInitialElements(null, elements);

       // Insert a node at position K
       head = insertNode(head, k, val);

       // Print the doubly linked list after insertion
       System.out.println("Doubly linked list after insertion:");
       printList(head);

       scanner.close();
   }
}*/

// Reverse the doubly linked list
/*public class App {

    static class Node {
        int data;
        Node next;
        Node prev;

        // constructor
        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    // Function to reverse the doubly linked list
    static Node reverseLinkedList(Node head) {
        Node current = head;
        Node prev = null;

        while (current != null) {
            // Swap next and prev pointers of the current node
            Node next = current.next;
            current.next = prev;
            current.prev = next;

            // Move pointers one position ahead
            prev = current;
            current = next;
        }

        // prev is now the new head of the reversed list
        return prev;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of nodes
        int n = scanner.nextInt();

        // Read the values of the nodes
        Node head = null;
        Node tail = null;
        for (int i = 0; i < n; i++) {
            int data = scanner.nextInt();
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        }

        // Reverse the linked list
        head = reverseLinkedList(head);

        // Print the reversed values separated by spaces
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        scanner.close();
    }
}*/

// Queue data structure
// Enqueue, dequeue, peek
/*public class App {
    static class Queue {
        private int[] queue;
        private int front;
        private int rear;
        private int size;
        private int capacity;

        public Queue(int capacity) {
            this.capacity = capacity;
            queue = new int[capacity];
            front = 0;
            rear = -1;
            size = 0;
        }

        public void enqueue(int element) {
            rear = (rear + 1) % capacity;
            queue[rear] = element;
            size++;
        }

        public int dequeue() {
            int dequeuedElement = queue[front];
            front = (front + 1) % capacity;
            size--;
            return dequeuedElement;
        }

        public int peek() {
            return queue[front];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int n = scanner.nextInt(); // Number of integers to enqueue onto the queue
        int[] elements = new int[n]; // Array to store the elements

        // Input the elements to be enqueued onto the queue
        for (int i = 0; i < n; i++) {
            elements[i] = scanner.nextInt();
        }

        // Create a queue
        Queue queue = new Queue(n);

        // Enqueue elements onto the queue
        for (int element : elements) {
            queue.enqueue(element);
        }

        // Dequeue and print the elements
        for (int i = 0; i < n; i++) {
            System.out.println(queue.dequeue());
        }

        scanner.close();
    }
}*/

// All subarrays of an array
/*public class App {
    public static void printSubarrays(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        int n = scanner.nextInt(); // Length of the array
        int[] arr = new int[n];    // Array to store the elements
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Print subarrays
        printSubarrays(arr);
        
        scanner.close();
    }
}*/

// Starting and ending indices of a subarray whose elements sum up to 'k'
/*public class App {
    public static void findSubarrayWithSum(int[] arr, int k) {
        int n = arr.length;
        int[] prefixSum = new int[n];

        // Compute the prefix sum array
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        // Find subarray with sum k using prefix sum
        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                int subarraySum = prefixSum[end] - (start > 0 ? prefixSum[start - 1] : 0);
                if (subarraySum == k) {
                    System.out.println(start + " " + end);
                    return;
                }
            }
        }
        // for(int i=0;i<n;i++){
        //     for(int j=i;j<n;j++){
        //         int subarraySum = prefixSum[j] - (i>0 ? prefixSum[i-1]:0);
        //         if(subarraySum == k){
        //             System.out.println(start + " " + end);
        //             return;
        //         }
        //     }
        // }

        // If no subarray is found, print "No subarray found"
        System.out.println("No subarray found");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int n = scanner.nextInt(); // Length of the array
        int[] arr = new int[n]; // Array to store the elements
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int k = scanner.nextInt(); // Target sum

        // Find subarray with sum k
        findSubarrayWithSum(arr, k);

        scanner.close();
    }
}*/

// Anagrams or not
/*public class App {

    public static boolean areAnagrams(String str1, String str2) {
        // Check if the lengths of the strings are different
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to char arrays and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Check if the sorted char arrays are equal
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the line containing two words separated by a space
        System.out.print("Enter two words separated by a space: ");
        String input = scanner.nextLine();

        // Split the input line into two words
        String[] words = input.split(" ");
        String str1 = words[0];
        String str2 = words[1];

        // Check if the input strings are anagrams
        if (areAnagrams(str1, str2)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }

        scanner.close();
    }
}*/

// Rotate matrix by 90 degress
/*public class App {

    public static void rotateMatrix(int[][] matrix) {
        int n = matrix.length;
        
        // Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        // Reverse each row of the transposed matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the matrix
        System.out.print("Enter the size of the matrix: ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        // Input the elements of the matrix
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Rotate the matrix
        rotateMatrix(matrix);

        // Print the rotated matrix
        System.out.println("Rotated matrix:");
        printMatrix(matrix);

        scanner.close();
    }
}*/

// Subarray with largest sum
/*public class App {
    public static int maxSubArraySum(int[] arr) {
        int n = arr.length;
        if (n == 0) {
            return 0;
        }
        int maxEndingHere = arr[0];
        int maxSoFar = arr[0];
        for (int i = 1; i < n; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int maxSum = maxSubArraySum(arr);
        System.out.println(maxSum);
        scanner.close();
    }
}*/

// Rotated string is palindrome or not
/*public class App {
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean canFormPalindrome(String s) {
        int n = s.length();
        for (int i = 0; i < n; i++) {
            String rotated = s.substring(n - i) + s.substring(0, n - i);
            if (isPalindrome(rotated)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (canFormPalindrome(s)) {
            System.out.println("Yes, the rotated string is a palindrome.");
        } else {
            System.out.println("No, the rotated string is not a palindrome.");
        }
        scanner.close();
    }
}*/

// Sort in-place without using any additional data structures
/*public class App {
    public static void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0;
        int mid = 0;
        int high = n - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        sortColors(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}*/

// Indices of two numbers such that they add up to target.
/*public class App {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                result[0] = map.get(complement);
                result[1] = i;
                return result;
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        int[] result = twoSum(nums, target);
        if (result[0] != -1 && result[1] != -1) {
            System.out.println(result[0] + " " + result[1]);
        } else {
            System.out.println(-1);
        }
        scanner.close();
    }
}*/

// Find whether a pair of indices exist such that, A[i] - A[j] = k
/*public class App {
    public static int findPair(int[] nums, int k) {
        int n = nums.length;
        int i = 0;
        int j = 1;
        while (i < n && j < n) {
            if (i != j && nums[j] - nums[i] == k) {
                return 1;
            } else if (nums[j] - nums[i] < k) {
                j++;
            } else {
                i++;
            }
            if (i == j) {
                j++;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        int result = findPair(nums, k);
        System.out.print(result);
        scanner.close();
    }
}*/

// Print the label of town judge if the town judge exists and can be identified.
/*public class App {

    public static int findJudge(int n, int[][] trust) {
        if (n == 1) {
            return 1; // If there is only one person, they are the town judge
        }

        // Map to store trust counts for each person
        Map<Integer, Integer> trustCounts = new HashMap<>();

        // Initialize trust counts for each person
        for (int i = 1; i <= n; i++) {
            trustCounts.put(i, 0);
        }

        // Update trust counts based on the trust relationships
        for (int[] relationship : trust) {
            int trustor = relationship[0];
            int trustee = relationship[1];
            trustCounts.put(trustee, trustCounts.getOrDefault(trustee, 0) + 1);
            trustCounts.put(trustor, trustCounts.getOrDefault(trustor, 0) - 1);
        }

        // Find the town judge
        for (Map.Entry<Integer, Integer> entry : trustCounts.entrySet()) {
            if (entry.getValue() == n - 1) { // The town judge is trusted by everyone
                return entry.getKey();
            }
        }

        return -1; // No town judge found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the trust array
        System.out.print("Enter the size of the trust array: ");
        int size = scanner.nextInt();

        // Input the number of people
        System.out.print("Enter the number of people: ");
        int n = scanner.nextInt();

        // Input the trust relationships
        System.out.println("Enter the trust relationships:");
        int[][] trust = new int[size][2];
        for (int i = 0; i < size; i++) {
            trust[i][0] = scanner.nextInt();
            trust[i][1] = scanner.nextInt();
        }

        // Find the town judge
        int townJudge = findJudge(n, trust);
        System.out.println("Town judge label: " + townJudge);

        scanner.close();
    }
}*/

// Determine whether you can pay correct change based on the bills of lemonade
/*public class App {

    public static boolean canGiveChange(int[] bills) {
        int fives = 0; // Number of $5 bills
        int tens = 0; // Number of $10 bills

        for (int bill : bills) {
            if (bill == 5) {
                fives++;
            } else if (bill == 10) {
                if (fives == 0) { // We don't have enough change
                    return false;
                }
                fives--;
                tens++;
            } else { // bill == 20
                if (tens > 0 && fives > 0) { // Give back a $10 and a $5 bill
                    tens--;
                    fives--;
                } else if (fives >= 3) { // Give back three $5 bills
                    fives -= 3;
                } else { // We don't have enough change
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of customers
        int n = scanner.nextInt();

        // Read the bills paid by customers
        int[] bills = new int[n];
        for (int i = 0; i < n; i++) {
            bills[i] = scanner.nextInt();
        }

        // Check if we can provide every customer with the correct change
        boolean result = canGiveChange(bills);
        System.out.println(result);

        scanner.close();
    }
}*/

// print true if new flowers can be planted in the flowerbed without violating
// the no-adjacent-flowers rule and false otherwise
/*public class App {

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                // Check if the current plot and its neighbors are empty
                // or if it's the first or last plot
                if ((i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 ||
                        flowerbed[i + 1] == 0)) {
                    flowerbed[i] = 1; // Plant a flower
                    count++; // Increment the count of planted flowers
                }
            }
        }
        return count >= n; // Check if enough flowers can be planted
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the flowerbed
        System.out.print("Enter the size of the flowerbed: ");
        int size = scanner.nextInt();

        // Read the number of flowers to plant
        System.out.print("Enter the number of flowers to plant: ");
        int n = scanner.nextInt();

        // Read the flowerbed
        System.out.println("Enter the flowerbed (0 for empty, 1 for planted):");
        int[] flowerbed = new int[size];
        for (int i = 0; i < size; i++) {
            flowerbed[i] = scanner.nextInt();
        }

        // Check if the flowers can be planted
        boolean result = canPlaceFlowers(flowerbed, n);
        System.out.println("Can the flowers be planted? " + result);

        scanner.close();
    }
}*/

// maximize the number of your content children and output the maximum number.
/*public class App {

    // Function to solve the problem
    public static int maxContentChildren(int n, int[] g, int m, int[] s) {
        // Sort both arrays
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0; // Pointer for greed factor array
        int j = 0; // Pointer for cookie size array
        int contentChildren = 0;

        // Iterate through both arrays
        while (i < n && j < m) {
            // If cookie size is greater than or equal to greed factor
            if (s[j] >= g[i]) {
                // Assign cookie to child
                contentChildren++;
                i++; // Move to the next child
            }
            j++; // Move to the next cookie
        }

        return contentChildren;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input values
        System.out.print("Enter the number of children (n): ");
        int n = scanner.nextInt();
        int[] g = new int[n];
        System.out.print("Enter the greed factors (space-separated): ");
        for (int i = 0; i < n; i++) {
            g[i] = scanner.nextInt();
        }

        System.out.print("Enter the number of cookies (m): ");
        int m = scanner.nextInt();
        int[] s = new int[m];
        System.out.print("Enter the sizes of cookies (space-separated): ");
        for (int i = 0; i < m; i++) {
            s[i] = scanner.nextInt();
        }

        // Call the function to get the result
        int result = maxContentChildren(n, g, m, s);
        System.out.println("Maximum number of content children: " + result);

        // Close the scanner
        scanner.close();
    }
}*/

// maximum number of consecutive 'T's or 'F's in the answer key after performing the operation at mot k times.
/*public class App{
    public static int maxConsecutiveAnswers(String answerKey, int k) {
        int maxCountT = 0;
        int maxCountF = 0;
        int windowStart = 0;
        int countT = 0;
        int countF = 0;

        // First run: focusing on maximizing the number of 'T's
        for (int windowEnd = 0; windowEnd < answerKey.length(); windowEnd++) {
            if (answerKey.charAt(windowEnd) == 'T') {
                countT++;
            } else {
                countF++;
            }

            while (Math.min(countT, countF) > k) {
                if (answerKey.charAt(windowStart) == 'T') {
                    countT--;
                } else {
                    countF--;
                }
                windowStart++;
            }

            maxCountT = Math.max(maxCountT, windowEnd - windowStart + 1);
        }

        // Second run: focusing on maximizing the number of 'F's
        windowStart = 0;
        countT = 0;
        countF = 0;

        for (int windowEnd = 0; windowEnd < answerKey.length(); windowEnd++) {
            if (answerKey.charAt(windowEnd) == 'F') {
                countF++;
            } else {
                countT++;
            }

            while (Math.min(countT, countF) > k) {
                if (answerKey.charAt(windowStart) == 'F') {
                    countF--;
                } else {
                    countT--;
                }
                windowStart++;
            }

            maxCountF = Math.max(maxCountF, windowEnd - windowStart + 1);
        }

        return Math.max(maxCountT, maxCountF);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter the answer key: ");
        String answerKey = scanner.nextLine();

        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        // Calculate and print the result
        int result = maxConsecutiveAnswers(answerKey, k);
        System.out.println("Maximum consecutive answers: " + result);

        scanner.close();
    }
}*/

// merge 2 arrays and print them in sorted manner
/*public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = scanner.nextInt();
        }
        int[] mergedArray = mergeSortedArray(arr1, arr2);
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
        scanner.close();
    }

    private static int[] mergeSortedArray(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int[] mergedArray = new int[n + m];
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }
        while (i < n) {
            mergedArray[k++] = arr1[i++];
        }
        while (j < m) {
            mergedArray[k++] = arr2[j++];
        }
        return mergedArray;
    }
}*/

// Remove the 1st occurrence of the word and print remaining string
/*public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        String W = scanner.nextLine();
        String result = removeFirstOccurrence(S, W);
        System.out.println(result);
        scanner.close();
    }

    public static String removeFirstOccurrence(String S, String W) {
        int index = S.indexOf(W);
        if (index != -1) {
            return S.substring(0, index) + S.substring(index + W.length());
        } else {
            return S;
        }
    }
}*/

// Right rotate the array by d positions
/*public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        rightRotate(arr, d);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        scanner.close();
    }

    private static void rightRotate(int[] arr, int d) {
        int n = arr.length;
        d = d % n;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}*/

// Does string contains valid brackets or not
/*public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}*/

// Stack that supports push, pop, top, and retireving the minimum element in constant time
/*class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public int pop() {
        if (stack.isEmpty()) {
            return -1; // Stack underflow
        }
        int popped = stack.pop();
        if (popped == minStack.peek()) {
            minStack.pop();
        }
        return popped;
    }

    public int getMin() {
        if (minStack.isEmpty()) {
            return -1; // Stack is empty
        }
        return minStack.peek();
    }
}

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MinStack stack = new MinStack();
        int q = scanner.nextInt();

        for (int i = 0; i < q; i++) {
            int queryType = scanner.nextInt();

            switch (queryType) {
                case 1:
                    int val = scanner.nextInt();
                    stack.push(val);
                    break;
                case 2:
                    int popped = stack.pop();
                    if (popped != -1) {
                        System.out.println( popped + " ");
                    } else {
                        System.out.println("-1" + " ");
                    }
                    break;
                case 3:
                    int min = stack.getMin();
                    if (min != -1) {
                        System.out.println(min + " ");
                    } else {
                        System.out.println("-1" + " ");
                    }
                    break;
                default:
                    System.out.println("-1" + " ");
            }
        }
    }
}*/

// Stack that supports push, pop, top, and retireving the maximum element in constant time
/*class MaxStack {
    Stack<Integer> stack;
    Stack<Integer> maxStack;

    public MaxStack() {
        stack = new Stack<>();
        maxStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if (maxStack.isEmpty() || val >= maxStack.peek()) {
            maxStack.push(val);
        }
    }

    public int pop() {
        if (stack.isEmpty()) {
            return -1; // Stack underflow
        }
        int popped = stack.pop();
        if (popped == maxStack.peek()) {
            maxStack.pop();
        }
        return popped;
    }

    public int getMax() {
        if (maxStack.isEmpty()) {
            return -1; // Stack is empty
        }
        return maxStack.peek();
    }
}

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MaxStack stack = new MaxStack();

        // Accept the number of queries
        System.out.print("Enter the number of queries: ");
        int q = scanner.nextInt();

        // Process each query
        for (int i = 0; i < q; i++) {
            // Accept the query type
            System.out.print("Enter the query type (1 for PUSH, 2 for POP, 3 for getMax): ");
            int queryType = scanner.nextInt();

            // Perform the corresponding operation based on the query type
            switch (queryType) {
                case 1:
                    System.out.print("Enter the element to push: ");
                    int val = scanner.nextInt();
                    stack.push(val);
                    break;
                case 2:
                    int popped = stack.pop();
                    if (popped != -1) {
                        System.out.println("Popped element: " + popped);
                    } else {
                        System.out.println("Stack underflow!");
                    }
                    break;
                case 3:
                    int max = stack.getMax();
                    if (max != -1) {
                        System.out.println("Maximum element: " + max);
                    } else {
                        System.out.println("Stack is empty!");
                    }
                    break;
                default:
                    System.out.println("Invalid query type!");
            }
        }
    }
}*/

// push, pop, top operation in stack data structure
/*public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases

        while (T-- > 0) {
            int N = scanner.nextInt(); // Number of operations
            int S = scanner.nextInt(); // Maximum size of the stack

            Stack<Integer> stack = new Stack<>();
            int size = 0; // Current size of the stack

            for (int i = 0; i < N; i++) {
                String operation = scanner.next();

                if (operation.equals("push")) {
                    int x = scanner.nextInt();
                    if (size == S) {
                        System.out.println("stack overflow");
                    } else {
                        stack.push(x);
                        size++;
                    }
                } else if (operation.equals("pop")) {
                    if (size == 0) {
                        System.out.println("stack underflow");
                    } else {
                        System.out.println(stack.pop());
                        size--;
                    }
                } else if (operation.equals("top")) {
                    if (size == 0) {
                        System.out.println("stack underflow");
                    } else {
                        System.out.println(stack.peek());
                    }
                }
            }
        }
    }
}*/

// 6th belt
// asteroid collision
/*public class App {
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int asteroid : asteroids) {
            if (stack.isEmpty() || asteroid > 0) {
                stack.push(asteroid);
            } else {
                while (true) {
                    int top = stack.isEmpty() ? 0 : stack.peek();
                    if (top < 0) {
                        stack.push(asteroid);
                        break;
                    } else if (top == -asteroid) {
                        stack.pop();
                        break;
                    } else if (top > -asteroid) {
                        break;
                    } else {
                        stack.pop();
                        if (stack.isEmpty() || stack.peek() < 0) {
                            stack.push(asteroid);
                        }
                        break;
                    }
                }
            }
        }
        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] asteroids = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            asteroids[i] = scanner.nextInt();
        }
        int[] result = asteroidCollision(asteroids);
        if (result.length == 0) {
            System.out.println("Everything Destroyed");
        } else {
            System.out.println("Output:");
            for (int asteroid : result) {
                System.out.print(asteroid + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}*/

// Smallest possible integer after removing k digits from num
/*public class App {
    public static String removeKDigits(String num, int k) {
        Stack<Character> stack = new Stack<>();
        for (char digit : num.toCharArray()) {
            while (!stack.isEmpty() && stack.peek() > digit && k > 0) {
                stack.pop();
                k--;
            }
            if (!stack.isEmpty() || digit != '0') {
                stack.push(digit);
            }
        }
        while (!stack.isEmpty() && k > 0) {
            stack.pop();
            k--;
        }
        StringBuilder result = new StringBuilder();
        for (char digit : stack) {
            result.append(digit);
        }
        return result.length() == 0 ? "0" : result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string representing a non-negative integer: ");
        String num = scanner.nextLine();
        System.out.print("Enter the number of digits to remove: ");
        int k = scanner.nextInt();
        String result = removeKDigits(num, k);
        System.out.println("Output:");
        System.out.println(result);
        scanner.close();
    }
}*/

// largest rectangle in the histogram
/*public class App {
    public static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] left = new int[n];
        int[] right = new int[n];
        Stack<Integer> myStack = new Stack<>();
        
        // Calculate left boundary for each bar
        for (int i = 0; i < n; i++) {
            if (myStack.isEmpty()) {
                left[i] = 0;
                myStack.push(i);
            } else {
                while (!myStack.isEmpty() && heights[myStack.peek()] >= heights[i]) {
                    myStack.pop();
                }
                left[i] = myStack.isEmpty() ? 0 : myStack.peek() + 1;
                myStack.push(i);
            }
        }
        
        myStack.clear();
        
        // Calculate right boundary for each bar
        for (int i = n - 1; i >= 0; i--) {
            if (myStack.isEmpty()) {
                right[i] = n - 1;
                myStack.push(i);
            } else {
                while (!myStack.isEmpty() && heights[myStack.peek()] >= heights[i]) {
                    myStack.pop();
                }
                right[i] = myStack.isEmpty() ? n - 1 : myStack.peek() - 1;
                myStack.push(i);
            }
        }
        
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            maxArea = Math.max(maxArea, heights[i] * (right[i] - left[i] + 1));
        }
        
        return maxArea;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the heights array: ");
        int size = scanner.nextInt();
        int[] heights = new int[size];
        System.out.println("Enter the elements of the heights array:");
        for (int i = 0; i < size; i++) {
            heights[i] = scanner.nextInt();
        }
        int area = largestRectangleArea(heights);
        System.out.println("Output:");
        System.out.println(area);
        scanner.close();
    }
}*/

// Max-Sliding window
/*public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("size: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("length: ");
        int length = scanner.nextInt();

        int[] result = maxSlidingWindow(arr, length);
        for (int num : result) {
            System.out.print(num + " ");
        }
        scanner.close();
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (!dq.isEmpty() && dq.peekFirst() == i - k) {
                dq.pollFirst();
            }

            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
                dq.pollLast();
            }

            dq.offerLast(i);

            if (i >= k - 1) {
                ans.add(nums[dq.peekFirst()]);
            }
        }

        // Convert the result list to an array
        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }

        return result;
    }
}*/

//Postfix to Prefix
/*import java.util.Stack;
public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String postfixExpression = scanner.nextLine();
        String prefixExpression = postfixToPrefix(postfixExpression);
        System.out.println(prefixExpression);
        scanner.close();
    }

    public static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    public static String postfixToPrefix(String postfix) {
        Stack<String> stack = new Stack<>();
        String[] tokens = postfix.split("\\s+");

        for (String token : tokens) {
            if (!isOperator(token.charAt(0))) {
                stack.push(token);
            } else {
                String operand2 = stack.pop();
                String operand1 = stack.pop();
                String result = token + " " + operand1 + " " + operand2;
                stack.push(result);
            }
        }
        return stack.peek();
    }
}*/

// Postfix to Infix
/*import java.util.Stack;
public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String postfixExpression = scanner.nextLine();
        String infixExpression = postfixToInfix(postfixExpression);
        System.out.println(infixExpression);
        scanner.close();
    }

    public static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    public static String postfixToInfix(String postfix) {
        Stack<String> stack = new Stack<>();
        String[] tokens = postfix.split("\\s+");

        for (String token : tokens) {
            if (!isOperator(token.charAt(0))) {
                stack.push(token);
            } else {
                String operand2 = stack.pop();
                String operand1 = stack.pop();
                String result = '(' + operand1 + " " + token + " " + operand2 + ')';
                stack.push(result);
            }
        }
        return stack.peek();
    }
}*/

// Infix to prefix
/*public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String infixExpression = scanner.nextLine();
        String prefixExpression = infixToPrefix(infixExpression);
        System.out.println(prefixExpression);
        scanner.close();
    }

    public static int getPrecedence(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return 0;
    }

    public static String infixToPrefix(String infix) {
        // Reverse the infix expression
        infix = new StringBuilder(infix).reverse().toString();
        
        // Replace '(' with ')' and vice versa
        infix = infix.replace('(', '#');
        infix = infix.replace(')', '(');
        infix = infix.replace('#', ')');

        Stack<Character> stack = new Stack<>();
        StringBuilder postfix = new StringBuilder();

        for (int i = 0; i < infix.length(); i++) {
            char c = infix.charAt(i);

            // If the character is an operand, add it to the output
            if (Character.isLetterOrDigit(c)) {
                postfix.append(c);
            } 
            // If the character is '(', push it to the stack
            else if (c == '(') {
                stack.push(c);
            } 
            // If the character is ')', pop and output from the stack
            // until an '(' is encountered
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                stack.pop();
            } 
            // An operator is encountered
            else {
                while (!stack.isEmpty() && getPrecedence(c) < getPrecedence(stack.peek())) {
                    postfix.append(stack.pop());
                }
                stack.push(c);
            }
        }

        // Pop all the operators from the stack
        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }

        // Reverse postfix to get prefix
        return postfix.reverse().toString();
    }
}*/

//find next Greater element
/*import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input for nums1 array
        System.out.print("Enter the size of nums1 array: ");
        int n1 = scanner.nextInt();
        int[] nums1 = new int[n1];
        System.out.print("Enter elements of nums1 array separated by space: ");
        for (int i = 0; i < n1; i++) {
            nums1[i] = scanner.nextInt();
        }
        
        // Input for nums2 array
        System.out.print("Enter the size of nums2 array: ");
        int n2 = scanner.nextInt();
        int[] nums2 = new int[n2];
        System.out.print("Enter elements of nums2 array separated by space: ");
        for (int i = 0; i < n2; i++) {
            nums2[i] = scanner.nextInt();
        }
        
        // Get the result
        int[] result = nextGreaterElement(nums1, nums2);
        
        // Print the result
        System.out.println("Next greater elements:");
        for (int element : result) {
            System.out.print(element + " ");
        }
        scanner.close();
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> nextGreater = new HashMap<>();
        int[] result = new int[nums1.length];
        
        // Traverse nums2 and fill the nextGreater map
        for (int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num) {
                nextGreater.put(stack.pop(), num);
            }
            stack.push(num);
        }
        
        // Traverse nums1 and use the nextGreater map to fill the result
        for (int i = 0; i < nums1.length; i++) {
            result[i] = nextGreater.getOrDefault(nums1[i], -1);
        }
        
        return result;
    }
}
 */

// Total amount of water
/*public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input for number of elements in elevation map
        System.out.print("Enter the number of elements in elevation map: ");
        int n = scanner.nextInt();
        int[] elevationMap = new int[n];
        
        // Input for elevation map elements
        System.out.print("Enter the elevation map elements separated by space: ");
        for (int i = 0; i < n; i++) {
            elevationMap[i] = scanner.nextInt();
        }
        
        // Calculate the total amount of trapped water
        int result = trapWater(elevationMap);
        
        // Output the result
        System.out.println("Total amount of water trapped among the blocks: " + result);
        
        scanner.close();
    }

    public static int trapWater(int[] height) {
        int n = height.length;
        if (n <= 2) {
            return 0;
        }
        
        int left = 0;
        int right = n - 1;
        int leftMax = 0;
        int rightMax = 0;
        int trappedWater = 0;
        
        while (left < right) {
            if (height[left] < height[right]) {
                leftMax = Math.max(leftMax, height[left]);
                trappedWater += leftMax - height[left];
                left++;
            } else {
                rightMax = Math.max(rightMax, height[right]);
                trappedWater += rightMax - height[right];
                right--;
            }
        }
        
        return trappedWater;
    }
}*/

// Sum of min(b) of all the subarrays
/*import java.util.Scanner;
import java.util.Stack;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] nums = new int[size];

        // Input for array elements
        System.out.print("Enter the elements of the array separated by space: ");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }

        // Calculate the sum of minimum values of all contiguous subarrays
        long sumVal = findMinSum(nums);

        // Output the result
        System.out.println(sumVal);

        scanner.close();
    }

    public static long findMinSum(int[] A) {
        int n = A.length;
        Stack<Integer> stack = new Stack<>();
        long[] nextSmaller = new long[n];
        long[] preSmaller = new long[n];

        // Calculate next smaller elements
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && A[stack.peek()] > A[i]) {
                nextSmaller[stack.pop()] = i;
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            nextSmaller[stack.pop()] = n;
        }

        // Calculate previous smaller elements
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && A[stack.peek()] >= A[i]) {
                preSmaller[stack.pop()] = i;
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            preSmaller[stack.pop()] = -1;
        }

        long ans = 0;
        long mod = 1000000007;

        // Calculate the answer
        for (int i = 0; i < n; i++) {
            long left = i - preSmaller[i];
            long right = nextSmaller[i] - i;
            ans = (ans + A[i] * left * right) % mod;
        }

        return ans;
    }
}*/

// Difference between largest and smallest number of a subarray
/*public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Input the elements of the array
        System.out.print("Enter the elements of the array separated by space: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Calculate the sum of subarray ranges
        long result = sumOfSubarrayRanges(arr);

        // Output the result
        System.out.println(result);

        scanner.close();
    }

    public static long sumOfSubarrayRanges(int[] nums) {
        int n = nums.length;
        long totalSum = 0;

        for (int i = 0; i < n; i++) {
            int minVal = Integer.MAX_VALUE;
            int maxVal = Integer.MIN_VALUE;
            for (int j = i; j < n; j++) {
                minVal = Math.min(minVal, nums[j]);
                maxVal = Math.max(maxVal, nums[j]);
                totalSum += (maxVal - minVal);
            }
        }

        return totalSum;
    }
}*/

// subsequences of a string in lexicographical order
/*import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter the string: ");
        String inputString = scanner.nextLine();

        // Generate subsequences
        List<String> subsequences = new ArrayList<>();
        generateSubsequences(inputString, "", 0, subsequences);

        // Sort the subsequences in lexicographical order
        Collections.sort(subsequences);

        // Print the subsequences
        for (String subsequence : subsequences) {
            System.out.print(subsequence + " ");
        }

        scanner.close();
    }

    public static void generateSubsequences(String inputString, String current, int index, List<String> subsequences) {
        if (index == inputString.length()) {
            subsequences.add(current);
            return;
        }
        // Include the current character
        generateSubsequences(inputString, current + inputString.charAt(index), index + 1, subsequences);
        // Exclude the current character
        generateSubsequences(inputString, current, index + 1, subsequences);
    }
}
 */

// well-formed parenthesis
/*import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        
        List<String> combinations = generateParenthesis(n);
        for (String parenthesis : combinations) {
            System.out.print(parenthesis + " ");
        }
    }

    public static List<String> generateParenthesis(int n) {
        List<String> formedParenthesis = new ArrayList<>();
        backtrack(0, 0, "", formedParenthesis, n);
        return formedParenthesis;
    }

    private static void backtrack(int openCount, int closeCount, String current, List<String> formedParenthesis, int n) {
        if (openCount == n && closeCount == n) {
            formedParenthesis.add(current);
            return;
        }
        if (openCount < n) {
            backtrack(openCount + 1, closeCount, current + "(", formedParenthesis, n);
        }
        if (closeCount < openCount) {
            backtrack(openCount, closeCount + 1, current + ")", formedParenthesis, n);
        }
    }
}
 */

// Maximum number of consecutive 1's in the array if you can flip at most k 0's
/*public class App {
    public static int countConsecutiveOnes(int[] nums, int k){
        int maxConsecutiveOne = 0;
        int start = 0;
        int zeroCount = 0;
        for(int end=0;end<nums.length;end++){
            if(nums[end] == 0){
                zeroCount++;
            }
            while(zeroCount > k){
                if(nums[start] == 0){
                    zeroCount--;
                }
                start++;
            }
            maxConsecutiveOne = Math.max(maxConsecutiveOne,start-end+1);
        }
        return maxConsecutiveOne;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        System.out.println(countConsecutiveOnes(nums, k));
        scanner.close();
    }
}*/

// Combinations of a targetted sum in lexicographical order
/*import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
    
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);  // Sort candidates to handle duplicates and for lexicographical order
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int[] candidates, int target, int start, List<Integer> path, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(path));
            return;
        }
        if (target < 0) {
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            // Avoid duplicates
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }
            // Choose current candidate
            path.add(candidates[i]);
            // Recur with reduced target and next candidate index
            backtrack(candidates, target - candidates[i], i , path, result);
            // Backtrack, remove the last element
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of candidates
        int n = scanner.nextInt();
        int[] candidates = new int[n];

        // Read the candidates array
        for (int i = 0; i < n; i++) {
            candidates[i] = scanner.nextInt();
        }

        // Read the target value
        int target = scanner.nextInt();

        // Find combinations
        List<List<Integer>> result = combinationSum(candidates, target);

        // Print result
        if (result.isEmpty()) {
            System.out.println(-1);
        } else {
            for (List<Integer> combination : result) {
                for (int num : combination) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }

        scanner.close();
    }
}*/

// Unique combinations in candiadates where the candidate numbers sum to target
/*import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
    
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);  // Sort candidates to handle duplicates and for lexicographical order
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int[] candidates, int target, int start, List<Integer> path, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(path));
            return;
        }
        if (target < 0) {
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            // Avoid duplicates
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }
            // Choose current candidate
            path.add(candidates[i]);
            // Recur with reduced target and next candidate index
            backtrack(candidates, target - candidates[i], i + 1, path, result);
            // Backtrack, remove the last element
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of candidates
        int n = scanner.nextInt();
        int[] candidates = new int[n];

        // Read the candidates array
        for (int i = 0; i < n; i++) {
            candidates[i] = scanner.nextInt();
        }

        // Read the target value
        int target = scanner.nextInt();

        // Find combinations
        List<List<Integer>> result = combinationSum(candidates, target);

        // Print result
        if (result.isEmpty()) {
            System.out.println(-1);
        } else {
            for (List<Integer> combination : result) {
                for (int num : combination) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }

        scanner.close();
    }
}*/

// Find 3 integers in nums such that the sum is closest to target.
/*public class App {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = Integer.MAX_VALUE;
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                int diff = Math.abs(sum - target);
                if (diff < minDiff) {
                    minDiff = diff;
                    closestSum = sum;
                }
                if (sum < target) {
                    left++;
                } else if (sum > target) {
                    right--;
                } else {
                    return sum;
                }
            }
        }
        return closestSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        int result = threeSumClosest(nums, target);
        System.out.println(result);
        scanner.close();
    }
}*/

// Generate all possible subsets in lexographically increasing order. The solution must not contain duplicate subsets.   --- 3 testcases pending
/*public class App {
    public static void generateSubsequences(int[] nums, int index, List<Integer> current, List<List<Integer>> result){
        result.add(new ArrayList<>(current));

        for(int i=index;i<nums.length;i++){
            current.add(nums[i]);
            generateSubsequences(nums, i+1 , current, result);
            current.remove(current.size() - 1);
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = scanner.nextInt();
        }
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();
        generateSubsequences(nums, 0, new ArrayList<>(), result);

        for(List<Integer> subset : result){
            if(!subset.isEmpty()){
                for(int num : subset){
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }

        scanner.close();
    }
}*/

// Permutations of an array in lexicographical order
/*import java.util.Arrays;
import java.util.Scanner;

public class App {
    // Function to generate the next lexicographical permutation
    private static boolean nextPermutation(int[] array) {
        int i = array.length - 2;
        while (i >= 0 && array[i] >= array[i + 1]) {
            i--;
        }
        if (i < 0) {
            return false;
        }
        int j = array.length - 1;
        while (array[j] <= array[i]) {
            j--;
        }
        swap(array, i, j);
        reverse(array, i + 1, array.length - 1);
        return true;
    }

    // Function to swap two elements in an array
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // Function to reverse a part of the array
    private static void reverse(int[] array, int start, int end) {
        while (start < end) {
            swap(array, start, end);
            start++;
            end--;
        }
    }

    // Function to print all permutations in lexicographical order
    private static void printPermutations(int[] nums) {
        Arrays.sort(nums); // Sort the array to start with the smallest lexicographical permutation
        do {
            System.out.println(Arrays.toString(nums));
        } while (nextPermutation(nums));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        printPermutations(nums);
        scanner.close();
    }
}*/

// Return true if you can partition the array into two subsets such that the sum of the elements in both subsets is equal or false.
/*import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    
    // Recursive function to split array into two subarrays with equal sum
    private static boolean splitArrayEqualSum(int[] nums, int index, int sum1, int sum2, List<Integer> arr1, List<Integer> arr2) {
        if (index == nums.length) {
            return sum1 == sum2;
        }
        
        // Try adding current element to arr1
        arr1.add(nums[index]);
        if (splitArrayEqualSum(nums, index + 1, sum1 + nums[index], sum2, arr1, arr2)) {
            return true;
        }
        arr1.remove(arr1.size() - 1); // backtrack
        
        // Try adding current element to arr2
        arr2.add(nums[index]);
        if (splitArrayEqualSum(nums, index + 1, sum1, sum2 + nums[index], arr1, arr2)) {
            return true;
        }
        arr2.remove(arr2.size() - 1); // backtrack
        
        return false;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input array
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        
        // Attempt to split the array
        if (splitArrayEqualSum(nums, 0, 0, 0, arr1, arr2)) {
            System.out.println("Array can be split into two subarrays with equal sum:");
            System.out.println("Subarray 1: " + arr1);
            System.out.println("Subarray 2: " + arr2);
        } else {
            System.out.println("Not possible to split the array into two subarrays with equal sum.");
        }
        
        scanner.close();
    }
}*/

// Maximum possible length of th string
/*import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of strings
        int n = scanner.nextInt();
        scanner.nextLine(); // consume the newline

        // Read the array of strings
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLine();
        }

        // Compute and print the result
        System.out.println(maxLengthOfConcatenationSubsequence(arr));
    }

    public static int maxLengthOfConcatenationSubsequence(String[] arr) {
        int[] maxLength = new int[1];
        backtrack(arr, 0, "", maxLength);
        return maxLength[0];
    }

    private static void backtrack(String[] arr, int index, String current, int[] maxLength) {
        if (isUnique(current)) {
            maxLength[0] = Math.max(maxLength[0], current.length());
        } else {
            return; // Early termination if current string is not unique
        }
        if (index == arr.length) {
            return;
        }
        for (int i = index; i < arr.length; i++) {
            backtrack(arr, i + 1, current + arr[i], maxLength);
        }
    }

    private static boolean isUnique(String s) {
        Set<Character> charSet = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (charSet.contains(c)) {
                return false;
            }
            charSet.add(c);
        }
        return true;
    }
}*/

// Return all distinct solutions to the n-queens puzzle in lexicographically increasing order.
/*public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<List<String>> solutions = solveNQueens(n);
        printSolutions(solutions);
    }

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> solutions = new ArrayList<>();
        char[][] board = new char[n][n];
        
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        
        solve(solutions, board, 0, n);
        return solutions;
    }

    private static void solve(List<List<String>> solutions, char[][] board, int row, int n) {
        if (row == n) {
            solutions.add(createSolution(board));
            return;
        }
        
        for (int col = 0; col < n; col++) {
            if (isValid(board, row, col, n)) {
                board[row][col] = 'Q';
                solve(solutions, board, row + 1, n);
                board[row][col] = '.';
            }
        }
    }

    private static boolean isValid(char[][] board, int row, int col, int n) {
        // Check the column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check the upper left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check the upper right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    private static List<String> createSolution(char[][] board) {
        List<String> solution = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            solution.add(new String(board[i]));
        }
        return solution;
    }

    private static void printSolutions(List<List<String>> solutions) {
        Collections.sort(solutions, (o1, o2) -> {
            for (int i = 0; i < o1.size(); i++) {
                int cmp = o1.get(i).compareTo(o2.get(i));
                if (cmp != 0) {
                    return cmp;
                }
            }
            return 0;
        });

        for (List<String> solution : solutions) {
            for (String row : solution) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}*/

// Return the number of non-empty beautifyl subsets of the array nums.
/*public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read inputs
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        // Compute and print the result
        System.out.println(countBeautifulSubsets(nums, k));
    }

    public static int countBeautifulSubsets(int[] nums, int k) {
        List<Integer> subset = new ArrayList<>();
        return backtrack(nums, k, subset, 0);
    }

    private static int backtrack(int[] nums, int k, List<Integer> subset, int index) {
        if (index == nums.length) {
            if (isBeautiful(subset, k)) {
                return 1;
            } else {
                return 0;
            }
        }
        
        // Count subsets without the current element
        int count = backtrack(nums, k, subset, index + 1);
        
        // Count subsets with the current element
        subset.add(nums[index]);
        count += backtrack(nums, k, subset, index + 1);
        subset.remove(subset.size() - 1);
        
        return count;
    }

    private static boolean isBeautiful(List<Integer> subset, int k) {
        for (int i = 0; i < subset.size(); i++) {
            for (int j = i + 1; j < subset.size(); j++) {
                if (Math.abs(subset.get(i) - subset.get(j)) == k) {
                    return false;
                }
            }
        }
        return true;
    }
}*/

// perm[i] is divisible by i, i is divisible by perm[i].  Return the number of the beautify arrangements that you can construct.
/*public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input
        int n = scanner.nextInt();

        // Compute and print the result
        System.out.println(countArrangement(n));
    }

    public static int countArrangement(int n) {
        boolean[] visited = new boolean[n + 1];
        return countArrangementHelper(n, 1, visited);
    }

    private static int countArrangementHelper(int n, int pos, boolean[] visited) {
        if (pos > n) {
            return 1;
        }

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (!visited[i] && (i % pos == 0 || pos % i == 0)) {
                visited[i] = true;
                count += countArrangementHelper(n, pos + 1, visited);
                visited[i] = false;
            }
        }

        return count;
    }
}*/

// given n and k, return the kth permutation sequence.
/*public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the inputs
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        
        // Compute and print the result
        System.out.println(getPermutation(n, k));
    }

    public static String getPermutation(int n, int k) {
        List<Integer> numbers = new ArrayList<>();
        int[] factorials = new int[n + 1];
        StringBuilder result = new StringBuilder();

        // Create the list of numbers to get indices
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }
        
        // Compute factorials
        factorials[0] = 1;
        for (int i = 1; i <= n; i++) {
            factorials[i] = factorials[i - 1] * i;
        }
        
        // Adjust k to be zero-based index
        k--;

        // Compute the k-th permutation
        for (int i = 1; i <= n; i++) {
            int index = k / factorials[n - i];
            result.append(numbers.get(index));
            numbers.remove(index);
            k -= index * factorials[n - i];
        }
        
        return result.toString();
    }
}*/

// Return all the different possible non-decreasing subsequences of the array with atleast 2 dlements in lexicographical order
/*public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Compute and print the result
        List<List<Integer>> result = findSubsequences(nums);
        for (List<Integer> subsequence : result) {
            for (int num : subsequence) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> findSubsequences(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        List<Integer> current = new ArrayList<>();
        backtrack(nums, 0, current, set);
        
        List<List<Integer>> result = new ArrayList<>(set);
        Collections.sort(result, (a, b) -> {
            int len = Math.min(a.size(), b.size());
            for (int i = 0; i < len; i++) {
                if (!a.get(i).equals(b.get(i))) {
                    return a.get(i) - b.get(i);
                }
            }
            return a.size() - b.size();
        });

        return result;
    }

    private static void backtrack(int[] nums, int index, List<Integer> current, Set<List<Integer>> set) {
        if (current.size() >= 2) {
            set.add(new ArrayList<>(current));
        }

        for (int i = index; i < nums.length; i++) {
            if (current.isEmpty() || nums[i] >= current.get(current.size() - 1)) {
                current.add(nums[i]);
                backtrack(nums, i + 1, current, set);
                current.remove(current.size() - 1);
            }
        }
    }
}*/

// In one operation, you can pick 2 no.'s from array whose sum = k and remove them from array.  Return the maximum no. of operations that can be performed.
/*public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Compute and print the result
        System.out.println(maxOperations(nums, k));
    }

    public static int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int count = 0;

        // Build frequency map
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Iterate through the array
        for (int num : nums) {
            int complement = k - num;
            if (frequencyMap.getOrDefault(num, 0) > 0 && frequencyMap.getOrDefault(complement, 0) > 0) {
                // If num and complement are the same, ensure there are at least two occurrences
                if (num == complement && frequencyMap.get(num) < 2) {
                    continue;
                }

                // Perform the operation
                frequencyMap.put(num, frequencyMap.get(num) - 1);
                frequencyMap.put(complement, frequencyMap.get(complement) - 1);
                count++;
            }
        }

        return count;
    }
}*/

// Each boat carries at most 2 people at the same time, provided the sum of the weight of those people is at most limit.  Return the minimum number of boats to carry every given person.
/*public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        int n = scanner.nextInt();
        int limit = scanner.nextInt();
        int[] people = new int[n];
        for (int i = 0; i < n; i++) {
            people[i] = scanner.nextInt();
        }

        // Compute and print the result
        System.out.println(numRescueBoats(people, limit));
    }

    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0, j = people.length - 1;
        int boats = 0;

        while (i <= j) {
            if (people[i] + people[j] <= limit) {
                i++;
            }
            j--;
            boats++;
        }

        return boats;
    }
}*/

// Return the number of contiguous non-empty subarrays such that the value of the maximum array element in that subarray is in the range [left, right]
/*import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        int n = scanner.nextInt();
        int left = scanner.nextInt();
        int right = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Compute and print the result
        System.out.println(numSubarrayBoundedMax(nums, left, right));
    }

    public static int numSubarrayBoundedMax(int[] nums, int left, int right) {
        return countSubarrays(nums, right) - countSubarrays(nums, left - 1);
    }

    private static int countSubarrays(int[] nums, int bound) {
        int count = 0, current = 0;
        for (int num : nums) {
            if (num <= bound) {
                current++;
                count += current;
            } else {
                current = 0;
            }
        }
        return count;
    }
}
 */

// Return the maximum possible score you can achieve after playing any number of tokens.
/*import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        int n = scanner.nextInt();
        int[] tokens = new int[n];
        for (int i = 0; i < n; i++) {
            tokens[i] = scanner.nextInt();
        }
        int power = scanner.nextInt();

        // Compute and print the result
        System.out.println(maxScore(tokens, power));
    }

    public static int maxScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int i = 0, j = tokens.length - 1;
        int score = 0, maxScore = 0;

        while (i <= j) {
            if (power >= tokens[i]) {
                // Play token face-up
                power -= tokens[i];
                score++;
                maxScore = Math.max(maxScore, score);
                i++;
            } else if (score > 0) {
                // Play token face-down
                power += tokens[j];
                score--;
                j--;
            } else {
                break;
            }
        }

        return maxScore;
    }
}
 */

// Return the longest_palindromic_substring.  There can be multiple answers but you should return the substring which starts at the lower index.
/*public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(longestPalindrome(s));
    }

    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1)
            return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i); // Odd length palindromes
            int len2 = expandAroundCenter(s, i, i + 1); // Even length palindromes
            int len = Math.max(len1, len2);
            if (len > end - start + 1) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            } else if (len == end - start + 1) {
                int newStart = i - (len - 1) / 2;
                if (newStart < start) {
                    start = newStart;
                    end = i + len / 2;
                }
            }
        }
        return s.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }
}*/

// Return the maximum possible greatness you can achieve after permuting nums.
/*import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Compute and print the result
        System.out.println(maxGreatness(nums));
    }

    public static int maxGreatness(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int greatness = 0;
        int j = 0; // pointer to iterate over the sorted array

        for (int i = 0; i < n; i++) {
            while (j < n && nums[j] <= nums[i]) {
                j++;
            }
            if (j < n) {
                greatness++;
                j++;
            }
        }
        return greatness;
    }
}*/

// Mapping of digits to letters.  Print all possible letter combinations that the number could represent.
/*import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private static final String[] KEYPAD = {
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String digits = scanner.next();
        List<String> result = letterCombinations(digits);
        for (String combination : result) {
            System.out.print(combination + " ");
        }
    }

    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }
        backtrack(result, new StringBuilder(), digits, 0);
        return result;
    }

    private static void backtrack(List<String> result, StringBuilder current, String digits, int index) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }
        String letters = KEYPAD[digits.charAt(index) - '0'];
        for (char letter : letters.toCharArray()) {
            current.append(letter);
            backtrack(result, current, digits, index + 1);
            current.deleteCharAt(current.length() - 1); // backtrack
        }
    }
}
 */

// Return an integer array pairs of length n where pairs[i] is the number of potions that will form a successful pair with the ith spell.
/*import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading input
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[] spells = new int[m];
        int[] potions = new int[n];
        
        for (int i = 0; i < m; i++) {
            spells[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            potions[i] = scanner.nextInt();
        }
        
        long success = scanner.nextLong();
        
        // Getting the result
        int[] result = successfulPairs(spells, potions, success);
        
        // Printing the result
        for (int count : result) {
            System.out.print(count + " ");
        }
    }

    public static int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int m = potions.length;
        int[] pairs = new int[n];
        
        Arrays.sort(potions);
        
        for (int i = 0; i < n; i++) {
            pairs[i] = countSuccessfulPairs(spells[i], potions, success);
        }
        
        return pairs;
    }
    
    private static int countSuccessfulPairs(int spell, int[] potions, long success) {
        int left = 0;
        int right = potions.length;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            if ((long) spell * potions[mid] >= success) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        
        return potions.length - left;
    }
}*/

// Find 3 integers in nums such that the sum is closest to target.  Return the sum of the 3 integers.
/*import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static int threeSumClosest(int[] nums, int target) {
        // Sort the array
        Arrays.sort(nums);
        int n = nums.length;
        int closestSum = nums[0] + nums[1] + nums[2]; // Initialize with the sum of the first three elements

        // Iterate through the array
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];

                // Check if the current sum is closer to the target than the closest sum found so far
                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currentSum;
                }

                if (currentSum < target) {
                    left++; // Move the left pointer to the right to increase the sum
                } else if (currentSum > target) {
                    right--; // Move the right pointer to the left to decrease the sum
                } else {
                    // If the currentSum is exactly equal to the target, we have found the closest possible sum
                    return currentSum;
                }
            }
        }

        return closestSum; // Return the closest sum found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the length of the array
        int n = scanner.nextInt();

        // Reading the elements of the array
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Reading the target value
        int target = scanner.nextInt();

        // Calculating the closest sum
        int result = threeSumClosest(nums, target);

        // Printing the result
        System.out.println(result);
    }
}
 */

// Print all possible subsets (the power set) in lexographically increasing order.  The solution set must not contain duplicate subsets. --- 3 test cases pending
/*import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PowerSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the value of n
        System.out.print("Enter the number of elements (n): ");
        int n = scanner.nextInt();

        // Read the array elements
        int[] nums = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Generate and print all subsets
        List<List<Integer>> result = subsets(nums);
        for (List<Integer> subset : result) {
            for (int num : subset) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // Ensure the array is sorted for lexicographical order
        backtrack(result, new ArrayList<>(), nums, 0);
        return result;
    }

    private static void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums, int start) {
        // Add the current non-empty subset to the result list
        if (!tempList.isEmpty()) {
            result.add(new ArrayList<>(tempList));
        }
        for (int i = start; i < nums.length; i++) {
            tempList.add(nums[i]);
            backtrack(result, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1); // Remove the last element to backtrack
        }
    }
}
 */

// koko eats n piles of banana
/*public class App {
    public static int minEatSpeed(int[] piles, int h) {
        int left = 1;
        int right = getMax(piles);
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canEatAll(piles, h, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private static boolean canEatAll(int[] piles, int h, int k) {
        int hoursNeeded = 0;
        for (int pile : piles) {
            hoursNeeded += (pile + k - 1) / k;
        }
        return hoursNeeded <= h;
    }

    private static int getMax(int[] piles) {
        int max = Integer.MIN_VALUE;
        for (int pile : piles) {
            max = Math.max(max, pile);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] piles = new int[n];
        for (int i = 0; i < n; i++) {
            piles[i] = scanner.nextInt();
        }
        int h = scanner.nextInt();
        int minSpeed = minEatSpeed(piles, h);
        System.out.println(minSpeed);
        scanner.close();
    }
}*/

// length of longest chain based on the pairs
/*public class App {
    public static int findLongestChain(int[][] pairs){
    // Comparator.comparingInt: This is a method in the Comparator class that returns a comparator that compares int values extracted from the objects being compared.
    // pair -> pair[1]: This is a lambda expression that specifies the key to sort by. For each pair (which is an array of two integers), pair[1] extracts the second element of the pair.
        Arrays.sort(pairs, Comparator.comparingInt(pair -> pair[1]));

        int currentEnd = Integer.MIN_VALUE;
        int count = 0;
        for(int[] pair : pairs){
            if(pair[0] > currentEnd){
                currentEnd = pair[1];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] pairs = new int[n][2];
        for(int i=0;i<n;i++){
            pairs[i][0] = scanner.nextInt();
            pairs[i][1] = scanner.nextInt();
        }
        int longestChainLength = findLongestChain(pairs);
        System.out.println(longestChainLength);
        scanner.close();
    }
}*/

// Return the kth smallest fraction considered.  Print your answer as numerator space denominator
/*import java.util.PriorityQueue;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        System.out.println("Enter the number of elements (n) and the value of k:");
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Find the k-th smallest fraction
        int[] result = findKthSmallestFraction(arr, k);
        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] findKthSmallestFraction(int[] arr, int k) {
        PriorityQueue<Fraction> minHeap = new PriorityQueue<>();

        // Initial fractions (arr[0] / arr[j])
        for (int j = 1; j < arr.length; j++) {
            minHeap.offer(new Fraction(arr[0], arr[j], 0, j));
        }

        // Extract min k-1 times to get the k-th smallest fraction
        for (int i = 0; i < k - 1; i++) {
            Fraction fraction = minHeap.poll();
            int numeratorIndex = fraction.numeratorIndex;
            int denominatorIndex = fraction.denominatorIndex;
            if (numeratorIndex + 1 < denominatorIndex) {
                minHeap.offer(new Fraction(arr[numeratorIndex + 1], arr[denominatorIndex], numeratorIndex + 1,
                        denominatorIndex));
            }
        }

        // The k-th smallest fraction
        Fraction kthFraction = minHeap.poll();
        return new int[] { kthFraction.numerator, kthFraction.denominator };
    }
}

class Fraction implements Comparable<Fraction> {
    int numerator;
    int denominator;
    int numeratorIndex;
    int denominatorIndex;
    double value;

    public Fraction(int numerator, int denominator, int numeratorIndex, int denominatorIndex) {
        this.numerator = numerator;
        this.denominator = denominator;
        this.numeratorIndex = numeratorIndex;
        this.denominatorIndex = denominatorIndex;
        this.value = (double) numerator / denominator;
    }

    @Override
    public int compareTo(Fraction other) {
        return Double.compare(this.value, other.value);
    }
}*/

// Return the length of the longest strictly increasing subsequence. 
/*public class App {
    public static int lengthofLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        int maxLength = 1;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxLength = Math.max(maxLength, dp[i]);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println(lengthofLIS(nums));
        scanner.close();
    }
}*/

// Maximun no. of fruits you can pick
/*public class App {
    public static int totalFruits(int[] fruits){
        if(fruits == null || fruits.length == 0){
            return 0;
        }
        int maxFruits = 0;
        int left = 0;
        int n = fruits.length;
        HashMap<Integer, Integer> basket = new HashMap<>();
        for(int right = 0; right < n; right++){
            basket.put(fruits[right], basket.getOrDefault(fruits[right], 0) + 1);
            while (basket.size()>2) {
                basket.put(fruits[left], basket.get(fruits[left])-1);
                if(basket.get(fruits[left]) == 0){
                    basket.remove(fruits[left]);
                }
                left++;
            }
            maxFruits = Math.max(maxFruits, right - left + 1);
        }
        return maxFruits;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] fruits = new int[n];
        for(int i=0;i<n;i++){
            fruits[i] = scanner.nextInt();
        }
        int result = totalFruits(fruits);
        System.out.print(result);
        scanner.close();
    }
}*/

// Maximum amount of gold you can collect from "grid m x n"
/*class GoldMine {
    public int getMaxGold(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;
        int maxGoldCollected = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] > 0){
                    maxGoldCollected = Math.max(maxGoldCollected, dfs(grid, i, j, m, n));
                }
            }
        }
        return maxGoldCollected;
    }
    private int dfs(int[][] grid, int x, int y, int m, int n){
        if(x < 0 || x >= m || y < 0 || y >= n || grid[x][y] == 0){
            return 0;
        }
        int originalGold = grid[x][y];
        grid[x][y] = 0;
        int maxGold = 0;
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        for(int[] direction : directions){
            int nx = x + direction[0];
            int ny = y + direction[1];
            maxGold = Math.max(maxGold, dfs(grid, nx, ny, m, n));
        }
        grid[x][y] = originalGold;
        return originalGold + maxGold;
    }    
}

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] grid = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                grid[i][j] = scanner.nextInt();
            }
        }
        GoldMine solution = new GoldMine();
        int maxGold = solution.getMaxGold(grid);
        System.out.println(maxGold);
        scanner.close();
    }
}*/

// Return the sum of the chemistry of all the teams, or return -1 if there is no way to divide the players into teams
/*public class App {
    public static int divideTeams(int[] skill){
        int n = skill.length;
        Arrays.sort(skill);
        int totalSkill = skill[0] + skill[n-1];
        int totalChemistry = 0;
        for(int i=0;i<n/2;i++){
            if(skill[i] + skill[n-1-i] != totalSkill){
                return -1;
            }
            totalChemistry += skill[i] * skill[n-1-i];
        }
        return totalChemistry;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] skill = new int[n];
        for(int i=0;i<n;i++){
            skill[i] = scanner.nextInt();
        }
        int result = divideTeams(skill);
        System.out.println(result);
        scanner.close();
    }
}*/

// Print min number of moves you can play space max number of moves you can play
/*public class App {

    public static int[] numMoves(int[] stones) {
        Arrays.sort(stones);
        int n = stones.length;
        int minMoves = Integer.MAX_VALUE;
        int maxMoves = Math.max(stones[n - 1] - stones[1], stones[n - 2] - stones[0]) - (n - 2);
        
        // Using a sliding window to find the minimum moves
        for (int i = 0, j = 0; i < n; ++i) {
            while (j < n && stones[j] - stones[i] + 1 <= n) {
                j++;
            }
            int currentMoves = n - (j - i);
            if (j - i == n - 1 && stones[j - 1] - stones[i] == n - 2) {
                currentMoves = 2; // Special case where only 2 moves are needed
            }
            minMoves = Math.min(minMoves, currentMoves);
        }

        return new int[]{maxMoves, minMoves};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("size ");
        int n = scanner.nextInt();
        int[] stones = new int[n];
        for(int i=0;i<n;i++){
            stones[i] = scanner.nextInt();
        }
        int[] result = numMoves(stones);
        System.out.println(result[0] + " " + result[1]);
        scanner.close();
    }
}*/

// Return true if one of s1's permutations is the substring of s2
/*import java.util.Arrays;
import java.util.Scanner;

public class App {
    public  static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] s1Count = new int[26];
        int[] s2Count = new int[26];

        // Count the frequency of each character in s1
        for (int i = 0; i < s1.length(); i++) {
            s1Count[s1.charAt(i) - 'a']++;
            s2Count[s2.charAt(i) - 'a']++;
        }

        // Use sliding window technique to compare segments of s2 with s1
        for (int i = s1.length(); i < s2.length(); i++) {
            if (Arrays.equals(s1Count, s2Count)) return true;

            // Move the window to the right: remove the leftmost character of the previous window
            s2Count[s2.charAt(i - s1.length()) - 'a']--;
            // Add the new character to the current window
            s2Count[s2.charAt(i) - 'a']++;
        }

        // Check the last window
        return Arrays.equals(s1Count, s2Count);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter s1: ");
        String s1 = scanner.nextLine();

        System.out.print("Enter s2: ");
        String s2 = scanner.nextLine();

        // Solution solution = new Solution();
        boolean result = checkInclusion(s1, s2);

        System.out.println("Output: " + result);
        scanner.close();
    }
}*/

// You are given 3 positive integers: n, index, and maxSum.  You want to construct an array nums (0-indexed) that satisfies the following conditions.  Note that abs(x) equals x if x >= 0, and -x otherwise.
/*public class MaxValueAtIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read inputs
        int n = scanner.nextInt();      // Length of the array
        int index = scanner.nextInt();  // Index to maximise
        int maxSum = scanner.nextInt(); // Maximum sum allowed
        
        // Binary search to find the maximum value at nums[index]
        int low = 1;
        int high = maxSum;
        int result = 1; // Minimum possible value for nums[index]
        
        while (low <= high) {
            int mid = low + (high - low) / 2; // Calculate mid value
            
            // Calculate the total sum needed to achieve nums[index] = mid
            long sum = mid; // Start with the peak value at index

            // Left slope calculation
            if (mid > index) {
                int leftSlope = mid - 1;
                sum += (long) (leftSlope + (leftSlope - index + 1)) * index / 2;
            } else {
                sum += (long) mid * (mid - 1) / 2 + (index - mid + 1);
            }

            // Right slope calculation
            int rightElements = n - index - 1;
            if (mid > rightElements) {
                int rightSlope = mid - 1;
                sum += (long) (rightSlope + (rightSlope - rightElements + 1)) * rightElements / 2;
            } else {
                sum += (long) mid * (mid - 1) / 2 + (rightElements - mid + 1);
            }

            // Adjust binary search range
            if (sum <= maxSum) {
                result = mid; // Update result as we found a feasible mid
                low = mid + 1; // Try for a larger mid
            } else {
                high = mid - 1; // Try for a smaller mid
            }
        }
        
        // Output the result
        System.out.println(result);
        
        // Close the scanner
        scanner.close();
    }
}*/

// Return the total number of friend requests made

// There are n persons on a social media website.  You are given an integer array ages where ages[i] is the age pf the ith person.  
// A person x will not send a friend request to a person y (x != y) if any of the following conditions is true:
// age[y] <= 0.5 * age[x] + 7
// age[y] > age[x]
// age[y] > 100 && age[x] < 100
/*public class App {
    public static int countRequests(int[] ages){
        int count = 0; // to store the total number of friend requests

        // Array to store how many people are of a particular age (ages range from 1 to 120)
        int[] ageCount = new int[121];
        for (int age : ages) {
            ageCount[age]++; // Increment the count for the person's age
        }

        // Loop through each possible pair of ages
        for (int ageX = 1; ageX <= 120; ageX++) {
            for (int ageY = 1; ageY <= 120; ageY++) {
                // Skip if there are no people of this age
                if (ageCount[ageX] == 0 || ageCount[ageY] == 0) continue;

                // Check if a friend request can be sent from ageX to ageY
                if (canSendRequest(ageX, ageY)) {
                    if (ageX == ageY) {
                        // If both people have the same age, person X can send request to everyone except themselves
                        count += ageCount[ageX] * (ageCount[ageX] - 1);
                    } else {
                        // If ages are different, count how many requests can be sent from ageX to ageY
                        count += ageCount[ageX] * ageCount[ageY];
                    }
                }
            }
        }
        return count;
    }

    // Function to check if person X (with ageX) can send a request to person Y (with ageY)
    public static boolean canSendRequest(int ageX, int ageY) {
        return !(ageY <= 0.5 * ageX + 7 || ageY > ageX || (ageY > 100 && ageX < 100));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ages = new int[n];
        for(int i=0;i<n;i++){
            ages[i] = scanner.nextInt();
        }
        int result = countRequests(ages);
        System.out.println(result);
        scanner.close();
    }
}*/






