package com.news.url.shortener.news_url_shortener.service;

import com.news.url.shortener.news_url_shortener.dto.GenerateShortUrlDto;

public interface GenerateShortUrlService {

    GenerateShortUrlDto generateShortUrl(String longUrl);

}
