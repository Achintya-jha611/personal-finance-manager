import java.util.ArrayList;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ExpenseService expenseService=new ExpenseService();
        //ArrayList<Expense> expenses=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        boolean continueExpenseManagement=true;
        while(continueExpenseManagement) {
            expenseService.printMenu();
            int optionChosen=sc.nextInt();
            if (optionChosen == 1) {
                expenseService.addExpense(sc);
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