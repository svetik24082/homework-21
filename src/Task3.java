import java.util.HashMap;
import java.util.Map;

public class Task3 {

    private final Map<String, Integer> map = new HashMap<>();

    public void addToMap(String key, int value) {
        if (!map.containsKey(key)) {  // если нет ключа
            map.put(key, value);       // добавляем
        } else {
            int valueFromMap = map.get(key);// значение
            if (valueFromMap == value) {
                throw new IllegalArgumentException(" Такой ключ уже есть");
            } else {
                map.put(key, valueFromMap + value);
            }

        }
    }

    @Override
    public String toString() {
        return
                "map=" + map;
    }
}
