package novin.ardian.yee.calciv2;

/**
 * @author Novin on 21/09/2022
 * @project belajar-java-oop
 */
public class Data {
    private double num1, num2;

    public Data(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public double divide(){
        if (num2 == 0){
            throw new ArithmeticException("Cant divided by zero");
        }
        return num1 / num2;
    }

    public double add(){
        return num1 + num2;
    }

    public double multiply(){
        return num1 * num2;
    }

    public double substract(){
        return num1 - num2;
    }


}
