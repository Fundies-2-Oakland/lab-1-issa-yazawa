public class Vector3D {
    //A constructor that takes in x, y, z components of the vector. Each parameter is of type double.
    private double x;
    private double y;
    private double z;

    public Vector3D (double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //Methods to get the values of individual components (e.g. getX, getY, getZ).
    public Double getX () {
        return x;
    }
    public Double getY () {
        return y;
    }
    public Double getZ () {
        return z;
    }

    //A toString method that returns a string that describes this vector. This string should be of the form “(x, y, z)” replacing the letters with their values. Each component should be formatted to round to exactly two decimal places (look at the String.format method to see how to do this).
    public String doubleToString() {
        return getX().toString() + "," + getY().toString() + "," + getZ().toString();
    }

    //A method getMagnitude that returns its magnitude.
    public double getMagnitude() {
        double number= getX() * getX() + getY()* getY() + getZ() * getZ();
        return Math.sqrt(number);
    }

    //A method normalize that returns a normalized version of this vector. It should throw an IllegalStateException object if this operation cannot be completed (magnitude is zero).
    public double normalize() {
        double magnitude = getMagnitude();
        if (magnitude == 0) {
            throw new IllegalStateException("Cannot normalize 0 magnitude")
        }
        return new Vector3D(this.getX() / magnitude, this.getY() / magnitude, this.getZ() / magnitude,);
    }

    //A method add that returns the result of adding this vector to another vector. It should not change the vectors that are being added.
    public double add(Vector3D otherVector) {
        return new Vector3D(this.getX() + otherVector.getX(), this.getY() + otherVector.getY(), this.getZ() + otherVector.getZ())
    }
    //A method multiply that returns the result of multiplying this vector by a constant. It should not change the vector that is being multiplied.
    public double multiply(int k) {
        return new Vector3D(this.getX() * k, this.getY() * k, this.getZ() * k)
    }
    //A method dotProduct that returns the dot product of this vector and another vector. It should not change the two vectors.
    public double dotProduct(Vector3D otherVector) {
        return this.getX() * otherVector.getX() + this.getY() * otherVector.getY() + this.getZ() * otherVector.getZ()
    }
    //A method angleBetween that returns the angle between two vectors in degrees. It should not change the two vectors. It should throw an IllegalStateException if this operation cannot be completed.
    public double angleBetween(Vector3D otherVector) {
        if (this.getMagnitude() == 0 || otherVector.getMagnitude() == 0) {
            throw new IllegalStateException("Cannot find angle between these vectors.")
        }
        double dP = dotProduct(otherVector);
        double magnitude = this.getMagnitude() * otherVector.getMagnitude()
        return Math.acos(dp/magnitude);
    }
    //A method crossProduct that returns the cross product of this vector and another vector. It should not change the two vectors.
    public double crossProduct(Vector3D otherVector) {
        double uX = this.getY() * otherVector.getZ() - this.getZ() - otherVector.getY();
        double uY = this.getZ() * otherVector.getX() - this.getX() - otherVector.getZ();
        double uZ = this.getX() * otherVector.getY() - this.getY() - otherVector.getX();
        return new Vector3D((uX, uY, uZ));
    }

}


