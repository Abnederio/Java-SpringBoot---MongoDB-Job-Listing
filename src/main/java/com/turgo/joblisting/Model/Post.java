package com.turgo.joblisting.Model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;

@Document(collection = "JobPost")
public class Post {
    private String desc;
    private int exp;
    private String role;
    private String tech[];

    public Post() {
    }

    @Override
    public String toString() {
        return "Post{" +
                "desc='" + desc + '\'' +
                ", exp=" + exp +
                ", role='" + role + '\'' +
                ", tech=" + Arrays.toString(tech) +
                '}';
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String[] getTechs() {
        return tech;
    }

    public void setTech(String[] tech) {
        this.tech = tech;
    }
}
