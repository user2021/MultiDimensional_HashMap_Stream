package HashMap2021_JuneStackOverflow;

import java.util.List;
import java.util.Map;

public class Profiler_Processor {

    int inner0_something;

    public String inner0_Processor(Map<String, Map<Integer, Map<Integer, Map<Integer, Map<Integer, Character>>>>> incomingToProcess, String input_key) {

        for (Map.Entry<String, Map<Integer, Map<Integer, Map<Integer, Map<Integer, Character>>>>> entry : incomingToProcess.entrySet()) {
            String key = entry.getKey();
            
            //NEED HELP HERE
            //List<String> valueList = entry.getValue();

            if (key == null ? input_key == null : key.equals(input_key)) {
//                for (String s : valueList) {
//                    //for (String value : entry.getValue()) {
//                    inner0_something = valueList.get(1);
//                }
            }
        }
        return null;
    }

    public String inner1_Processor(Map<String, Map<Integer, Map<Integer, Map<Integer, Map<Integer, Character>>>>> incomingToProcess, String input_key) {

        return null;
    }

    public String inner2_Processor(Map<String, Map<Integer, Map<Integer, Map<Integer, Map<Integer, Character>>>>> incomingToProcess, String input_key) {

        return null;
    }

    public String inner3_Processor(Map<String, Map<Integer, Map<Integer, Map<Integer, Map<Integer, Character>>>>> incomingToProcess, String input_key) {

        return null;
    }

    public String character_Processor(Map<String, Map<Integer, Map<Integer, Map<Integer, Map<Integer, Character>>>>> incomingToProcess, String input_key) {

        return null;
    }

}
