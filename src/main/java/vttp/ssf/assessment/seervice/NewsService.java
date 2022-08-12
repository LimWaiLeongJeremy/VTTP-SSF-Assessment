package vttp.ssf.assessment.seervice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

import vttp.ssf.assessment.model.Data;
import vttp.ssf.assessment.model.Datum;

@Service
public class NewsService implements NewsRepo{
    private static final Logger logger = LoggerFactory.getLogger(NewsService.class);
    String cryptoUrl = "https:min-api.cryptocompare.com/data/v2/news/?lang=EN";

    
    public ArrayList<Datum> getArticale() {
		RestTemplate template = new RestTemplate();
        RequestEntity<Void> req = RequestEntity.get(cryptoUrl)
            .accept(MediaType.APPLICATION_JSON).build();
        ResponseEntity<Data> resp = template.exchange(req, Data.class);

        ArrayList<Datum> dataHash = new ArrayList<>(resp.getBody().getData());
        ArrayList<HashMap> dataHashMap = new ArrayList<>();

        return dataHash;
    }


    @Override
    public void save(Data data) {
        // TODO Auto-generated method stub
        
    }


    @Override
    public Data load(String id) {
        // TODO Auto-generated method stub
        return null;
    }
}
