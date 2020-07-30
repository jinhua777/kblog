package com.jinhua.kblog.base.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 评论
 */
@Entity
@Table(name = "kto_comment")
public class Comment implements Serializable {

    private static final long serialVersionUID = -2925964856470500104L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    /**
     * 博文ID
     */
    private long articleId;

    /**
     * 用户id
     */
    private long userId;

    /**
     * 评论内容
     */
    @Column(length = 1000)
    private String content;

    /**
     * 父评论id
     */
    @Column(name = "parent_comment_id")
    private long parentCommentId;

    /**
     * 评论日期
     */
    private Date created;

    /**
     * 状态
     */
    private int status;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getArticleId() {
        return articleId;
    }

    public void setArticleId(long articleId) {
        this.articleId = articleId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getParentCommentId() {
        return parentCommentId;
    }

    public void setParentCommentId(long parentCommentId) {
        this.parentCommentId = parentCommentId;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
