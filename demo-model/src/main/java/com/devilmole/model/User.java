package com.devilmole.model;

import java.util.List;

/**
 * Created by Administrator on 2016/3/10 0010.
 */
public class User {

    private String id;
    private String name;
    private String nick;
    private String start;
    private List<column> columns;

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public List<column> getColumns() {
        return columns;
    }

    public void setColumns(List<column> columns) {
        this.columns = columns;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }
}
