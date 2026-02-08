package com.news.url.shortener.news_url_shortener.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "shorted_urls")
public class GenerateShortUrl {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "short_url", nullable = false, unique = true)
    private String shortUrl;

    @Column(name = "long_url", nullable = false)
    private String longUrl;

    @Column(name = "click_count")
    private int clickCount = 0;


}
