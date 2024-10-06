package lk.ijse.posapispring.util;

import java.util.UUID;

public class AppUtil {
    public static String generateUserId(){
        return "USER-" + UUID.randomUUID();
    }
    public static String generateCustomerId(){
        return "CUS-" + UUID.randomUUID();
    }

    public static String generateItemId(){
        return "ITEM-" + UUID.randomUUID();
    }

    public static String generateOrderId(){
        return "ORDER-" + UUID.randomUUID();
    }
}
