package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int id;
    private final String name;
    private final char sex;
    private final LocalDate birthDate;
    private final int numberOfPost;

    public ForumUser(final int id, final String name, final char sex, final int yearOfBirth, final int monthOfBirth, final int dayOfBirth, final int numberOfPost) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.numberOfPost = numberOfPost;

    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public char getSex(){
        return sex;
    }
    public int getBirthDate(){
        return birthDate.getYear() + birthDate.getMonthValue() + birthDate.getDayOfMonth();
    }
    public int getNumberOfPost(){
        return numberOfPost;
    }

    @Override
    public String toString(){
        return "ForumUser{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", numberOfPost='" + numberOfPost + '\'' +
                '}';
    }

}

