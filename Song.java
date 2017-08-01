package 民谣;

public class Song {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
int beerNum=99;
String word = " bottles";
while (beerNum > 0) {
	if (beerNum == 1) {
word = "bottle";
	}
	System.out.println(beerNum + "" + word + "of beer on the wall.");
	System.out.println(beerNum + "" + word + "of beer.");
	System.out.println("Take one dowm.");
	System.out.println("Pass it around.");
	beerNum = beerNum - 1;
	if (beerNum > 0) {
		System.out.println(beerNum + "" + word + "of beer on the wall");
	}else{
		System.out.println("No more beer on the wall.");
	}//else结束
}//while结束
}//main方法结束
}//class结束
