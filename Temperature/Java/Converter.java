import java.util.Scanner;

public class Converter{

    public Converter(){}
    
    public void display(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Input Temperature in Farenheit: ");
        float temp = sc.nextFloat();
        
        System.out.println("Your temperature in Celsius: " + convert(temp));
        sc.close();
    }

    private float convert(float temp){
        return (temp - 32.0f) * 5.0f / 9.0f;
    }
}