public class InstanceOf extends Parent
{
  public static void main(String[] args) {
    Parent p = new Parent();
    InstanceOf c = new InstanceOf();
    System.out.println(p instanceof Parent);
    System.out.println(c instanceof Parent);
    System.out.println(p instanceof InstanceOf);
    System.out.println(c instanceof InstanceOf);
  }
}
class Parent
{

}
