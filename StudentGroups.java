package TP4;
import java.util.Set;
import java.util.HashSet;

public class StudentGroups {
    public void main(){
        HashSet<String> groupA = new HashSet<>();
        HashSet<String> groupB = new HashSet<>();

        groupA.add("Ahmed");
        groupA.add("Mohammad");
        groupA.add("Asma");

        groupB.add("Ahmed");
        groupB.add("Anas");
        groupB.add("Amine");

        System.out.println("Group A: " + groupA);
        System.out.println("Group B: " + groupB);

        Set<String> intersection = new HashSet<>(groupA);
        intersection.retainAll(groupB);
        System.out.println("Intersection: " + intersection);

        Set<String> union = new HashSet<>(groupA);
        union.addAll(groupB);
        System.out.println("Union: " + union);
    }
}
