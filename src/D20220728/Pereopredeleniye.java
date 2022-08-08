package D20220728;

import java.util.Objects;

public class Pereopredeleniye {
    Double a;

    /**
     * Returns something to somewhere
     *
     * While My children are in Dankov
     * I'm studying at home
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pereopredeleniye that = (Pereopredeleniye) o;
        return a.equals(that.a);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a);
    }
}
/*

public static class ComplexNumber {
    private double re;
    private double im;

    public ComplexNumber() {
    }

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public boolean equals(Object anObject) {
        if (this == anObject) {
            return true;
        }
        if (anObject == null || this == null || anObject.getClass() != this.getClass()) {
            return false;
        }
        if (anObject.getClass() == this.getClass()) {
            ComplexNumber comNum = (ComplexNumber) anObject;
            if ((comNum.re == this.re) && (comNum.im == this.im)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result;
        result = 31 * (int) (Double.doubleToLongBits(im) ^ (Double.doubleToLongBits(im) >>> 32));
        result = result + (int) (Double.doubleToLongBits(re) ^ (Double.doubleToLongBits(re) >>> 32));
        return result;
    }
}
*/

