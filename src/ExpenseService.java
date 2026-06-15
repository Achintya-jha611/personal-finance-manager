import java.util.ArrayList;
import java.util.Scanner;

public class ExpenseService {
    ArrayList<Expense> expenses=new ArrayList<>();
    public void printMenu(){
        System.out.println("===== Expense Manager =====");
        System.out.println("1. Add Expense");
        System.out.println("2. View Expenses");
        System.out.println("3. Exit");
        System.out.println("Enter choice");
    }
    public  void addExpense(Scanner sc){
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
        Expense e = new Expense(id, amount, category, description, date);
        expenses.add(e);
        System.out.println("Expense Added Successfully");
    }
    public  void viewExpense(){
        System.out.println("User chose to view expense");
        for(Expense e:expenses){
            System.out.println(e);
        }
    }
}
