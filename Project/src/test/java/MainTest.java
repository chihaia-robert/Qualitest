import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void reverseStringTest() {
        String output = Main.reverseString("Automation");
        assert output.equals("noitamotuA");
    }

    @Test
    void printStringsTest() {
        Main.printStrings(createPrintStringsInput());
    }

    @Test
    void removeDuplicatesTest() {
        ArrayList<Object> output = Main.removeDuplicates(createRemoveDuplicatesInput());
        assert output.equals(createRemoveDuplicatesOutput());
    }

    @Test
    void dictionaryTest() {
        HashMap<String, ArrayList<String>> output = Main.dictionary(createDictionaryInput());
        assert output.equals(createDictionaryOutput());
    }

    @Test
    void rabbitsTest() {
        int output1 = Main.rabbits(10, 1, 1);
        int output2 = Main.rabbits(10, 1, 2);
        int output3 = Main.rabbits(10, 1, 3);

        assert output1 == 123;
        assert output2 == 10360;
        assert output3 == 180981;
    }

    private ArrayList<Object> createRemoveDuplicatesInput(){
        ArrayList<Object> input = new ArrayList<>();
        input.add(1);
        input.add(3);
        input.add(67);
        input.add("1");
        input.add("62");
        input.add("Foo");
        input.add("3");
        input.add(5);
        input.add(1);
        input.add(3);
        input.add(Boolean.FALSE);
        input.add(1.3);
        input.add("Foo");
        return input;
    }

    private ArrayList<Object> createRemoveDuplicatesOutput(){
        ArrayList<Object> output = new ArrayList<>();
        output.add(1);
        output.add(3);
        output.add(67);
        output.add(5);
        output.add(1.3);
        return output;
    }

    private ArrayList<String> createPrintStringsInput() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("in");
        list.add("a");
        list.add("frame");
        return list;
    }

    public static ArrayList<String> createDictionaryInput() {
        ArrayList<String> input = new ArrayList<>();
        input.add("Entry One.mp4");
        input.add("Entry Two.wav");
        input.add("Entry Three.jpg");
        input.add("Entry Four.mng");
        input.add("Entry Five.png");
        input.add("Entry Six.csv");
        return input;
    }

    public static HashMap<String, ArrayList<String>> createDictionaryOutput() {
        HashMap<String, ArrayList<String>> output = new HashMap<>();
        ArrayList<String> video = new ArrayList<>();
        ArrayList<String> audio = new ArrayList<>();
        ArrayList<String> other = new ArrayList<>();

        video.add("Entry Four.mng");
        audio.add("Entry One.mp4");
        audio.add("Entry Two.wav");
        other.add("Entry Three.jpg");
        other.add("Entry Five.png");
        other.add("Entry Six.csv");

        output.put("Video", video);
        output.put("Audio", audio);
        output.put("Other", other);
        return output;
    }
}