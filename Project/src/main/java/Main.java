import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
    }

    public static String reverseString(String string){
        String reversed = "";

        for (int i = 0; i < string.length(); i++)
        {
            char character = string.charAt(i);
            reversed = character + reversed;
        }

        return reversed;
    }

    public static void printStrings(ArrayList<String> stringList){
        int maxLength = 0;

        for(String string : stringList){
            if(string.length() > maxLength){
                maxLength = string.length();
            }
        }

        System.out.println(new String(new char[maxLength + 4]).replace("\0", "*"));

        for(String string : stringList){
            while(string.length() < maxLength){
                string = string.concat(" ");
            }

            System.out.println("* " + string + " *");
        }

        System.out.println(new String(new char[maxLength + 4]).replace("\0", "*"));
    }

    public static ArrayList<Object> removeDuplicates(ArrayList<Object> list)
    {
        ArrayList<Object> newList = new ArrayList<>();

        for (Object element : list) {
            if(element instanceof Integer || element instanceof Float || element instanceof Double){
                if (!newList.contains(element)) {
                    newList.add(element);
                }
            }
        }

        return newList;
    }


    public static HashMap<String, ArrayList<String>> dictionary(ArrayList<String> stringList){
        HashMap<String, ArrayList<String>> dictionary = new HashMap<>();
        ArrayList<String> video = new ArrayList<>();
        ArrayList<String> audio = new ArrayList<>();
        ArrayList<String> other = new ArrayList<>();

        for(String string : stringList){
            switch (string.substring(string.indexOf("."))) {
                case ".mp4", ".wav" -> audio.add(string);
                case ".mng" -> video.add(string);
                default -> other.add(string);
            }
        }

        dictionary.put("Video", video);
        dictionary.put("Audio", audio);
        dictionary.put("Other", other);
        return dictionary;
    }

    public static int rabbits(int nYears, int numberRabbits, int rabbitsBirths){
        int totalRabbits;

        if(nYears == 0){
            totalRabbits = 0;
        } else if (nYears == 1){
            totalRabbits = 1;
        } else if (nYears == 2 || nYears == 3 || nYears == 4){
            totalRabbits = (rabbits(nYears - 1, numberRabbits, rabbitsBirths) + rabbits(nYears - 2, numberRabbits, rabbitsBirths)) * rabbitsBirths + 1;
        } else {
            totalRabbits = (rabbits(nYears - 1, numberRabbits, rabbitsBirths) + rabbits(nYears - 2, numberRabbits, rabbitsBirths)) * rabbitsBirths;
        }

        return  totalRabbits;
    }
}
