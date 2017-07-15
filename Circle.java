import java.util.Scanner

public class Circle
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    int radio;
    double pi;
    pi = Math.PI;
    
    System.out.print("Ingrese el radio del círculo: ");
    radio = input.nextInt();
    
    System.out.printf("El diámetro es %d%n", 2 * radio);
    
    System.out.printf("La circunferencia es %f%n", 2 * pi * radio);
    
    System.out.printf("El área es %f%n", pi * (radio * radio));
  }
}
