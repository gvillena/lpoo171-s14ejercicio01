/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s14ejercicio01;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class S14ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in); 
        
        int numeroGenerado;                
        ArrayList<Integer> numerosGenerados = new ArrayList<>(); 
        
        while (numerosGenerados.size() < 5) {            
            numeroGenerado = new Random().nextInt(26);
            if (numeroGenerado != 0) {
                if (!numerosGenerados.contains(numeroGenerado)) {
                    numerosGenerados.add(numeroGenerado);
                }                
            }            
        }
        
        System.out.println("¡NUMEROS GENERADOS SATISFACTORIAMENTE!");         
        for (Integer n : numerosGenerados) {
            System.out.println("n = " + n);
        }   
        
        ArrayList<Integer> numerosJugada01 = new ArrayList<>(); 
        ArrayList<Integer> numerosJugada02 = new ArrayList<>(); 
        ArrayList<Integer> numerosJugada03 = new ArrayList<>(); 
        ArrayList<Integer> numerosJugada04 = new ArrayList<>(); 
        ArrayList<Integer> numerosJugada05 = new ArrayList<>(); 
        ArrayList<Integer> numerosJugada06 = new ArrayList<>(); 
        ArrayList<Integer> numerosJugada07 = new ArrayList<>(); 
        ArrayList<Integer> numerosJugada08 = new ArrayList<>(); 
        ArrayList<Integer> numerosJugada09 = new ArrayList<>(); 
        ArrayList<Integer> numerosJugada10 = new ArrayList<>(); 
                 
        System.out.println(""); 
        System.out.println("JUGADA 01"); 
        System.out.println("---------");                 
        System.out.print("N01: "); 
        numerosJugada01.add(Integer.parseInt(reader.nextLine())); 
        System.out.print("N02: "); 
        numerosJugada01.add(Integer.parseInt(reader.nextLine())); 
        System.out.print("N03: "); 
        numerosJugada01.add(Integer.parseInt(reader.nextLine())); 
        System.out.print("N04: "); 
        numerosJugada01.add(Integer.parseInt(reader.nextLine())); 
        System.out.print("N05: "); 
        numerosJugada01.add(Integer.parseInt(reader.nextLine())); 
          
        System.out.println(""); 
        System.out.println("JUGADA 02"); 
        System.out.println("---------");                 
        System.out.print("N01: "); 
        numerosJugada02.add(Integer.parseInt(reader.nextLine())); 
        System.out.print("N02: "); 
        numerosJugada02.add(Integer.parseInt(reader.nextLine())); 
        System.out.print("N03: "); 
        numerosJugada02.add(Integer.parseInt(reader.nextLine())); 
        System.out.print("N04: "); 
        numerosJugada02.add(Integer.parseInt(reader.nextLine())); 
        System.out.print("N05: "); 
        numerosJugada02.add(Integer.parseInt(reader.nextLine())); 
         
        System.out.println(""); 
        System.out.println("JUGADA 03"); 
        System.out.println("---------");                 
        System.out.print("N01: "); 
        numerosJugada03.add(Integer.parseInt(reader.nextLine())); 
        System.out.print("N02: "); 
        numerosJugada03.add(Integer.parseInt(reader.nextLine())); 
        System.out.print("N03: "); 
        numerosJugada03.add(Integer.parseInt(reader.nextLine())); 
        System.out.print("N04: "); 
        numerosJugada03.add(Integer.parseInt(reader.nextLine())); 
        System.out.print("N05: "); 
        numerosJugada03.add(Integer.parseInt(reader.nextLine())); 
          
        System.out.println(""); 
        System.out.println("JUGADA 04"); 
        System.out.println("---------");                 
        System.out.print("N01: "); 
        numerosJugada04.add(Integer.parseInt(reader.nextLine())); 
        System.out.print("N02: "); 
        numerosJugada04.add(Integer.parseInt(reader.nextLine())); 
        System.out.print("N03: "); 
        numerosJugada04.add(Integer.parseInt(reader.nextLine())); 
        System.out.print("N04: "); 
        numerosJugada04.add(Integer.parseInt(reader.nextLine())); 
        System.out.print("N05: "); 
        numerosJugada04.add(Integer.parseInt(reader.nextLine())); 
   
        System.out.println(""); 
        System.out.println("JUGADA 05"); 
        System.out.println("---------");                 
        System.out.print("N01: "); 
        numerosJugada05.add(Integer.parseInt(reader.nextLine())); 
        System.out.print("N02: "); 
        numerosJugada05.add(Integer.parseInt(reader.nextLine())); 
        System.out.print("N03: "); 
        numerosJugada05.add(Integer.parseInt(reader.nextLine())); 
        System.out.print("N04: "); 
        numerosJugada05.add(Integer.parseInt(reader.nextLine())); 
        System.out.print("N05: "); 
        numerosJugada05.add(Integer.parseInt(reader.nextLine())); 
        
        System.out.println(""); 
        System.out.println("JUGADA 06"); 
        System.out.println("---------");                 
        System.out.print("N01: "); 
        numerosJugada06.add(Integer.parseInt(reader.nextLine())); 
        System.out.print("N02: "); 
        numerosJugada06.add(Integer.parseInt(reader.nextLine())); 
        System.out.print("N03: "); 
        numerosJugada06.add(Integer.parseInt(reader.nextLine())); 
        System.out.print("N04: "); 
        numerosJugada06.add(Integer.parseInt(reader.nextLine())); 
        System.out.print("N05: "); 
        numerosJugada06.add(Integer.parseInt(reader.nextLine())); 
        
        System.out.println(""); 
        System.out.println("JUGADA 07"); 
        System.out.println("---------");                 
        System.out.print("N01: "); 
        numerosJugada07.add(Integer.parseInt(reader.nextLine())); 
        System.out.print("N02: "); 
        numerosJugada07.add(Integer.parseInt(reader.nextLine())); 
        System.out.print("N03: "); 
        numerosJugada07.add(Integer.parseInt(reader.nextLine())); 
        System.out.print("N04: "); 
        numerosJugada07.add(Integer.parseInt(reader.nextLine())); 
        System.out.print("N05: "); 
        numerosJugada07.add(Integer.parseInt(reader.nextLine())); 
        
        System.out.println(""); 
        System.out.println("JUGADA 08"); 
        System.out.println("---------");                 
        System.out.print("N01: "); 
        numerosJugada08.add(Integer.parseInt(reader.nextLine())); 
        System.out.print("N02: "); 
        numerosJugada08.add(Integer.parseInt(reader.nextLine())); 
        System.out.print("N03: "); 
        numerosJugada08.add(Integer.parseInt(reader.nextLine())); 
        System.out.print("N04: "); 
        numerosJugada08.add(Integer.parseInt(reader.nextLine())); 
        System.out.print("N05: "); 
        numerosJugada08.add(Integer.parseInt(reader.nextLine())); 
        
        
        System.out.println(""); 
        System.out.println("JUGADA 09"); 
        System.out.println("---------");                 
        System.out.print("N01: "); 
        numerosJugada09.add(Integer.parseInt(reader.nextLine())); 
        System.out.print("N02: "); 
        numerosJugada09.add(Integer.parseInt(reader.nextLine())); 
        System.out.print("N03: "); 
        numerosJugada09.add(Integer.parseInt(reader.nextLine())); 
        System.out.print("N04: "); 
        numerosJugada09.add(Integer.parseInt(reader.nextLine())); 
        System.out.print("N05: "); 
        numerosJugada09.add(Integer.parseInt(reader.nextLine())); 
        
        
        System.out.println(""); 
        System.out.println("JUGADA 10"); 
        System.out.println("---------");                 
        System.out.print("N01: "); 
        numerosJugada10.add(Integer.parseInt(reader.nextLine())); 
        System.out.print("N02: "); 
        numerosJugada10.add(Integer.parseInt(reader.nextLine())); 
        System.out.print("N03: "); 
        numerosJugada10.add(Integer.parseInt(reader.nextLine())); 
        System.out.print("N04: "); 
        numerosJugada10.add(Integer.parseInt(reader.nextLine())); 
        System.out.print("N05: "); 
        numerosJugada10.add(Integer.parseInt(reader.nextLine())); 
        
        int aciertosJ01 = 0; 
        int aciertosJ02 = 0; 
        int aciertosJ03 = 0;
        int aciertosJ04 = 0; 
        int aciertosJ05 = 0; 
        int aciertosJ06 = 0;
        int aciertosJ07 = 0;
        int aciertosJ08 = 0; 
        int aciertosJ09 = 0; 
        int aciertosJ10 = 0;
                  
        for (Integer numero : numerosJugada01) { 
            if (numerosGenerados.contains(numero)) { 
                aciertosJ01 += 1; 
            } 
        } 
          
        for (Integer numero : numerosJugada02) { 
           if (numerosGenerados.contains(numero)) { 
               aciertosJ02 += 1; 
           } 
        } 
          
        for (Integer numero : numerosJugada03) { 
            if (numerosGenerados.contains(numero)) { 
                aciertosJ03 += 1; 
            } 
        }           
        
        for (Integer numero : numerosJugada04) { 
             if (numerosGenerados.contains(numero)) { 
                 aciertosJ04 += 1; 
             } 
         } 
        for (Integer numero : numerosJugada05) { 
             if (numerosGenerados.contains(numero)) { 
                 aciertosJ04 += 1; 
             } 
         } 
        for (Integer numero : numerosJugada06) { 
             if (numerosGenerados.contains(numero)) { 
                 aciertosJ06 += 1; 
             } 
         } 
        for (Integer numero : numerosJugada07) { 
             if (numerosGenerados.contains(numero)) { 
                 aciertosJ07 += 1; 
             } 
         } 
        
        for (Integer numero : numerosJugada08) { 
             if (numerosGenerados.contains(numero)) { 
                 aciertosJ08 += 1; 
             } 
         } 
        for (Integer numero : numerosJugada09) { 
             if (numerosGenerados.contains(numero)) { 
                 aciertosJ09 += 1; 
             } 
         } 
        for (Integer numero : numerosJugada10) { 
             if (numerosGenerados.contains(numero)) { 
                 aciertosJ10 += 1; 
             } 
         } 
        
        // RESUMEN JUGADA 01
        double montoGanadoJ01 = 0; 
        double jugadasGanadas01 = 0;
        
        System.out.println("aciertosJ01 = " + aciertosJ01); 
        switch (aciertosJ01) {            
            case 0:
                montoGanadoJ01 = 0;
                jugadasGanadas01 = 0;
                break;
            case 1:                             
                jugadasGanadas01 = 1;
                break;
            case 2:      
                jugadasGanadas01 = 2;                
                break;
            case 3:                
                montoGanadoJ01 = 500;
                break;
            case 4:             
                montoGanadoJ01 = 5000;
                break;
            case 5:             
                montoGanadoJ01 = 100000;
                break;
            case 6:             
                montoGanadoJ01 = 3800000;
                break;                   
        }
        
        System.out.println("montoGanado01 = " + montoGanadoJ01);
        System.out.println("jugadasGanadas01 = " + jugadasGanadas01);
        
        
        // RESUMEN JUGADA 02
        double montoGanadoJ02 = 0; 
        double jugadasGanadas02 = 0;
        
        System.out.println("aciertosJ02 = " + aciertosJ02); 
        switch (aciertosJ02) {            
            case 0:
                montoGanadoJ02 = 0;
                jugadasGanadas02 = 0;
                break;
            case 1:                             
                jugadasGanadas02 = 1;
                break;
            case 2:      
                jugadasGanadas02 = 2;                
                break;
            case 3:                
                montoGanadoJ02 = 500;
                break;
            case 4:             
                montoGanadoJ02 = 5000;
                break;
            case 5:             
                montoGanadoJ02 = 100000;
                break;
            case 6:             
                montoGanadoJ02 = 3800000;
                break;                   
        }
        
        System.out.println("montoGanado02 = " + montoGanadoJ02);
        System.out.println("jugadasGanadas02 = " + jugadasGanadas02);
                
        
        // RESUMEN JUGADA 03
        double montoGanadoJ03 = 0; 
        double jugadasGanadas03 = 0;
        
        System.out.println("aciertosJ03 = " + aciertosJ03); 
        switch (aciertosJ03) {            
            case 0:
                montoGanadoJ03 = 0;
                jugadasGanadas03 = 0;
                break;
            case 1:                             
                jugadasGanadas03 = 1;
                break;
            case 2:      
                jugadasGanadas03 = 2;                
                break;
            case 3:                
                montoGanadoJ03 = 500;
                break;
            case 4:             
                montoGanadoJ03 = 5000;
                break;
            case 5:             
                montoGanadoJ03 = 100000;
                break;
            case 6:             
                montoGanadoJ03 = 3800000;
                break;                   
        }
        
        System.out.println("montoGanado03 = " + montoGanadoJ03);
        System.out.println("jugadasGanadas03 = " + jugadasGanadas03);
        
        
        
        // RESUMEN JUGADA 04
        double montoGanadoJ04 = 0; 
        double jugadasGanadas04 = 0;
        
        System.out.println("aciertosJ04 = " + aciertosJ04); 
        switch (aciertosJ04) {            
            case 0:
                montoGanadoJ04 = 0;
                jugadasGanadas04 = 0;
                break;
            case 1:                             
                jugadasGanadas04 = 1;
                break;
            case 2:      
                jugadasGanadas04 = 2;                
                break;
            case 3:                
                montoGanadoJ04 = 500;
                break;
            case 4:             
                montoGanadoJ04 = 5000;
                break;
            case 5:             
                montoGanadoJ04 = 100000;
                break;
            case 6:             
                montoGanadoJ04 = 3800000;
                break;                   
        }
        
        System.out.println("montoGanado04 = " + montoGanadoJ04);
        System.out.println("jugadasGanadas04 = " + jugadasGanadas04);    
        
        
        // RESUMEN JUGADA 05
        double montoGanadoJ05 = 0; 
        double jugadasGanadas05 = 0;
        
        System.out.println("aciertosJ05 = " + aciertosJ05); 
        switch (aciertosJ05) {            
            case 0:
                montoGanadoJ05 = 0;
                jugadasGanadas05 = 0;
                break;
            case 1:                             
                jugadasGanadas05 = 1;
                break;
            case 2:      
                jugadasGanadas05 = 2;                
                break;
            case 3:                
                montoGanadoJ05 = 500;
                break;
            case 4:             
                montoGanadoJ05 = 5000;
                break;
            case 5:             
                montoGanadoJ05 = 100000;
                break;
            case 6:             
                montoGanadoJ05 = 3800000;
                break;                   
        }
        
        System.out.println("montoGanado05 = " + montoGanadoJ05);
        System.out.println("jugadasGanadas05 = " + jugadasGanadas05);
        
        
        
        // RESUMEN JUGADA 06
        double montoGanadoJ06 = 0; 
        double jugadasGanadas06 = 0;
        
        System.out.println("aciertosJ06 = " + aciertosJ06); 
        switch (aciertosJ06) {            
            case 0:
                montoGanadoJ06 = 0;
                jugadasGanadas06 = 0;
                break;
            case 1:                             
                jugadasGanadas06 = 1;
                break;
            case 2:      
                jugadasGanadas06 = 2;                
                break;
            case 3:                
                montoGanadoJ06 = 500;
                break;
            case 4:             
                montoGanadoJ06 = 5000;
                break;
            case 5:             
                montoGanadoJ06 = 100000;
                break;
            case 6:             
                montoGanadoJ06 = 3800000;
                break;                   
        }
        
        System.out.println("montoGanado06 = " + montoGanadoJ06);
        System.out.println("jugadasGanadas06 = " + jugadasGanadas06);
        
        
        
        // RESUMEN JUGADA 07
        double montoGanadoJ07 = 0; 
        double jugadasGanadas07 = 0;
        
        System.out.println("aciertosJ07 = " + aciertosJ07); 
        switch (aciertosJ07) {            
            case 0:
                montoGanadoJ07 = 0;
                jugadasGanadas07 = 0;
                break;
            case 1:                             
                jugadasGanadas07 = 1;
                break;
            case 2:      
                jugadasGanadas07 = 2;                
                break;
            case 3:                
                montoGanadoJ07 = 500;
                break;
            case 4:             
                montoGanadoJ07 = 5000;
                break;
            case 5:             
                montoGanadoJ07 = 100000;
                break;
            case 6:             
                montoGanadoJ07 = 3800000;
                break;                   
        }
        
        System.out.println("montoGanado07 = " + montoGanadoJ07);
        System.out.println("jugadasGanadas07 = " + jugadasGanadas07);
              
        
        // RESUMEN JUGADA 08
        double montoGanadoJ08 = 0; 
        double jugadasGanadas08 = 0;
        
        System.out.println("aciertosJ08 = " + aciertosJ08); 
        switch (aciertosJ08) {            
            case 0:
                montoGanadoJ08 = 0;
                jugadasGanadas08 = 0;
                break;
            case 1:                             
                jugadasGanadas08 = 1;
                break;
            case 2:      
                jugadasGanadas08 = 2;                
                break;
            case 3:                
                montoGanadoJ08 = 500;                
                break;
            case 4:             
                montoGanadoJ08 = 5000;
                break;
            case 5:             
                montoGanadoJ08 = 100000;
                break;
            case 6:             
                montoGanadoJ08 = 3800000;
                break;                   
        }
        
        System.out.println("montoGanado08 = " + montoGanadoJ08);
        System.out.println("jugadasGanadas08 = " + jugadasGanadas08);
        
        
        
        // RESUMEN JUGADA 09
        double montoGanadoJ09 = 0; 
        double jugadasGanadas09 = 0;
        
        System.out.println("aciertosJ09 = " + aciertosJ09); 
        switch (aciertosJ09) {            
            case 0:
                montoGanadoJ09 = 0;
                jugadasGanadas09 = 0;
                break;
            case 1:                             
                jugadasGanadas09 = 1;
                break;
            case 2:      
                jugadasGanadas09 = 2;                
                break;
            case 3:                
                montoGanadoJ09 = 500;
                break;
            case 4:             
                montoGanadoJ09 = 5000;
                break;
            case 5:             
                montoGanadoJ09 = 100000;
                break;
            case 6:             
                montoGanadoJ09 = 3800000;
                break;                   
        }
        
        System.out.println("montoGanado09 = " + montoGanadoJ09);
        System.out.println("jugadasGanadas09 = " + jugadasGanadas09);
        
        
        // RESUMEN JUGADA 10
        double montoGanadoJ10 = 0; 
        double jugadasGanadas10 = 0;
        
        System.out.println("aciertosJ10 = " + aciertosJ10); 
        switch (aciertosJ10) {            
            case 0:
                montoGanadoJ10 = 0;
                jugadasGanadas10 = 0;
                break;
            case 1:                             
                jugadasGanadas10 = 1;
                break;
            case 2:      
                jugadasGanadas10 = 2;                
                break;
            case 3:                
                montoGanadoJ10 = 500;
                break;
            case 4:             
                montoGanadoJ10 = 5000;
                break;
            case 5:             
                montoGanadoJ10 = 100000;
                break;
            case 6:             
                montoGanadoJ10 = 3800000;
                break;                   
        }
        
        System.out.println("montoGanado10 = " + montoGanadoJ10);
        System.out.println("jugadasGanadas10 = " + jugadasGanadas10);
        
        
        System.out.println("------------------");
        System.out.println("RESUMEN DE JUGADAS");
        System.out.println("------------------");
        System.out.println("");
             
        System.out.println("JUGADA 01");
        System.out.println("----------");
        System.out.println("");
        System.out.println("NUMERO DE ACIERTOS: " + aciertosJ01);
        System.out.println("MONTO EN SOLES GANADO: " + montoGanadoJ01);
        System.out.println("NUMERO DE JUGADAS GANADAS: " + jugadasGanadas01);
        System.out.println("");
        
        System.out.println("JUGADA 02");
        System.out.println("----------");
        System.out.println("");
        System.out.println("NUMERO DE ACIERTOS: " + aciertosJ02);
        System.out.println("MONTO EN SOLES GANADO: " + montoGanadoJ02);
        System.out.println("NUMERO DE JUGADAS GANADAS: " + jugadasGanadas02);
        System.out.println("");
        
        System.out.println("JUGADA 03");
        System.out.println("----------");
        System.out.println("");
        System.out.println("NUMERO DE ACIERTOS: " + aciertosJ03);
        System.out.println("MONTO EN SOLES GANADO: " + montoGanadoJ03);
        System.out.println("NUMERO DE JUGADAS GANADAS: " + jugadasGanadas03);
        System.out.println("");
        
        System.out.println("JUGADA 04");
        System.out.println("----------");
        System.out.println("");
        System.out.println("NUMERO DE ACIERTOS: " + aciertosJ04);
        System.out.println("MONTO EN SOLES GANADO: " + montoGanadoJ04);
        System.out.println("NUMERO DE JUGADAS GANADAS: " + jugadasGanadas04);
        System.out.println("");
        
        System.out.println("JUGADA 05");
        System.out.println("----------");
        System.out.println("");
        System.out.println("NUMERO DE ACIERTOS: " + aciertosJ05);
        System.out.println("MONTO EN SOLES GANADO: " + montoGanadoJ05);
        System.out.println("NUMERO DE JUGADAS GANADAS: " + jugadasGanadas05);
        System.out.println("");
        
        System.out.println("JUGADA 06");
        System.out.println("----------");
        System.out.println("");
        System.out.println("NUMERO DE ACIERTOS: " + aciertosJ06);
        System.out.println("MONTO EN SOLES GANADO: " + montoGanadoJ06);
        System.out.println("NUMERO DE JUGADAS GANADAS: " + jugadasGanadas06);
        System.out.println("");
        
        System.out.println("JUGADA 07");
        System.out.println("----------");
        System.out.println("");
        System.out.println("NUMERO DE ACIERTOS: " + aciertosJ07);
        System.out.println("MONTO EN SOLES GANADO: " + montoGanadoJ07);
        System.out.println("NUMERO DE JUGADAS GANADAS: " + jugadasGanadas07);
        System.out.println("");
        
        System.out.println("JUGADA 08");
        System.out.println("----------");
        System.out.println("");
        System.out.println("NUMERO DE ACIERTOS: " + aciertosJ08);
        System.out.println("MONTO EN SOLES GANADO: " + montoGanadoJ08);
        System.out.println("NUMERO DE JUGADAS GANADAS: " + jugadasGanadas08);
        System.out.println("");
        
        System.out.println("JUGADA 09");
        System.out.println("----------");
        System.out.println("");
        System.out.println("NUMERO DE ACIERTOS: " + aciertosJ09);
        System.out.println("MONTO EN SOLES GANADO: " + montoGanadoJ09);
        System.out.println("NUMERO DE JUGADAS GANADAS: " + jugadasGanadas09);
        System.out.println("");
        
        System.out.println("JUGADA 10");
        System.out.println("----------");
        System.out.println("");
        System.out.println("NUMERO DE ACIERTOS: " + aciertosJ10);
        System.out.println("MONTO EN SOLES GANADO: " + montoGanadoJ10);
        System.out.println("NUMERO DE JUGADAS GANADAS: " + jugadasGanadas10);
        System.out.println("");
    }
    
}
