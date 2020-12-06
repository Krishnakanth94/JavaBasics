package com.designpatterns;

public class Duck { //step 0.1
    public  void Quack(){} //step 0.1
    public  void Swim(){}  //step 0.1
    public  void display(){} //step 0.1
    public  void fly(){} // added this method  new feature as requirement step 0.2
}

class MallardDuck extends Duck{ //step 0.1
  public void  display(){} //step 0.1
}


class RedHeadDuck extends Duck{ //step 0.1
    public void  display(){} //step 0.1
}

/* added this class as new module as requirement
   step 0.3
   as far as this step its all good
*/
class RubberDuck{
   public  void Quack(){
       // over ride to Squeak
   }
   public void display(){
       // looks like a rubber Duck
   }
   public  void fly(){
       // do nothing
   }
}
/* new module need to be added wooden duck
   step 0.4

 */
