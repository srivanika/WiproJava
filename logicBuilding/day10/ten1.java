package logicBuilding.day10;

public class ten1 {
   public String secondWordUpperCase(String input1)
    {
        input1 = input1.trim();

        String[] words = input1.split("\\s+");

        if(words.length < 2)
        {
            return "LESS";
        }

        return words[1].toUpperCase();
    }
}  

