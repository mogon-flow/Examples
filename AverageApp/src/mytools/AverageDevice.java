package mytools;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class AverageDevice {

    private List<Double> inputs;
    private Double output;

    public AverageDevice() {
        inputs = new ArrayList<>();
        output = null;
    }
    public List getInputs() {
        return inputs;
    }
    public void setInputs(List inputs) {
        this.inputs = inputs;
    }

    public void printInputs() {//for console app
        int size = inputs.size();
        System.out.println("There are " + size + " valid inputs: ");
        inputs.forEach(System.out::println);
    }

    // calculate average of inputs
    private void calcAverage() {
        OptionalDouble avg = inputs.stream().mapToDouble(i -> i).average();
        output = avg.isPresent() ? avg.getAsDouble() : null;
    }

    public Object getAvg() {
        calcAverage();
        if (!output.isNaN()){
            return output;
        } else {
            return "\nNo invalid input..thus you get NULL";
        }   
    }

    public String getFormatAvg(int scale) {
        calcAverage();
        if (null != output) {
            DecimalFormat mask = new DecimalFormat();
            mask.setMaximumFractionDigits(scale);
            return mask.format(output);
        } else {
            return "\nNo output from your inputs";
        }
    }

}//END of AverageDevice
