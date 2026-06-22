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
    public static boolean askToContinue(Scanner sc){
        System.out.println("Want to continue expense management? Enter true to continue and false to stop");
        return sc.nextBoolean();
    }
    public static void main(String[] args) {
        ExpenseService expenseService=new ExpenseService();
        Scanner sc=new Scanner(System.in);
        boolean continueExpenseManagement=true;
        while(continueExpenseManagement) {
            expenseService.printMenu();
            int optionChosen=sc.nextInt();
            sc.nextLine();
            if (optionChosen == 1) {
                Expense expense=getExpenseFromUser(sc);
                expenseService.addExpense(expense);
                continueExpenseManagement= askToContinue(sc);
            }
            else if (optionChosen == 2) {
                expenseService.viewExpense();
                continueExpenseManagement= askToContinue(sc);
            }
            else if (optionChosen == 3) {
                System.out.println("enter id of the expense you want to delete");
                int id=sc.nextInt();
                System.out.println("Moving ahead with deletion of expense");
                if(expenseService.deleteExpenseById(id)){
                    System.out.println("successfully deleted expense");
                    System.out.println("Updated expense list");
                    expenseService.viewExpense();
                    continueExpenseManagement= askToContinue(sc);
                }
                else{
                    System.out.println("could not find expense!");
                    continueExpenseManagement= askToContinue(sc);
                }

            }
            else if (optionChosen==4) {
                String category;
                System.out.println("Enter the expense category you want to search");
                category=sc.nextLine();
                ArrayList<Expense> matchingExpenses=expenseService.searchExpenseByCategory(category);
                if(matchingExpenses.size()!=0){
                    System.out.println("successfully found matching expense");
                    for(Expense e: matchingExpenses){
                        System.out.println(e);
                    }
                    continueExpenseManagement= askToContinue(sc);
                }
                else{
                    System.out.println("could not find expense!");
                    continueExpenseManagement= askToContinue(sc);
                }
            }
            else if(optionChosen==5){
                float amount;
                int id;
                System.out.println("Enter the expense id you want to update the amount for");
                id=sc.nextInt();
                sc.nextLine();
                System.out.println("Enter the value you want to update for the expense amount");
                amount=sc.nextFloat();
                sc.nextLine();
                if(expenseService.updateExpenseById(id,amount)){
                    System.out.println("successfully updated matching expense");
                    continueExpenseManagement= askToContinue(sc);
                }
                else{
                    System.out.println("could not update expense!");
                    continueExpenseManagement= askToContinue(sc);
                }
            }
            else if(optionChosen==6){
                System.out.println("Closing down expense management!");
                break;
            }
            else {
                System.out.println("option not available. Closing down expense management!");
            }
        }
    }
}