package com.elite.rx;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by wjc133
 * Date: 2016/10/25
 * Time: 10:24
 */
public class JokeEntity {
    @JsonProperty("ct")
    private String createTime;
    private String text;
    private String title;
    private int type;

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
