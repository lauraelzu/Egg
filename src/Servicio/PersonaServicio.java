// comentario para la práctica de Git con GitHub!!!!!  1° commit
// comentario para la practica de enviar info al repo remoto 2° commit

package Servicio;

import Entidades.Persona;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class PersonaServicio {
    
    /*
    • Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
    */
    public Persona crearPersona(){
        Persona p = new Persona();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el nombre");
        p.setNombre(leer.next());
        System.out.println("Ingrese el edad");
        p.setEdad(leer.nextInt());
        String sex;
        System.out.println("Ingrese el sexo: H hombre | M mujer | O otro");
        do{
            sex = leer.next();
            sex = toUpperCase(sex);
            if (sex.equals("M")||sex.equals("H")||sex.equals("O")){   //comprueba que el sexo introducido sea correcto
                p.setSexo(sex);
            } else {
                System.out.println("Opción incorrecta. Ingrese nuevamente el sexo");
            }
        }while (!sex.equals("M")&&!sex.equals("H")&&!sex.equals("O"));
        System.out.println("Ingrese el peso en Kg");
        p.setPeso(leer.nextDouble());
        System.out.println("Ingrese la altura en m");
        p.setAltura(leer.nextDouble());     
        return p;
    } 
    
    /*
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
    */
    public int calcularIMC(Persona p){
        double imc = p.getPeso()/Math.pow(p.getAltura(), 2);
        p.setImc(imc);
        System.out.println("El IMC es " + p.getImc() );
        if (p.getImc() < 20){
            return -1;
        } else if (p.getImc() > 25){
            return 1;
        } else {
            return 0;
        }      
    }
    
    /*
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
 */
    public boolean esMayorDeEdad(Persona p){
       if (p.getEdad() >= 18){
           return true;
       } else {
           return false;
       }
    }
}

