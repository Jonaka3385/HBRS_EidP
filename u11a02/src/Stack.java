public class Stack {
    public static void main(String[] args) {
        Stack st = new Stack(10);
        st.push("a");
        st.push("b");
        st.push("c");
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.isEmpty());
    }

    private int current = 0;
    private int size = 0;
    private Object[] stack;

    public Stack(int maximalGroesse) {
        size = maximalGroesse;
        stack = new Object[size];
    }

    public void push(Object o) {
        current = 0;
        while(stack[current] != null) {
            current++;
        }
        stack[current] = o;
    }

    public Object pop() {
        current = size-1;
        while(stack[current] == null) {
            current--;
        }
        Object r = stack[current];
        stack[current] = null;
        return r;
    }

    public boolean isEmpty() {
        return stack[0]==null;
    }
}
