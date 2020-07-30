package com.jinhua.kblog.base.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 标签
 */
@Entity
@Table(name = "kto_label")
public class Label implements Serializable {

    private static final long serialVersionUID = 932121585636669682L;

    private long id;

    /**
     * 标签名
     */
    @Column(length = 64)
    private String name;

    /**
     * 描述
     */
    @Column(length = 500)
    private String description;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
