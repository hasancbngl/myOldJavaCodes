import java.util.*;
public class loops {
public static void main(String[] args) {
    /*int x=1;
     
     while(x<=10) {
       
       if(x%2==1) System.out.println(x);
       x++;
   } 
   for(int i=1 ;i<=5;i++) System.out.println(i*2);
     
    System.out.println("First 10 Triangular numbers!!");
   for(int a=1;a<=10;a++) System.out.println(a*(a+1)/2); 
  int x=1,triangular=1; 
  while(x<=10) {
  System.out.println(triangular);
   x++;
   triangular = x + triangular;
   }
     
    String[] familyMembers = {"Rob", "Kirsten","Tommy","Ralphie" };
    for(String name : familyMembers) System.out.println(name);
    */
     List<String> familyMembers = new ArrayList<String>();
     familyMembers.add("Mediha");
     familyMembers.add("Bedir");
     familyMembers.add("Ceylan");
     familyMembers.add("Hasan");
     familyMembers.add("Çiğdem");
     familyMembers.add("Ferhat");
     familyMembers.add("Emrah");
     
    for(String name : familyMembers) System.out.println(name);

}
}
