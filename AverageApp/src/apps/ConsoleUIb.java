//java -jar "E:\www-2017\AverageApp\dist\AverageApp.jar" a 3 4.5 100 -1230 -34.556 a 345 b $%^#@ 1.1111

package apps;

import mytools.AverageDevice;
import mytools.DataLoader;

public class ConsoleUIb {

    private AverageDevice device;

    public ConsoleUIb() {
        device = new AverageDevice();
    }
    public AverageDevice getDevice() {
        return device;
    }

    public static void main(String[] args) {

        ConsoleUIb myCli = new ConsoleUIb();

        // Option 1: Collect inputs from the command line with args       
        DataLoader reader = new DataLoader();
        myCli.getDevice().setInputs(reader.parseArgs(args));

        // Verify inputs with user
        myCli.getDevice().printInputs();

        // get avg
        String out = myCli.getDevice().getFormatAvg(5);
        System.out.println("The average is " 
                + out 
                + "\n"
                + "I hope you have enjoyed our services!");

    }//END of main

}//END of ConsoleUIb
