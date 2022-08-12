package vttp.ssf.assessment.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import vttp.ssf.assessment.model.*;
import vttp.ssf.assessment.seervice.NewsService;;

@Controller
public class NewsController {
    private static final Logger logger = LoggerFactory.getLogger(NewsController.class);
    
    @Autowired
    private NewsService service;

    @GetMapping("/")
    public void lsCountryCode(Model model) {
        
        HashMap l = service.getArticale();
        logger.info(l.toString());
        model.addAttribute(l);
    }
//         Map<String, String> lsArticle = service.getArticles();
//         List<String> lsOfArt = Arrays.asList(lsArticle.keySet().toArray(new String[0]));
//         List<String> lsOfArtVal = Arrays.asList(lsArticle.values().toArray(new String[0]));

//         model.addAttribute("lsOArt", lsOfArt);
//         model.addAttribute("lsOfArtVal", lsOfArtVal);

//     //     model.addAttribute("id", Data.getId());
//     //     model.addAttribute("published_on", Data.getPublished_on());
//     //     model.addAttribute("title", Data.getTitle());
//     //     model.addAttribute("url", Data.getUrl());
//     //     model.addAttribute("imageurl", Data.getImageurl());
//     //     model.addAttribute("body", Data.getBody());
//     //     model.addAttribute("tags", Data.getTags());
//     //     model.addAttribute("categories", Data.getCategories());

//     }
    
}

