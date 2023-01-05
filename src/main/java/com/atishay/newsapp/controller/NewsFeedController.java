package com.atishay.newsapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atishay.newsapp.constant.HtmlTemplateConstants;

@RestController
public class NewsFeedController {

	@GetMapping("/")
	public String getFeed() {
        return HtmlTemplateConstants.NEWS_TEMPLATE;
    }
}
