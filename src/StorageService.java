import java.util.ArrayList;

public interface StorageService {
    boolean saveExpense(Expense expense);
    ArrayList<Expense> loadExpenses();
}
