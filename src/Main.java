import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice2;

        do {


            Scanner input = new Scanner(System.in);
            System.out.println("press 1 for Task 1 : ");
            System.out.println("press 2 for Task 2 : ");
            System.out.println("press 3 for Task 3 : ");
            System.out.println("press 4 for Task 4 : ");
            System.out.println("press 5 for Task 5 : ");
            System.out.println("press 6 for Task 6 : ");
            System.out.println("press 7 for Task 7 : ");
            System.out.println("press 8 for Task 8 : ");
            System.out.println("press 9 for Task 9 : ");
            System.out.println("press 10 for Task 10 : ");
            int choice1 = input.nextInt();
            input.nextLine();  // Consume newline

            switch (choice1) {

                case 1: {

                    int basic_salary = 105000;
                    double dearness = (basic_salary * 40) / 100;
                    double h_rent = (basic_salary * 20) / 100;
                    double gross_salary = basic_salary + dearness + h_rent;

                    System.out.println("Gross Saary = " + gross_salary);


                }
                break;

                case 2: {

                    int distance = 2614;


                    System.out.println("Distance in meters= " + distance * 1000 + " meters ");
                    System.out.println("Distance in Inches= " + distance * 39370 + " Inches ");
                    System.out.println("Distance in centimeter= " + distance * 100000 + " centimeter ");
                    System.out.println("Distance in feet= " + distance * 3280.84 + " feet ");


                }
                break;

                case 3: {


                    int total_marks = 80 + 90 + 75 + 60 + 100;
                    double result = (total_marks * 100) / 500;

                    System.out.println("Marks = " + total_marks + "/500");
                    System.out.println("Percentage = " + result);

                }
                break;

                case 4: {


                    double Farn = 108;
                    double result = (Farn - 32) * 5 / 9;
                    result = Math.round(result);
                    System.out.println("Celcius = " + result + " C");


                }
                break;

                case 5: {

                    double length = 36;
                    double width = 36;
                    double radius = 36;

                    double a_result = length * width;
                    double pie = 3.14;
                    double c_result = pie * radius * radius;
                    double circumfarence = 2 * pie * radius;

                    System.out.println("Area of square = " + a_result);
                    System.out.println("Perimeter of square = " + (4 * length));


                    System.out.println("\n\nArea of circle = " + c_result);
                    System.out.println("Circumference of circle = " + circumfarence);

                }
                break;

                case 6: {
                    double a = 3;
                    double n = 4;

                    double result = Math.pow(a, n);

                    System.out.println("Result = " + result);


                }
                break;

                case 7: {
                    int n = 12345;
                    int a = 0;
                    int dS = 0;
                    int result = 0;

                    while (n > 0) {
                        a = n % 10;
                        dS += a;
                        n = n / 10;
                    }
                    System.out.println("\n\nThe Sum of all Digits = " + dS);

                }
                break;

                case 8: {

                    int m_per = 52;
                    int total_pop = 80000;
                    double total_p_litracy = 48;
                    double m_p_litracy = 35;

                    double w_p_litracy = total_p_litracy - m_p_litracy;

                    double w_pop = (80000 * w_p_litracy) / 100;
                    double m_pop = (80000 * m_p_litracy) / 100;


                    System.out.println("Total men litracy population = " + m_pop);

                    System.out.println("\nTotal women litracy population = " + w_pop);

                }
                break;

                case 9: {
                    int amount = 860;
                    int h_note = 0;
                    int f_note = 0;
                    int t_note = 0;

                    h_note = amount / 100;
                    amount %= 100;

                    f_note = amount / 50;
                    amount %= 50;

                    t_note = amount / 10;
                    amount %= 10;

                    System.out.println("\nNumber of hundred notes = " + h_note);
                    System.out.println("Number of fifty notes = " + f_note);
                    System.out.println("Number of ten notes = " + t_note);

                }
                break;

                case 10: {

                    double selling_price = 15000;
                    double profit_per = 20;
                    double total_profit = (profit_per * selling_price) / 100;
                    double total_cost = selling_price - total_profit;
                    double cost_per_item = total_cost / 15;

                    System.out.println("Cost per item is =$" + cost_per_item);

                }
                break;
                default: {
                    System.out.println("Invalid choice");
                }
                break;

            }
            System.out.println("Do you want to continue:(1/0) ");
             choice2 = input.nextInt();


        }while(choice2==1);

        System.out.println("Program Exiting!!!");






    }
}