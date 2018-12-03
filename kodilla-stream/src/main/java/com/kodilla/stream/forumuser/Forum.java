package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

        private final List<ForumUser> getUserList = new ArrayList<>();
        public Forum() {
            getUserList.add(new ForumUser(001, "Damian", 'M', 1987, 6,30,5));
            getUserList.add(new ForumUser(002, "Olek", 'M',2003, 4,12,0));
            getUserList.add(new ForumUser(003, "Ksenia", 'F', 1997,11,23,9));
            getUserList.add(new ForumUser(004, "Beatrice", 'F',  1981,7,19,20));
            getUserList.add(new ForumUser(005, "Marian", 'M', 2004,1,15,0));
            getUserList.add(new ForumUser(006, "Margaret", 'F', 1995,3,13,7));
            getUserList.add(new ForumUser(007, "Zbigniew", 'M', 1990,5,29,15));

        }

        public List<ForumUser> getList() {
            return new ArrayList<>(getUserList);

    }
}
