import java.util.*;
public class Health
{
  public enum Doctor
  {
    D1("Saikat",200,"Genearal Physician"),
    D2("Ankur",500,"Eye"),
    D3("Mainak",1000,"Heart");
    private String name, spec;
    private int fee;
    Doctor(String n,int f, String s)
    {
      this.name = n;
      this.fee = f;
      this.spec = s;
    }
    void display()
    {
      System.out.println(".  Doctor Name is--- "+name+" Fee is ----"+fee+" Specialization is:----- "+spec);
    }
  }

  public static void main(String[] args)
  {


      Scanner sc = new Scanner(System.in);
      String pname;
      int age;
      int pid = 100;
      System.out.println("Enter your Name:-- ");
      pname = sc.nextLine();
      System.out.println("Enter your Age:-- ");
      age = sc.nextInt();
      System.out.println("Available Doctors are:---- \n\n");
      int c=1;
      for(Doctor x:Doctor.values())
      {
        System.out.print(c);
        c=c+1;
        x.display();
      }
      System.out.println("\n\n-----Select Doctor:----1 or 2 or 3");
      int choice;
      //Doctor d;
      choice=sc.nextInt();
      switch(choice)
      {
        case 1:
        System.out.println("Patient Name -- "+pname);
        System.out.println("Patient ID -- "+pid);
        System.out.println("Patient Age -- "+age);
        System.out.println("Details of Doctor for this Patient is: \n");
        Doctor d = Doctor.D1;
        d.display();
          break;
        case 2:
        System.out.println("Patient Name -- "+pname);
        System.out.println("Patient ID -- "+pid);
        System.out.println("Patient Age -- "+age);
        System.out.println("Details of Doctor for this Patient is: \n");
        Doctor d2 = Doctor.D2;
        d2.display();
          break;

        case 3:
        System.out.println("Patient Name -- "+pname);
        System.out.println("Patient ID -- "+pid);
        System.out.println("Patient Age -- "+age);
        System.out.println("Details of Doctor for this Patient is: \n");
        Doctor d3 = Doctor.D3;
        d3.display();
          break;
              
        default:System.out.println("Invalid Input");
      }





  }
}
