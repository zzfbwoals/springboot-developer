package me.ryujaemin.springbootdeveloper.repository;

import me.ryujaemin.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
