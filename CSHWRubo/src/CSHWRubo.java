
public class CSHWRubo {
    public static void main(String []args){
        System.out.println("Hello World");
        
        Cat cat = new Cat(12, 15);
        Dog dog = new Dog(4, 25);
        Cow cow = new Cow(5, 100);
        
        System.out.println(cow.getAge());
        
        System.out.println(factorial(5));
     }
    
    static int factorial(int n){    
    	if (n == 0)
    		return 1;
    	else
    		return(n * factorial(n-1));    
    } 
}
