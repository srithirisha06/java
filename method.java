class method{
    public Static int addNumbers(int num1,int num2){
        return num1+num2;
    }
    public static int subNumbers(int num1, int num2){
        return num2-num1;
    }
    public static void main(String[] args) {
        method obj=new method();
        System.out.println(obj.addNumbers(11, 22));
        System.out.println(subNumbers(11,22));`

    }
}
