/**
 * Created by think on 2017/6/3.
 */
public class InfoSet {

    public static void SetMapInfo()
    {
        int width = 10;
        int height = 10;
        char[] mapdata = new char[width*height];
        Map newMap = new Map(mapdata,width,height);
        newMap.initDisplay();
    }

    public static void main(String args[])
    {
    SetMapInfo();
    }
}
