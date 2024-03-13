public class Akar15 {
    public double num;

    public double akar15BF(double num) {
        double low = 0, high = num, mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (mid * mid == num) {
                return mid;
            } else if (mid * mid < num) {
                low = mid + 0.00001; // utk mencegah infinite loop
            } else {
                high = mid - 0.00001; // utk mencegah infinite loop
            }
        }
        return low;
    }

    public double akar15DC(double num, double low, double high) {
        double mid = low + (high - low) / 2;
        if (high - low < 0.00001) {
            return mid;
        }
        if (mid * mid == num) {
            return mid;
        } else if (mid * mid < num) {
            return akar15DC(num, mid, high);
        } else {
            return akar15DC(num, low, mid);
        }
    }
}