/*
en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
en distintas variables, para después en el main, calcular un porcentaje de esas 4
personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
cuantos menores
 */
package ej7calculoimc;

import Entidades.Persona;
import Servicio.PersonaServicio;

public class Ej7CalculoIMC {

    public static void main(String[] args) {
        
        PersonaServicio ps = new PersonaServicio();
        int debajo = 0;
        int ideal = 0;
        int encima = 0;
        int mayor = 0;
        int menor = 0;
         
        for (int i=1; i<4; i++){
            Persona p1 = ps.crearPersona();
            System.out.println(p1);
            int imc1 = ps.calcularIMC(p1);
            if(imc1<0){
                System.out.println(p1.getNombre() + " está por debajo del peso ideal");
                debajo++;
            } else if(ps.calcularIMC(p1)==0){
                System.out.println(p1.getNombre() + " tiene el peso ideal");
                ideal++;
            } else {
                System.out.println(p1.getNombre() + " tiene sobre peso");
                encima++;
            }
            boolean mayor1 = ps.esMayorDeEdad(p1);
            if (mayor1){
                System.out.println(p1.getNombre() + " es mayor de edad");
                mayor++;
            } else {
                System.out.println(p1.getNombre() + " es menor de edad");
                menor++;
            } 
        }
        
        
        //calculo de porcentaje, multiplicando los acumuladores por 100/4 =25
               
        System.out.println("Estadística");
        System.out.println("-----------");
        System.out.println("Por debajo del peso ideal: " + debajo*25 + "%");
        System.out.println("Por encima del peso ideal: " + encima*25 + "%");
        System.out.println("Peso ideal: " + ideal*25 + "%");
        System.out.println("Mayores de edad: " + mayor*25 + "%");
        System.out.println("Menor de edad: " + menor*25 + "%"); 
    }
   
}
