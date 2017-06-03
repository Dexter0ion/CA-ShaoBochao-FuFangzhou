/**
 * Created by think on 2017/6/3.
 */

public class InfoSet {

    public static void SetMapInfo()
    {
        int width = 20;
        int height = 20;

        char[] mapdata = new char[width*height];
        Map newMap = new Map(mapdata,width,height);
        newMap.next();
    }


}
