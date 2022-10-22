package lab5_nandini;
//Exercise 1:  Validate the age of a person and display proper
//message by using user defined exception. 
//Age of a person should be above 15.

public class InvalidAgeException extends Exception{
	InvalidAgeException(String InvalidAgeInput){
	super(InvalidAgeInput);
}
}
