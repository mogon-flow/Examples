package mytools;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DataLoader {

    public List parseArgs(String[] args) {
        List out = new ArrayList<>();
        for (String a : args) {
            try {
                Double temp = Double.parseDouble(a);
                out.add(temp);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + e);
            }//end catch
        }//END for
        return out;     
    }//end parseArgs

    public List parseString(String input) {
        // split input into substrings by \n
        String[] subs = input.trim().split("\\n+");
        // streamlize subs for mapping to Double
        List out = Stream.of(subs)
                .map(s -> {
                    try {
                        return Double.parseDouble(s);
                    } catch (NumberFormatException e) {
                        System.out.println(e);
                        return null;
                    }
                })
                .filter(s->(null!=s))
                .collect(Collectors.toList());
        // return
        return out;
    }//end parseString

}
