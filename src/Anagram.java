import java.util.ArrayList;

class Anagram {
    public static void printStrArr(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
    public static ArrayList<String> groupAnagrams(String arr[]) {
        String[] strArr = new String[arr.length];
        ArrayList <String> output = new ArrayList<> ();
        int count = 0;
        for (int i =0; i < arr.length; i++) {
            for (int j =0; j < arr.length; j++) {
                if (i == j)
                    break;
                if (arr[i].length() == arr[j].length()) {
                    for (int c1 = 0; c1 < arr[i].length(); c1++) {
                        for (int c2 = 0; c2 <arr[j].length(); c2++) {
                            if (arr[i].charAt(c1) == arr[j].charAt(c2))
                                count += 1;
                        }
                    }
                    if (count == arr[j].length()) {
                        output.add(arr[i]);
                        output.add(arr[j]);
                    }
                    count = 0;
                }
            }
        }
        return output;
    }
    public static void main(String args[]) {
        String arr[] = {
                "tom marvolo riddle ",
                "abc",
                "def",
                "cab",
                "fed",
                "clint eastwood ",
                "i am lord voldemort",
                "elvis",
                "old west action",
                "lives"
        };
        ArrayList<String> vec = groupAnagrams(arr);
        System.out.println(vec);
    }
}