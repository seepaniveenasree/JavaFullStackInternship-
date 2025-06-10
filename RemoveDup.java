import java.util.*;
class RemoveDup{
public static void remove(int a[])
{
     LinkedHashSet<Integer> ls=new LinkedHashSet<>();
     ArrayList<Integer> al=new ArrayList<>();
     for(int i=0;i<a.length;i++)
      {
 	ls.add(a[i]);
       }
      System.out.println(ls);
}
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter size of the array");
  int n=sc.nextInt();
  int a[]= new int[n];
  System.out.println("Enter array:");
  for(int i=0;i<n;i++)
   {
     a[i]=sc.nextInt();
   }
   remove(a);
}
}