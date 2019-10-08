public class ErrorException extends Exception
{
    public String operator;
    public ErrorException(String operator)
    {
    this.operator = operator;
    }
    public String getMessage()
    {
    return operator;
    } 
}