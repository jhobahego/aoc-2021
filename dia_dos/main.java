package dia_dos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class main {
    
    public static int parteA(){
        
        int resp = 0;
        
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:/Users/USUARIO/Desktop/input2.txt"));
            
            int x = 0;
            int depth = 0;
            
            String linea = "";
            while((linea = br.readLine()) != null){
                String[] subArray = linea.split(" ");
                String direccion = subArray[0];
                int monto = Integer.parseInt(subArray[1]);
                
                switch(direccion){
                    case "forward":
                        x += monto;
                        break;
                    
                    case "down":
                        depth += monto;
                        break;
                        
                    case "up":
                        depth -= monto;
                        break;
                }
            }
            resp = depth*x;
            
        } catch (IOException e) {
            e.printStackTrace();
        }

        return resp;
    }
    
    public static int parteB(){
        
        int resp = 0;
        
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("C:/Users/USUARIO/Desktop/input2.txt"));
            
            int x = 0;
            int depth = 0;
            int aim = 0;
            
            String linea = "";
            while((linea = br.readLine()) != null){
                String[] subArray = linea.split(" ");
                String direccion = subArray[0];
                int monto = Integer.parseInt(subArray[1]);
                
                switch(direccion){
                    case "forward":
                        x += monto;
                        depth += (aim*x);
                        break;
                    
                    case "down":
                        aim += monto;
                        break;
                        
                    case "up":
                        aim -= monto;
                        break;
                }
            }
            resp = x*depth;
            
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return resp;
    }
    
    public static void main(String[] args) {
        
        System.out.println("Primera parte: " +parteA());
        System.out.println("Segunda parte: " +parteB());
    }
}
