import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        System.out.println("This is a test for two sum");

        int[] nums = {2, 7, 11, 15};

        int target = 18;

        System.out.println(Arrays.toString(twoSum(nums, target)));
        System.out.println(Arrays.toString(twoSum(nums, target)));

        List<Integer> list1 =  new LinkedList<>();
        list1.add(2);
        list1.add(4);
        list1.add(3);
        System.out.println(list1.toString());
        List<Integer> list2 =  new LinkedList<>();
        list2.add(4);
        list2.add(6);
        list2.add(5);

        int i = 3;
        i++;
        System.out.println(i);
        ++i;
        System.out.println(i);

        System.out.println(++i);

        System.out.println(i++);

        System.out.println(i);

        conditionCheck(3);

        Integer[] intArray = {1,2, 3, 4};
        String[] strArray = {"I", "am", "Tian"};
        System.out.println(fromArrayToList(intArray).toString());
        System.out.println(fromArrayToList(strArray).toString());


    }

    public static int[] getIndics(int[] nums, int target){
        int[] indics = new int[2];
        int[] demandNums = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            demandNums[i] = target - nums[i];
        }
        for(int j = 0; j < demandNums.length; j++){
            for (int h = 0; h < nums.length; h++){
                if(j != h && demandNums[j] == nums[h]){
                    indics[0] = h;
                    indics[1] = j;
                    break;
                }
            }
        }
        return indics;
    }

    public static int[] twoSum(int[] nums, int target){
        int[] indics = new int[2];
        Map<Integer, Integer> ht = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int demandNum  = target - nums[i];
            if(ht.containsKey(demandNum)){
                indics[1] = i;
                indics[0] = ht.get(demandNum);
                break;
            }else{
                ht.put(nums[i], i);
            }

        }
        return indics;
    }

    public static boolean containPrefix(String[] strs, String prefix){
        boolean contained = true;
        for(String str : strs){
            if(!str.startsWith(prefix)){
                contained = false;
                break;
            }
        }
        return contained;
    }

    /**
     * This is a prac code for longest common prefix problem
     * @param strs contains a list of strings for comparison.
     * @return a string which is the common prefix for all strings.
     */
    /*public static String longestCommonPrefix(String[] strs){
        String cp = "";
        String[] checkPrefixBase = strs[0].split("");
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return cp;
    }
*/
    public static LinkedList<Integer> addTwoNumbers(LinkedList list1, LinkedList list2){
        LinkedList<Integer> result = new LinkedList<>();
        Iterator<Integer> itr= list1.iterator();
        return result;
    }

    public static void conditionCheck(int input){
        if(input >= 0) {
            if (input == 0)
                System.out.println("first string");
        }else{
            System.out.println("second string");
        }
        System.out.println("third string");
    }

    public static <T> List<T> fromArrayToList(T[] a){
        return Arrays.stream(a).collect(Collectors.toList());
    }

}
