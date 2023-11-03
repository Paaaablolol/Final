import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;

public class App {

    public static String[][] fillWeekDay(String fileName) {
                    
        
                String[][] resultados = new String[100][5];


                FileReader fr = null;
                BufferedReader br = null; 
                   
            try {  

            fr = new FileReader(fileName);
            String linea= "";

           
                for (int j = 0; j < 100; j++) {
                    
                    String[] split = linea.split(";");

                    resultados[j] = split;
                
                }
            
            } catch (Exception e) {
            System.out.println(e.getMessage());

                } finally {
                    try {
                fr.close();
                        } catch (Exception e) {
                
                        }
                } 
            
            
        }

    public static void main(String[] args) throws Exception {
        File archivo1 = null;
        
        String[][] lunesData = fillWeekDay("lunes.txt")
        String[][] martesData = fillWeekDay("martes.txt")
        String[][] miercolesData = fillWeekDay("miercoles.txt")
        String[][] juevesData = fillWeekDay("jueves.txt")
        String[][] viernesData = fillWeekDay("viernes.txt")
        String[][] sabadoData = fillWeekDay("sabado.txt")
        String[][] domingoData = fillWeekDay("domingo.txt")

        String[] dias = {"lunes.txt","martes.txt","miercoles.txt","jueves.txt","viernes.txt","sabado.txt","domingo.txt"};
        

         
    }
}