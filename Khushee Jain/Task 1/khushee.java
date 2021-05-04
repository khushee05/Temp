import java.Util.Scanner;
class love{

  final boolean love=true;
  final boolean trust=true;
  final boolean hate=false;
  boolean sex;
  public static void main(String[] args){
    
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter sex (true or false): ");
    sex = scan.nextBoolean();
    if(sex==true){
      System.out.println("Panshul happy");
    }
    else{
      System.out.println("Panshul sad");
    }
  }
  
}
