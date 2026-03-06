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
               case 1:  numeroDivisible4();      break;
               case 2:  factorialNumero();       break;
               case 3:  numeroPosNegCero();      break;
               case 4:  promedioNumeroPar();     break;
               case 5:  sumaDigitos();  		 break;
               case 6:  multiplo7y11();       	 break;
               case 7:  divisibleEntre3no2();    break;
               case 8:  leerHora();         	 break;
               case 9:  numerosRomanos();        break;
               case 10: leerOpcion2num();  	     break;
               case 11:  numMayorMenorDiferencia();     break;
               case 12:  tablaDivicion();				break;
               case 13:  cantidadDigitoPar();          	break;
               case 14:  determinarTriangular();    	break;
               case 15:  promedioNumeroNegativo();		break;
               case 16:  primerosMultiplos6();			break;
               case 17:  poteciaDe2();					break;
               case 18:  numeroInvertido();				break;
               case 19:  sumaParoImpar();				break;
               case 20: gradosCelsiusFahre();  			break;  
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
   	public static void numeroDivisible4() {
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
	    // Solucion progama 2
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
	         for (int i = 1; i <= n; i++)
	        	 resultado *= i;
	         return resultado;
	     }
	    	// Solucion programa 3
	     public static void numeroPosNegCero() {
	    	
	    	         int cantidad = 10;
	    	         procesarNumeros(cantidad);
}   

	    	     public static void procesarNumeros(int cantidad) {

	    	         int positivos = 0;
	    	         int negativos = 0;
	    	         int ceros = 0;

	    	         for (int i = 0; i < cantidad; i++) {

	    	             System.out.print("Ingrese un número: ");
	    	             int num = sc.nextInt();

	    	             if (num > 0) {
	    	                 positivos++;
	    	             } else if (num < 0) {
	    	                 negativos++;
	    	             } else {
	    	                 ceros++;
	    	             }
	    	         }

	    	         mostrarResultados(positivos, negativos, ceros);
	    	     }

	    	     public static void mostrarResultados(int positivos, int negativos, int ceros) {

	    	         System.out.println("Cantidad de positivos: " + positivos);
	    	         System.out.println("Cantidad de negativos: " + negativos);
	    	         System.out.println("Cantidad de ceros: " + ceros);

	    	     }
	    	         
	     // Solucion programa 4
	     	public static void  promedioNumeroPar() {

	     		    System.out.print("Ingrese un número: ");
	     		    int nume = sc.nextInt();

	     		    int suma = 0;
	     		    int contador = 0;

	     		    for (int i = 1; i <= nume; i ++) {

	     		        if (i % 2 == 0) {
	     		            suma += i;
	     		            contador++;
	     		        }
	     		    }

	     		    if (contador > 0) {
	     		        double promedio = (double) suma / contador;
	     		        System.out.println("El promedio de los pares es: " + promedio);
	     		    } else {
	     		        System.out.println("No hay números pares.");
	     		    }
	     		}
	     
	     	// Solucion programa 5 
           public static void  sumaDigitos() {
        	   System.out.print("Ingrese un número: ");
    		    int numer= sc.nextInt();
    		    int sumar = 0;
    		    
    		    for (; numer > 0; numer = numer /10) {
    		    	        sumar += numer % 10;
    		    	     
    		    }
    		    	    System.out.println("La suma de los dígitos es: " + sumar);
    		    	    		
    		    	}
          //Parte 2
           // Solucion programa 6
           public static void    multiplo7y11() {
        	   System.out.print("Ingrese un número: ");
   		    int nu = sc.nextInt(); 
   		    if ( nu % 7 ==0) {
   		    	
   		   System.out.print("El número es multiplo de 7");}
   		    
   		    else if (nu % 11 == 0){
   		    
   		   System.out.print("El número es multiplo de 11");
   		   
   		    } else  {
  		 	System.out.print("El número no es multiplo de ninguno");
   		    }
           }
           
           //Solucion problema 7 
           //En este use mucho la logica que use para resolver el programa 1
           public static void    divisibleEntre3no2() {
        	   System.out.print("Ingrese un numero: ");
        	   int numeroo = sc.nextInt();
        	   int resul = numeroDivisible (numeroo);
        	 
        	    System.out.println(" La suma de los numeros divisibles entre 4 es: "+ resul);
        	    
        	    sc.close();
        	}      
        	    public static int numeroDivisible (int numeroo) {
        
        	    System.out.println(" Los numeros divisibles entre 3 pero no entre 2 son: ");
        	    for (int i=1; i<= numeroo;i++) {
        	    		if (i % 3== 0 && i % 2 != 0) {
        	    			  System.out.println(i+ " ");	
        	    		}
        	    }    
           }
           // Solucion programa 8
           public static void leerHora() {
        	   System.out.print("Ingrese una hora 0-23");
        	   int hora = sc.nextInt();
        	   if (hora >= 0 && hora < 12) {
        		   System.out.print("Es de Mañana");
        	   }
        	   else if (hora >= 12 && hora < 18) {
        		   System.out.print("Es Tarde");
        	   } else if (hora >= 18 && hora < 23) {
        		   System.out.print("Es de noche");
        	   } else {
        		   System.out.print("La hora es invalida ");
        	   }     	   
           }
      //Parte 3: Uso de switch
     //Solucion programa 9
           public static void    numerosRomanos() {
        	   System.out.print("Ingrese un numero del 1 al 5");
        	   int numer = sc.nextInt();
        	   switch (numer) {
        	   case 1:
        	   System.out.print("I");  		 break;
        	   case 2:
            	   System.out.print("II");   break;
        	   case 3:
            	   System.out.print("III");   break;
        	   case 4:
            	   System.out.print("IV"); 	  break;
        	   case 5:
            	   System.out.print("V");  	 break;
        	   defaul:
            	   System.out.print("Numero invalido");
        	   }            
           }           
      //Solucion programa 10
           public static void leerOpcion2num() {
        	   double numero1 = leerDouble("Ingrese el primer número: ");
               double numero2 = leerDouble("Ingrese el segundo número: ");
               System.out.println("1. Sumar\n2. Restar\n3. Multiplicar");
               int operacion = leerEntero("Elija una operación: ");
               switch (operacion) {
                   case 1: System.out.println("Resultado: " + sumar(numero1, numero2));       break;
                   case 2: System.out.println("Resultado: " + restar(numero1, numero2));      break;
                   case 3: System.out.println("Resultado: " + multiplicar(numero1, numero2)); break;               
                   default:
                	   System.out.println("Opción inválida.");
               }
           }
           public static double sumar(double x, double y)       { return x + y; }
           public static double restar(double x, double y)      { return x - y; }
           public static double multiplicar(double x, double y) { return x * y; }
      //Parte 4
       //Solucion programa 11
           public static void numMayorMenorDiferencia() {
        	   System.out.print("Ingrese el primero numero");
        	   int a = sc.nextInt();
        	   System.out.print("Ingrese el segundo numero");
        	   int b = sc.nextInt();
        	   int mayor;
        	   int menor;
        	   if (a > b ) {
        		   mayor= a;
        		   menor= b;
        	   } else {
        		   mayor= b;
        		   menor= a;
        	   }
        	   int diferencia = Math.abs( a-b );
        	   System.out.println("El numero mayor es:" + mayor);
        	   System.out.println("El numero menor es:" + menor);
        	   System.out.println("La diferencia absoluta es:"+ diferencia );
           }
     //Solucion programa 12
           
           public static void tablaDivicion()  {
        	   int numerodiv = leerEntero("Ingrese un número: ");
               generarTabla(numerodiv);
           }

           public static void generarTabla(int numerodiv) {
               for (int i = 1; i <= 10; i++) {
                   System.out.println(numerodiv  + " / " + i + " = " + (numerodiv / i));
               }   
           }
      //Solucion programa 13
           public static void cantidadDigitoPar() {
        	   System.out.print("Ingrese un numero");
        	   int numero = sc.nextInt();
        	   int contador = 0;
        	   while (numero > 0) {
        		   int digito =numero % 10;
        		   if (digito % 2 == 0) {
        			   contador ++;
        		   }
        		   numero = numero / 10;
        		   
           }
        	   System.out.print("Cantidad de digitos pares " + contador);
           }
      //Solucion programa 14
           public static void determinarTriangular() {
        	   System.out.print("Ingrese un numero");
        	   int nume = sc.nextInt();  
        	   int suma = 0;
        	   int i = 1;
        	   
        	   while (suma < nume ) {
        		   suma += i;
        		   i++;
        	   }
        	   if ( suma == nume) {
        		   System.out.print("Es un numero triangular");
        	   }else {
        		   System.out.print("No es numero triangular");  
           
           }
         }
         //Solucion programa 15
           public static void  promedioNumeroNegativo() {

        		    System.out.print("Ingrese la cantidad de números: ");
        		    int n = sc.nextInt();

        		    int sumaNegativos = 0;
        		    int contador = 0;

        		    for (int i = 0; i < n; i++) {

        		        System.out.print("Ingrese un número: ");
        		        int num = sc.nextInt();

        		        if (num < 0) {
        		            sumaNegativos += num;
        		            contador++;
        		        }
        		    }

        		    if (contador > 0) {

        		        double promedio = (double) sumaNegativos / contador;
        		        System.out.println("Promedio de negativos: " + promedio);

        		    } else {

        		        System.out.println("No hay negativos");

        		    }
        		} 
           // Solucion programa 16          
           public static void    primerosMultiplos6() {
        	   System.out.print("Ingrese un número: ");
      		    int numer = sc.nextInt(); 
      		    
      		    for (int i = 1; i <= numer; i++) {
      		    	
      		    	int multiplo = 6 * i;
      		    	System.out.println(multiplo);
      		    }
      		    			
           }
        //Solucion programa 17   
           public static void poteciaDe2(){
        	   System.out.print("Ingrese un número: ");
     		    int numero = sc.nextInt();  
     		    
     		    while ( numero > 1 )  {
     			  if (numero % 2 != 0) {
     				 System.out.print("El numero no es potencia de 2");
     				 return;
     			  }
     			  numero = numero / 2;
     		    }
     		   System.out.print("El numero es potencia de 2");
     			  }
       //Solucion programa 18     
           public static void     numeroInvertido()  {
        		    System.out.print("Ingrese un número: ");
        		    int num = sc.nextInt();

        		    int invertido = 0;

        		    while (num > 0) {

        		        int digito = num % 10;
        		        invertido = invertido * 10 + digito;
        		        num = num / 10;

        		    }

        		    System.out.println("Número invertido: " + invertido);
        		}  
           }
           
           public static void sumaParoImpar()  {
        	   
           }
           
           public static void  gradosCelsiusFahre() {
        	   
           }
   
	     }
}
	     
    
	    	        
	    	        
	    	        
	    	        
	    	        
	    	        