public class test {
    public static void main(String[] args) {
        System.out.println("Hello world");
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[2]);
        // String[] agrs;
        String operator = args[1];
        int result = 0 ;
        
        switch(operator){
            case "+":
                result = num1 + num2 ;
                break ;
            case "-":
                result = num1 - num2 ;
                break ;
            case "*":
                result = num1 * num2 ;
                break ;
            case "/":
                result = num1 / num2 ;
                break ;
            default:
            System.out.println("Invalid operator");
        }
        System.out.println("Result is : " + result);
	}
    
}
