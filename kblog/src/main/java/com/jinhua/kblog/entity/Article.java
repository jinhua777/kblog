package com.jinhua.kblog.entity;

import org.hibernate.search.annotations.Field;

import javax.persistence.*;
import java.sql.Statement;
import java.util.Date;

/**
 * 博文
 */
@Entity
@Table(name = "kto_article")
public class Article {

    /**
     * 博文id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 博文标题
     */
    //@Field
    @Column(name = "title", length = 64)
    private String title;

    /**
     * 博文内容id
     */
    private long contentId;

    /**
     * 作者id
     */
    private long authorId;

    /**
     * 创建日期
     */
    private Date created;

    /**
     * 浏览数量
     */
    private int views;

    /**
     * 评论数量
     */
    private int comments;

    /**
     * 收藏数量
     */
    //private int favors;

    /**
     * 点赞数量
     */
    private int likes;

    /**
     * 博文状态（1正常 0删除）
     */
    private int status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getContentId() {
        return contentId;
    }

    public void setContentId(long contentId) {
        this.contentId = contentId;
    }

    public long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(long authorId) {
        this.authorId = authorId;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
