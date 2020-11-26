class oopClasses {
   public static void main(String[] args) {
       
/*        class User {
                   int score;
                   
                    public boolean hasWon() {
                        if(score>=100) {
                              return true;
                                       }
                        else {
                            return false; 
                             }                     
                                            }

           }
       User bob=new User();

       bob.score=35;
       System.out.println(bob.hasWon());    */

           class Number {
                 int x;
                     public boolean check() {
                              if (x>0) {
                                      return true;
                                       }
                             
                              else   {
                                      return false;
                                      }


                                      } 
                       }
                   

          Number hasans = new Number();
          hasans.x=5;
          Number number=new Number();
          number.x=-5;
          Number no=new Number();
          no.x=0;
                 if(hasans.check()) {
                                     System.out.println(hasans.x + " is positive");  
                                    }
                 else {
                            System.out.println(hasans.x + " is not positive"); 
                           } 
                        if(number.check()) {
                                     System.out.println(number.x + " is positive");  
                                    }
                 else {
                            System.out.println(number.x + " is not positive"); 
                           }

                     if(no.check()) {
                                     System.out.println(no.x + " is positive");  
                                    }
                 else {
                            System.out.println(no.x + " is not positive or negative"); 
                           }
    


}





}
