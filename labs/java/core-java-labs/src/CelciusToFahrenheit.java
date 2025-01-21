import java.util.Scanner;

public class CelciusToFahrenheit {

//    static float celcius;

    public static void main(String[] args) {
        // Approach 1: Take Value in Celcius
//        float celcius = 100F;

        // Approach 2: Read value from command line arg
//        float celcius = 0.0F;
//
//        if(args.length > 0) {
//            celcius = Float.parseFloat(args[0]);
//        } else {
//            System.out.println("Please provide argument");
//            return;
//        }


        // Approach 3: Reach input from user

        Scanner in = new Scanner(System.in);

        char flag = 'Y';

        do {
            System.out.print("Enter the value in Celcius: ");
            float celcius = in.nextFloat();

            // TODO: Do the conversion
            //(9x/5)+32
            float fahrenheit = 9 * (celcius / 5) + 32;

            // TODO: Print the value in Fahrenheit
            System.out.println(celcius + " degree celcius is " + fahrenheit + " fahrenheit");

            System.out.print("Do you want to continue? Y/N");
            flag = in.next().toCharArray()[0];
        }while(flag == 'Y');

    }
}
