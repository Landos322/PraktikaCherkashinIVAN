import java.util.*;
class Actor
{
    String name;
    int roles;
}

public class RoliAkterov {


    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in,"cp1251");
        System.out.println("Vvedite kol-vo akterov");
        int kol = in.nextInt();
        Actor [] actor =new Actor [kol];
        in.nextLine();
        for (int i = 0; i < kol; i++) {
            actor[i] = new Actor();
            System.out.println("Vvedite imya " + (i+1) + "  Aktera - ");
            actor[i].name = in.nextLine(); 
               System.out.println("Vvedite kolichestvo glavnih roley " + (i+1) + " Aktera - ");
            actor[i].roles = in.nextInt();
            in.nextLine();
        }
                  int minroles  = actor[0].roles;         
     for (int i = 0; i<actor.length; i++) 
     {             
         if (minroles > actor[i].roles)   {              
             minroles  = actor[i].roles;
          System.out.print("Akter s naimenshim kolvom glavnih roley " + actor[i].name + " "+ actor[i].roles+" \n");}}         
                    
    }}

     
    
