package com.service2.serviceEnv2.controller;

import com.service2.serviceEnv2.entity.ArticleInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mafeki
 */
@RestController
@RequestMapping("/")
public class Controller {

    @GetMapping
    public ArticleInfo getArticle(String id) {
        ArticleInfo article = new ArticleInfo("2", 10);

        return article;
    }

}
