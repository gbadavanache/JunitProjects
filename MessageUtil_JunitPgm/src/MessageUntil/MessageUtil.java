package MessageUntil;

public class MessageUtil {

   private String message;
   public MessageUtil(String message){
      this.message = message; 
   }

   // prints the message
   public void printMessage(){
      System.out.println(message);
      int a = 2/2;
      int b = 1;
   }   

   // add "Hi!" to the message
   public String salutationMessage(){
      message = "Hi!" + message;
      System.out.println(message);
      return message;
   }   
}  	

