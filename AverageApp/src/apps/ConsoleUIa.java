package apps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import mytools.AverageDevice;

public class ConsoleUIa {
    
    private AverageDevice device;
    
    public ConsoleUIa() {
        device = new AverageDevice();
    }
    
    public AverageDevice getDevice() {
        return device;
    }
    
    public static void main(String[] args) {
        
        ConsoleUIa myCli = new ConsoleUIa();

        // make a test set
        ArrayList<Double> test = new ArrayList<>();
        test.add(3.4);
        test.add(10.);
        test.add(-12.);

        // set inputs
        myCli.getDevice().setInputs(test);

        // verify inputs with user
        myCli.getDevice().printInputs();

        // get avg
        Object out = myCli.getDevice().getAvg();
        System.out.println("The average is "
                + out
                + "\n"
                + "I hope you have enjoyed our services!");

        
    }//END of main

}//END of ConsoleUIa
