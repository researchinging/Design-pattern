package bridge;
//�ֻ�Ʒ��
public  abstract class HandsetBrand
{
    protected HandsetSoft soft;

    //�����ֻ�����
    public void SetHandsetSoft(HandsetSoft soft)
    {
        this.soft = soft;
    }
    //����
    public abstract void Run();
    

}

//�ֻ�Ʒ��N
class HandsetBrandN extends HandsetBrand
{
    public  void Run()
    {
        soft.Run();
    }
}

//�ֻ�Ʒ��M
class HandsetBrandM extends HandsetBrand
{
    public  void Run()
    {
        soft.Run();
    }
}

//�ֻ�Ʒ��S
class HandsetBrandS extends HandsetBrand
{
    public  void Run()
    {
        soft.Run();
    }
}
