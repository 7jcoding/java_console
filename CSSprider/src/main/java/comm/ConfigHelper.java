package comm;
import Lin.Utils.Config;
/**
 * Created by LIN on 2017/6/8.
 */
public class ConfigHelper {
    /**
     * 根据配置KEY，获取指定文件【程序默认config.properties】获取相应的值
     * @param key
     * @return
     */
    public static String getPropertiesByKey(String key) {
        String fileName = "config.properties";
        return Config.getPropertiesByKey(fileName, key);
    }
}
