/*
Problem:
ExpensePrinter
IncomePrinter
BudgetPrinter
All have same logic.
Only datatype changes.
How can we avoid duplicate classes?
*/
package playground;
class Box<T>
{
    private T name;
    public void setName(T value){
        this.name = value;

    }
    public T getName(){
        return this.name;
    }
}