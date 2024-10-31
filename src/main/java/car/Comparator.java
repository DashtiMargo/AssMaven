package car;

import java.util.ArrayList;
import java.util.Collections;

public class Comparator{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "Привет", "как", "дела?");
        Collections.sort(list);
    }
}

class StringLengthComparator
{
    public int compare (String obj1, String obj2)
    {
        return obj1.length() - obj2.length();
    }
}


