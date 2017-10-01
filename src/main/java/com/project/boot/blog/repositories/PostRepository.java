package com.project.boot.blog.repositories;

import com.project.boot.blog.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {

}
