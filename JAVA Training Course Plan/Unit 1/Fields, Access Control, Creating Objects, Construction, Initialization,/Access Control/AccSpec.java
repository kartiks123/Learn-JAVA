// WORKING OF A PRIVATE CLASS AND PRIVATE METHOD.

class pri
{
    private int s=5;
    private void msg() // void is written to give no return.
    {
        System.out.println("Hey, I am written in java.");
    }
}

class AccSpec
{
    public static void main(String[] args) {
        pri result=new pri(); // pri is the class name, which is needed to be specified early on so as to get the correct output, when referencing to it.
        System.out.println(result.s);
        result.msg();

        // Since, both above outputs are private in pri class, hence it will show compilation error.
    }
}