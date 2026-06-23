import java.util.Scanner;

public class Expense {
    private int id;
    private float amount;
    private String category;
    private String description;
    private String date;

    public Expense(int id, float amount, String category, String description, String date){
      this.id=id;
      if(amount<=0){
          throw new IllegalArgumentException("amount cannot be negative");
      }
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
    public boolean setAmount(float amount){
        if(amount<=0){
            return false;
        }
        else {
            this.amount = amount;
            return true;
        }
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
}
