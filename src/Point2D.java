public class Point2D {
    private float x = 0.0f, y = 0.0f;
    private static int count = 0;

    public Point2D() {
        increaseCount();
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
        increaseCount();
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        setX(x);
        setY(y);
    }

    public float[] getXY() {
        return new float[]{x, y};
    }

    private void increaseCount() {
        count++;
    }

    @Override
    public String toString() {
        return "Point2D " + count + " ("
                + getXY()[0] + ", "
                + getXY()[1] + ')';
    }
}
