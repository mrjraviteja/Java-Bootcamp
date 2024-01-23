package repository;

import pojo.TradeAccount;
import java.util.*;

public class TradeAccountRepository {
    private Map<String, TradeAccount> datastore = new HashMap<>();

    public void createTradeAccount(TradeAccount obj)
    {
        this.datastore.put(obj.getId(), obj.clone());
    }

    public TradeAccount retrieveTradeAccount(String id)
    {
        return this.datastore.get(id).clone();
    }

    public void updateTradeAccount(TradeAccount obj)
    {
        this.datastore.put(obj.getId(),obj.clone());
    }

    public void deleteTradeAccount(String id)
    {
        this.datastore.remove(id);
    }

}
