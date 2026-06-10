import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Expense e=new Expense(1,475.66f,"Food","Swiggy","09-06-2026");
        e.toString();*/
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