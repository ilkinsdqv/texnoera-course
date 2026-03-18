package l03.variables.homework;

public class Task12HardCheckoutDebug {
    public static void main(String[] args) {
        //Buggy calculation
        int number = 100;
        int percentage = 15;
        int result = number * (percentage/100); //Result of 'percentage/100' is always '0'
        System.out.println(result);

        String hello = "Hello";
        //== compares references
        if(hello == "Hello"){
            System.out.println("Hello");
        }

        int number1 = Integer.MAX_VALUE;
        int number2 = 10;
        System.out.println(number1 + number2);

        //FIX 1
        double fixedResult = number * (percentage/100.0); //Result of 'percentage/100' is always '0'
        System.out.println("FIXED RESULT : " + fixedResult);

        //FIX 2
        if(hello.equals("Hello")){
            System.out.println("Fixed Hello");
        }

        //FIX 3
        try {
            System.out.println(Math.addExact(number1, number2));
        }catch (Exception e){
            //Add exact throws exception if it detects integer overflow
            System.out.println(e.getMessage());
        }


    }
}
