package com.wu.cmfz.service.impl;

import com.wu.cmfz.dao.ArticleDao;
import com.wu.cmfz.entity.Article;
import com.wu.cmfz.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wu on 2018/7/8.
 */
@Service
@Transactional
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleDao articleDao;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public Map<String, Object> queryArticle(int totalSize, int pageIndex) {
        List<Article> articles = articleDao.selectArticle((pageIndex - 1) * totalSize, totalSize);
        int count=articleDao.countArticle();
        Map<String,Object> map =new HashMap<String,Object>();
        map.put("total",count);
        map.put("rows",articles);
        return map;
    }

    @Override
    public boolean addArticle(Article article) {
        return articleDao.insertArticle(article);
    }

    @Override
    public boolean modifyArticle(Article article) {
        return articleDao.updateArticle(article);
    }
}
