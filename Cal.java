class Cal
{ public static void main(String arg[])
{int a=Integer.parseInt(arg[0]);
String b=arg[1];
int c=Integer.parseInt(arg[2]),d=0;

if(b=="+")
d=a+c;
else if(b=="-")
d=a-c;
else if(b=="*")
d=a*c;
else if(b=="/")
{if(c==0)
 System.out.println("not possible");
 else
 d=a/c;
}
else
{System.out.println("plz choose correct operator");}
System.out.println(d);
}
}