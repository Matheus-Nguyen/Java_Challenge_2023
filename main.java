public class main {


public static void main(String[] args) 
{
    int count = 1;
    //Rolls dice 'count' times and prints out
    while (count <= 20) {
        //finding random roll
        int randomNum = (int)((Math.random() * 6) +1);
        
        System.out.println(count + ": rolling a... " + randomNum + ".");
        count++;
    }

//calling function to roll die w 5 sides
Die r1 = new Die(5);
//trying to read last roll without rolling first returns -1
System.out.println(Die.readLastRoll());
//Rolling die and printing
System.out.println(r1.roll());
//Reading out last roll
System.out.println(Die.readLastRoll());

//creating a die without stating number of sides creates a die with 6 sides
Die r2 = new Die();
System.out.println(r1.roll());
}








}













