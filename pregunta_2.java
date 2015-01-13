import java.util.*;
import java.io.File;

class Main{
    public static void main(String[] args){
        //Crear arreglo de booleanos
        //Donde 0 -> A= 65 y 25 ->Z 90
        boolean[] repetidas = new boolean[26];
        Arrays.fill(repetidas,false);

        System.out.println(args[0]);
        try{
            Scanner lector = new Scanner(new File(args[0]));
            String lineaActual;


            //Recorrido del archivo una sola vez
            while(lector.hasNext()){
                lineaActual = lector.nextLine();
                int size;
                size = lineaActual.length();
                //Recorremos cada palabra
                for(int i=0;i<size-1;i++){
                    //Si hay letras contiguas repetidas
                    if( lineaActual.charAt(i) == lineaActual.charAt(i+1)){
                        //Se marca en el arreglo booleano
                        repetidas[((int) lineaActual.charAt(i)) - 65] = true;
                    }
                }
            }

        System.out.print("Letras no repetidas en la lista: ");
        for(int i=0;i<26;i++){
            if(!repetidas[i]){
                //Se realiza conversion del indice del areglo a char, y se 
                //imprime si no esta repetida
                System.out.print(((char)(i+65)) + " ");
            }
            
        }
        System.out.println();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        

        //Leer archivo y verificar si hay letras seguidas repetidas
        //Si las encuentra, eliminarlas de la lista

        //Hacer conversion explicitar de caracter a (int)

        
    }
}

