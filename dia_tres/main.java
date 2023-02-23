package dia_tres;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

public class main {
    	
    public static int parteA() {

        int resp = 0;

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("C:/Users/usuario/Desktop/input3.txt"));

            int[] bitPosCount = new int[12];
            int[] bitNegCount = new int[12];

            String linea = "";
            while ((linea = br.readLine()) != null) {
                String[] arrayLinea = linea.split("");

                int i = 0;
                for (String s : arrayLinea) {
                    if (s.equals("1")) {
                        bitPosCount[i]++;
                    } else {
                        bitNegCount[i]++;
                    }
                    i++;
                }
            }

            String mayoria = "";
            String minoria = "";
            for (int i = 0; i < bitPosCount.length; i++) {
                if (bitPosCount[i] > bitNegCount[i]) {
                    mayoria += "1";
                    minoria += "0";
                } else {
                    mayoria += "0";
                    minoria += "1";
                }
            }

            BigInteger numeroMayor = new BigInteger(mayoria, 2);
            BigInteger numeroMenor = new BigInteger(minoria, 2);

            resp = (numeroMayor.intValue() * numeroMenor.intValue());

        } catch (IOException e) {
            e.printStackTrace();
        }

        return resp;
    }

    public static int parteB() {

        int resp = 0;

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("C:/Users/usuario/Desktop/input31.txt"));

            int[] bitUno = new int[5];
            int[] bitCero = new int[5];

        } catch (IOException e) {
            e.printStackTrace();
        }

        return resp;
    }

    
    public static void main(String[] args) {
        
        
    }
}
