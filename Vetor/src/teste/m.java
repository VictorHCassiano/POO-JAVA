package teste;
import java.util.Vector;

public class m {
public static void main(String[] args) {
     Vector vet = new Vector();		
    vet.add(42);
    vet.add("Alirio");
    vet.add(63.98);
    vet.add(33.33);

   String[]vetstring = new String[vet.size()]; 
   for(int i =0;i<vet.size();i++) {
	   vetstring[i] = String.valueOf(vet.get(i));   
    }
   
   for (int i = 0;i<vet.size();i++) {
     System.out.println(vetstring[i]);
 	}

 }
}
