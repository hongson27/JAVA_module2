package ss6_inheritance.bai_tap;

public class MoveAblePoint extends Point2D{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
    public MoveAblePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveAblePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveAblePoint() {}
    public float getXSpeed() { return xSpeed; }
    public float getYSpeed() { return ySpeed; }
    public void setXSpeed(float xSpeed) { this.xSpeed = xSpeed; }
    public void setYSpeed(float ySpeed) { this.ySpeed = ySpeed; }
    public void setXSpeed(float xSpeed, float ySpeed) {
        setXSpeed(xSpeed);
        setYSpeed(ySpeed);
    }
    public float[] getSpeed() {
        return new float[] {getXSpeed(), getYSpeed()};    }
    @Override
    public String toString() {
        return "MoveAblePoint: (" +
                + getX() + ","
                + getY() + ")"
                + ", xSpeed=(" + getXSpeed() +
                "," + getYSpeed() +
                ')';
    }
    public MoveAblePoint move() {
        return new MoveAblePoint(getX() + xSpeed, getY()+ySpeed, xSpeed, ySpeed);
    }
}
