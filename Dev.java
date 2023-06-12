class Dev{
public static void main(String args[]){
int a = Integer.parseInt(args[0]);
//int b = Integer.parseInt(args[1]);
//System.out.println(args[0] + " Technologies " + args[1]);
//System.out.println("Welcome " + args[0]);
//System.out.println(a+b);
for(int i=2;i<a/2;i++){
	if(a%i==0){
	System.out.println("It is not an prime");
	break;
	}
	else if(i==a-1){
	System.out.println("It is a Prime number");
	}
	else{
	continue;
	}
}
}
}