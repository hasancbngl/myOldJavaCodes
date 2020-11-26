import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class stringManipulation {
  public static void main(String[] args) {
         
    /*  String myString = "Hasan x dev x emrah x cengoo";
      String[] splitString = myString.split(" x ");
    
      System.out.println(Arrays.toString(splitString));

        String name="Mississippi";
        String[] splitString = name.split("s");
        System.out.println(Arrays.toString(splitString)); 

     String city="Mississippi";
     String cityPart = city.substring(4,8); //start from 4.till 7 lettet it took from city string

     System.out.println(cityPart);

 

        String surname="Cobanoglu";
        
        Pattern p= Pattern.compile("Co(.*?)lu");
        Matcher m=p.matcher(surname);
                 
        
        while (m.find()){

        System.out.println(m.group(1));  }       */





        String site="        <img src=\"https://gmsrp.cachefly.net/v4/images/stub.svg\" data-src=\"https://gmsrp.cachefly.net/images/19/12/28/c1a546efa8cce64bf818619510c7c09b/690.jpg\" alt=\"FBL-ESP-LIGA-REALMADRID-SEVILLA\">>";

   Pattern p = Pattern.compile("src=\"(.*?)\" d");
   Matcher m=p.matcher(site);

       while(m.find()) {
               System.out.println(m.group(1));   
               }

       /*    p = Pattern.compile("alt=\"(.*?)\"");
           m=p.matcher(site);

       while(m.find()) {
               System.out.println(m.group(1));   
               }*/

}
}
