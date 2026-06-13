import java.util.ArrayList;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Expense e=new Expense(1,475.66f,"Food","Swiggy","09-06-2026");
        e.toString();*/
        ArrayList<Expense> expenses=new ArrayList<>();
        System.out.println("===== Expense Manager =====");
        System.out.println("1. Add Expense");
        System.out.println("2. View Expenses");
        System.out.println("3. Exit");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter choice");
        int optionChosen=sc.nextInt();
        if(optionChosen==1) {
            System.out.println("Enter id:");
            int id=sc.nextInt();
            System.out.println("Enter Amount:");
            float amount=sc.nextFloat();
            sc.nextLine();//nextFloat reads only the float element so suppose user enters 500 it only reads that but when user press enter after 500 that \n char is not read by next float,thus \n stays in buffer and is allocated to category..to avoid this need to make extra next line statement
            System.out.println("Enter Category:");
            String category=sc.nextLine();
            System.out.println("Enter Description");
            String description=sc.nextLine();
            System.out.println("Enter Date:");
            String date=sc.nextLine();
            Expense e=new Expense(id,amount,category,description,date);
            expenses.add(e);
            System.out.println("Expense Added Successfully");
        }
        else if(optionChosen==2) {
            System.out.println("User chose to view expense");
        }
        else if(optionChosen==3){
            System.out.println("Exiting...");
        }
        else{
            System.out.println("Invalid input");
        }
        /*ArrayList<Expense> expenses=new ArrayList<>();
        expenses.add(new Expense(1,388.6f,"Food","zomato","10-06-2026"));
        expenses.add(new Expense(2,255,"ride","uber","08-06-2026"));
        expenses.add(new Expense(3,580,"ration","swiggy","08-06-2026"));
        System.out.println("list waala"+expenses);
        for(Expense expense:expenses){
            System.out.println(expense);
        }*/
        //Expense.printExpense(e);
    }
}