package com.news.url.shortener.news_url_shortener.service.GenerateShortUrlServiceImpl;

import com.news.url.shortener.news_url_shortener.dto.GenerateShortUrlDto;
import com.news.url.shortener.news_url_shortener.repository.GenerateShortUrlRepository;
import com.news.url.shortener.news_url_shortener.service.GenerateShortUrlService;

public class GenerateShortUrlServiceImpl implements GenerateShortUrlService {

    private final GenerateShortUrlRepository generateShortUrlRepository;

    public GenerateShortUrlServiceImpl(GenerateShortUrlRepository generateShortUrlRepository) {
        this.generateShortUrlRepository = generateShortUrlRepository;
    }

    @Override
    public GenerateShortUrlDto generateShortUrl(String longUrl) {

        return null;
    }
}
