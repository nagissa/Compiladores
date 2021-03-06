import java_cup.runtime.Symbol;
import java.io.*;
import java.util.*;
class Main {
    static boolean do_debug_parse = false;
    static public void main(String[] args) throws java.io.IOException {
		
    String archivo = args[0];
    

    String mis = Main.recovery_string(archivo);

    String arc = "tmp.txt";
    parser parser_obj = new parser(new prueba(new FileReader(archivo)));
		
   
    System.out.println(mis);
    Symbol parse_tree = null;
		try {
			if (do_debug_parse)
				 parse_tree = parser_obj.debug_parse();
			else parse_tree = parser_obj.parse();
      if (!parser_obj.has_main)
			  System.out.println("No tiene main!!");
		} catch (Exception e) {
      e.printStackTrace();
			System.out.println("Horror");
		}
 
    }

  static public String recovery_string(String path){
        File file = new File(path);
        String writeTo = "";
        String errores = "";

        boolean inFunction = false;
        boolean inSub = false;

        int columna = 1;
        int fila = 1;
        try{
          Scanner scanner = new Scanner(file);
          while(scanner.hasNextLine()){
            String linea =  scanner.nextLine() + "\n";
            if (linea.contains("Function") && !linea.contains("End"))
            {
               if(inSub){
                  linea = "End Sub\n" + linea; 
                  inSub = false;
                  errores += "Error en linea " + fila + " y en columna 1\n"+ "Error: se esperaba finalizacion de sub \n";
                  
               }
               inFunction = true;        
            }     
            else if (linea.contains("Sub") && !linea.contains("End"))
            {
                if(inFunction){
                  linea = "End Function\n" + linea; 
                  errores += "Error en linea " + fila + " y en columna 1\n"+ "Error: se esperaba finalizacion de funcion  \n";
                  inFunction = false;
                }
                inSub = true;
            }          
            else if (linea.contains("Function") && linea.contains("End"))
            {
              inFunction = false;
            }         
            else if (linea.contains("Sub") && linea.contains("End"))
            {
              inSub = false;
            }         

 
            char[] arreglo = linea.toCharArray();    
            for(int i = 0;i < arreglo.length;i++ ){
              char c = arreglo[i];
              if ( c == '"'){
                writeTo += c;
                i+= 1;
                while(true) {
                  if (arreglo[i] == '"'){
                      writeTo += arreglo[i];
                      break;
                  }
                  if (arreglo[i] == '\r'  || arreglo[i] == '\n'){
                      errores += "Error en linea " + fila + " y en columna " + i + "\n"+ "Error: se esperaba finalizacion de cadena \" \n";
                      writeTo += '"';
                      writeTo += arreglo[i];
                      break;
                  }
                  else
                    writeTo += arreglo[i];
                  i+=1; 
                }
              }
              else
                writeTo += arreglo[i];
              }
              fila ++;
            }
              
               if(inSub){
                  writeTo += "\nEnd Sub\n" ; 
                  inSub = false;
               }
            
                if(inFunction){
                  writeTo += "\nEnd Function\n"; 
                  inSub = false;
                }

            

        }
         catch(FileNotFoundException e){
          System.err.println("Archivo no encontrado");
          return "";
        }
        
      try{
        FileWriter outFile = new FileWriter("tmp.txt");
        PrintWriter out = new PrintWriter(outFile); 
        out.print(writeTo);
        out.close();
      } catch ( IOException e){
       e.printStackTrace();
    }
     return errores;
  }
}
