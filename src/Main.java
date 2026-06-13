import java.util.ArrayList;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Expense e=new Expense(1,475.66f,"Food","Swiggy","09-06-2026");
        e.toString();*/
        System.out.println("===== Expense Manager =====");
        System.out.println("1. Add Expense");
        System.out.println("2. View Expenses");
        System.out.println("3. Exit");
        Scanner sc=new Scanner(System.in);
        int optionChosen=sc.nextInt();
        if(optionChosen==1) {
            System.out.println("User chose to add expense");
        }
        if(optionChosen==2) {
            System.out.println("User chose to view expense");
        }
        if(optionChosen==3) {
            System.out.println("Exiting...");
        }
        ArrayList<Expense> expenses=new ArrayList<>();
        expenses.add(new Expense(1,388.6f,"Food","zomato","10-06-2026"));
        expenses.add(new Expense(2,255,"ride","uber","08-06-2026"));
        expenses.add(new Expense(3,580,"ration","swiggy","08-06-2026"));
        System.out.println("list waala"+expenses);
        for(Expense expense:expenses){
            System.out.println(expense);
        }
        //Expense.printExpense(e);
    }
}