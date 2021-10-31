package ecommercePrice.mycontroller;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import ecommercePrice.service.WatchService;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @Autowired
    private WatchService WatchMap;

    public MyController() {
    }

    @RequestMapping(
            value = {"/checkout"},
            method = {RequestMethod.POST},
            produces = {"application/json"}
    )
    @ResponseBody
    public String calPrice(@RequestBody String WatchIDStrings) throws JsonMappingException, JsonProcessingException {
        String[] WatchIDS = this.processRequest(WatchIDStrings);
        Hashtable<String, Integer> Count = new Hashtable();
        this.WatchMap.setWatchHashMap();
        int totalPrice = 0;
        String[] var5 = WatchIDS;
        int var6 = WatchIDS.length;

        for(int var7 = 0; var7 < var6; ++var7) {
            String id = var5[var7];
            Count.put(id, (Integer)Count.getOrDefault(id, 0) + 1);
        }

        Entry entry;
        for(Iterator var9 = Count.entrySet().iterator(); var9.hasNext(); totalPrice += this.WatchMap.calWatchPrice((String)entry.getKey(), (Integer)entry.getValue())) {
            entry = (Entry)var9.next();
        }

        return String.format("{\"price\": %d }", totalPrice);
    }

    public String[] processRequest(String str) {
        String[] results = str.replaceAll("\\[", "").replaceAll("\\]", "").replaceAll(" ", "").replaceAll("\"", "").split(",");
        return results;
    }
}
