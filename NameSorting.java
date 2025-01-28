import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class NameSorting {
public static void main(String[] args) {
List<String> names = new ArrayList<>();
names.add("John");
names.add("Alice");
names.add("David");
names.add("Emily");
names.add("Bob");
System.out.println("Original list of names: " + names);
// Sorting in ascending order
Collections.sort(names);
System.out.println("List of names sorted in ascending order: " + names);
}
}