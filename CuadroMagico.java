import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CuadroMagico {

    public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;
    public static int[] sumas;

    public static boolean validar(int r, int c){
        // if ( r == c )
        //     return true;
        // else 
        //     return false;
        
        return r == c;
    }

    public static int[][] llenarDatos(int[][] m){
        // aquí debe estar el proceso para pedir los datos del cuadro
        return m;
    }


    public static boolean comprobarRenglones(int[][] cuadro) {
        int s;
        for ( int i = 0; i < cuadro.length; i++ ){
            s = sumaRenglon(i, cuadro);
            if ( i == 0 ){
                sumas[indice] = s; // indice = 0;
                indice++;
            }
            else {
                sumas[indice] = s;
                if ( s != sumas[0])
                    return false;
                else indice++;}
    }
    return true;
    }


    public static boolean esMagico(int[][] cuadro){
        int s;
            if ( comprobarRenglones() ){
                if ( comprobarColumnas() ){
                    if ( comprobarDiagonales())
                      return true;
                    else 
                        return false;
                }
                else
                    return false;
            }
            else  return false; 
        }

        return false;
    }

    public static int sumaRenglon(int r, int[][] m){
        int suma = 0;
        for ( int j = 0; j < m[j].length; j++){
            suma += m[r][j];
        }
        return suma;
    }

    public static void main(String[] args) {
        int renglones=0, columnas=0;
        int longArreglo; // tamaño del arreglo de sumas;
        int[][] cuadro;
        // pedir valores de renglones y columnas
        // validar que sea una matriz cuadrada
        if ( !validar(renglones, columnas ) ){
            System.out.println("No cumple con las dimensiones de un cuadro");
            System.exit(1);
        }
        else {
            // El programa del cuadro mágico
            cuadro = new int[renglones][columnas]; // creando la matriz
            cuadro = llenarDatos(cuadro);
            longArreglo = renglones + columnas + 2; 
            sumas = new int[longArreglo];
            if ( esMagico(cuadro) ){
                // el cuadro es mágico
            }
            else {
                // el cuadro no es mágico
            }
        }
        
    }
}