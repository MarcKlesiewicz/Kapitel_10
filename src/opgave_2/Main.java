package opgave_2;

public class Main {
    public static void main(String[] args) {

        BMI myBMI = new BMI("Marc", 24, 176, 6, 0.8 );

        System.out.println(myBMI.getName() + " your BMI is " + myBMI.getBMI());
    }


}
