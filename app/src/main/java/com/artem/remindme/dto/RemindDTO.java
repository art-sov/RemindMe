package com.artem.remindme.dto;

import java.util.Date;

public class RemindDTO {

    private String id;
    private String title;
    private Date remindDte;

    public RemindDTO() {
    }

    public RemindDTO(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getRemindDte() {
        return remindDte;
    }

    public void setRemindDte(Date remindDte) {
        this.remindDte = remindDte;
    }
}
