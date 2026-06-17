import java.util.ArrayList;
import java.util.Scanner;

public class ExpenseService {
    private ArrayList<Expense> expenses=new ArrayList<>();
    public void printMenu(){
        System.out.println("===== Expense Manager =====");
        System.out.println("1. Add Expense");
        System.out.println("2. View Expenses");
        System.out.println("3. Delete Expense");
        System.out.println("4. Exit");
        System.out.println("Enter choice");
    }
    public  void addExpense(Expense expense){
        expenses.add(expense);
        System.out.println("Expense Added Successfully");
    }
    public  void viewExpense(){
        System.out.println("User chose to view expense");
        for(Expense e:expenses){
            System.out.println(e);
        }
    }
    public void deleteExpenseById(int id){
        Boolean deleted=false;
        for(Expense e:expenses){
            if(e.getId()==id){
                expenses.remove(e);
                deleted=true;
                break;
            }
        }
        if(deleted==false){
            System.out.println("expense with this id doesn't exist");
        }
    }
}
