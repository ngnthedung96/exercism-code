import java.util.*;

public class DialingCodes {
    private Map<Integer, String> dialingCodes = new HashMap<Integer, String>();;

    public Map<Integer, String> getCodes() {
        return dialingCodes;
    }

    public void setDialingCode(Integer code, String country) {
         this.dialingCodes.put(code, country);
    }

    public String getCountry(Integer code) {
        return this.dialingCodes.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if(!this.dialingCodes.containsKey(code) && !this.dialingCodes.containsValue(country))  this.dialingCodes.put(code, country);
    }

    public Integer findDialingCode(String country) {
        for(Map.Entry<Integer, String> entry: this.dialingCodes.entrySet()){
            if(entry.getValue().equals(country)) return entry.getKey();
        };
        return null;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        Integer originCode = findDialingCode(country);
        if(originCode != null){
            this.dialingCodes.remove(originCode);
            this.dialingCodes.put(code, country);
        }
    }
}
