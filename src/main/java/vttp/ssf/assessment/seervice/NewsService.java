package vttp.ssf.assessment.seervice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

import vttp.ssf.assessment.model.Data;

@Service
public class NewsService {
    private static final Logger logger = LoggerFactory.getLogger(NewsService.class);
    String cryptoUrl = "https:min-api.cryptocompare.com/data/v2/news/?lang=EN";

    
    public HashMap getArticale() {
		
		RestTemplate template = new RestTemplate();
		ResponseEntity<Data> responseEntity = 
			                template.getForEntity(cryptoUrl, 
                            Data.class);
		Data data = responseEntity.getBody();
        logger.info(data.toString());
        
        ArrayList<HashMap> dataHash = new ArrayList<>();
        dataHash = data.getData();
        ArrayList<HashMap> dataHashMap = new ArrayList<>();
        
        for (HashMap dataMap : dataHash) {
            String id = (String) dataMap.get("id");
			String publishhed_on = (String) dataMap.get("published_on");
			String title = (String)dataMap.get("title");
            String url = (String)dataMap.get("url");
			String imageurl = (String)dataMap.get("imageurl");
            String body = (String)dataMap.get("body");
            String tags = (String)dataMap.get("tags");
            String catigories = (String)dataMap.get("categories");

            dataMap.put("id", id);
			dataMap.put("publishhed_on", publishhed_on);
			dataMap.put("url", url);
			dataMap.put("imageurl", imageurl);
			dataMap.put("body", body);
            dataMap.put("tags", tags);
            dataMap.put("catigories", catigories);
			dataHashMap.add(dataMap);
        }

    return dataHashMap.get(0);

        
    }
    
}
