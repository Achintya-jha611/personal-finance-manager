import java.util.ArrayList;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static Expense getExpenseFromUser(Scanner sc){
        System.out.println("Enter id:");
        int id = sc.nextInt();
        System.out.println("Enter Amount:");
        float amount = sc.nextFloat();
        sc.nextLine();
        System.out.println("Enter Category:");
        String category = sc.nextLine();
        System.out.println("Enter Description");
        String description = sc.nextLine();
        System.out.println("Enter Date:");
        String date = sc.nextLine();
        Expense expense = new Expense(id, amount, category, description, date);
        return expense;
    }
    public static void main(String[] args) {
        ExpenseService expenseService=new ExpenseService();
        //ArrayList<Expense> expenses=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        boolean continueExpenseManagement=true;
        while(continueExpenseManagement) {
            expenseService.printMenu();
            int optionChosen=sc.nextInt();
            if (optionChosen == 1) {
                Expense expense=getExpenseFromUser(sc);
                expenseService.addExpense(expense);
                System.out.println("Want to add more expenses?Enter 1 to continue and 2 to stop");
                int choice=sc.nextInt();
                if(choice==1){
                    continue;
                }
                else{
                    continueExpenseManagement=false;
                }
            } else if (optionChosen == 2) {
                expenseService.viewExpense();
                System.out.println("want to continue expense management?enter 1 to continue 2 to stop");
                int choice=sc.nextInt();
                if(choice==1){
                    continue;
                }
                else{
                    continueExpenseManagement=false;
                }
            } else if (optionChosen == 3) {
                System.out.println("Exiting...");
                break;

            } else {
                System.out.println("Invalid input");
            }
        }
    }
}