public class SalesManager {

    protected int[] sales = {150, 200, 400};

    public SalesManager() {
        this.sales = sales;
    }

    public int max(int sales) {
        int max = -1;
        for (int sale : this.sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
}