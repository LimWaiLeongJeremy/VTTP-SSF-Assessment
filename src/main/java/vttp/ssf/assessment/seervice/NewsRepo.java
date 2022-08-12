package vttp.ssf.assessment.seervice;

import vttp.ssf.assessment.model.Data;

public interface NewsRepo {
  
    public void save(final Data data);
    public Data load(final String id);
}
