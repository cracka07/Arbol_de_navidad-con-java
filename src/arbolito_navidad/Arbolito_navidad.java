
package arbolito_navidad;


public class Arbolito_navidad {

 
    public static void main(String[] args) {
        int altura=20;
        //Recorro las filas
        for (int i = 0; i <altura ; i++) {
            
            
            //Recorro los espacios
            for (int space = 0; space < (altura-i-1); space++) {
                    System.out.print(" ");
            }
            //Recorro asteriscos
            for (int ast = 0; ast < (i *2)+1; ast++) {
                System.out.print("*");
            }
            System.out.println("");
            }
        int largoTronco=2;
        for (int i = 0; i <largoTronco; i++) {
            //espacios
            for (int espacio = 0; espacio < (altura-2); espacio++) {
                           System.out.print(" ");
            }
            //barras tronco
            for (int barras = 0; barras < 3; barras++) {
                 System.out.print("|");
            }
            System.out.println("");
        }
    }
    
}
