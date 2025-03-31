public class Employee {

    protected int age;
    protected int id;
    protected String name;
    protected boolean isPermanent;

    public static void main(String args [])
    {
        Employee emp = new Employee();

        //assignin a values

        emp.id=101;
        emp.name="Aman kumar";
        emp.isPermanent=true;

        // here we are commenting this becaue the value is (float type) and the datatype is (int)
       // emp.age=35.5;

       //so we use typecasting to convert the float value to int
       emp.age=(int)35.5;

       // now it will run without errors let check it


       
       System.out.println("Suceesfully started ");
        System.out.println("Employee name : " + emp.name);
        System.out.println("Employee name : " + emp.id);
        System.out.println("Employee name : " + emp.age);
        System.out.println("Employee name : " + emp.isPermanent);

        // succesfully run
        System.out.println("Suceesfully Run the program ");
        





        


        

    }





    
}
