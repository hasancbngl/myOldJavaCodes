import java.util.*;
public class arrays {
 public static void main(String[] args) {
    /*
    int[] primeNumbers = {2,3,5,7,11,13};
      for(int i=0;i<=5;i++) System.out.println(primeNumbers[i]);

        List list = new ArrayList();
        list.add(2); //it add number 2
        list.add(3);
        list.add(5);
          
        list.remove(1); //it removes the item 1 which is 3
        System.out.println(list.get(1)); //it shows as a output item 1 which is 5 in that case.
          System.out.println(list.toString()); //it shows as a output the whole list.
          */
    List countries = new ArrayList();
    countries.add("Belgium");
    countries.add("Poland");
    countries.add("Turkey");
    countries.add("Germany");
    System.out.println(countries.toString());
    countries.remove(0);
    countries.add(0, "Ireland");
    countries.remove(3); //after we remove (the first item=0)belgium it became poland the item 0.
    System.out.println(countries.toString());
     System.out.println("==================================");
       //Maps
    Map map = new HashMap();
    map.put("Nomad", "Hasan");// we can map a certain index to a certain value. 
    map.put("sun", "Goddess");     
    System.out.println(map.get("Nomad")); // nomad map to hasan. and it output is hasan
    System.out.println(map.toString()); //we can look at the whole map.
    map.remove("sun");
    map.put("moon", "god"); 
    
    System.out.println(map.toString());
    System.out.println(map.size()); //it tells the number of the items  in the map.


}


}
