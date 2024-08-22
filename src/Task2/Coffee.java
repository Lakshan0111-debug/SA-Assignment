package Task2;

public class Coffee extends Beverages{
    protected void  brew(){
        System.out.println("Dripping coffee through filter");
    }
    protected void  addCondiments(){
        System.out.println("Adding sugar and milk");
    }
    protected void addExtras(){
        System.out.println("Adding vanilla syrup");
    }
}
