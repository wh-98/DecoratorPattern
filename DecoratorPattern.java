package decorator;
public class DecoratorPattern
{
    public static void main(String[] args)
    {
        Component p=new ConcreteComponent();
        p.operation();
        System.out.println("---------------------------------");
        Component d=new ConcreteDecorator(p);
        d.operation();
    }
}
//���󹹼���ɫ
interface  Component
{
    public void operation();
}
//���幹����ɫ
class ConcreteComponent implements Component
{
    public ConcreteComponent()
    {
        System.out.println("�������幹����ɫ");       
    }   
    public void operation()
    {
        System.out.println("���þ��幹����ɫ�ķ���operation()");           
    }
}
//����װ�ν�ɫ
class Decorator implements Component
{
    private Component component;   
    public Decorator(Component component)
    {
        this.component=component;
    }   
    public void operation()
    {
        component.operation();
    }
}
//����װ�ν�ɫ
class ConcreteDecorator extends Decorator
{
    public ConcreteDecorator(Component component)
    {
        super(component);
    }   
    public void operation()
    {
        super.operation();
        addedFunction();
    }
    public void addedFunction()
    {
        System.out.println("Ϊ���幹����ɫ���Ӷ���Ĺ���addedFunction()");           
    }
}