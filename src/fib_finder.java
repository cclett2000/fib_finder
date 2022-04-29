//////////////////////////////////////////////////////////
// name: fib_finder.java
// function: calculating fibonacci sequence and finding
//           requested number's index
// programmer: Charles Lett Jr.
// last modifies: 4/29/22
// reference: https://www.javatpoint.com/fibonacci-series-in-java
//////////////////////////////////////////////////////////


public class fib_finder {
    public void run(int number, boolean debug){
        find_num(number, debug);
    }

    private void find_num(int number, boolean debug){
        boolean stop_switch = false;
        int num1 = 0;
        int num2 = 1;
        int num3;
        int count = 0;

        while(stop_switch == false){
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            count += 1;

            if (debug) System.out.println("\nNum: " + number + ", num3: " + num3 + ", count: " + count);

            if (number == num3){
                stop_switch = true;

                if(debug) System.out.println("\n[NUM_EQUAL] Num: " + number + ", num3: " + num3 + ", count: " + count);
                System.out.println("\nNumber found! Index = " + count);
            }

            if (num3 > number){
                stop_switch = true;

                if(debug) System.out.println("\n[NUM_GREATER] Num: " + number + ", num3: " + num3 + ", count: " + count);
                System.out.println("\nNumber not found! This number is not part of the fibonacci sequence!");
            }
        }

    }
}
