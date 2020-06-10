//上午和中午工作状态类
public class ForenoonState implements State
{
    public void writeProgram(Work work)
    {
        if (work.getHour() < 12)
        {
            System.out.println("当前时间：" + work.getHour() + "点 上午工作，精神百倍");
        }
        else
        {
            work.setState(new NoonState());
            work.writeProgram();
        }
    }
}