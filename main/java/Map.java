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


    public void initDisplay() {

        setData();
        display();
    }
    
    private void viewAllCell()
    {
        markdata = new int[width*height];
        for (int i = 0; i < markdata.length; i++) {
            markdata[i]=0;
            for (int j = 0; j < data.length; j++) {
                changeMarkdata(markdata,i);
                
            }
        }
    }

    private void changeMarkdata(int[] markdata, int p) {
        int result=0;
        int x = p % width;
        int y = p / width;
        for (int i = x - 1; i <= x + 1; i++) {
            for (int j = y - 1; j <= y + 1; j++) {
                if (i == x && j == y) continue;
                if (checkStatus(i, j)) result += 1;
            }
        }
        markdata[p] = result;
            
        }

    private boolean checkStatus(int x, int y) {
        if (x < 0 || x >= width || y < 0 || y >= height) return false;
        else if (data[x + y * width] == 0) return false;
        else return true;
    }
    
    public void next()
    {
        viewAllCell();
        markChange();
        setData();
        display();
    }

    private void markChange() {
        for (int i = 0; i < markdata.length; i++) {
            if (markdata[i] == 3) data[i] = 1;
            else if (markdata[i] == 2) ;
            else
                data[i] = 0;

        }
    }
}

