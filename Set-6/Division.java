class One {
    public static void main(String[] args){
        try{
            int result = Integer.parseInt(args[0]) / Integer.parseInt(args[1]);
            System.out.println("Answer is : " + result);
        } catch(NumberFormatException e){
            System.out.println("Invalid Input Format : " + e.getMessage());
        } catch(ArithmeticException e){
            System.out.println("Invalid Operation : " + e.getMessage());
        } 
    }
}