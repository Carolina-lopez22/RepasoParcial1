package repaso.com;
import java.util.Scanner;
public class main {
	 static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  
	   int opcion;
       do {
           mostrarMenuOpciones();
           opcion = leerEntero("Elija el programa a ejecutar: ");
           switch (opcion) {
               case 1:  numeroDivisible();       break;
               case 2:  factorialNumero();            break;
               case 3:  numeroPosNegCero();          break;
               case 4:  promedioNumeroPar();       break;
               case 5:  sumaDigitos();   break;
               case 6:  multiplo7y11();        break;
               case 7:  divisibleEntre2();       break;
               case 8:  leerHora();          break;
               case 9:  numerosRomanos();         break;
               case 10: leerOpcion2num();       break;
               case 11:  numMayorMenorDiferencia();       break;
               case 12:  tablaDivicion();            break;
               case 13:  cantidadDigitoPar();          break;
               case 14:  determinarTriangular();       break;
               case 15:  promedioNumeroNegativo();   break;
               case 16:  primerosMultiplos6();        break;
               case 17:  poteciaDe2();       break;
               case 18:  numeroInvertido();          break;
               case 19:  sumaParoImpar();         break;
               case 20: gradosCelsiusFahre();	break;
               case 21:
            	   System.out.println("-Usted ha salido del Programa-"); break;
               default: System.out.println("Opción no válida. Intente de nuevo.");
           }
       } while (opcion != 21);
   }
   
   public static void mostrarMenuOpciones() {
       System.out.println(" PARTE 1: CICLOS Y OPERACIONES NUMÉRICAS");
       System.out.println(" 1.  Número Divisible entre 4");
       System.out.println(" 2.  Factorial de un número");
       System.out.println(" 3.  Números positivos, negativos y ceros");
       System.out.println(" 4.  Promedio de números pares");
       System.out.println(" 5.  Suma de dígitos");
       System.out.println("\n PARTE 2: CONDICIONES Y DIVICIBILIDAD");
       System.out.println(" 6.  Multiplo de 7 o 11");
       System.out.println(" 7.  Divisible entre 3 pero no entre 2");
       System.out.println(" 8.  Leer hora");
       System.out.println(" PARTE 3: USO DE SWITCH ");
       System.out.println(" 9.  Numeros romanos");
       System.out.println("10.  Leer una opcion de 2 numeros");
       System.out.println(" PARTE 4: ANALISIS NUMÉRICO ");
       System.out.println("11. Numero mayor, menor y diferencia absoluta");
       System.out.println("12. Tabla de división");
       System.out.println("13. Cantidad de digitos pares");
       System.out.println("14. Determinar si es triangular");
       System.out.println("15. Promedio de numeros negativos");
       System.out.println(" PARTE 5: PATRONES Y TRANSFORMACIONES");
       System.out.println("16. Primeros multiplos de 6");
       System.out.println("17. Determina si es potencia de 2");
       System.out.println("18. Numero invertido");
       System.out.println("19. Determinar si la suma del numero es par o impar");
       System.out.println("20. De grados celsius a fahrenheit");
       System.out.println("21.  Salir del programa");
       System.out.println("_________________________________");
   }
   public static int leerEntero(String mensaje) {
       while (true) {
           System.out.print(mensaje);
           try {
               return Integer.parseInt(sc.nextLine().trim());
           } catch (NumberFormatException e) {
               System.out.println("Ingrese un número entero.");
           }
       }
   }

   public static double leerDouble(String mensaje) {
       while (true) {
           System.out.print(mensaje);
           try {
               return Double.parseDouble(sc.nextLine().trim());
           } catch (NumberFormatException e) {
               System.out.println("Ingrese un número válido.");
           }
       }
   }
	    // Solucion programa 1
   	public static void numeroDivisible() {
	   System.out.print("Ingrese un numero: ");
	   int n = sc.nextInt();
	   int resultado = numeroaDividir(n);
	 
	    System.out.println(" La suma de los numeros divisibles entre 4 es: "+ resultado);
	    
	    sc.close();
	}
	       
	    public static int numeroaDividir(int n) {
	    int suma = 0;
	    System.out.println(" Los numeros divisibles entre 4 son: ");
	    for (int i=1; i<= n; i++) {
	    		if (i % 4 == 0) { 
	    			  System.out.println(i+ " ");
	    			suma += i;
	    		}
	    }
	    return suma;
	    }
	    public static void factorialNumero() {
	         int numero = leerEntero("Ingrese un número entero: ");
	         long resultado = factorial(numero);
	         if (resultado >= 0)
	             System.out.println("El factorial de " + numero + " es: " + resultado);
	     }

	     public static long factorial(int n) {
	         if (n < 0) {
	             System.out.println("No se permiten números negativos.");
	             return -1;
	         }
	         long resultado = 1;
	         for (int i = 1; i <= n; i++) resultado *= i;
	         return resultado;
	     }
	    	
	    
	   }
}
