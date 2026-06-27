import java.util.ArrayList;
import java.util.Scanner;

public class ExpenseService {
    private ArrayList<Expense> expenses=new ArrayList<>();
    public void printMenu(){
        System.out.println("===== Expense Manager =====");
        System.out.println("1. Add Expense");
        System.out.println("2. View Expenses");
        System.out.println("3. Delete Expense");
        System.out.println("4. Search Expense");
        System.out.println("5. Update Expense");
        System.out.println("6. Get total expense");
        System.out.println("7. Exit");
        System.out.println("Enter choice");
    }
    public  void addExpense(Expense expense){
        expenses.add(expense);
        System.out.println("Expense Added Successfully");
    }
    public  void viewExpense(){
        System.out.println("fetching the current expense list");
        for(Expense e:expenses){
            System.out.println(e);
        }
    }
    public boolean deleteExpenseById(int id){
        boolean deleted=false;
        for(Expense e:expenses){
            if(e.getId()==id){
                expenses.remove(e);
                deleted=true;
                break;
            }
        }
        return  deleted;
    }
    public boolean updateExpenseById(int id,float amount){
        boolean updated=false;
        for(Expense e:expenses){
            if(e.getId()==id){
                boolean setNewValue=e.setAmount(amount);
                if(setNewValue)
                {
                    updated=true;
                    return updated;
                }
                else{
                    System.out.println("invalid amount! couldn't update the amount");
                    return updated;
                }
            }
        }
        return  updated;
    }

    public ArrayList<Expense> searchExpenseByCategory(String category) {
        ArrayList<Expense> matchingExpense=new ArrayList<>();
        for(Expense e: expenses){
            if(e.getCategory().equalsIgnoreCase(category)){
                matchingExpense.add(e);
            }
        }
        return matchingExpense;
    }
    public float getTotalExpense(String category){
        float totalExpense=0;
        if(category!=null) {
            for (Expense e : expenses) {
                if (category.equalsIgnoreCase(e.getCategory())) {
                    totalExpense += e.getAmount();
                }
            }
        }
        else{
            for (Expense e : expenses) {
                    totalExpense += e.getAmount();
                }
            }

        return totalExpense;
    }
}
