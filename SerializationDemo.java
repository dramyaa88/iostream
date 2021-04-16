package demo.serialization;
import java.io.*;


class Product implements Serializable
{
	int pid;
	String pname;
	int pstock;
	float pprice;
	
	
	public Product(int pid, String pname, int pstock, float pprice) {

		this.pid = pid;
		this.pname = pname;
		this.pstock = pstock;
		this.pprice = pprice;
	}



	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pstock=" + pstock + ", pprice=" + pprice + "]";
	}
	
	
}

public class SerializationDemo {
	
	File file = new File("D:\\File\\MyFile.txt");
	FileOutputStream fos;
	FileInputStream fis;
	ObjectOutputStream oos;
	ObjectInputStream ois;
	
	public void serialize()
	{
		Product poductobj = new Product(100,"Mobile",500,1500.98f);
		
		try
		{
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(poductobj);
			
			System.out.println("Succesfully written the stream of bytes into object");
			
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void deserialize()
	{
		try
		{
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			Product obj = (Product)ois.readObject();
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public static void main(String[] args) {
		SerializationDemo obj = new SerializationDemo();
		obj.serialize();
	}
}
