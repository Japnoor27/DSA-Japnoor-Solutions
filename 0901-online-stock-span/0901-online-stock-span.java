import java.util.*;

class StockSpanner {
    // Stack stores {price, span}
    Stack<int[]> st;
    
    public StockSpanner() {
        st = new Stack<>();
    }
    
    public int next(int price) {
        int span = 1;

        // Pop all smaller or equal prices and add their spans
        while (!st.isEmpty() && st.peek()[0] <= price) {
            span += st.pop()[1];
        }

        // Push current price and its span
        st.push(new int[]{price, span});

        return span;
    }
}