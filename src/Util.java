import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Util {
    
    public static void In(int i){

        try {
            BufferedWriter input = new BufferedWriter(new FileWriter("D:\\UPH\\Semester Aksel\\Pemrogrman Berorientasi Objek\\Java\\InputOutput\\src\\Output.txt",true));
            input.flush();
            input.write(Integer.toString(i) + "\n");
            input.close();
        }
        
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void Out() throws NumberFormatException, IOException{
        
        String Data = "0";
        FileReader fin = null;

        try {
            fin = new FileReader("D:\\UPH\\Semester Aksel\\Pemrogrman Berorientasi Objek\\Java\\InputOutput\\src\\Input.txt");

            try (BufferedReader br = new BufferedReader(fin)){

                while(Data!=null){

                    Data = br.readLine();
                    
                    if(Data!=null){
                        System.out.println(Data);
                    }

                    int Dataint = Integer.parseInt(Data);
                    int ans = Dataint*Dataint*Dataint;
                    In(ans);
                }
            }
        }
        
        catch (Exception e) {
            e.printStackTrace();
        }

        finally{
            if(fin!=null){

                try {
                    fin.close();
                }

                catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
