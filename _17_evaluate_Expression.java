public class _17_evaluate_Expression {

    public static void main(String ar[]) {
        System.out.println(" Hello one this is me ");

      
        var a = new String[] {"4","13","5","/","+" };
        
            int ans=new _17_evaluate_Expression().helper(a);
            

        System.out.println(ans); 
        String s=""; 
      

    }

    public int helper( String a[])
    {

        java.util.Stack<Integer> stack = new java.util.Stack();
       
      
        int p = 0;
        String  c;
        int i, j; 
        int ans=0; 
        while (p < a.length) {
            c =a[p]; 

            if ("* / + - ".contains(c)) {
                i=stack.pop(); 
                j=stack.pop(); 
                ans=evalute(j,i, c.charAt(0)); 
                System.out.println(ans); 
                stack.push(ans);
               
            } else {

                stack.push(Integer.parseInt(c));

                

            }
            System.out.println(stack +" "+p); 
            p++;
        }
        return stack.pop(); 
    }

    public int evalute(int a, int b, char op) {
        System.out.println(a+" "+b+" "+op); 
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            case '%':
                return a % b;
        }
        return -1;
    }

}
