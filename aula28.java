aula 28
/* tipo de dados 
int / float / double / char / String / bool 

 * inteiro = int / Númerico / Sem casas decimais = 5 
 * Ponto flutuante = float / aceita casas decimais = 5.5
 * Double = float similar / mais preciso = 5.4989999 
 * Caractere = char / letras números e caracteres especiais / ñ calcula
 * Contatena caractere = string / classe / textos ñ calcula
 * true / false = bool / booleano 
 */

import java.util.Scanner;

/**  int num1;
    int num2;
    int result;  

    Scanner sc = new Scanner(System.in); 
    System.out.print("Num1 -"); 
    num1 = sc.nextInt(); 
    System.out.print("Num2 -");  
    num2 = sc.nextInt();
   
result = num1 + num2; 
System.out.println(result);

sc.close();
--------------------------------------------------------
**/ 

/* Cotação do dolar */
 

/*  
public class aula28 { 
   /**
 * @param args
 
public static void main(String[] args) {    
float cotDolar, qtDolar, real; 

Scanner sc = new Scanner(System.in); 

System.out.print("Valor cotação dolar: ");
cotDolar = sc.nextFloat();

System.out.print("Qtde Dolar:"); 
qtDolar = sc.nextFloat(); 

real = cotDolar * qtDolar; 

System.out.print("Real R$" + real);


sc.close();
   } 
 }
 ------------------------------------------------------------
*/ 

/* Exercicio em aula! Ex 3 calculadora ao quadrado 


public class aula28{
public static void main(String[] args) {
float num1, num2, num3, num4; 

Scanner sc = new Scanner(System.in); 
System.out.println("Add valor um");
num1 = sc.nextFloat();

float resultado = num1 * num1; 
System.out.println("Resultado ao quadrado é" + resultado);

System.out.println("Add valor dois");
num2 = sc.nextFloat();
float resultado2 = num2 * num2; 
System.out.println("Resultado ao quadrado é" + resultado2);

System.out.println("Add valor três");
num3 = sc.nextFloat();
float resultado3 = num3 * num3;
System.out.println("Resultado ao quadrado é" + resultado3);

System.out.println("Add valor quatro ");
num4 = sc.nextFloat();
float resultado4 = num4 * num4;
System.out.println("Resultado ao quadrado é" + resultado4);

sc.close();
------------------------------------------------------------------------
} } 




/*  
Mostrar seu antecessor 


public class aula28 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
float primeiro; 

System.out.println("Digite seu resultado um");
primeiro = sc.nextFloat(); 

float resultado = primeiro - 1;
System.out.println("o valor antecessor é" + resultado );

sc.close(); 
----------------------------------------------------------------------------
} } 
*/ 



public class aula28 {
public static void main(String[] args) {
double altura;
double base;
double resultado;

Scanner sc = new Scanner(System.in);
System.out.println("Informe a altura do seu retangulo");
altura = sc.nextDouble(); 

System.out.println("Informe a base do seu retangulo");
base = sc.nextDouble();

 resultado = altura * base; 

System.out.println("a area deste retangulo é:" + resultado );

sc.close();
}} 
