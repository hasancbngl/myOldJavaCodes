import java.util.Arrays;

class tryandcatch {

    public static void main(String args[]){       
 
      int[] array = new int[3];

       try {
      
      for(int i=0;i<4;i++) {
             array[i]=i;
            
                         }
                        }

        catch (ArrayIndexOutOfBoundsException e)   {

                 System.out.println("Index out of bounds");
        
                }

  catch (Exception e) // to catch spesific exception
                                 {

                 System.out.println(e);
           //when it caught exception do this 
                }
       

      System.out.println(Arrays.toString(array));
      
    }
}
