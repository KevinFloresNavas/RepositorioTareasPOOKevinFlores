/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareamodulo2_kevinflores;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Recursos {
     Scanner sc = new Scanner(System.in);
    public void Saludo()
    {
        System.out.println("Estoy aprendiendo, pero seré el mejor programador del mundo");
    }
    public void IngresoCalificacion()
    {
     int nota;
        System.out.println("Ingrese calificacion");
        nota=sc.nextInt();
        if(nota>=70)
        {
            System.out.println("Alumno aprobado");
        }
        if(nota<70)
        {
            System.out.println("Alumno reprobado");
        }
        else
        {
        
            System.out.println("Ingrese un valor valido");
        }
    }
    public void Division()
    {
        System.out.println("Vamos a dividir");
        System.out.println("Ingrese el numerador");
        int n1=sc.nextInt();
        System.out.println("Ingrese el denominador(distinto de cero)");
        int n2=sc.nextInt();
        
        if(n2==0)
        {
            System.out.println("Debe ingresar un denominador distinto de cero");
            Division();
        }
        else{int div;
        div=n1/n2;
            System.out.println("La division es: "+div);
        }
    }
    public void ListaNumeros()
    {
        System.out.println("Ingrese un numero entero positivo: ");
        int x=sc.nextInt();
        
        for(int i=1;i<=x; i++)
        {
            System.out.println(i);
        }
    }
            
    public void OperacionesAritmeticas()
    {
        double numero1,numero2, suma,resta, multiplicacion;
  
        System.out.println("Ingrese un numero:");
        numero1=sc.nextInt();
        System.out.println("Ingrese un segundo numero:");
        numero2=sc.nextInt();
        suma=numero1+numero2;
        resta=numero1-numero2;
        multiplicacion=numero1*numero2;
      
        System.out.println("Suma: "+suma);
        System.out.println("Resta: "+ resta);
        System.out.println("Multiplicacion: "+multiplicacion);
    }
}
