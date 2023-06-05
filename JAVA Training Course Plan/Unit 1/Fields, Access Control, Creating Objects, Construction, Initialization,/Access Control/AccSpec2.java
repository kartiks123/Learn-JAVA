import javax.annotation.processing.SupportedOptions;

class pub
{
    public int a=5;
    public void display()
    {
        System.out.println("Hey !");
    }
}

class AccSpec2
{
    public static void main(String[] args) {
        pub show=new pub();
        System.out.println(show.a);
        show.display();
    }
}