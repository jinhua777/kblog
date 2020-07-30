package com.jinhua.kblog.base.dao;

import com.jinhua.kblog.base.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 */
public interface UserRepository extends JpaRepository<User, Long>, JpaSpecificationExecutor<User> {
    User findByEmail(String email);

    User findByUsername(String username);

    User findByPhone(String phone);

    @Modifying
    @Query("update User set articles = articles + :increment where id = :id")
    int incrementArticles(@Param("id") long id, @Param("increment") int increment);

}
