public class SalesManager {

    protected long[] sales = {150, 200, 400};

    public SalesManager() {
        this.sales = sales;
    }

    public long max(long sales) {
        long max = -1;
        for (long sale : this.sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
}
