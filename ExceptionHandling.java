
package exceptionhandling;


public class ExceptionHandling {

    
    public static void main(String[] args) {
        
        try{
         
            int a=1,b=0;
            int c=a/b;
            System.out.println("result + " + c);//trying to divide by 0
            
        }catch(ArithmeticException e){
            System.out.println("Can`t divide by 0.");
        }
        
      
        try{
            String str=null;
            System.out.println(str.length());//trying to get the string length
            
        }catch(NullPointerException e){
            System.out.println("Invalid attempt to use an object reference that has null value. ");
        }
        
        
        try{
            int num=Integer.parseInt("Hello");//trying to parse integer to a string
            System.out.println(num);
        }catch ( NumberFormatException e){
            System.out.println("Number Format Exception");
        }
        
        
        try{
            int a[]=new int[5];
            a[7]=9;//trying to access invalid array position
        }catch(ArrayIndexOutOfBoundsException a){
            System.out.println("Array index out of bounds. ");
        }
        
        
        try{
            String name="Hello";
            System.out.println(name.charAt(7));//trying to access invalid String position
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("Invalid String position. ");
        }
        
        
        
    } 
}
