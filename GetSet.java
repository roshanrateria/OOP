public class GetSet{
  public static void main(String args[]){
    MyClass obj=new MyClass();
    obj.display();
    obj.setMyVariable(10);
    System.out.println("Value :"+obj.getmyVariable());
     obj.setMyVariable(20);
    System.out.println("Value :"+obj.getmyVariable());
    
  }
}
public class MyClass {
    private int myVariable;

    public int getMyVariable() {
        return myVariable;
    }

    public void setMyVariable(int value) {
        myVariable = value;
    }
  public void display(){
    System.out.println("Value :"+myVariable);
  }
}
