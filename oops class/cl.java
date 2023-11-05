
class sl{
    String name="Sanju";
    int age;
    public void setAge(int age) throws Exception{
        if(age<0){
            throw new Exception("-ve age");
        }
        this.age=age;
        System.out.println(age);
    }
    public static void main(String[] args) throws Exception {
        sl stu=new sl();
        stu.setAge(-10);
    }
}


// try{}
// catch (Exeption e){
//     e.printStackTrace();
// }
//finally{}