package com.news.url.shortener.news_url_shortener.repository;

import com.news.url.shortener.news_url_shortener.dto.GenerateShortUrlDto;
import com.news.url.shortener.news_url_shortener.entity.GenerateShortUrl;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenerateShortUrlRepository extends JpaRepository<GenerateShortUrl, Long> {
    GenerateShortUrlDto findByShortUrl(String shortUrl);

}
