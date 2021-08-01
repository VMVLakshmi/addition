import java.io.*;
import java.lang.*;
class Operation
{
static float mul(float x,float y)
{
return(x*y);
}
static float div(float x,float y)
{
return(x/y);
}
}
class Ope
{
public static void main(String args[])
{
float a=Operation.mul(2.5f,2.5f);
float b=Operation.div(6.0f,2.0f);
System.out.println("Multiplication="+a);
System.out.println("Division="+b);
}
}