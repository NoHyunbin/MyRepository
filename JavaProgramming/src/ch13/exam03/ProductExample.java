package ch13.exam03;

public class ProductExample {

	public static void main(String[] args) {
		Product<String, String> p1 = new Product<>();
		
		p1.setKind("TV");
		p1.setModel("스마트");
		String kind = p1.getKind();
		String model = p1.getModel();
		
		Product<TV, String> p2 = new Product<>();
		p2.setKind(new TV("Samsung"));
		p2.setModel("대화면");
		TV kind2 = p2.getKind();
		String model2 = p2.getModel();
		
		System.out.println(kind);
		System.out.println(model);
		System.out.println(kind2);
		System.out.println(model2);

	}

}
