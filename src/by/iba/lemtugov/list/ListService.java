package by.iba.lemtugov.list;

import java.util.ArrayList;
import java.util.List;

public class ListService {
    private static List<Person> groupList = new ArrayList<> (  );

    static {
        groupList.add (new Person ( "anna1", "37544 71123123", "qwe@qwe.qwe" ));
        groupList.add (new Person ( "anna2", "375144 7133123", "q1we@qwe.qwe" ));
        groupList.add (new Person ( "anna3", "3751244 713123", "q11we@qwe.qwe" ));
        groupList.add (new Person ( "anna4", "3351244 713123", "q11we1@qwe.qwe" ));
    }

    static public List <Person> retriveList (){
        return groupList;
    }

    static public void addPerson(Person person) {
        groupList.add(new Person(person));
    }

}
