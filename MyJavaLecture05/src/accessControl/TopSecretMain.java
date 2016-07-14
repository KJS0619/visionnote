package accessControl;

public class TopSecretMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TopSecret t = new TopSecret();
		t.setSecret(1000);
		int s = t.getSecret();
		System.out.println(s);
	}

}
