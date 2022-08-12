package vttp.ssf.assessment.model;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Data {
    private static final Logger logger = LoggerFactory.getLogger(Data.class);

    private ArrayList<Datum> data;

    public ArrayList<Datum> getData() {
        return data;
    }

    public void setData(ArrayList<Datum> data) {
        this.data = data;
    }


}