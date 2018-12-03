package com.kodilla.stream;

import java.util.List;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        Forum theForumUser = new Forum();
        Map<Integer, ForumUser> theResultOfForum = theForumUser.getList().stream()
                .filter(forum -> forum.getSex()=='M')
                .filter(forum-> forum.getNumberOfPost() > 1)
                .filter(forum -> forum.getBirthDate() > 1998)
                .collect(Collectors.toMap(ForumUser::getId, user-> user));

        System.out.println(theResultOfForum);

    }
}
