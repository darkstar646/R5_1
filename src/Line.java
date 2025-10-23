
public class Line extends MyFrame2 {

    /** a と b のうち小さい方を返すメソッド */
    public int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    /** a の絶対値を返すメソッド */
    public int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }

    public void drawHorizontalLine(int x0, int x1, int y) {
       // TODO: 座標 (x0, y) から座標 (x1, y) に水平線を描く
    }

    public void drawVerticalLine(int y0, int y1, int x) {
       // TODO: 座標 (x, y0) から座標 (x, y1) に垂直線を描く
    }

    public void drawRect(int x, int y, int w, int h) {
       // TODO: 左上の座標が (x, y) で，幅 w および 高さ h の四角形(塗りつぶし無し)を描画する(↑の 2 つのメソッドを使うこと)
    }

    public void run() {
       // TODO: drawRect メソッドを呼び出す
    }

    public static void main(String[] args) {
        new Line();
    }

}
