import java.util.*;
class StudentArraylist{
public static void main(String args[]){
ArrayList<String> list=new ArrayList<>();
Scanner sc=new Scanner(System.in);
System.out.println("enter exit to exit");
while(true){
String str=sc.nextLine();
list.add(str);
if(str.equals("exit")){
break;
}
}
System.out.println(list);
}
}