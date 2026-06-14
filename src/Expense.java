import java.util.Scanner;

public class Expense {
    private int id;
    private float amount;
    private String category;
    private String description;
    private String date;
    Scanner sc=new Scanner(System.in);

    public Expense(int id, float amount, String category, String description, String date){
      this.id=id;
      this.amount=amount;
      this.category=category;
      this.description=description;
      this.date=date;
    }
    public int getId(){
        return this.id;
    }
    public float getAmount(){
        return this.amount;
    }
    public String getCategory(){
        return this.category;
    }
    public String getDescription(){
        return this.description;
    }
    public String getDate(){
        return this.date;
    }

    public void setId(int id){
        this.id=id;
    }
    public void setAmount(float amount){
        this.amount=amount;
    }
    public void setCategory(String category){
        this.category=category;
    }
    public void setDescription(String description){
        this.description=description;
    }
    public void setDate(String date){
        this.date=date;
    }
    @Override public String toString(){
        return "Expense{"+
                "id="+id
                +",amount="+amount
                +",category='"+category+ '\'' +
                ",description='"+description+ '\'' +
                ",date='"+date +'\''+
            '}';
    }


    /*public static void viewExpense(Expense e){
        System.out.println("Expense details");
        String expenseId = String.valueOf(e.getId());
        String expenseAmount = String.valueOf(e.getAmount());
        System.out.println("expense id is"+expenseId);
        System.out.println("expense amount is "+expenseAmount);
        System.out.println("expense category is "+ e.getCategory());
        System.out.println("expense description is "+ e.getDescription());
        System.out.println("expense date is "+ e.getDate());

    }*/

}
