/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospracticos60326;

import java.util.Scanner;

/**
 *
 * @author Jun
 */
public class EjerciciosPracticos60326 {
    
    public static String[][] aCodigo;
    static String[][] aPersonajes; 
    static String sexo;
    public static String[][] preguntas;
    public static String[][] incisos;
    public static int contador;

    public static void Encabezado(){
      
        System.out.println("------------------------------------------");
        System.out.println("*****Universidad Autónoma de Campeche*****");
        System.out.println("------------------------------------------");
        System.out.println("***********Facultad de Ingeniería*********");
        System.out.println("------------------------------------------");
        System.out.println("**Ingeniería en Sistemas Computacionales**");
        System.out.println("------------------------------------------");
    }
    
    public static void Cuerpo(){
        
        System.out.println("------------------------------------------");
        System.out.println("*****Nombre: Jorge Alberto Sulub Xool*****");
        System.out.println("*************Matricula: 60326*************");
        System.out.println("------------------------------------------");
        System.out.println("*****Profesor: Edgar D. Caamal Dzulu******");
        System.out.println("********Lenguaje de programación 1********");
        System.out.println("------------------------------------------");
        System.out.println("*********Segundo Semestre Grupo A*********");
        System.out.println("------------------------------------------");
        System.out.println("*****Actividad 4: Ejercicios Prácticos****");
        System.out.println("------------------------------------------");
        System.out.println("");
    }
        
    public static void Pie(){
        
        System.out.println("");
        System.out.println("------------------------------------------");
        System.out.println("**************San Francisco de Campeche***");
        System.out.println("******************************Mayo 2021***");
    }
    
    public static void ClaveMorse(){
        
        aCodigo = new String[26][2];
        aCodigo[0][0] = "A";
        aCodigo[1][0] = "B";
        aCodigo[2][0] = "C";
        aCodigo[3][0] = "D";
        aCodigo[4][0] = "E";
        aCodigo[5][0] = "F";
        aCodigo[6][0] = "G";
        aCodigo[7][0] = "H";
        aCodigo[8][0] = "I";
        aCodigo[9][0] = "J";
        aCodigo[10][0] = "K";
        aCodigo[11][0] = "L";
        aCodigo[12][0] = "M";
        aCodigo[13][0] = "N";
        aCodigo[14][0] = "O";
        aCodigo[15][0] = "P";
        aCodigo[16][0] = "Q";
        aCodigo[17][0] = "R";
        aCodigo[18][0] = "S";
        aCodigo[19][0] = "T";
        aCodigo[20][0] = "U";
        aCodigo[21][0] = "V";
        aCodigo[22][0] = "W";
        aCodigo[23][0] = "X";
        aCodigo[24][0] = "Y";
        aCodigo[25][0] = "Z";
        // Arreglo con representación del Alfabeto
        // En código Morse
        aCodigo[0][1] = ".-";
        aCodigo[1][1] = "-...";
        aCodigo[2][1] = "-.-.";
        aCodigo[3][1] = "-..";
        aCodigo[4][1] = ".";
        aCodigo[5][1] = "..-.";
        aCodigo[6][1] = "--.";
        aCodigo[7][1] = "...";
        aCodigo[8][1] = "..";
        aCodigo[9][1] = ".---";
        aCodigo[10][1] = "-.-";
        aCodigo[11][1] = ".-..";
        aCodigo[12][1] = "--";
        aCodigo[13][1] = "-.";
        aCodigo[14][1] = "---";
        aCodigo[15][1] = ".--.";
        aCodigo[16][1] = "--.-";
        aCodigo[17][1] = ".-.";
        aCodigo[18][1] = "...";
        aCodigo[19][1] = "-";
        aCodigo[20][1] = "..-";
        aCodigo[21][1] = "...-";
        aCodigo[22][1] = ".--";
        aCodigo[23][1] = "-..-";
        aCodigo[24][1] = "-.--";
        aCodigo[25][1] = "--..";     
    }
    
    public static void StarWarsPersonajes (){
        
        aPersonajes = new String[16][3];
        aPersonajes[0][0] = "Luke Skywalker";
        aPersonajes[0][1] = "172";
        aPersonajes[0][2] = "male";
        aPersonajes[1][0] = "R2-D2";
        aPersonajes[1][1] = "96";
        aPersonajes[1][2] = "n/a";
        aPersonajes[2][0] = "C-3PO";
        aPersonajes[2][1] = "167";
        aPersonajes[2][2] = "n/a";
        aPersonajes[3][0] = "Darth Vader";
        aPersonajes[3][1] = "202";
        aPersonajes[3][2] = "male";
        aPersonajes[4][0] = "Leia Organa";
        aPersonajes[4][1] = "150";
        aPersonajes[4][2] = "female";
        aPersonajes[5][0] = "Owen Lars";
        aPersonajes[5][1] = "178";
        aPersonajes[5][2] = "male";
        aPersonajes[6][0] = "Beru Whitesun lars";
        aPersonajes[6][1] = "165";
        aPersonajes[6][2] = "female";
        aPersonajes[7][0] = "R5-D4";
        aPersonajes[7][1] = "97";
        aPersonajes[7][2] = "n/a";
        aPersonajes[8][0] = "Biggs Darklighter";
        aPersonajes[8][1] = "183";
        aPersonajes[8][2] = "male";
        aPersonajes[9][0] = "Obi-Wan Kenobi";
        aPersonajes[9][1] = "182";
        aPersonajes[9][2] = "male";
        aPersonajes[10][0] = "Yoda";
        aPersonajes[10][1] = "66";
        aPersonajes[10][2] = "male";
        aPersonajes[11][0] = "Jek Tono Porkins";
        aPersonajes[11][1] = "180";
        aPersonajes[11][2] = "male";
        aPersonajes[12][0] = "Jabba Desilijic Tiure";
        aPersonajes[12][1] = "175";
        aPersonajes[12][2] = "hermaphrodite";
        aPersonajes[13][0] = "Han Solo";
        aPersonajes[13][1] = "180";
        aPersonajes[13][2] = "male";
        aPersonajes[14][0] = "Chewbacca";
        aPersonajes[14][1] = "228";
        aPersonajes[14][2] = "male";
        aPersonajes[15][0] = "Anakin Skywalker";
        aPersonajes[15][1] = "188";
        aPersonajes[15][2] = "male"; 
    }
    
    public static void QuizzPreguntas(){
        
        preguntas = new String[10][2];
        preguntas[0][0] = "¿Cuál es la sintaxis correcta para generar Hello World en Java?";
        preguntas[0][1] = "0";
        preguntas[1][0] = "¿Cómo se insertan comentarios de una línea en Java?";
        preguntas[1][1] = "1";
        preguntas[2][0] = "¿Qué tipo de datos se utiliza para crear una variable que almacene texto?";
        preguntas[2][1] = "2";
        preguntas[3][0] = "¿Cómo se crea una variable numérica que asigne el valor 5?";
        preguntas[3][1] = "0";
        preguntas[4][0] = "¿Qué operador se utiliza para comparar dos valores?";
        preguntas[4][1] = "1";
        preguntas[5][0] = "¿Para declarar un arreglo, la variable se define como tipo?";
        preguntas[5][1] = "2";
        preguntas[6][0] = "¿Qué instrucción se usa para crear una clase en Java?";
        preguntas[6][1] = "0";
        preguntas[7][0] = "¿Cuál es la sentencia correcta para crear un objeto llamado myObj de MyClass? ";
        preguntas[7][1] = "1";
        preguntas[8][0] = "¿Cuál es el operador que se utiliza para multiplicar números?";
        preguntas[8][1] = "2";
        preguntas[9][0] = "¿Cómo se inicia la sentencia if en Java?";
        preguntas[9][1] = "0";
    }
    
    public static void QuizzIncisos(){
        
        incisos = new String[10][3];
        incisos[0][0] = "System.out.println( Hello World );";
        incisos[0][1] = "echo( Hello World );";
        incisos[0][2] = "print ( Hello World );";
        incisos[1][0] = "/* This is a comment";
        incisos[1][1] = "// This is a comment";
        incisos[1][2] = "# This is a comment";
        incisos[2][0] = "myString";
        incisos[2][1] = "string";
        incisos[2][2] = "String";
        incisos[3][0] = "int x = 5;";
        incisos[3][1] = "num x = 5";
        incisos[3][2] = "x = 5;";
        incisos[4][0] = "><";
        incisos[4][1] = "==";
        incisos[4][2] = "<>";
        incisos[5][0] = "{}";
        incisos[5][1] = "()";
        incisos[5][2] = "[]";
        incisos[6][0] = "class";
        incisos[6][1] = "MyClass";
        incisos[6][2] = "class()";
        incisos[7][0] = "class MyClass = new myObj();";
        incisos[7][1] = "MyClass myObj = new MyClass();";
        incisos[7][2] = "new myObj = MyClass();";
        incisos[8][0] = "%";
        incisos[8][1] = "X";
        incisos[8][2] = "*";
        incisos[9][0] = "if (x > y)";
        incisos[9][1] = "if x > y;";
        incisos[9][2] = "if x > y then;";
    }
    
    public static void ClaveMorseActividad(){
       
        Scanner Usuario = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("*************** Código Morse ***************");
        System.out.println("");
        System.out.println("Si hay menos de 5 palabras, se cobrará 10 pesos.");
        System.out.println("Por cada palabra extra se cobrará 3 pesos.");
        System.out.println("");
                
        System.out.println("Escriba una frase: ");
        String Frase = Usuario.nextLine().toUpperCase();
        char carFrase[] = Frase.toCharArray();
        ClaveMorse();
        bucle(Frase, carFrase);
        System.out.println(Pago(Frase, carFrase));        
    }
    
    public static String Caracter(char car) {
        
        int NumeroCar = (int) car;
        return aCodigo[NumeroCar - 65][0] + " " + aCodigo[NumeroCar - 65][1];
    }
    
    public static void bucle(String Frase, char carFrase[]){
        
        for (int i = 0; i < Frase.length(); i++) {
            if(String.valueOf(carFrase[i]).equals(" ")){
                System.out.println("");
            } else {
                System.out.println(Caracter(carFrase[i]));
            }
        }
    }
    
    public static String Pago(String Frase, char carFrase[]){
        
        int Contador = 1;
        int Precio = 0;
        for (int i = 0; i < Frase.length(); i++) {
            if(String.valueOf(carFrase[i]).equals(" ")){
                Contador++;
            }
        }
        if(Contador <= 5){
            Precio = 10;
        } else{
            Precio = ((Contador - 5) * 3) + 10;
        }
        return "Numero de palabras escritas: " + Contador + "\n" + "Son en total: $" + Precio + " pesos";
    }
    
    public static void StarWarsActividad(){
        
        Scanner Usuario = new Scanner(System.in);
        System.out.println("");
        System.out.println("***************Personajes de Star Wars ***************");
        System.out.println("********Filtro de los personajes por su género********");
        System.out.println("");
                
        System.out.println("Introduzca un género de la siguiente lista: ");
        System.out.println("male");
        System.out.println("female");
        System.out.println("n/a");
        System.out.println("hermaphrodite");
        System.out.println("-------------------------------------------------------------");
        System.out.println("");
        String genero = Usuario.nextLine();
        System.out.println("");
        StarWarsPersonajes();
        recorrido(genero);
    }
    
    public static void recorrido(String genero){
        sexo = genero;
        for (int i = 0; i < aPersonajes.length; i++) {
            if(aPersonajes[i][2].equals(sexo)){
                System.out.println(aPersonajes[i][0]);
                System.out.println(aPersonajes[i][1]);
                System.out.println(aPersonajes[i][2]);
                System.out.println();
            }
        }
    }
    
    public static void QuizzActividad(){
        
        System.out.println("");
        System.out.println("************ Quizz sobre Java ************");
        System.out.println("Responda el Quizz y al final se mostrará su calificación obtenida.");
        System.out.println("");
                
        QuizzPreguntas();
        QuizzIncisos();
        Recorrido();
        System.out.println();
        System.out.println("Tu calificación fue de:  " + contador + "0");
        
    }
    
    public static void Recorrido(){
        String Respuesta;
        Scanner Usuario = new Scanner(System.in);
        
        for (int i = 0; i < preguntas.length; i++) {
            System.out.println();
            System.out.println("Pregunta " + (i + 1));
            System.out.println(preguntas[i][0]);
            System.out.println("0.- " + incisos[i][0]);
            System.out.println("1.- " + incisos[i][1]);
            System.out.println("2.- " + incisos[i][2]);
            System.out.println();
            System.out.print("Escriba su respuesta: ");
            Respuesta = Usuario.nextLine();
            if(preguntas[i][1].equals(Respuesta)){
                contador++;
            }
        }
    }
    
    public static int contador(){
        return contador;
    }
    
    public static void SelecciónActividad(){
        
        Scanner usuario = new Scanner(System.in);
        int NumAct;
        NumAct = usuario.nextInt();
        switch (NumAct){
            case 1:
                ClaveMorseActividad();
                break;
            case 2:
                StarWarsActividad();
                break; 
            case 3:
                QuizzActividad();
                break;
            default:
            System.out.println("Verifique que la actividad seleccionada sea entre 1 a 3.");
            break;
        }
    }
    
    public static void main(String[] args) {
        
       Encabezado();
       Cuerpo();
       System.out.println("Seleccione una actividad de la siguiente lista:");
       System.out.println("1.-Algoritmo con código Morse");
       System.out.println("2.-Genero Personajes de Star Wars");
       System.out.println("3.-Banco de preguntas de Java");
       System.out.println("");
       System.out.println("Introduzca el numero de la actividad correspondiente del 1 al 3.");
       SelecciónActividad();
       Pie();
    }
    
}
