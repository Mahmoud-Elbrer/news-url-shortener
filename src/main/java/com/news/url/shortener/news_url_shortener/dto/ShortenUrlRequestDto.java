package com.news.url.shortener.news_url_shortener.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.URL;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShortenUrlRequestDto {


    @NotBlank(message = "URL cannot be empty or null")
    @URL(protocol = "http", message = "Invalid URL. Must start with http:// or https://")
    private String longUrl;
}
