package Methods_Nov_15;

public class code_sample {

    public static void main(String[] args) {

        code_sample obj1=new code_sample();
        code_sample obj2=new code_sample();
        code_sample obj3=new code_sample();

        add(5.5f,5.5f, 5.5f);

        isPositive(5);
    }



    static int add(int a, int b){
        int res=a+b;
        return res;
    }

    static float add(float a, float b){
        float res=a+b;

        res=res+10;
        return res;
    }

    static float add(float a, float b, float c){
        float res=a+b;
        return res;
    }

    float add(float a, float b, int c){
        float res=a+b;
        return res;
    }
//
//    static double add(double a, double b){
//        double res=a+b;
//        return res;
//    }



    static void isPositive(int a){

        if(a>0){
            System.out.println("Postive");
        }else {
            System.out.println("Negative");
        }




        if(a==5){
            System.out.println("Its five");
        }else {
            System.out.println("not five");
        }

        //   return;
        if(a==0){
            System.out.println("Its zero");
        }else {
            System.out.println("not zero");
        }
    }



    static void  say_hi(){
        System.out.println("Hi");
    }



}


/*

Method Overloading
    same method name and different argument data types and counts
    Note: return type will not affect Method Overloading

Method types:
    instance method  -> created for each obj
    static method    -> created for class only once



- perform specific tasks
- like functions
- to reduce code reputation
- reuse the code


// java -> classes and obj  ->

classes-> 1)variables 2)methods -> to do business logic



Method->

 */
