public class Phone{
	public static void main(String [] args){
		Phones [] gadget = new Phones[3];


		gadget[0]  = new Phones();
		gadget [1] = new Phones();
		gadget [2] = new Phones();


		gadget[0].phoneType = "iphone";
		gadget [0].color = "red";

		gadget[1].phoneType = "samsung";
		gadget [1].color = "black";

		gadget[2].phoneType = "nokia";
		gadget[2].color = "blue";

		gadget[0].showInfo();
		gadget[1].showInfo();
		gadget[2].showInfo();





	}



}