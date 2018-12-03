package com.kodilla.stream;

import java.util.List;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        ForumUser theForumUser = new ForumUser();
        List<Forum>theResultOfForum = theForumUser.getList().stream()
                .filter(forum -> forum.getSex.equals('M'))
                .filter(forum-> forum.numberOfPost() > 1)
                .filter(forum -> forum.getBirthDate() > 1998)
                .map(Forum::toString)
                .collect(Collectors.joining(", \n", "<<",">>"));

        System.out.println(theResultOfForum);

    }
}
