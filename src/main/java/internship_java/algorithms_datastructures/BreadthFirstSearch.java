package internship_java.algorithms_datastructures;

import java.util.*;

public class BreadthFirstSearch {
    private static Map<String, String[]> getGraph() {
        Map<String, String[]> map = new HashMap<>();
        map.put("you", new String[]{"alice", "bob", "claire"});
        map.put("alice", new String[]{"peggie"});
        map.put("bob", new String[]{"anuj", "peggie"});
        map.put("claire", new String[]{"tom", "jonny"});
        map.put("peggie", null);
        map.put("anuj", null);
        map.put("tom", null);
        map.put("jonny", null);
        return map;
    }

    private static boolean personIsSeller(String name) {

        return name.equals("bob");
    }

    private static void search() {
        Map<String, String[]> graph = getGraph();
        Set<String> searched = new HashSet<>();
        Deque<String> searchQue = new ArrayDeque<>();
        searchQue.add("you");
        while (!searchQue.isEmpty()) {
            String person = searchQue.pollFirst();
            System.out.println(person);
            if (personIsSeller(person)) {
                System.out.println(person + " He is a seller!");
                break;
            } else {
                String[] friends = graph.get(person);
                if (friends == null) {
                    continue;
                }
                for (String friend : friends) {
                    if (friend != null && !searched.contains(friend)) {
                        searchQue.addLast(friend);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        search();
    }
}
