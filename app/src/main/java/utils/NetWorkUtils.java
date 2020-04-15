package utils;

import android.net.Uri;

import java.net.MalformedURLException;
import java.net.URL;
//https://api.vk.com/ method/users.get?  user_ids=  210700286  &fields=bdate&access_token=  533bacf01e11f55b536a565b57531ac114461ae8736d6506a3  &v=  5.103

public class NetWorkUtils {

    private static final String VK_BASE_URL="https://api.vk.com/";
    private static final String VK_METOD_URL="method/users.get";
    private static final String PARAM_VK_SERVICE_KEY="2968af7e2968af7e2968af7e572919bd6f229682968af7e77fd1e31ae8d22942f437248";
    private static final String USER_ID="user_ids";
    private static final String FIELD_POLE="&fields=bdate&access_token"; //primer
    private static final String PARAM_VERSION="v"; //primer

    public static URL generateURL (String userId){

        Uri builtUri = Uri.parse(VK_BASE_URL+VK_METOD_URL)
                .buildUpon()
                .appendQueryParameter(USER_ID,userId)
                .appendQueryParameter(FIELD_POLE,PARAM_VK_SERVICE_KEY)
                .appendQueryParameter(PARAM_VERSION,"5.103")
                .build();

        URL url = null;
        try {
            url = new URL(builtUri.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return url;
    }
}
