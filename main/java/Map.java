/**
 * Created by think on 2017/6/3.
 */
public class Map {
    public int SPAN;
    public int width;
    public int height;
    public char[] data;
    public int[] markdata;
    public Map(char[]data,int x,int y)
    {
        this.data=data;
        this.width=x;
        this.height=y;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }
    public void initMarkData()
    {
        for (int i = 0; i <this.width*this.height ; i++) {
            markdata[i]=0;
        }
    }

    public void setData()
    {
        for (int i = 0; i <width*height; i++) {
            data[i]=0;
        }
        for (int i = 0; i <width*height ; i++) {
            if(data[i]==0)
                data[i]='□';
            if(data[i]==1)
                data[i]='■';

        }
    }
    public void display() {
        for (int i = 0; i <width; i++) {
            for (int j = 0; j <height; j++) {
                System.out.print(data[i]);
            }
            System.out.print('\n');
        }
    }

    public void next()
    {

    }

    public void initDisplay() {

        setData();
        display();
    }
}
