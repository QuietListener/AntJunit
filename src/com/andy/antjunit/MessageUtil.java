package com.andy.antjunit;

import org.apache.log4j.Logger;

/*
* This class prints the given message on console.
*/
public class MessageUtil {

   private String message;
   static Logger logger = Logger.getLogger(MessageUtil.class);

   //Constructor
   //@param message to be printed
   public MessageUtil(String message){
      this.message = message; 
   }

   // prints the message
   public String printMessage(){
      System.out.println(message);
      return message;
   }   

   // add "Hi!" to the message
   public String salutationMessage(){
      message = "Hi!" + message;
      System.out.println(message);
      return message;
   }   
   
   public static void main(String [] args)
   {
	   System.out.println(new MessageUtil("hello world").salutationMessage());
	   logger.info("Hello World"); 
   }
}  	