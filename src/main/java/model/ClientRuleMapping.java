package model;

import model.client.Client;
import model.config.Configuration;

import java.util.HashMap;
import java.util.Map;

public class ClientRuleMapping {
    private Map<Client, Configuration> clientListMap;

    public ClientRuleMapping() {
        this.clientListMap = new HashMap<>();
    }


}
