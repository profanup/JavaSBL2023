/* Problem Statement: Consider a hierarchy, where a sportsperson can either
be an athlete or a hockey player. Every sportsperson has a unique name. 
An athlete is characterized by the event in which he/she participates; 
whereas a hockey player is characterised by the number of goals scored by him/her.
Perform the following tasks using Java :
(i)Create the class hierarchy with suitable instance variables and methods.
(ii) Create a suitable constructor for each class.
(iii) Create a method named display_all_info with suitable parameters. 
This method should display all the information about the object of a class.
(iv) Write the main method that demonstrates polymorphism.
*/
class Sportsman{
   String name; 
   Sportsman(String name){
      this.name=name;
   } 
   public void display_all_info(){
      System.out.println("Name of Sports man is :"+this.name);
   }
}

class Athlete extends Sportsman{
   String eventType;
   Athlete(String name, String eventType){
      super(name);
      this.eventType=eventType;
   }
   @Override
   public void display_all_info(){
      super.display_all_info();
      System.out.println("Being Athelete "+super.name+" plays in "+eventType);
   }
}

class HockeyPlayer extends Sportsman{
   int noOfGoals;
   HockeyPlayer(String name, int noOfGoals){
      super(name);
      this.noOfGoals=noOfGoals;
   }
   @Override
   public void display_all_info(){
      super.display_all_info();
      System.out.println("Being okeyplayer "+super.name+" has scored "+noOfGoals);
   } 
}

class sports_info{
    public static void main(String args[]){
        Athlete a1 = new Athlete("Deepa Karmakar","Gymnastics");
        HockeyPlayer h1 = new HockeyPlayer("Dhanraj Pillai",198);
        a1.display_all_info();
        h1.display_all_info();
    
    }

}
