package oops.exceptiontopic;

public class InvalidAgeException extends Exception
{
	public InvalidAgeException(String errorMsg) 
	{
		super(errorMsg);
	}
}
