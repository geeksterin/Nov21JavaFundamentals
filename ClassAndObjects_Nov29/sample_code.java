

class Mobile{

    /*
     1. instance variables / member variables
    */

    String model;
    int price;

   static String termsAndConditions;


   /*
     2.  Constructors

         Rules for Constructors:
             1) Its structure looks similar to methods
             2)Even though its structure looks similar to method
                 for Constructor there is no return type
             3) Constructor should have same name as that of class name



    */

         Mobile() {    //  default no argument Constructor
             // any operation like assigning values to variables
             // will be called only once during object creation

             this.model="nokia";
             this.price=2000;

             System.out.println("Inside Constructor");

          }

          Mobile(String model, int price){
              this.model=model;
              this.price=price;
          }


          Mobile(String model, int price, float value){

          }


    /*
    3.  methods
   */

    public void call(){

        System.out.println("calling");

    }

    public void message(){

        System.out.println("sending message");

    }

    public void on(){
        System.out.println("swithing on");
    }

    //getters -> get the value -> methods


    public String getModel(){      //   public <return-type> get<Variable-name>(){

       return this.model;
    }

    public int getPrice(){
        return this.price;
    }

    //setters -> set the value -> methods

    public void setModel(String model){

        this.model=model;

    }

    public void setPrice(int price){
        this.price=price;
    }

    public void changeFuntionality(){
        String model="samsung";
    }
}






public class sample_code {

    public static void main(String[] args) {

        Mobile nokia=new Mobile(); // obj creation  and constructor calling

        // Approach-1 : assigning values to variables
//        nokia.model="1100";
//        nokia.price=2000;

        // Approach-2 :  Getters and Setters
        nokia.setModel("1100");
        nokia.setPrice(2000);

        // Approach-3 :  Constructors

        /*
            Rules for Constructors:
             1) Even though its structure looks similar to method
                 for Constructor there is no return type
             2) Constructor should have same name as that of class name




        */


        // printing values of variables
        System.out.println("Model="+nokia.getModel());
        System.out.println("Price="+nokia.getPrice());

        Mobile iphone=new Mobile("iphone",1200000); // obj creation



        // printing values of variables
        System.out.println("Model="+iphone.getModel());
        System.out.println("Price="+iphone.getPrice());

    }
}
