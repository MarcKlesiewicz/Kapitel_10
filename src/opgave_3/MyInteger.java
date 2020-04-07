package opgave_3;

public class MyInteger {

    public int value;


    public MyInteger(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    public static boolean isEven(int value){

        boolean even;

        if (value % 2 == 0){
            even = true;
        }else{
            even = false;
        }
        return even;
    }

    public static boolean isOdd(int value){

        boolean odd;

        if (value % 2 == 0){
            odd = false;
        }else{
            odd = true;
        }
        return odd;
    }

    public static boolean isPrime(int value){

        boolean prime = false;

        for (int i = 2; i < value/2 ; i++) {

            if (value % i == 0){
                prime = true;

            }else {
                prime = false;
            }

        }

        return prime;
    }


}
