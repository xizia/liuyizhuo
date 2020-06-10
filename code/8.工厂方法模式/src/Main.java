//客户端代码
public class Main
{
    public static void main(String[] args)
    {
        IFactory factory = new UndergraduateFactory();
        LeiFeng student = factory.createLeiFeng();

        student.buyRice();
        student.sweep();
        student.wash();
    }
}

/*//客户端代码
public class Main
{
    public static void main(String[] args)
    {
        LeiFeng xueleifeng = new Undergraduate();

        xueleifeng.buyRice();
        xueleifeng.sweep();
        xueleifeng.wash();
    }
}*/
