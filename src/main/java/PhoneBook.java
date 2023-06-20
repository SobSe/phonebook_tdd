import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    public Map<String, String> byName = new TreeMap<>();
    public Map<String, String> byNumber = new HashMap<>();
    int add(String name, String number) {
        byNumber.put(number, name);
        byName.put(name, number);
        return byName.size();
    }

    public String findByNumber(String number) {
        return byNumber.get(number);
    }

    public String findByName(String number) {
        return byName.get(number);
    }
}
