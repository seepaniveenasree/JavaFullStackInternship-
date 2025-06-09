class Exmpleclass{
 public void student()
 {
    System.out.println("name: veena");
    System.out.println("roll:606");
    System.out.println("branch: cst");
  }
}
class Personal extends Exmpleclass{
  public void details()
  { 
     System.out.println("Fathername: Srinivasu");
     System.out.println("Motehrname: Lalitha");
   }
}
class Info
{ 
   public static void main(String args[])
   { 
      Personal s=new Personal();
      s.student();
      s.details();
   }
}
    