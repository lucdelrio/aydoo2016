package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program 
{
	
    public static final void main(String args[])
    {
    	int numeroIngresado = Integer.parseInt(args[0]);
    	int numeroRecibido;
    	FactoresPrimos calcular = new FactoresPrimos();
    	
        if(args.length > 2){
        	System.out.println("Hay demasiados par�metros");
        }
        else if(args.length == 0){
        	System.out.println("Debe ingresar los par�metros correspondientes");
        }
        try{
        	
        	if (numeroIngresado < 2){
        		System.out.println("Debe ingresar un n�mero mayor que 1");
        	}{
            	numeroRecibido = numeroIngresado;
            	calcular.calcularPrimos(numeroRecibido);
            	calcular.calcularFactoresPrimos();
            	System.out.println("Factores Primos " + numeroRecibido + ":" + 
            	calcular.imprimirFactoresPrimos());

        	}
        }catch(InputMismatchException e){
        	System.out.println("Debe ingresar un n�mero entero");
        }
    }	
}
