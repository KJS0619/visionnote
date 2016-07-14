package accessControl;

public class MySonMain extends MyFather {
	public void sayFatherNames() {
		System.out.println(name);
		//System.out.println(nickname);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySonMain m = new MySonMain();
		m.sayFatherNames();
	}
}
