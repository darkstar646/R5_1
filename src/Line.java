
public class Line extends MyFrame2 {
	
    public int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
    
    public void drawHorizontalLine(int x0, int x1, int y) {
       // TODO: 座標 (x0, y) から座標 (x1, y) に水平線を描く
    	int wid=abs(x0-x1);
    	fillRect(x0,y,wid+1,1);	
    }
    
   
    public void drawVerticalLine(int y0, int y1, int x) {
       // TODO: 座標 (x, y0) から座標 (x, y1) に垂直線を描く
    	int hei=abs(y0-y1);
    	fillRect(x,y0,1,hei+1);
    }

    public void drawRect(int x, int y, int w, int h) {
       // TODO: 左上の座標が (x, y) で，幅 w および 高さ h の四角形(塗りつぶし無し)を描画する(↑の 2 つのメソッドを使うこと)
    	drawHorizontalLine(x, x+w-1, y);
    	drawHorizontalLine(x, x+w-1, y+h-1);
    	drawVerticalLine(y, y+h-1, x);
    	drawVerticalLine(y, y+h-1, x+w-1);
    }

    public void run() {
       // TODO: drawRect メソッドを呼び出す
    	int n=7+3;
    	for(int i=0; i<n; i++) {
    		drawRect(10*i+20,10*i+80,50,50);
    	}
    }

    public static void main(String[] args) {
        new Line();
    }

}

	

