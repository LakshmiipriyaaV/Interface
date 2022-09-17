package Interface;



interface Shows{  
  void show();  
  interface Message{  
   void msg();  
  }  
}  
class TestNestedInterface1 implements Shows.Message{  
 public void msg(){
	 System.out.println("Hello ,this is a nested interface");}  
 public static void main(String args[]){  
  Shows.Message message=new TestNestedInterface1();  
  message.msg();  
 }  
}

