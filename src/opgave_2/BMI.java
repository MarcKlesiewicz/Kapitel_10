package opgave_2;

public class BMI {

    public String name;
    public int age;
    public double weight;
    public double feet;
    public double inches;

    public BMI(String name, int age, double weight, double feet, double inches){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.feet = feet;
        this.inches = inches;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public double getWeight(){
        return weight;
    }

    public  double getFeet(){
        return feet;
    }

    public double getInches(){
        return inches;
    }

    public double getBMI(){

        double feetToInches = (feet * 12) + inches;

        double newBMI = 703 * (weight / (feetToInches * feetToInches));

        return newBMI;
    }
}
