package internal;

import org.json.JSONObject;

/**
 * Created by william.russell on 8/28/17.
 */
public class mainer {


    public static void main(String[] args) {
        JSONObject json = DotUtil.getProperty("page.lander.c_ZipContainer.zc_CardTitle.attributes");
        System.out.println(json.getString("text"));
    }
}
