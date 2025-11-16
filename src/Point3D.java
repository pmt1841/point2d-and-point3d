public class Point3D extends Point2D {
    private float z = 0.0f;
    private static int count = 0;

    public Point3D() {
        increaseCount();
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
        increaseCount();
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        setZ(z);
    }

    public float[] getXYZ() {
        return new float[]{getX(), getY(), getZ()};
    }

    private void increaseCount() {
        count++;
    }

    @Override
    public String toString() {
        return "Point3D " + count + " ("
                + getXYZ()[0] + ", "
                + getXYZ()[1] + ", "
                + getXYZ()[2] + ')';
    }
}
