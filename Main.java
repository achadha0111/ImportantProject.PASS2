public class Main {
  public static void main(String[] args){
    foo();
    bar();
  }
  
  public void foo(){
    System.out.println("This is the foo method.");
  }
  
  public void bar(){
    System.out.println("Branch change! This is the bar method.");
    System.out.println("I did some changes in this method in MergeConflictBranch");

  }
}
