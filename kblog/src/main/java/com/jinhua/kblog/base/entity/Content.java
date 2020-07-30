package com.jinhua.kblog.base.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 内容
 */
@Entity
@Table(name = "kto_content")
public class Content implements Serializable {

    private static final long serialVersionUID = 206284329340422179L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 内容
     */
    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Type(type = "text")
    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
