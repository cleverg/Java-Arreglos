
package arreglos;

import java.util.Scanner;

/**
 *
 * @author everardo
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[ ] ArregloPromedioMaterias = new int[3];
        int[ ] ArregloPromedioAlumno = new int[3];
        int[][] arregloCalificaciones = new int[3][3];
        int n=0;
        int variableLlenable=0;
        Scanner sc = new Scanner(System.in);
        
        //llenado dinamico del array multidimensional
        
        for(int x=0; x<3;x++){
            
            for(int y=0; y<3;y++){
             
                System.out.print("Introduzca un número entero: ");
                n = sc.nextInt();
                arregloCalificaciones[x][y] = n;
        
            } 
        } 
        
        //Impresion normal del array multidimensional
        
        for(int x=0; x<3;x++){   
            for(int y=0; y<3;y++){
                System.out.print(arregloCalificaciones[x][y]+" ");
            }
             System.out.println();
        } 
        
        
        //Operaciones con filas, sacamos el promedio de cada calificacion.
        
        for(int x=0; x<3;x++){   
            variableLlenable=0;
            for(int y=0; y<3;y++){
                variableLlenable=variableLlenable+arregloCalificaciones[x][y];
            }
            ArregloPromedioAlumno[x]=variableLlenable;
        }
        //imprimimos el promedio
        System.out.println("Promedio de las filas");
        for(int x=0; x<3;x++){
                System.out.print((ArregloPromedioAlumno[x]/3)+" ");
        }
        
        
        System.out.println();
        //Operaciones con columna, sacamos el promedio de cada materia.
        
        for(int x=0; x<3;x++){   
            variableLlenable=0;
            for(int y=0; y<3;y++){
                variableLlenable=variableLlenable+arregloCalificaciones[y][x];
            }
            ArregloPromedioMaterias[x]=variableLlenable;
        }
        //imprimimos el promedio
        System.out.println("Promedio de las columnas");
        for(int x=0; x<3;x++){
                System.out.print((ArregloPromedioMaterias[x]/3)+" ");
        }
        
        
     
    }
    
}
