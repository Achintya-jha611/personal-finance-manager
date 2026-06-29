import java.io.*;
import java.util.ArrayList;

public class FileService {
    public static boolean saveExpenseToFile(Expense expense) {
        try(FileWriter writer = new FileWriter("expenses.txt", true)) {
            //append method makes sure ki file close hone k baad next jab data aaye to existing data delete nahi ho
            writer.write(expense.toCSV());
            writer.write("\n");//this makes sure next data is added to next line
           //saves the file properly
            return true;
        } catch (IOException e) {
            System.out.println("Exception encountered");
            return false;
        }
    }
    public ArrayList<Expense> loadExpensesFromFile() {

        ArrayList<Expense> expenses = new ArrayList<>();
        int maxId=0;
        try( BufferedReader bufferedReader = new BufferedReader(new FileReader("expenses.txt"))){
            //FileReader reader = //reads entire file in one go
           //the read file if we want to read line by line
            String currentLine;
            while((currentLine = bufferedReader.readLine())!=null) {
                String[] currentRow = currentLine.split(",");
                int expenseId = Integer.parseInt(currentRow[0]);
                if(expenseId>maxId){
                    maxId=expenseId;
                }
                float expenseAmount = Float.parseFloat(currentRow[1]);
                String category = currentRow[2];
                String description = currentRow[3];
                String date = currentRow[4];
                //currentLine = bufferedReader.readLine();
                Expense e = new Expense(expenseId,expenseAmount,category,description,date);
                expenses.add(e);
            }
            //bufferedReader.close();
            Expense.setUpdatedNextId(maxId+1);
            return expenses;

        }
        catch (NumberFormatException | FileNotFoundException e){
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // TODO:
        // 1. Open file
        // 2. Read line by line
        // 3. Split by comma
        // 4. Parse id and amount
        // 5. Create Expense object
        // 6. Add to ArrayList

        return expenses;
    }
}
