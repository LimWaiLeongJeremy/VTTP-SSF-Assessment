package vttp.ssf.assessment.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Data {
    private static final Logger logger = LoggerFactory.getLogger(Data.class);

    private Datum data;

    public Datum getData() {
        return data;
    }

    public void setData(Datum data) {
        this.data = data;
    }

}