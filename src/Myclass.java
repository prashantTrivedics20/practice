public class Myclass {

        private int value;
        public void setValue(int i){
            value=i;
        }
// Other methods…
    public void display()
    {
        System.out.println(value);
    }
public static void main(String[] args) {
    Myclass obj=new Myclass();
    obj.setValue(10);
    obj.display();
        }
    }


