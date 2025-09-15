// Write a program to convert the input dollar (4) into its peso equivalent. Presume that
// one dollar is equivalent to 50.75. Then display the result on the screen.


public class DollarConverter {


    public static void main(String[] args) {

        double dollars = 4;
        double pesoEquivent = 50.75;
        double total;

        total = dollars * pesoEquivent;
        System.out.println("the total of " + dollars + " dollars is equavalent to " + total  + " pesos.");
        
    }

}

