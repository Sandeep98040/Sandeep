import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        if (age<18){
            System.out.println("You cannot vote");
        }else {
            System.out.println("You can vote");
        }


    }
}
class fifty{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your marks");
        double marks = scanner.nextDouble();
        if (marks>50){
            System.out.println("Marks is good");

        }else{
            System.out.println("Marks is not good");
        }
    }
}
class Results {
    public static void main(String args[]) {
        float progammming, database, android, math, communication;
        double total, average, marks;
        Scanner std = new Scanner(System.in);

        System.out.print("Enter marks of progammming :");
        progammming = std.nextFloat();
        System.out.print("Enter marks of database :");
        database = std.nextFloat();
        System.out.print("Enter marks of android :");
        android = std.nextFloat();
        System.out.print("Enter marks of maths :");
        math = std.nextFloat();
        System.out.print("Enter marks of communication :");
        communication = std.nextFloat();

        total = progammming + database + android + math + communication;
        average = (total / 5.0);
        marks = (total / 500.0) * 100;


        System.out.println("Total marks =" + total);
        System.out.println("Average marks = " + average);
        System.out.println("Percentage = " + marks);
        if (marks >= 70) {
            System.out.println("First Class Class");
        } else if (marks <= 59) {
            System.out.println("Upper Second Class");
        } else if (marks <= 49) {
            System.out.println("Second Class");
        } else {

            System.out.println("Third Class");
        }
    }
}
class vote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = scanner.nextInt();
        boolean votercard = true;
        if (age > 18) {
            if (votercard) {
                System.out.println("I have voting card");
            } else {
                System.out.println("I have not voting card");
            }
        }else{
            System.out.println("You cannot vote");
        }
    }
}
class Max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = scanner.nextInt();
        System.out.println("Enter second number:");
        int b = scanner.nextInt();
        if (a < b) {
            System.out.println("Maximum number");
        } else {
            System.out.println("Not a maximum number");

        }
    }
}

class Maximum{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=scanner.nextInt();
        System.out.println("Enter second number:");
        int b=scanner.nextInt();
        System.out.println("Enter third  number:");
        int c=scanner.nextInt();
        if(a>b && a>c){
            System.out.println("Maximum Number");

        }
        else if(b>a && b>c){
            System.out.println("Maximum number");
        }
        else{
            System.out.println("not a maximum");
        }
    }
}

class Month{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the month number(1-12):");
        int month=scanner.nextInt();
        int year=scanner.nextInt();
        if(month==1){
            System.out.println("January 31 days");
        }
        else if (month==2){
            System.out.println("February");
            if ((year%400==0)||((year%4==0)&&(year%100!=0))){
                System.out.println("Number of days=29");
            }else{
                System.out.println("Number of days =28");
            }
        }
        else if(month==3){
            System.out.println("March 31 days");
        }
        else if(month==4){
            System.out.println("April 30 days");
        }
        else if(month==5) {
            System.out.println("May 31 days");
        }
        else if(month==6){
            System.out.println("June 30 days");
        }
        else if(month==7){
            System.out.println("July 31 days");
        }
        else if(month==8){
            System.out.println("August 31 days");
        }
        else if(month==9){
            System.out.println("September 30 days");
        }
        else if(month==10){
            System.out.println("October 31 days");
        }
        else if(month==11){
            System.out.println("November 30 days");
        }
        else if(month==12){
            System.out.println("December 31 days");
        }
        else{
            System.out.println("Invalid input!");
        }
    }
}

class Trianglee{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first traingle:");
        System.out.println("Enter second trinagle:");
        System.out.println("Enter third triangle:");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        int total=a+b+c;
        if(total==180){
            System.out.println("It is valid!!");
        }
        else{
            System.out.println("It is not valid!!");
        }
    }

}

class Triaa{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the sides of triangle:");
        double a=scanner.nextDouble();
        double b=scanner.nextDouble();
        double c=scanner.nextDouble();
        if((a+b>c)&&(b+c>a)&&(a+c>b)){
            System.out.println("It is valid triangle");

        }
        else{
            System.out.println("It is not valid triangle");
        }
    }
}

class divisible{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any num");
        int a = scanner.nextInt();
        if (a % 5 == 0 && a % 11 == 0) {
            System.out.println(" number is divisible by 5 and 11");
        } else {
            System.out.println("number is not divisible ");
        }
    }
}

class even{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any num");
        int a = scanner.nextInt();
        if (a%2==0) {
            System.out.println(" number is even");
        }
        else {
            System.out.println("number is odd");}
    }
}

class leap{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any num");
        int a = scanner.nextInt();
        if (a % 400 == 0) {
            System.out.println(" leap year");
        } else {
            System.out.println("not leap year");
        }
    }
}

class iso{
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three sides:");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if (a < b + c && b < a + c && c < a + b) {
            if (a == b && b == c)
                System.out.println("Equilateral Triangle");
            else if(a==b||b==c||c==a)
                System.out.println("Isoceles Traingle");
            else
                System.out.println("Scalene Triangle");
        }
        else
            System.out.println("Cant form any traingle");
    }
}
class Nega{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=scanner.nextInt();
        System.out.println("Enter second number:");
        int b=scanner.nextInt();
        System.out.println("Enter third number:");
        int c=scanner.nextInt();
        if(a==0){
            System.out.println("Negative");
        }
        else if(a<0){
            System.out.println("Positive");
        }
        else if(a>0){
            System.out.println("Zero");
        }
    }
}
class quadratic{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        double a = input.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = input.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = input.nextDouble();
        double d= b * b - 4.0 * a * c;
        if (d> 0.0)
        {
            double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
            System.out.println("The roots are " + r1 + " and " + r2);
        }
        else if (d == 0.0)
        {
            double r1 = -b / (2.0 * a);
            System.out.println("The root is " + r1);
        }
        else
        {
            System.out.println("Roots are not real.");
        }
    }
}

class Alpha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch;

        System.out.print("Enter a character:");
        ch  = scanner.next().charAt(0);


        if(Character.isAlphabetic(ch)){
            System.out.println("The number is a alphabet");
        }

        else{
            System.out.println("It is not a alphabet");
        }
    }
}

class Characte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the character.");
        String a;
        a = scanner.next();
        String v= "aeiou";
        if(v.contains(a)){
            System.out.println("The number is a vowel.");
        }
        else {
            System.out.println("The number is a consonant");
        }
    }

}

class Units {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float bill;

        System.out.print("Enter electricity unit: ");
        float unit = scanner.nextFloat();
        if(unit<=50){
            bill= (float) (unit*0.50);
            System.out.println(bill);
        }
        else if(unit<=150){
            bill = (float) ((float) (50*0.50)+((unit-50)*0.75));
            System.out.println(bill);
        }
        else if(unit<=250){
            bill = (float) ((float) (50*0.50)+(100*0.75)+((unit-150)*1.20));
            System.out.println(bill);
        }
        else if(unit>250){
            bill = (float) ((float) (50*0.50)+(100*0.75)+(100*1.20)+((unit-250)*1.50));
            System.out.println(bill);
        }
    }
}

class Salar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the salary: ");
        int salary = scanner.nextInt();

        if(salary<=10000){
            System.out.println("HRA=20%\nDA=80%");
        }
        else if(salary<=20000){
            System.out.println("HRA=25%\nDA=90%");
        }
        else if(salary>20000){
            System.out.println("HRA=30%\nDA=95%");
        }
    }
}
class note{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int amount=scanner.nextInt();
        int totalnoofnotes;
        if (amount%5==0){
            totalnoofnotes=amount/5;
            System.out.println(totalnoofnotes);

        }else {
            System.out.println("you must enter valid figures");
        }
    }
}

class ElectricityBill1 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        double Units;
        double Amount, Total_Amount;

        System.out.print(" Please Enter the Units that you Consumed  : ");
        Units = scanner.nextInt();

        if (Units < 50)
        {
            Amount = Units * 0.50;
        }
        else if (Units <= 150)
        {
            Amount = 25 + ((Units - 50 ) * 0.75);
        }
        else if (Units <= 250)
        {
            Amount = 25 + 75 + ((Units - 100 ) * 1.20);

        }
        else
        {
            Amount = 25 + 75 + 120 + ((Units - 200 ) * 1.50);

        }

        Total_Amount = Amount + (Amount*0.8);
        System.out.println("\n Electricity Bill  =  " + Total_Amount);
    }

}



