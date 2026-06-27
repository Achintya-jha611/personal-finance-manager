import java.io.FileWriter;
import java.io.IOException;
public class FileService {
    public static boolean saveExpenseToFile(Expense expense) {
        try {
            FileWriter writer = new FileWriter("expenses.txt", true);//append method makes sure ki file close hone k baad next jab data aaye to existing data delete nahi ho
            writer.write(expense.toCSV());
            writer.write("\n");//this makes sure next data is added to next line
            writer.close();//saves the file properly
            return true;
        } catch (IOException e) {
            System.out.println("Exception encountered");
            return false;
        }
    }
}
