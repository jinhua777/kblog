package com.jinhua.kblog.base.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 用户信息
 * @author jinhua
 */
@Entity
@Table(name = "kto_user")
public class User implements Serializable {

    private static final long serialVersionUID = 6852540115208328078L;

    /**
     * 用户id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户名
     */
    @Column(name = "username", unique = true, nullable = false, length = 64)
    private String username;

    /**
     * 密码（加密）
     */
    @Column(name = "password", length = 64)
    private String password;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 昵称
     */
    @Column(name = "name")
    private String name;

    /**
     * 性别
     */
    private int gender;

    /**
     * 邮箱
     */
    @Column(name = "email", unique = true, length = 64)
    private String email;

    /**
     * 手机
     */
    @Column(name = "phone", unique = true, length = 20)
    private String phone;

    /**
     * 文章数量
     */
    private int articles;

    /**
     * 注册时间
     */
    private Date created;

    /**
     * 最后登录时间
     */
    @Column(name = "last_login")
    private Date lastLogin;

    /**
     * 个性签名
     */
    private String signature;

    /**
     * 状态
     */
    private int status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getArticles() {
        return articles;
    }

    public void setArticles(int articles) {
        this.articles = articles;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
