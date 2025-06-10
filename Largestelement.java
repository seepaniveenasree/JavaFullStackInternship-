import java.util.*;
import java.util.Collections;
class Largestelement
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the n value:");
int n= sc.nextInt();
List<Integer> list = new ArrayList<>();
for(int i=0;i<n;i++)
{
list.add(sc.nextInt());
}
Collections.sort(list);
System.out.println(list.get(n-2));
}
}  