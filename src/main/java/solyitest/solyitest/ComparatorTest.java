package solyitest.solyitest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(3,"solyi"));
        users.add(new User(1,"moyi"));
        users.add(new User(2,"boyi"));

        // u1<u2 음수리턴  , u1=u2 0리턴, u1>u2 양수리턴  -> int타입 리턴
        Comparator<User> idComparator =( ul,u2)-> ul.getId() - u2.getId();
        Collections.sort(users,idComparator);

        Collections.sort(users,(u1,u2)->u1.getName().compareTo(u2.getName()));
        System.out.println(users);
    }
}
