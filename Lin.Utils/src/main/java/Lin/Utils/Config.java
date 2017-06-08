package Lin.Utils;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Properties;

/**
 * Created by LIN on 2017/6/7.
 */
public class Config {
    /**
     * 根据配置文件路径及KEY名获取相应的值
     * @param fileName
     * @param key
     * @return
     */
    public static String getPropertiesByKey(String fileName, String key){
        String value = "";
        try {
            Properties prop = new Properties();
            InputStream in = new BufferedInputStream(new FileInputStream(fileName));
            prop.load(in);
            Iterator<String> it = prop.stringPropertyNames().iterator();
            while (it.hasNext()) {
                String _key = it.next();
                if (_key.equals(key)) {
                    value = prop.getProperty(_key);
                    break;
                }
            }
        }catch (Exception ex){
            System.out.println(ex.toString());
        };
        return value;
    }
}
