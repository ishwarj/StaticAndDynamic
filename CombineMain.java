package combineStaticDynamic;

import java.util.Scanner;

public class CombineMain {

	public static void main(String[] args) {
		CombineDynamic combine=new CombineDynamic();
		CombineStatic combineStatic=new CombineStatic();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter 1 For Dynamic and 2 For Static:");
	    int in=scanner.nextInt();
	    System.out.println("enter 1 for insert 2 for update 3 for delete");
	    int i=scanner.nextInt();
	 switch(in) {
	 case 1:{
		 if(i==1) {
		 combine.insert();
	}
		 else if(i==2) {
			 combine.update();	 
	 }
		 else if(i==3) {
			 combine.delete();
		 }
	}
		 case 2:{
			 if(i==1) {
			 combineStatic.insert();
		}
			 else if(i==2){
			 combineStatic.update();
		 }
			 else if(i==3){
			 combineStatic.delete();
		 }
	}
	 
	}
	}
	}
