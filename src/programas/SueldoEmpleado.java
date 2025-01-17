package programas;
//Paquete de dtos e/s datos por consola
import java.util.Scanner;
public class SueldoEmpleado {
  //Método principal  
  public static void main(String[] args){
     //Declarar variables
     String empleado;
     double ht,th,sb,d,sn;
     //creando el objeto lectura
     Scanner lectura=new Scanner(System.in);
     //Entrada de datos
     System.out.println("Nombre del empleado:");
     empleado=lectura.next();
     System.out.println("Horas Trabajadas:");
     ht=lectura.nextDouble();
     System.out.println("Tarifa por hora:");
     th=lectura.nextDouble();
     //Proceso de datos
     sb=ht*th;
     d=sb*0.13;
     sn=sb-d;
     //Salida de datos
     System.out.println("Sueldo Bruto:"+sb);
     System.out.println("Descuento:"+d);
     System.out.println("Sueldo Neto:"+sn);
     
  }  
}
