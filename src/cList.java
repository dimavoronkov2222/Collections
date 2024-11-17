import java.util.*;
public class cList {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        String[] array = {"One", "Two", "Three"};
        Collections.addAll(list1, array);
        ArrayList<String> list2 = new ArrayList<>(list1);
        List<String> list3 = Arrays.asList("Four", "Five", "Six");
        ArrayList<String> list3Converted = new ArrayList<>(list3);
        list2.addAll(list2.size() / 2, list3Converted);
        list2.sort(Collections.reverseOrder());
        ListIterator<String> iterator = list2.listIterator();
        while (iterator.hasNext()) {
            iterator.next();
            if (iterator.hasNext()) {
                iterator.next();
                iterator.remove();
            }
        }
        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);
        System.out.println("List3 (as ArrayList): " + list3Converted);
        HashSet<String> set1 = new HashSet<>();
        set1.add("Hello");
        set1.add("World");
        set1.addAll(list1);
        set1.addAll(list2);
        System.out.println("Set1: " + set1);
        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        set2.addAll(list2);
        set2.addAll(list3);
        System.out.println("Set2: " + set2);
        LinkedHashMap<Integer, String> map1 = new LinkedHashMap<>();
        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        for (int i = 0; i < months.length; i++) {
            map1.put(i, months[i]);
        }
        System.out.println("First month: " + map1.get(0));
        System.out.println("Last month: " + map1.get(11));
        map1.put(5, "ОТПУСК");
        System.out.println("Updated map1: " + map1);
        HashMap<Integer, String> map2 = new HashMap<>(map1);
        printMap(map1);
        printMap(map2);
        Map<String, Set<String>> map3 = new HashMap<>();
        Set<String> contacts = new HashSet<>(Arrays.asList("123-456", "email@example.com", "skypeID"));
        map3.put("Student1", contacts);
        System.out.println("Map3: " + map3);
        HashSet<User> userSet = new HashSet<>();
        User user1 = new User("John", 25, "123-456");
        User user2 = new User("Jane", 30, "789-012");
        User user3 = new User("John", 35, "345-678");
        userSet.add(user1);
        userSet.add(user2);
        userSet.add(user3);
        System.out.println("UserSet: " + userSet);
    }
    public static void printMap(Map<Integer, String> map) {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}