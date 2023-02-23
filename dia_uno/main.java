package dia_uno;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class main {
    
    public static int parteA(){
        
        int contador = 0;
        
        try{
            BufferedReader br = new BufferedReader(new FileReader("C:/Users/USUARIO/Desktop/prueba.txt"));
            
            int ultimoNumero = -1;
            String linea = "";
            while((linea = br.readLine()) != null){
                int i = Integer.parseInt(linea);
                if(ultimoNumero == -1){
                    ultimoNumero = i;
                    continue;
                }
                if(i > ultimoNumero){
                    ultimoNumero = i;
                    contador++;
                }
                ultimoNumero = i;
            }
            br.close();
            
        }catch (IOException ex) {
            ex.printStackTrace();
        }
        
        return contador;
    }
    
    public static int parteB() {

        int incremento = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader("C:/Users/USUARIO/Desktop/prueba.txt"));

            int[] ultimosNumeros = new int[3];
            int[] numerosActuales = new int[3];
            int inicioConteo = 0;
            String linea = "";

            while ((linea = br.readLine()) != null) {
                //				if (linea.isBlank())
                //					continue;
                int i = Integer.parseInt(linea);
                if (inicioConteo < 3) {
                    if (inicioConteo > 0) {
                        numerosActuales[inicioConteo - 1] = i;
                    }
                    ultimosNumeros[inicioConteo] = i;
                    inicioConteo++;
                    continue;
                }

                numerosActuales[2] = i;

                int actual = 0;
                int ultimo = 0;
                for (int j = 0; j < 3; j++) {
                    ultimo += ultimosNumeros[j];
                    actual += numerosActuales[j];
                }

                if (actual > ultimo) {
                    incremento++;
                }

                ultimosNumeros = Arrays.copyOf(numerosActuales, 3);
                for (int j = 0; j < 2; j++) {
                    numerosActuales[j] = numerosActuales[j + 1];
                }

            }
            br.close();

        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return incremento;

    }
    
    public static void main(String[] args) {
        
        System.out.println(parteB());
        
    }
}
