package practice;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailList {
    private final TreeSet<String> emailList = new TreeSet<>();

    public void add(String email) {
        String regex = "[A-z0-9-\\_.]+?@[A-z0-9]+?\\.[A-z]{2,3}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            emailList.add(matcher.group(0).toLowerCase());
        } else {
            System.out.println(Main.WRONG_EMAIL_ANSWER);
        }
    }

    public List<String> getSortedEmails() {
    for (String emails : emailList) {
        System.out.println(emails);
    }
        return new ArrayList<>(emailList);
    }
}
