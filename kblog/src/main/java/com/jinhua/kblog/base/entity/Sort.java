package com.jinhua.kblog.base.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 分类
 */
@Entity
@Table(name = "kto_sort")
public class Sort implements Serializable {

    private static final long serialVersionUID = 1647608149695456212L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 分组名称
     */
    @Column(name = "name", length = 60)
    private String name;

    /**
     * 描述
     */
    @Column(length = 500)
    private String description;

    @Column(name = "parent_sort_id")
    private Long parentSortId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Long getParentSortId() {
        return parentSortId;
    }

    public void setParentSortId(Long parentSortId) {
        this.parentSortId = parentSortId;
    }
}
