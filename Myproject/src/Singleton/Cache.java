package Singleton;
import java.util.HashMap;
import java.util.Map;

public class CacheManager {
    // Static variable to hold the single instance
    private static CacheManager instance;

    // Internal cache storage
    private Map<String, Object> cache;

    // Private constructor to prevent instantiation
    private CacheManager() {
        cache = new HashMap<>();
        System.out.println("CacheManager initialized.");
    }

    // Public method to get the singleton instance
    public static CacheManager getInstance() {
        if (instance == null) {
            instance = new CacheManager();
        }
        return instance;
    }

    // Method to add data to cache
    public void put(String key, Object value) {
        cache.put(key, value);
    }

    // Method to retrieve data from cache
    public Object get(String key) {
        return cache.get(key);
    }

    // Method to remove data from cache
    public void remove(String key) {
        cache.remove(key);
    }

    // Method to clear the entire cache
    public void clear() {
        cache.clear();
    }
}

// Test c
public class Cache {

		    public static void main(String[] args) {
		        CacheManager cm1 = CacheManager.getInstance();
		        CacheManager cm2 = CacheManager.getInstance();

		        cm1.put("user", "Shenoy");
		        System.out.println("User from cache: " + cm2.get("user"));

		        System.out.println("Are both instances same? " + (cm1 == cm2));
		    
	}

}
