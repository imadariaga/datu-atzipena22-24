package dambi;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.SocketPermission;

import javax.print.event.PrintEvent;
import javax.print.event.PrintJobAdapter;
import javax.swing.SortOrder;

public class CopyCharactersMaiuskulaz {

    public static void main(String[] args) throws IOException {

        FileReader inputStream = null;
        FileWriter outputStream = null;


     


        try {
            inputStream = new FileReader("./xanadu.txt");
            outputStream = new FileWriter("Maiuskulaz.txt");

            int c;
            while ((c = inputStream.read()) != -1) {

                if ( c >=96 && c>=123){
                    c = c-32;
                    

                
                outputStream.write(c);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
           
        }
    } 
    }
    }


