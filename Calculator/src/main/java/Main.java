import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi it's a calculator of your quadratic equation :)");
        System.out.println("Please enter the a, b, c of your equation!");
        System.out.println("-----------------------------------------------------------");
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();
        System.out.println("---------------------------------------------------------------");
        ArrayList<Double> answer = job(a, b, c);
        if (answer.isEmpty()){
            System.out.println("This equation hasn't got answers");
        }else{
            for (int i = 0; i < answer.size(); i++){
                System.out.println("x equals: " + answer.get(i));
            }
        }
        System.out.println("-------------------------------------------------------------------");
    }
    public static ArrayList<Double> job(double a, double b, double c){
        ArrayList<Double> answers = new ArrayList<Double>();
        double x;
        if (b == 0 && c == 0){
            x = 0;
            answers.add(x);
        }else if(b == 0){
            x = (-c)/a;
            if (x < 0){
                System.out.println("This equation hasn't got answers");//поправь потом
            }else{
                answers.add(Math.sqrt(x));
            }
        }else if(c == 0){
            x = 0;
            answers.add(x);
            x = (-b)/a;
            answers.add(x);
        }else{
            double discriminant = b*b -(4 * a * c);
            if (discriminant < 0){

            }else if (discriminant > 0) {
                x = (-b + Math.sqrt(discriminant)) / (2 * a);
                answers.add(x);
                x = (-b - Math.sqrt(discriminant)) / (2 * a);
                answers.add(x);
            }else{

            }
        }
        return answers;
    }

}

