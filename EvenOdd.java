public class EvenOdd {
public static void main(String[] args){
if (args.length<10)
int even = 0, odd = 0;
for (int i=0;i<10;i++){
int num = Integer.parseInt(args[i]);
if(num % 2 ==0) {
even++;
}else{
odd++;
}
}
System.out.println("Number of Even Number ="+even);
System.out.println("Number of Odd Number ="+odd);
}
}