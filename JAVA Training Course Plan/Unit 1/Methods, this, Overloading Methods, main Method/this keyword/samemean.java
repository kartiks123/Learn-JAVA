class thiskey
{
    void show()
    {
        System.out.println(this);
    }
}

/*
class same extends thiskey
{
    void disp()
    {
        System.out.println(this);
    }
}
*/

class samemean // remember if you use, 'extends thiskey' after this, the result will be a different unique reference ID
{
    public static void main(String[] args) 
    {
        thiskey s=new thiskey();  // if you write 'samemean s=new samemean();', then it will print the unique reference ID for samemean
        System.out.println(s);
        s.show();
    }
}

// This whole code proves that the object reference 's' and 'this' keyword, is referencing to the same, current object in the reference table