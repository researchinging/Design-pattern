package bridge;
//�ֻ�����
public  abstract class HandsetSoft
{

    public abstract void Run();
}

//�ֻ���Ϸ
class HandsetGame extends HandsetSoft
{
    public  void Run()
    {
        System.out.println("�����ֻ���Ϸ");
    }
}

//�ֻ�ͨѶ¼
class HandsetAddressList extends HandsetSoft
{
    public  void Run()
    {
    	System.out.println("�����ֻ�ͨѶ¼");
    }
}

//�ֻ�MP3����
class HandsetMP3 extends HandsetSoft
{
    public  void Run()
    {
    	System.out.println("�����ֻ�MP3����");
    }
}


