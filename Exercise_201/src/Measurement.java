
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

public class Measurement {
    
    public void safe(File f, LinkedList<Velocity> velocity) throws FileNotFoundException, IOException{
        ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream(f));
        
        for (Velocity vel : velocity) {
            ous.writeObject(vel);
        }
        ous.flush();
        ous.close();
    }
    
    public void load(File f, LinkedList<Velocity> velocity) throws FileNotFoundException, IOException, ClassNotFoundException{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
        Velocity v;
        
        try{
            while((v = (Velocity) ois.readObject()) != null){
            velocity.add(v);
        }
        }catch(EOFException eof){
            System.out.println("EOF Exception");
        }
    }
}
